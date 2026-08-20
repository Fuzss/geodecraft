package net.yeoxuhang.geode_plus.server.registry;

import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.levelgen.feature.configurations.GeodeConfiguration;
import net.yeoxuhang.geode_plus.server.world.feature.*;
import net.yeoxuhang.geode_plus.server.world.feature.config.GeodeCrystalSpikeConfig;

public class FeatureRegistry {
    public static final Holder.Reference<CrystalSpikeFeature> NETHER_CRYSTAL_SPIKE = ModRegistry.REGISTRY.register(
            Registries.FEATURE,
            "nether_crystal_spike",
            () -> new CrystalSpikeFeature(GeodeCrystalSpikeConfig.CODEC));

    public static final Holder.Reference<OceanCrystalSpikeFeature> OCEAN_CRYSTAL_SPIKE = ModRegistry.REGISTRY.register(
            Registries.FEATURE,
            "ocean_crystal_spike",
            () -> new OceanCrystalSpikeFeature(GeodeCrystalSpikeConfig.CODEC));

    public static final Holder.Reference<EchoCrystalSpikeFeature> ECHO_CRYSTAL_SPIKE = ModRegistry.REGISTRY.register(
            Registries.FEATURE,
            "echo_crystal_spike",
            () -> new EchoCrystalSpikeFeature(GeodeCrystalSpikeConfig.CODEC));

    public static final Holder.Reference<WrappistCrystalSpikeFeature> WRAPPIST_CRYSTAL_SPIKE = ModRegistry.REGISTRY.register(
            Registries.FEATURE,
            "wrappist_crystal_spike",
            () -> new WrappistCrystalSpikeFeature(GeodeCrystalSpikeConfig.CODEC));

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
