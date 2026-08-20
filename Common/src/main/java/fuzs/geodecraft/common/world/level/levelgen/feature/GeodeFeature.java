package fuzs.geodecraft.common.world.level.levelgen.feature;

import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import net.minecraft.Util;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.block.BuddingAmethystBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.levelgen.GeodeBlockSettings;
import net.minecraft.world.level.levelgen.GeodeCrackSettings;
import net.minecraft.world.level.levelgen.GeodeLayerSettings;
import net.minecraft.world.level.levelgen.LegacyRandomSource;
import net.minecraft.world.level.levelgen.WorldgenRandom;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.synth.NormalNoise;
import net.minecraft.world.level.material.FluidState;
import fuzs.geodecraft.common.world.level.levelgen.feature.configurations.CustomGeodeConfiguration;

import java.util.List;
import java.util.function.Predicate;

/**
 * A copy of {@link net.minecraft.world.level.levelgen.feature.GeodeFeature} that opens cracks using
 * {@link CustomGeodeConfiguration#crackState} instead of always using air, allowing for flooded geodes.
 */
public class GeodeFeature extends Feature<CustomGeodeConfiguration> {
    private static final Direction[] DIRECTIONS = Direction.values();
    /**
     * Heights relative to the geode origin at which crack points are placed.
     */
    private static final int[] CRACK_HEIGHTS = {7, 5, 1};

    public GeodeFeature(Codec<CustomGeodeConfiguration> codec) {
        super(codec);
    }

