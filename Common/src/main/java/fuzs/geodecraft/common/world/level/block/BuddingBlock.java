package fuzs.geodecraft.common.world.level.block;

import com.mojang.serialization.MapCodec;
import fuzs.geodecraft.common.init.BlockRegistry;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.Holder;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.AmethystClusterBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.BuddingAmethystBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Fluids;
import org.jetbrains.annotations.Nullable;

import java.util.Objects;

public class BuddingBlock extends BuddingAmethystBlock {
    private static final Direction[] DIRECTIONS = Direction.values();

    private final Holder<Block> smallBlock;
    private final Holder<Block> mediumBlock;
    private final Holder<Block> largeBlock;
    private final Holder<Block> clusterBlock;
    private final int growthChance;

    protected BuddingBlock(Holder<Block> smallBlock, Holder<Block> mediumBlock, Holder<Block> largeBlock, Holder<Block> clusterBlock, int growthChance, Properties properties) {
        super(properties);
        this.smallBlock = Objects.requireNonNull(smallBlock);
        this.mediumBlock = Objects.requireNonNull(mediumBlock);
        this.largeBlock = Objects.requireNonNull(largeBlock);
        this.clusterBlock = Objects.requireNonNull(clusterBlock);
        this.growthChance = growthChance;
    }

    public static Block ancientDebris(Properties properties) {
        return new BuddingBlock(BlockRegistry.SMALL_ANCIENT_DEBRIS_BUD,
                BlockRegistry.MEDIUM_ANCIENT_DEBRIS_BUD,
                BlockRegistry.LARGE_ANCIENT_DEBRIS_BUD,
                BlockRegistry.ANCIENT_DEBRIS_CRYSTAL,
                20,
                properties);
    }

    public static Block glowstone(Properties properties) {
        return new BuddingBlock(BlockRegistry.SMALL_GLOWSTONE_BUD,
                BlockRegistry.MEDIUM_GLOWSTONE_BUD,
                BlockRegistry.LARGE_GLOWSTONE_BUD,
                BlockRegistry.GLOWSTONE_CRYSTAL,
                BuddingAmethystBlock.GROWTH_CHANCE,
                properties);
    }

    public static Block prismarine(Properties properties) {
        return new BuddingBlock(BlockRegistry.SMALL_PRISMARINE_BUD,
                BlockRegistry.MEDIUM_PRISMARINE_BUD,
                BlockRegistry.LARGE_PRISMARINE_BUD,
                BlockRegistry.PRISMARINE_CRYSTAL,
                BuddingAmethystBlock.GROWTH_CHANCE,
                properties);
    }

    @Override
    public MapCodec<BuddingAmethystBlock> codec() {
        throw new UnsupportedOperationException();
    }

    @Override
    protected void randomTick(BlockState state, ServerLevel level, BlockPos pos, RandomSource random) {
        if (random.nextInt(this.growthChance) == 0) {
            Direction direction = DIRECTIONS[random.nextInt(DIRECTIONS.length)];
            BlockPos neighborPos = pos.relative(direction);
            BlockState neighborState = level.getBlockState(neighborPos);
            Holder<Block> block = this.getClusterGrowthBlock(neighborState, direction);
            if (block != null) {
                BlockState updatedState = block.value()
                        .defaultBlockState()
                        .setValue(AmethystClusterBlock.FACING, direction)
                        .setValue(AmethystClusterBlock.WATERLOGGED,
                                neighborState.getFluidState().getType() == Fluids.WATER);
                level.setBlockAndUpdate(neighborPos, updatedState);
                this.onClusterGrown(state, level, pos);
            }
        }
    }

    protected void onClusterGrown(BlockState state, ServerLevel level, BlockPos pos) {
        // NO-OP
    }

    private @Nullable Holder<Block> getClusterGrowthBlock(BlockState state, Direction direction) {
        if (canClusterGrowAtState(state)) {
            return this.smallBlock;
        } else if (state.is(this.smallBlock) && state.getValue(AmethystClusterBlock.FACING) == direction) {
            return this.mediumBlock;
        } else if (state.is(this.mediumBlock) && state.getValue(AmethystClusterBlock.FACING) == direction) {
            return this.largeBlock;
        } else if (state.is(this.largeBlock) && state.getValue(AmethystClusterBlock.FACING) == direction) {
            return this.clusterBlock;
        } else {
            return null;
        }
    }
}
