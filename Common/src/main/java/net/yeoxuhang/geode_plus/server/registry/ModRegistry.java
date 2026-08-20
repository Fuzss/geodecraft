package net.yeoxuhang.geode_plus.server.registry;

import fuzs.puzzleslib.api.init.v3.registry.RegistryManager;
import net.yeoxuhang.geode_plus.GeodePlus;

public class ModRegistry {
    static final RegistryManager REGISTRY = RegistryManager.from(GeodePlus.MOD_ID);

    public static void bootstrap() {
        ItemRegistry.bootstrap();
        TrimMaterialsAndPatternsRegistry.bootstrap();
        BlockRegistry.bootstrap();
        BlockEntityRegistry.bootstrap();
        FeatureRegistry.bootstrap();
        PlacedFeatureRegistry.bootstrap();
        ConfiguredFeatureRegistry.bootstrap();
    }
}
