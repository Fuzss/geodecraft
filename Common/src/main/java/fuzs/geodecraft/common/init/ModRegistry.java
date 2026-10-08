package fuzs.geodecraft.common.init;

import fuzs.geodecraft.common.Geodecraft;
import fuzs.puzzleslib.common.api.init.v3.registry.RegistryManager;
import net.minecraft.core.Holder;
import net.minecraft.world.item.CreativeModeTab;

public class ModRegistry {
    static final RegistryManager REGISTRIES = RegistryManager.from(Geodecraft.MOD_ID);
    public static final Holder.Reference<CreativeModeTab> CREATIVE_MODE_TAB = REGISTRIES.registerCreativeModeTab(
            ItemRegistry.WRAPPIST_SHARD);

    public static void bootstrap() {
        BlockRegistry.bootstrap();
        ItemRegistry.bootstrap();
        BlockEntityRegistry.bootstrap();
        PotionRegistry.bootstrap();
        FeatureTypeRegistry.bootstrap();
    }
}
