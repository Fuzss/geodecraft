package fuzs.geodecraft.common.init;

import fuzs.geodecraft.common.Geodecraft;
import fuzs.puzzleslib.api.init.v3.registry.RegistryManager;
import net.minecraft.core.Holder;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.CreativeModeTab;

public class ModRegistry {
    public static final RegistrySetBuilder REGISTRIES_BUILDER = new RegistrySetBuilder().add(Registries.CONFIGURED_FEATURE,
                    ConfiguredFeatureRegistry::bootstrap)
            .add(Registries.PLACED_FEATURE, PlacedFeatureRegistry::bootstrap)
            .add(Registries.TRIM_MATERIAL, TrimMaterialRegistry::bootstrapMaterials)
            .add(Registries.TRIM_PATTERN, TrimPatternRegistry::bootstrapPatterns);
    static final RegistryManager REGISTRIES = RegistryManager.from(Geodecraft.MOD_ID);
    public static final Holder.Reference<CreativeModeTab> CREATIVE_MODE_TAB = REGISTRIES.registerCreativeModeTab(
            ItemRegistry.WRAPPIST_SHARD);

    public static void bootstrap() {
        BlockRegistry.bootstrap();
        ItemRegistry.bootstrap();
        BlockEntityRegistry.bootstrap();
        PotionRegistry.bootstrap();
        FeatureRegistry.bootstrap();
    }
}
