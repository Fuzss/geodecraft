package fuzs.geodecraft.common.world.level.block;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.valueproviders.IntProvider;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.AmethystClusterBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

/**
 * @see net.minecraft.world.level.block.DropExperienceBlock
 */
public class DropExperienceClusterBlock extends AmethystClusterBlock {
    /**
     * @see net.minecraft.world.level.block.Blocks#AMETHYST_CLUSTER
     */
    public static final float CLUSTER_HEIGHT = 7.0F;
    /**
     * @see net.minecraft.world.level.block.Blocks#LARGE_AMETHYST_BUD
     */
    public static final float LARGE_CLUSTER_HEIGHT = 5.0F;
    /**
     * @see net.minecraft.world.level.block.Blocks#MEDIUM_AMETHYST_BUD
     */
    public static final float MEDIUM_CLUSTER_HEIGHT = 4.0F;
    /**
     * @see net.minecraft.world.level.block.Blocks#SMALL_AMETHYST_BUD
     */
    public static final float SMALL_CLUSTER_HEIGHT = 3.0F;
    /**
     * @see net.minecraft.world.level.block.Blocks#AMETHYST_CLUSTER
     */
    public static final float CLUSTER_WIDTH = 10.0F;
    /**
     * @see net.minecraft.world.level.block.Blocks#LARGE_AMETHYST_BUD
     */
    public static final float LARGE_CLUSTER_WIDTH = 10.0F;
    /**
     * @see net.minecraft.world.level.block.Blocks#MEDIUM_AMETHYST_BUD
     */
    public static final float MEDIUM_CLUSTER_WIDTH = 10.0F;
    /**
     * @see net.minecraft.world.level.block.Blocks#SMALL_AMETHYST_BUD
     */
    public static final float SMALL_CLUSTER_WIDTH = 8.0F;

    private final IntProvider xpRange;

    protected DropExperienceClusterBlock(float height, float width, IntProvider xpRange, Properties properties) {
        super(height, width, properties);
        this.xpRange = xpRange;
    }

    public static Block cluster(IntProvider xpRange, Properties properties) {
        return new DropExperienceClusterBlock(CLUSTER_HEIGHT, CLUSTER_WIDTH, xpRange, properties);
    }

    public static Block large(IntProvider xpRange, Properties properties) {
        return new DropExperienceClusterBlock(LARGE_CLUSTER_HEIGHT, LARGE_CLUSTER_WIDTH, xpRange, properties);
    }

    public static Block medium(IntProvider xpRange, Properties properties) {
        return new DropExperienceClusterBlock(MEDIUM_CLUSTER_HEIGHT, MEDIUM_CLUSTER_WIDTH, xpRange, properties);
    }

    public static Block small(IntProvider xpRange, Properties properties) {
        return new DropExperienceClusterBlock(SMALL_CLUSTER_HEIGHT, SMALL_CLUSTER_WIDTH, xpRange, properties);
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
