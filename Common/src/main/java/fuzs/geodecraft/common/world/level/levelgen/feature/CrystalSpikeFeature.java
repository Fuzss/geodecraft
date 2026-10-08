package fuzs.geodecraft.common.world.level.levelgen.feature;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.tags.TagKey;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraft.util.valueproviders.IntProvider;
import net.minecraft.util.valueproviders.IntProviders;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.chunk.ChunkGenerator;
import net.minecraft.world.level.levelgen.feature.SpeleothemUtils;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.placement.CaveSurface;
import net.minecraft.world.level.material.Fluids;
import org.jspecify.annotations.Nullable;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @param crystalState the block the spike itself is built from
 * @param clusterState the cluster block growing on the finished spike
 * @param bloomState   the block terrain around the spike base is converted into
 * @param placeableOn  terrain the spike may grow from, this is also the terrain replaced by {@link #bloomState}
 * @param radius       horizontal radius of the spike base
 * @param placement    whether the spike hangs from a ceiling or grows from a floor
 */
public record CrystalSpikeFeature(Holder<BlockStateProvider> crystalState,
                                  Holder<BlockStateProvider> clusterState,
                                  Holder<BlockStateProvider> bloomState,
                                  TagKey<Block> placeableOn,
                                  IntProvider radius,
                                  CaveSurface placement) implements Feature {
    private static final Direction[] DIRECTIONS = Direction.values();
    /**
     * The horizontal directions a spike may lean towards, in radians: 30°, 150°, 210°, and 330°.
     */
    private static final float[] SPIKE_ANGLES = {0.5235988F, 2.617994F, 3.6651917F, 5.759587F};
    /**
     * How far a ceiling spike searches upwards for solid terrain to attach to.
     */
    private static final int CEILING_SEARCH_DISTANCE = 10;
    /**
     * Vertical extent of the terrain blooming around the spike base.
     */
    private static final int BLOOM_HEIGHT = 2;
    /**
     * Chance for an individual spike block to grow clusters, as a one in n chance.
     */
    private static final int CLUSTER_CHANCE = 6;

    public static final MapCodec<CrystalSpikeFeature> CODEC = RecordCodecBuilder.mapCodec(instance -> instance.group(
                    BlockStateProvider.CODEC.fieldOf("crystal_state").forGetter(CrystalSpikeFeature::crystalState),
                    BlockStateProvider.CODEC.fieldOf("cluster_state").forGetter(CrystalSpikeFeature::clusterState),
                    BlockStateProvider.CODEC.fieldOf("bloom_state").forGetter(CrystalSpikeFeature::bloomState),
                    TagKey.hashedCodec(Registries.BLOCK)
                            .fieldOf("placeable_on")
                            .forGetter(CrystalSpikeFeature::placeableOn),
                    IntProviders.CODEC.fieldOf("radius").forGetter(CrystalSpikeFeature::radius),
                    CaveSurface.CODEC.fieldOf("placement").forGetter(CrystalSpikeFeature::placement))
            .apply(instance, CrystalSpikeFeature::new));

    @Override
    public MapCodec<CrystalSpikeFeature> codec() {
        return CODEC;
    }

    @Override
    public boolean place(WorldGenLevel level, ChunkGenerator chunkGenerator, RandomSource random, BlockPos origin) {
        Direction direction = this.placement().getDirection();
        if (!level.isStateAtPosition(origin.relative(direction.getOpposite()), SpeleothemUtils::isEmptyOrWaterOrLava)) {
            return false;
        } else if (!level.getBlockState(origin).is(this.placeableOn())) {
            return false;
        } else {
            int radius = this.radius().sample(random) + 1;
            float angle = SPIKE_ANGLES[random.nextInt(SPIKE_ANGLES.length)];
            int height = radius + 14 + Mth.nextInt(random, 10, 14);
            Set<BlockPos> crystalPositions = new HashSet<>();
            return this.placeSpike(level, random, origin, radius, height, angle, crystalPositions)
                    && this.placeCrystals(level, random, crystalPositions);
        }
    }

    /**
     * Collects the positions the spike is built from, and blooms the terrain it grows out of.
     *
     * @return whether at least one position is free for the spike to occupy
     */
    private boolean placeSpike(WorldGenLevel level, RandomSource random, BlockPos origin, int startRadius, int height, float angle, Set<BlockPos> crystalPositions) {
        Direction direction = this.placement().getDirection();
        // a ceiling spike is built downwards, so all offsets are mirrored
        int sign = direction == Direction.UP ? -1 : 1;
        boolean placed = false;

        for (int y = 0; y < height; y++) {
            // the spike tapers off, once nothing is left there is no point in going any higher
            int radius = startRadius - y / 2;
            if (radius < 0) {
                break;
            }

            for (int x = -radius; x <= radius; x++) {
                for (int z = -radius; z <= radius; z++) {
                    if (x * x + z * z > radius * radius) {
                        continue;
                    }
                    BlockPos pos = origin.offset(x, 0, z);
                    if (direction == Direction.UP) {
                        pos = findCeiling(level, pos);
                        if (pos == null) {
                            return false;
                        }
                    }

                    this.bloomTerrain(level, random, pos.relative(direction), radius);
                    BlockPos crystalPos = pos.offset(sign * (int) (Mth.cos(angle) * y),
                            sign * y,
                            sign * (int) (Mth.sin(angle) * y));
                    if (level.isStateAtPosition(crystalPos, SpeleothemUtils::isEmptyOrWaterOrLava)) {
                        crystalPositions.add(crystalPos);
                        placed = true;
                    } else {
                        crystalPositions.remove(crystalPos);
                    }
                }
            }
        }

        return placed;
    }

    /**
     * @return the position whose block above is solid, or <code>null</code> when there is no ceiling in range
     */
    @Nullable
    private static BlockPos findCeiling(LevelAccessor level, BlockPos pos) {
        BlockPos.MutableBlockPos mutablePos = pos.mutable();

        for (int i = 0; i < CEILING_SEARCH_DISTANCE && level.isStateAtPosition(mutablePos.above(),
                SpeleothemUtils::isEmptyOrWaterOrLava); i++) {
            mutablePos.move(Direction.UP);
        }

        return level.isStateAtPosition(mutablePos.above(), SpeleothemUtils::isEmptyOrWaterOrLava) ? null :
                mutablePos.immutable();
    }

    /**
     * Converts exposed terrain around the spike base into the configured bloom block.
     */
    private void bloomTerrain(WorldGenLevel level, RandomSource random, BlockPos origin, int crystalRadius) {
        int radius = crystalRadius / 4;

        for (int x = -radius; x <= radius; x++) {
            for (int z = -radius; z <= radius; z++) {
                for (int y = -BLOOM_HEIGHT; y <= BLOOM_HEIGHT; y++) {
                    BlockPos pos = origin.offset(x, y, z);
                    if (!level.getBlockState(pos).is(this.placeableOn())) {
                        continue;
                    }

                    for (Direction direction : DIRECTIONS) {
                        if (level.isStateAtPosition(pos.relative(direction), SpeleothemUtils::isEmptyOrWaterOrLava)) {
                            level.setBlock(pos,
                                    this.bloomState().value().getState(level, random, pos),
                                    Block.UPDATE_CLIENTS);
                            break;
                        }
                    }
                }
            }
        }
    }

    /**
     * Fills the collected positions with the spike block, then grows clusters on some of them.
     *
     * @return whether any part of the spike was placed
     */
    private boolean placeCrystals(WorldGenLevel level, RandomSource random, Set<BlockPos> crystalPositions) {
        List<BlockPos> spikePositions = new ArrayList<>();

        for (BlockPos pos : crystalPositions) {
            if (level.isStateAtPosition(pos, SpeleothemUtils::isEmptyOrWaterOrLava)) {
                this.setBlock(level, pos, this.crystalState().value().getState(level, random, pos));
                spikePositions.add(pos);
            }
        }

        for (BlockPos pos : spikePositions) {
            if (random.nextInt(CLUSTER_CHANCE) != 0) {
                continue;
            }

            for (Direction direction : DIRECTIONS) {
                BlockPos clusterPos = pos.relative(direction);
                if (random.nextBoolean() && level.isStateAtPosition(clusterPos, SpeleothemUtils::isEmptyOrWater)) {
                    BlockState blockState = this.clusterState()
                            .value()
                            .getState(level, random, clusterPos)
                            .trySetValue(BlockStateProperties.FACING, direction)
                            .trySetValue(BlockStateProperties.WATERLOGGED,
                                    level.getFluidState(clusterPos).getType() == Fluids.WATER);
                    this.setBlock(level, clusterPos, blockState);
                }
            }
        }

        return !spikePositions.isEmpty();
    }
}
