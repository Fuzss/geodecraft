package fuzs.geodecraft.common.world.level.block;

import fuzs.geodecraft.common.init.BlockRegistry;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Holder;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.valueproviders.IntProvider;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

public class BuddingEchoCrystalBlock extends BuddingDropExperienceBlock {

    protected BuddingEchoCrystalBlock(Holder<Block> smallBlock, Holder<Block> mediumBlock, Holder<Block> largeBlock, Holder<Block> clusterBlock, int growthChance, IntProvider xpRange, Properties properties) {
        super(smallBlock, mediumBlock, largeBlock, clusterBlock, growthChance, xpRange, properties);
    }

    public static Block echoCrystal(Properties properties) {
        return new BuddingEchoCrystalBlock(BlockRegistry.SMALL_ECHO_BUD,
                BlockRegistry.MEDIUM_ECHO_BUD,
                BlockRegistry.LARGE_ECHO_BUD,
                BlockRegistry.ECHO_CRYSTAL,
                15,
                UniformInt.of(3, 7),
                properties);
    }

    @Override
    protected void onClusterGrown(BlockState state, ServerLevel level, BlockPos pos) {
        BuddingGrantEffectBlock.applyEffectAround(MobEffects.DARKNESS, level, pos, 200, 20);
    }
}
