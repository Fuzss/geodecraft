package net.yeoxuhang.geode_plus.server.block.entity;

import fuzs.geodecraft.common.init.BlockEntityRegistry;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.NonNullList;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.world.ContainerHelper;
import net.minecraft.world.WorldlyContainer;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.entity.BaseContainerBlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.Nullable;

public class WrappistPedestalBlockEntity extends BaseContainerBlockEntity implements WorldlyContainer {
    private NonNullList<ItemStack> stacks = NonNullList.withSize(1, ItemStack.EMPTY);

    public WrappistPedestalBlockEntity(BlockPos pWorldPosition, BlockState pBlockState) {
        super(BlockEntityRegistry.WRAPPIST_PEDESTAL.value(), pWorldPosition, pBlockState);
    }

    @Override
    public int[] getSlotsForFace(Direction direction) {
        return new int[0];
    }

    @Override
    public boolean canPlaceItemThroughFace(int i, ItemStack stack, @Nullable Direction direction) {
        return true;
    }

    @Override
    public boolean canTakeItemThroughFace(int i, ItemStack stack, Direction direction) {
        return false;
    }

    @Override
    public int getContainerSize() {
        return 1;
    }

    @Override
    public boolean isEmpty() {
        for (int i = 0; i < this.getContainerSize(); i++) {
            if (!this.getItem(i).isEmpty()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public ItemStack getItem(int i) {
        return this.stacks.get(i);
    }

    @Override
    public ItemStack removeItem(int i, int j) {
        if (!this.stacks.get(i).isEmpty()) {
            ItemStack itemstack;

            if (this.stacks.get(i).getCount() <= j) {
                itemstack = this.stacks.get(i);
                this.stacks.set(i, ItemStack.EMPTY);
            } else {
                itemstack = this.stacks.get(i).split(j);

                if (this.stacks.get(i).isEmpty()) {
                    this.stacks.set(i, ItemStack.EMPTY);
                }

            }
            return itemstack;
        } else {
            return ItemStack.EMPTY;
        }
    }

    @Override
    public ItemStack removeItemNoUpdate(int i) {
        ItemStack stack = this.stacks.get(i);
        if (stack.isEmpty()) {
            return ItemStack.EMPTY;
        } else {
            this.stacks.set(i, ItemStack.EMPTY);
            return stack;
        }
    }

    @Override
    public void setItem(int i, ItemStack itemStack) {
        this.stacks.set(i, itemStack);
        if (!itemStack.isEmpty() && itemStack.getCount() > this.getMaxStackSize()) {
            itemStack.setCount(this.getMaxStackSize());
        }

//        this.saveAdditional(this.getUpdateTag());
    }

    @Override
    public void clearContent() {
        this.stacks.clear();
    }

    @Override
    public void loadAdditional(CompoundTag compound, HolderLookup.Provider registries) {
        super.loadAdditional(compound, registries);
        this.stacks = NonNullList.withSize(this.getContainerSize(), ItemStack.EMPTY);
        ContainerHelper.loadAllItems(compound, this.stacks, registries);
    }

    @Override
    public void saveAdditional(CompoundTag compound, HolderLookup.Provider registries) {
        super.saveAdditional(compound, registries);
        ContainerHelper.saveAllItems(compound, this.stacks, registries);
    }

    @Override
    public Component getDisplayName() {
        return this.getDefaultName();
    }

    @Override
    protected Component getDefaultName() {
        return Component.translatable("block.geode_plus.wrappist_pedestal");
    }

    @Override
    protected NonNullList<ItemStack> getItems() {
        return this.stacks;
    }

    @Override
    protected void setItems(NonNullList<ItemStack> items) {
        this.stacks = items;
    }

    @Override
    protected AbstractContainerMenu createMenu(int i, Inventory inventory) {
        return null;
    }

    @Override
    public CompoundTag getUpdateTag(HolderLookup.Provider registries) {
        CompoundTag tag = new CompoundTag();
        this.saveAdditional(tag, registries);
        return tag;
    }

    @Override
    public boolean stillValid(Player player) {
        return this.worldPosition.distSqr(player.blockPosition()) <= 16.0;
    }

    @Override
    public int getMaxStackSize() {
        return 64;
    }
}
