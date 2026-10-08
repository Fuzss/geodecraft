package fuzs.geodecraft.common.init;

import com.mojang.serialization.MapCodec;
import fuzs.geodecraft.common.world.level.levelgen.feature.CrystalSpikeFeature;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.levelgen.feature.Feature;

public class FeatureTypeRegistry {
    public static final Holder.Reference<MapCodec<? extends Feature>> CRYSTAL_SPIKE = ModRegistry.REGISTRIES.register(
            Registries.FEATURE_TYPE,
            "crystal_spike",
            () -> CrystalSpikeFeature.CODEC);

    public static void bootstrap() {
        // NO-OP
    }
}
