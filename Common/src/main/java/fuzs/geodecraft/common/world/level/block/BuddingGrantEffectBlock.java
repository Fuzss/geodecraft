package fuzs.geodecraft.common.world.level.block;

import com.mojang.serialization.MapCodec;
import fuzs.geodecraft.common.init.BlockRegistry;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Holder;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffectUtil;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.BuddingAmethystBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;

public class BuddingGrantEffectBlock extends BuddingBlock {
    private final Holder<MobEffect> effect;

    protected BuddingGrantEffectBlock(Holder<Block> smallBlock, Holder<Block> mediumBlock, Holder<Block> largeBlock, Holder<Block> clusterBlock, int growthChance, Holder<MobEffect> effect, Properties properties) {
        super(smallBlock, mediumBlock, largeBlock, clusterBlock, growthChance, properties);
        this.effect = effect;
    }

    public static Block celestite(Properties properties) {
        return new BuddingGrantEffectBlock(BlockRegistry.SMALL_CELESTITE_BUD,
                BlockRegistry.MEDIUM_CELESTITE_BUD,
                BlockRegistry.LARGE_CELESTITE_BUD,
                BlockRegistry.CELESTITE_CLUSTER,
                BuddingAmethystBlock.GROWTH_CHANCE,
                MobEffects.DAMAGE_BOOST,
                properties);
    }

    public static Block pinkTopaz(Properties properties) {
        return new BuddingGrantEffectBlock(BlockRegistry.SMALL_PINK_TOPAZ_BUD,
                BlockRegistry.MEDIUM_PINK_TOPAZ_BUD,
                BlockRegistry.LARGE_PINK_TOPAZ_BUD,
                BlockRegistry.PINK_TOPAZ_CLUSTER,
                BuddingAmethystBlock.GROWTH_CHANCE,
                MobEffects.LUCK,
                properties);
    }

    public static Block wrappist(Properties properties) {
        return new BuddingGrantEffectBlock(BlockRegistry.SMALL_WRAPPIST_BUD,
                BlockRegistry.MEDIUM_WRAPPIST_BUD,
                BlockRegistry.LARGE_WRAPPIST_BUD,
                BlockRegistry.WRAPPIST_CLUSTER,
                BuddingAmethystBlock.GROWTH_CHANCE,
                MobEffects.DIG_SPEED,
                properties);
    }

    @Override
    public MapCodec<BuddingAmethystBlock> codec() {
        throw new UnsupportedOperationException();
    }

    @Override
    protected void onClusterGrown(BlockState state, ServerLevel level, BlockPos pos) {
        applyEffectAround(this.effect, level, pos, 300, 24);
    }

    /**
     * @see net.minecraft.world.entity.monster.warden.Warden#applyDarknessAround(ServerLevel, Vec3, Entity, int)
     */
    public static void applyEffectAround(Holder<MobEffect> effect, ServerLevel level, BlockPos pos, int duration, int radius) {
        MobEffectInstance effectInstance = new MobEffectInstance(effect, duration, 0, false, false);
        MobEffectUtil.addEffectToPlayersAround(level, null, Vec3.atCenterOf(pos), radius, effectInstance, 200);
    }
}
