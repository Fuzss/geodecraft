package net.yeoxuhang.geode_plus.server.registry;

import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.levelgen.feature.configurations.GeodeConfiguration;
import net.yeoxuhang.geode_plus.server.world.feature.CrystalSpikeFeature;
import net.yeoxuhang.geode_plus.server.world.feature.GeodeFeature;
import net.yeoxuhang.geode_plus.server.world.feature.OceanGeodeFeature;
import net.yeoxuhang.geode_plus.server.world.feature.config.CrystalSpikeConfiguration;

public class FeatureRegistry {
    public static final Holder.Reference<CrystalSpikeFeature> CRYSTAL_SPIKE = ModRegistry.REGISTRY.register(
            Registries.FEATURE,
            "crystal_spike",
            () -> new CrystalSpikeFeature(CrystalSpikeConfiguration.CODEC));

    public static final Holder.Reference<GeodeFeature> GEODE = ModRegistry.REGISTRY.register(Registries.FEATURE,
            "geode",
            () -> new GeodeFeature(GeodeConfiguration.CODEC));

    public static final Holder.Reference<OceanGeodeFeature> OCEAN_GEODE = ModRegistry.REGISTRY.register(Registries.FEATURE,
            "ocean_geode",
            () -> new OceanGeodeFeature(GeodeConfiguration.CODEC));

    public static void bootstrap() {
        // NO-OP
    }
}
