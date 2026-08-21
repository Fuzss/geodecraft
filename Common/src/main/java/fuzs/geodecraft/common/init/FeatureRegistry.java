package fuzs.geodecraft.common.init;

import fuzs.geodecraft.common.world.level.levelgen.feature.CrystalSpikeFeature;
import fuzs.geodecraft.common.world.level.levelgen.feature.configurations.CrystalSpikeConfiguration;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;

public class FeatureRegistry {
    public static final Holder.Reference<CrystalSpikeFeature> CRYSTAL_SPIKE = ModRegistry.REGISTRY.register(Registries.FEATURE,
            "crystal_spike",
            () -> new CrystalSpikeFeature(CrystalSpikeConfiguration.CODEC));

    public static void bootstrap() {
        // NO-OP
    }
}
