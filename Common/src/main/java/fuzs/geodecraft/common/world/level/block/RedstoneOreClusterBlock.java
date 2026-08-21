package fuzs.geodecraft.common.world.level.block;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.DustParticleOptions;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraft.util.valueproviders.IntProvider;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.ItemInteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.AmethystClusterBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RedstoneTorchBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

/**
 * @see net.minecraft.world.level.block.RedStoneOreBlock
 */
public class RedstoneOreClusterBlock extends DropExperienceClusterBlock {
    public static final BooleanProperty LIT = RedstoneTorchBlock.LIT;

    public RedstoneOreClusterBlock(float height, float aabbOffset, IntProvider xpRange, Properties properties) {
        super(height, aabbOffset, xpRange, properties);
        this.registerDefaultState(this.defaultBlockState().setValue(LIT, Boolean.FALSE));
    }

    @Override
    public MapCodec<AmethystClusterBlock> codec() {
        throw new UnsupportedOperationException();
    }

    @Override
    protected void attack(BlockState state, Level level, BlockPos pos, Player player) {
        interact(state, level, pos);
        super.attack(state, level, pos, player);
    }

    @Override
    protected void entityInside(BlockState state, Level level, BlockPos pos, Entity entity) {
        if (!entity.isSteppingCarefully()) {
            interact(state, level, pos);
        }

        super.entityInside(state, level, pos, entity);
    }

    @Override
    protected ItemInteractionResult useItemOn(ItemStack stack, BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hitResult) {
        if (level.isClientSide) {
            spawnParticles(state, level, pos, level.getRandom());
        } else {
            interact(state, level, pos);
        }

        return stack.getItem() instanceof BlockItem && new BlockPlaceContext(player,
                hand,
                stack,
                hitResult).canPlace() ? ItemInteractionResult.SKIP_DEFAULT_BLOCK_INTERACTION :
                ItemInteractionResult.SUCCESS;
    }

    private static void interact(BlockState state, Level level, BlockPos pos) {
        spawnParticles(state, level, pos, level.getRandom());
        if (!state.getValue(LIT)) {
            level.setBlock(pos, state.setValue(LIT, Boolean.TRUE), Block.UPDATE_ALL);
        }
    }

    @Override
    protected boolean isRandomlyTicking(BlockState state) {
        return state.getValue(LIT);
    }

    @Override
    protected void randomTick(BlockState state, ServerLevel level, BlockPos pos, RandomSource random) {
        if (state.getValue(LIT)) {
            level.setBlock(pos, state.setValue(LIT, Boolean.FALSE), Block.UPDATE_ALL);
        }
    }

    @Override
    public void animateTick(BlockState state, Level level, BlockPos pos, RandomSource random) {
        if (state.getValue(LIT)) {
            spawnParticles(state, level, pos, random);
        }
    }

    private static void spawnParticles(BlockState state, Level level, BlockPos pos, RandomSource random) {
        VoxelShape shape = state.getShape(level, pos, CollisionContext.empty());
        shape.forAllEdges((double minX, double minY, double minZ, double maxX, double maxY, double maxZ) -> {
            if (random.nextInt(3) == 0) {
                double x = randomBetween(random, minX, maxX);
                double y = randomBetween(random, minY, maxY);
                double z = randomBetween(random, minZ, maxZ);
                if (x % 16.0 != 0.0 && y % 16.0 != 0.0 && z % 16.0 != 0.0) {
                    level.addParticle(DustParticleOptions.REDSTONE,
                            pos.getX() + x,
                            pos.getY() + y,
                            pos.getZ() + z,
                            0.0,
                            0.0,
                            0.0);
                }
            }
        });
    }

    /**
     * @see Mth#randomBetween(RandomSource, float, float)
     */
    private static double randomBetween(RandomSource random, double minInclusive, double maxExclusive) {
        return random.nextDouble() * (maxExclusive - minInclusive) + minInclusive;
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        super.createBlockStateDefinition(builder);
        builder.add(LIT);
    }
}
