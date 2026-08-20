package fuzs.geodecraft.common.init;

import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import fuzs.geodecraft.common.world.level.levelgen.feature.CrystalSpikeFeature;
import fuzs.geodecraft.common.world.level.levelgen.feature.GeodeFeature;
import fuzs.geodecraft.common.world.level.levelgen.feature.configurations.CrystalSpikeConfiguration;
import fuzs.geodecraft.common.world.level.levelgen.feature.configurations.CustomGeodeConfiguration;

public class FeatureRegistry {
    public static final Holder.Reference<CrystalSpikeFeature> CRYSTAL_SPIKE = ModRegistry.REGISTRY.register(Registries.FEATURE,
            "crystal_spike",
            () -> new CrystalSpikeFeature(CrystalSpikeConfiguration.CODEC));

    public static final Holder.Reference<GeodeFeature> GEODE = ModRegistry.REGISTRY.register(Registries.FEATURE,
            "geode",
            () -> new GeodeFeature(CustomGeodeConfiguration.CODEC));

    public static void bootstrap() {
        // NO-OP
    }
}
