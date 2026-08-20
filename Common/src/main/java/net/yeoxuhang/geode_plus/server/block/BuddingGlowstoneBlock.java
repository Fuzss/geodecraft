package net.yeoxuhang.geode_plus.server.block;

import fuzs.geodecraft.common.config.CommonConfig;
import fuzs.geodecraft.common.init.BlockRegistry;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.AmethystBlock;
import net.minecraft.world.level.block.AmethystClusterBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.storage.loot.LootParams;
import net.yeoxuhang.geode_plus.GeodePlus;

import java.util.Collections;
import java.util.List;

public class BuddingGlowstoneBlock extends AmethystBlock {
    public static final int GROWTH_CHANCE = 5;
    private static final Direction[] DIRECTIONS = Direction.values();

    public BuddingGlowstoneBlock(Properties p_152726_) {
        super(p_152726_);
    }

    public PushReaction getPistonPushReaction(BlockState p_152733_) {
        return PushReaction.DESTROY;
    }

    public void randomTick(BlockState p_220898_, ServerLevel p_220899_, BlockPos p_220900_, RandomSource p_220901_) {
        if (p_220901_.nextInt(5) == 0) {
            Direction direction = DIRECTIONS[p_220901_.nextInt(DIRECTIONS.length)];
            BlockPos blockpos = p_220900_.relative(direction);
            BlockState blockstate = p_220899_.getBlockState(blockpos);
            Block block = null;
            if (canClusterGrowAtState(blockstate)) {
                block = BlockRegistry.SMALL_GLOWSTONE_BUD.value();
            } else if (blockstate.is(BlockRegistry.SMALL_GLOWSTONE_BUD.value())
                    && blockstate.getValue(AmethystClusterBlock.FACING) == direction) {
                block = BlockRegistry.MEDIUM_GLOWSTONE_BUD.value();
            } else if (blockstate.is(BlockRegistry.MEDIUM_GLOWSTONE_BUD.value())
                    && blockstate.getValue(AmethystClusterBlock.FACING) == direction) {
                block = BlockRegistry.LARGE_GLOWSTONE_BUD.value();
            } else if (blockstate.is(BlockRegistry.LARGE_GLOWSTONE_BUD.value())
                    && blockstate.getValue(AmethystClusterBlock.FACING) == direction) {
                block = BlockRegistry.GLOWSTONE_CLUSTER.value();
            }

            if (block != null) {
                BlockState blockstate1 = block.defaultBlockState()
                        .setValue(AmethystClusterBlock.FACING, direction)
                        .setValue(AmethystClusterBlock.WATERLOGGED,
                                Boolean.valueOf(blockstate.getFluidState().getType() == Fluids.WATER));
                p_220899_.setBlockAndUpdate(blockpos, blockstate1);
            }

        }
    }

    public static boolean canClusterGrowAtState(BlockState p_152735_) {
        return p_152735_.isAir() || p_152735_.is(net.minecraft.world.level.block.Blocks.WATER)
                && p_152735_.getFluidState().getAmount() == 8;
    }

    @Override
    public List<ItemStack> getDrops(BlockState blockState, LootParams.Builder builder) {
        ItemStack pickaxe = builder.getLevel().players().get(0).getMainHandItem();
        ItemStack nether = new ItemStack(BlockRegistry.BUDDING_GLOWSTONE.value());
        ItemStack basalt = new ItemStack(BlockRegistry.BUDDING_BASALT_GLOWSTONE.value());
        ItemStack blackstone = new ItemStack(BlockRegistry.BUDDING_BLACKSTONE_GLOWSTONE.value());
        if (GeodePlus.hasSilkTouch(builder, pickaxe) && CommonConfig.Blocks.allowSilkTouch && blockState.is(
                BlockRegistry.BUDDING_GLOWSTONE.value())) {
            return Collections.singletonList(nether);
        }
        if (GeodePlus.hasSilkTouch(builder, pickaxe) && CommonConfig.Blocks.allowSilkTouch && blockState.is(
                BlockRegistry.BUDDING_BASALT_GLOWSTONE.value())) {
            return Collections.singletonList(basalt);
        }
        if (GeodePlus.hasSilkTouch(builder, pickaxe) && CommonConfig.Blocks.allowSilkTouch && blockState.is(
                BlockRegistry.BUDDING_BLACKSTONE_GLOWSTONE.value())) {
            return Collections.singletonList(blackstone);
        }
        return super.getDrops(blockState, builder);
    }
}