    @Override
    public boolean place(FeaturePlaceContext<CustomGeodeConfiguration> context) {
        CustomGeodeConfiguration config = context.config();
        RandomSource random = context.random();
        BlockPos origin = context.origin();
        WorldGenLevel level = context.level();
        GeodeBlockSettings blockSettings = config.geodeBlockSettings;
        GeodeLayerSettings layerSettings = config.geodeLayerSettings;
        GeodeCrackSettings crackSettings = config.geodeCrackSettings;
        NormalNoise noise = NormalNoise.create(new WorldgenRandom(new LegacyRandomSource(level.getSeed())), -4, 1.0);

        int distributionPointCount = config.distributionPoints.sample(random);
        double distributionRatio = (double) distributionPointCount / config.outerWallDistance.getMaxValue();
        double fillingThreshold = 1.0 / Math.sqrt(layerSettings.filling);
        double innerLayerThreshold = 1.0 / Math.sqrt(layerSettings.innerLayer + distributionRatio);
        double middleLayerThreshold = 1.0 / Math.sqrt(layerSettings.middleLayer + distributionRatio);
        double outerLayerThreshold = 1.0 / Math.sqrt(layerSettings.outerLayer + distributionRatio);
        double crackThreshold = 1.0 / Math.sqrt(
                crackSettings.baseCrackSize + random.nextDouble() / 2.0 + (distributionPointCount > 3 ?
                        distributionRatio : 0.0));
        boolean generateCrack = random.nextFloat() < crackSettings.generateCrackChance;

        List<Pair<BlockPos, Integer>> distributionPoints = Lists.newLinkedList();
        int invalidBlocks = 0;

        for (int i = 0; i < distributionPointCount; i++) {
            BlockPos pos = origin.offset(config.outerWallDistance.sample(random),
                    config.outerWallDistance.sample(random),
                    config.outerWallDistance.sample(random));
            BlockState blockState = level.getBlockState(pos);
            if (blockState.isAir() || blockState.is(blockSettings.invalidBlocks)) {
                if (++invalidBlocks > config.invalidBlocksThreshold) {
                    return false;
                }
            }

            distributionPoints.add(Pair.of(pos, config.pointOffset.sample(random)));
        }

        List<BlockPos> crackPoints = Lists.newLinkedList();
        if (generateCrack) {
            // the crack runs up one of the four horizontal corners of the geode
            int corner = random.nextInt(4);
            int crackOffset = distributionPointCount * 2 + 1;
            int crackX = corner == 0 || corner == 2 ? crackOffset : 0;
            int crackZ = corner == 1 || corner == 2 ? crackOffset : 0;

            for (int crackY : CRACK_HEIGHTS) {
                crackPoints.add(origin.offset(crackX, crackY, crackZ));
            }
        }

        List<BlockPos> potentialPlacements = Lists.newArrayList();
        Predicate<BlockState> replaceable = isReplaceable(blockSettings.cannotReplace);
        Iterable<BlockPos> positions = BlockPos.betweenClosed(origin.offset(config.minGenOffset,
                config.minGenOffset,
                config.minGenOffset), origin.offset(config.maxGenOffset, config.maxGenOffset, config.maxGenOffset));

        for (BlockPos pos : positions) {
            double noiseValue = noise.getValue(pos.getX(), pos.getY(), pos.getZ()) * config.noiseMultiplier;
            double distance = 0.0;
            double crackDistance = 0.0;

            for (Pair<BlockPos, Integer> distributionPoint : distributionPoints) {
                distance += Mth.invSqrt(pos.distSqr(distributionPoint.getFirst()) + distributionPoint.getSecond())
                        + noiseValue;
            }

            for (BlockPos crackPoint : crackPoints) {
                crackDistance += Mth.invSqrt(pos.distSqr(crackPoint) + crackSettings.crackPointOffset) + noiseValue;
            }

            if (distance < outerLayerThreshold) continue;

            if (generateCrack && crackDistance >= crackThreshold && distance < fillingThreshold) {
                this.safeSetBlock(level, pos, config.crackState, replaceable);

                for (Direction direction : DIRECTIONS) {
                    BlockPos relativePos = pos.relative(direction);
                    FluidState fluidState = level.getFluidState(relativePos);
                    if (!fluidState.isEmpty()) {
                        level.scheduleTick(relativePos, fluidState.getType(), 0);
                    }
                }
            } else if (distance >= fillingThreshold) {
                this.safeSetBlock(level, pos, blockSettings.fillingProvider.getState(random, pos), replaceable);
            } else if (distance >= innerLayerThreshold) {
                boolean useAlternateLayer = random.nextFloat() < config.useAlternateLayer0Chance;
                if (useAlternateLayer) {
                    this.safeSetBlock(level,
                            pos,
                            blockSettings.alternateInnerLayerProvider.getState(random, pos),
                            replaceable);
                } else {
                    this.safeSetBlock(level, pos, blockSettings.innerLayerProvider.getState(random, pos), replaceable);
                }

                if ((!config.placementsRequireLayer0Alternate || useAlternateLayer)
                        && random.nextFloat() < config.usePotentialPlacementsChance) {
                    potentialPlacements.add(pos.immutable());
                }
            } else if (distance >= middleLayerThreshold) {
                this.safeSetBlock(level, pos, blockSettings.middleLayerProvider.getState(random, pos), replaceable);
            } else {
                this.safeSetBlock(level, pos, blockSettings.outerLayerProvider.getState(random, pos), replaceable);
            }
        }

        for (BlockPos pos : potentialPlacements) {
            BlockState blockState = Util.getRandom(blockSettings.innerPlacements, random);

            for (Direction direction : DIRECTIONS) {
                if (blockState.hasProperty(BlockStateProperties.FACING)) {
                    blockState = blockState.setValue(BlockStateProperties.FACING, direction);
                }

                BlockPos relativePos = pos.relative(direction);
                BlockState relativeState = level.getBlockState(relativePos);
                if (blockState.hasProperty(BlockStateProperties.WATERLOGGED)) {
                    blockState = blockState.setValue(BlockStateProperties.WATERLOGGED,
                            relativeState.getFluidState().isSource());
                }

                if (BuddingAmethystBlock.canClusterGrowAtState(relativeState)) {
                    this.safeSetBlock(level, relativePos, blockState, replaceable);
                    break;
                }
            }
        }

        return true;
    }
}
