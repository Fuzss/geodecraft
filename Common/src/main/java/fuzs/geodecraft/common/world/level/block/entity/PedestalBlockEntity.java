package fuzs.geodecraft.common.world.level.block.entity;

import fuzs.geodecraft.common.init.BlockEntityRegistry;
import fuzs.puzzleslib.api.block.v1.entity.TickingBlockEntity;
import fuzs.puzzleslib.api.container.v1.ListBackedContainer;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.NonNullList;
import net.minecraft.core.component.DataComponentMap;
import net.minecraft.core.component.DataComponents;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.protocol.game.ClientboundBlockEntityDataPacket;
import net.minecraft.world.Container;
import net.minecraft.world.ContainerHelper;
import net.minecraft.world.WorldlyContainer;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.component.ItemContainerContents;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.Nullable;

public class PedestalBlockEntity extends BlockEntity implements ListBackedContainer, WorldlyContainer, TickingBlockEntity {
    private static final int[] SLOTS = new int[]{0};

    private final NonNullList<ItemStack> items = NonNullList.withSize(1, ItemStack.EMPTY);
    private int time;

    public PedestalBlockEntity(BlockPos pos, BlockState blockState) {
        super(BlockEntityRegistry.PEDESTAL.value(), pos, blockState);
    }

    public float getTime(float partialTicks) {
        return this.time + partialTicks;
    }

    @Override
    public void clientTick(Level level, BlockPos blockPos, BlockState blockState) {
        this.time++;
    }

    @Override
    protected void loadAdditional(CompoundTag tag, HolderLookup.Provider context) {
        super.loadAdditional(tag, context);
        this.items.clear();
        ContainerHelper.loadAllItems(tag, this.items, context);
    }

    @Override
    protected void saveAdditional(CompoundTag tag, HolderLookup.Provider context) {
        super.saveAdditional(tag, context);
        ContainerHelper.saveAllItems(tag, this.items, context);
    }

    @Override
    public ClientboundBlockEntityDataPacket getUpdatePacket() {
        return ClientboundBlockEntityDataPacket.create(this);
    }

    @Override
    public CompoundTag getUpdateTag(HolderLookup.Provider context) {
        CompoundTag tag = new CompoundTag();
        this.saveAdditional(tag, context);
        return tag;
    }

    @Override
    public NonNullList<ItemStack> getContainerItems() {
        return this.items;
    }

    @Override
    public boolean stillValid(Player player) {
        return Container.stillValidBlockEntity(this, player);
    }

    public ItemStack swapItem(int slot, ItemStack heldItem) {
        ItemStack retrievedItem = this.removeItemNoUpdate(slot);
        this.setItem(slot, heldItem);
        return retrievedItem;
    }

    @Override
    public void setChanged() {
        super.setChanged();
        this.getLevel()
                .sendBlockUpdated(this.getBlockPos(), this.getBlockState(), this.getBlockState(), Block.UPDATE_ALL);
    }

    @Override
    public int[] getSlotsForFace(Direction direction) {
        return SLOTS;
    }

    @Override
    public boolean canPlaceItemThroughFace(int index, ItemStack itemStack, @Nullable Direction direction) {
        return direction != Direction.DOWN;
    }

    @Override
    public boolean canTakeItemThroughFace(int index, ItemStack itemStack, Direction direction) {
        return direction == Direction.DOWN;
    }

    @Override
    protected void applyImplicitComponents(BlockEntity.DataComponentInput componentInput) {
        super.applyImplicitComponents(componentInput);
        componentInput.getOrDefault(DataComponents.CONTAINER, ItemContainerContents.EMPTY)
                .copyInto(this.getContainerItems());
    }

    @Override
    protected void collectImplicitComponents(DataComponentMap.Builder components) {
        super.collectImplicitComponents(components);
        components.set(DataComponents.CONTAINER, ItemContainerContents.fromItems(this.getContainerItems()));
    }

    @Override
    public void removeComponentsFromTag(CompoundTag tag) {
        tag.remove(ContainerHelper.TAG_ITEMS);
    }
}
