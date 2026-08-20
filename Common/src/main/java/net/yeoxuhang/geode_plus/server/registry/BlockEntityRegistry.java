package net.yeoxuhang.geode_plus.server.registry;

import net.minecraft.core.Holder;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.yeoxuhang.geode_plus.server.block.entity.WrappistPedestalBlockEntity;

public class BlockEntityRegistry {
    public static final Holder.Reference<BlockEntityType<WrappistPedestalBlockEntity>> WRAPPIST_PEDESTAL = ModRegistry.REGISTRY.registerBlockEntityType(
            "wrappist_pedestal",
            WrappistPedestalBlockEntity::new,
            BlockRegistry.WRAPPIST_PEDESTAL);

    public static void bootstrap() {
        // NO-OP
    }
}
