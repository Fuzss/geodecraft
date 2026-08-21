package fuzs.geodecraft.common.world.level.block;

import com.mojang.serialization.MapCodec;
import fuzs.geodecraft.common.init.BlockRegistry;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Holder;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.valueproviders.IntProvider;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.BuddingAmethystBlock;
import net.minecraft.world.level.block.state.BlockState;

/**
 * @see net.minecraft.world.level.block.DropExperienceBlock
 */
public class BuddingDropExperienceBlock extends BuddingBlock {
    private final IntProvider xpRange;

    protected BuddingDropExperienceBlock(Holder<Block> smallBlock, Holder<Block> mediumBlock, Holder<Block> largeBlock, Holder<Block> clusterBlock, int growthChance, IntProvider xpRange, Properties properties) {
        super(smallBlock, mediumBlock, largeBlock, clusterBlock, growthChance, properties);
        this.xpRange = xpRange;
    }

    public static Block diamond(Properties properties) {
        return new BuddingDropExperienceBlock(BlockRegistry.SMALL_DIAMOND_BUD,
                BlockRegistry.MEDIUM_DIAMOND_BUD,
                BlockRegistry.LARGE_DIAMOND_BUD,
                BlockRegistry.DIAMOND_CRYSTAL,
                15,
                UniformInt.of(3, 7),
                properties);
    }

    public static Block emerald(Properties properties) {
        return new BuddingDropExperienceBlock(BlockRegistry.SMALL_EMERALD_BUD,
                BlockRegistry.MEDIUM_EMERALD_BUD,
                BlockRegistry.LARGE_EMERALD_BUD,
                BlockRegistry.EMERALD_CLUSTER,
                10,
                UniformInt.of(3, 7),
                properties);
    }

    public static Block goldNugget(Properties properties) {
        return new BuddingDropExperienceBlock(BlockRegistry.SMALL_GOLD_NUGGET_BUD,
                BlockRegistry.MEDIUM_GOLD_NUGGET_BUD,
                BlockRegistry.LARGE_GOLD_NUGGET_BUD,
                BlockRegistry.GOLD_NUGGET_CLUSTER,
                BuddingAmethystBlock.GROWTH_CHANCE,
                UniformInt.of(0, 1),
                properties);
    }

    public static Block lapisLazuli(Properties properties) {
        return new BuddingDropExperienceBlock(BlockRegistry.SMALL_LAPIS_LAZULI_BUD,
                BlockRegistry.MEDIUM_LAPIS_LAZULI_BUD,
                BlockRegistry.LARGE_LAPIS_LAZULI_BUD,
                BlockRegistry.LAPIS_LAZULI_CLUSTER,
                BuddingAmethystBlock.GROWTH_CHANCE,
                UniformInt.of(2, 5),
                properties);
    }

    public static Block netherQuartz(Properties properties) {
        return new BuddingDropExperienceBlock(BlockRegistry.SMALL_NETHER_QUARTZ_BUD,
                BlockRegistry.MEDIUM_NETHER_QUARTZ_BUD,
                BlockRegistry.LARGE_NETHER_QUARTZ_BUD,
                BlockRegistry.NETHER_QUARTZ_CRYSTAL,
                BuddingAmethystBlock.GROWTH_CHANCE,
                UniformInt.of(2, 5),
                properties);
    }

    public static Block redstone(Properties properties) {
        return new BuddingDropExperienceBlock(BlockRegistry.SMALL_REDSTONE_BUD,
                BlockRegistry.MEDIUM_REDSTONE_BUD,
                BlockRegistry.LARGE_REDSTONE_BUD,
                BlockRegistry.REDSTONE_CRYSTAL,
                BuddingAmethystBlock.GROWTH_CHANCE,
                UniformInt.of(1, 5),
                properties);
    }

    @Override
    public MapCodec<BuddingAmethystBlock> codec() {
        throw new UnsupportedOperationException();
    }

    @Override
    protected void spawnAfterBreak(BlockState state, ServerLevel level, BlockPos pos, ItemStack stack, boolean dropExperience) {
        super.spawnAfterBreak(state, level, pos, stack, dropExperience);
        if (dropExperience) {
            this.tryDropExperience(level, pos, stack, this.xpRange);
        }
    }
}
