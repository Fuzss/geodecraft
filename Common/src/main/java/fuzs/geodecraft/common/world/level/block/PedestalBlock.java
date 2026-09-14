package fuzs.geodecraft.common.world.level.block;

import com.mojang.serialization.MapCodec;
import fuzs.geodecraft.common.init.BlockEntityRegistry;
import fuzs.geodecraft.common.world.level.block.entity.PedestalBlockEntity;
import fuzs.puzzleslib.common.api.block.v1.entity.TickingEntityBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.Containers;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.BaseEntityBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.level.pathfinder.PathComputationType;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class PedestalBlock extends BaseEntityBlock implements TickingEntityBlock<PedestalBlockEntity> {
    private static final VoxelShape SHAPE = Block.box(1.0, 0.0, 1.0, 15.0, 8.0, 15.0);

    public PedestalBlock(Properties properties) {
        super(properties);
    }

    @Override
    protected MapCodec<? extends BaseEntityBlock> codec() {
        throw new UnsupportedOperationException();
    }

    @Override
    public BlockEntityType<? extends PedestalBlockEntity> getBlockEntityType() {
        return BlockEntityRegistry.PEDESTAL.value();
    }

    @Override
    public RenderShape getRenderShape(BlockState state) {
        return RenderShape.MODEL;
    }

    @Override
    protected VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        return SHAPE;
    }

    @Override
    protected boolean canSurvive(BlockState state, LevelReader level, BlockPos pos) {
        return canSupportRigidBlock(level, pos.below());
    }

    @Override
    protected InteractionResult useItemOn(ItemStack heldItem, BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hitResult) {
        if (level.getBlockEntity(pos) instanceof PedestalBlockEntity blockEntity) {
            if (level.isClientSide()) {
                return heldItem.isEmpty() ? InteractionResult.TRY_WITH_EMPTY_HAND :
                        InteractionResult.SUCCESS;
            }

            ItemStack removedItem = blockEntity.swapItem(0, heldItem);
            level.gameEvent(GameEvent.ITEM_INTERACT_FINISH, pos, GameEvent.Context.of(state));
            ItemStack updatedHeldItem =
                    player.hasInfiniteMaterials() && removedItem.isEmpty() ? heldItem.copy() : removedItem;
            player.setItemInHand(hand, updatedHeldItem);
            if (!removedItem.isEmpty()) {
                this.playInteractSound(level, pos, !heldItem.isEmpty());
            } else {
                if (heldItem.isEmpty()) {
                    return InteractionResult.TRY_WITH_EMPTY_HAND;
                } else {
                    this.playInteractSound(level, pos, true);
                }
            }

            return InteractionResult.CONSUME;
        } else {
            return super.useItemOn(heldItem, state, level, pos, player, hand, hitResult);
        }
    }

    private void playInteractSound(Level level, BlockPos pos, boolean insert) {
        float pitch =
                insert ? 0.9F + level.getRandom().nextFloat() * 0.2F : 0.65F + level.getRandom().nextFloat() * 0.15F;
        level.playSound(null, pos, SoundEvents.ITEM_PICKUP, SoundSource.BLOCKS, 1.0F, pitch);
    }

    @Override
    protected void affectNeighborsAfterRemoval(BlockState state, ServerLevel level, BlockPos pos, boolean isMoving) {
        Containers.updateNeighboursAfterDestroy(state, level, pos);
    }

    @Override
    protected boolean hasAnalogOutputSignal(BlockState state) {
        return true;
    }

    @Override
    protected int getAnalogOutputSignal(BlockState blockState, Level level, BlockPos pos, Direction direction) {
        return AbstractContainerMenu.getRedstoneSignalFromBlockEntity(level.getBlockEntity(pos));
    }

    @Override
    protected boolean isPathfindable(BlockState state, PathComputationType pathComputationType) {
        return false;
    }
}
