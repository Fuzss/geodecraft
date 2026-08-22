package fuzs.geodecraft.common.init;

import fuzs.geodecraft.common.world.level.block.entity.PedestalBlockEntity;
import net.minecraft.core.Holder;
import net.minecraft.world.level.block.entity.BlockEntityType;

public class BlockEntityRegistry {
    public static final Holder.Reference<BlockEntityType<PedestalBlockEntity>> PEDESTAL = ModRegistry.REGISTRIES.registerBlockEntityType(
            "pedestal",
            PedestalBlockEntity::new,
            BlockRegistry.PEDESTAL);

    public static void bootstrap() {
        // NO-OP
    }
}
