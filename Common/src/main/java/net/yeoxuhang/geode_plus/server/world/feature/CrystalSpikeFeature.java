package net.yeoxuhang.geode_plus.server.world.feature;

import com.mojang.serialization.Codec;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.levelgen.feature.DripstoneUtils;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.material.Fluids;
import net.yeoxuhang.geode_plus.server.world.feature.config.CrystalSpikeConfiguration;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CrystalSpikeFeature extends Feature<CrystalSpikeConfiguration> {
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

    public CrystalSpikeFeature(Codec<CrystalSpikeConfiguration> codec) {
        super(codec);
    }

    @Override
    public boolean place(FeaturePlaceContext<CrystalSpikeConfiguration> context) {
        WorldGenLevel level = context.level();
        BlockPos origin = context.origin();
        RandomSource random = context.random();
        CrystalSpikeConfiguration config = context.config();
        Direction direction = config.crystalDirection().getDirection();
        if (!level.isStateAtPosition(origin.relative(direction.getOpposite()), DripstoneUtils::isEmptyOrWaterOrLava)) {
            return false;
        } else if (!level.getBlockState(origin).is(config.placeableOn())) {
            return false;
        } else {
            int radius = config.xzRadius().sample(random) + 1;
            float angle = SPIKE_ANGLES[random.nextInt(SPIKE_ANGLES.length)];
            int height = radius + 14 + Mth.nextInt(random, 10, 14);
            Set<BlockPos> crystalPositions = new HashSet<>();
            return this.placeSpike(level, config, random, origin, radius, height, angle, crystalPositions)
                    && this.placeCrystals(level, config, random, crystalPositions);
        }
    }

    /**
     * Collects the positions the spike is built from, and blooms the terrain it grows out of.
     *
     * @return whether at least one position is free for the spike to occupy
     */
    private boolean placeSpike(WorldGenLevel level, CrystalSpikeConfiguration config, RandomSource random, BlockPos origin, int startRadius, int height, float angle, Set<BlockPos> crystalPositions) {
        Direction direction = config.crystalDirection().getDirection();
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

                    this.bloomTerrain(level, config, random, pos.relative(direction), radius);
                    BlockPos crystalPos = pos.offset(sign * (int) (Mth.cos(angle) * y),
                            sign * y,
                            sign * (int) (Mth.sin(angle) * y));
                    if (level.isStateAtPosition(crystalPos, DripstoneUtils::isEmptyOrWaterOrLava)) {
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
                DripstoneUtils::isEmptyOrWaterOrLava); i++) {
            mutablePos.move(Direction.UP);
        }

        return level.isStateAtPosition(mutablePos.above(), DripstoneUtils::isEmptyOrWaterOrLava) ? null :
                mutablePos.immutable();
    }

    /**
     * Converts exposed terrain around the spike base into the configured bloom block.
     */
    private void bloomTerrain(WorldGenLevel level, CrystalSpikeConfiguration config, RandomSource random, BlockPos origin, int crystalRadius) {
        int radius = crystalRadius / 4;

        for (int x = -radius; x <= radius; x++) {
            for (int z = -radius; z <= radius; z++) {
                for (int y = -BLOOM_HEIGHT; y <= BLOOM_HEIGHT; y++) {
                    BlockPos pos = origin.offset(x, y, z);
                    if (!level.getBlockState(pos).is(config.placeableOn())) {
                        continue;
                    }

                    for (Direction direction : DIRECTIONS) {
                        if (level.isStateAtPosition(pos.relative(direction), DripstoneUtils::isEmptyOrWaterOrLava)) {
                            level.setBlock(pos, config.bloomState().getState(random, pos), Block.UPDATE_CLIENTS);
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
    private boolean placeCrystals(WorldGenLevel level, CrystalSpikeConfiguration config, RandomSource random, Set<BlockPos> crystalPositions) {
        List<BlockPos> spikePositions = new ArrayList<>();

        for (BlockPos pos : crystalPositions) {
            if (level.isStateAtPosition(pos, DripstoneUtils::isEmptyOrWaterOrLava)) {
                this.setBlock(level, pos, config.crystalState().getState(random, pos));
                spikePositions.add(pos);
            }
        }

        for (BlockPos pos : spikePositions) {
            if (random.nextInt(CLUSTER_CHANCE) != 0) {
                continue;
            }

            for (Direction direction : DIRECTIONS) {
                BlockPos clusterPos = pos.relative(direction);
                if (random.nextBoolean() && level.isStateAtPosition(clusterPos, DripstoneUtils::isEmptyOrWater)) {
                    BlockState blockState = config.clusterState()
                            .getState(random, clusterPos)
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
