package net.yeoxuhang.geode_plus.server.block;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.valueproviders.IntProvider;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.AmethystClusterBlock;
import net.minecraft.world.level.block.state.BlockState;

/**
 * @see net.minecraft.world.level.block.DropExperienceBlock
 */
public class OresClusterBlock extends AmethystClusterBlock {
    private final IntProvider xpRange;

    public OresClusterBlock(float height, float aabbOffset, IntProvider xpRange, Properties properties) {
        super(height, aabbOffset, properties);
        this.xpRange = xpRange;
    }

    @Override
    public MapCodec<AmethystClusterBlock> codec() {
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
