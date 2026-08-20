package net.yeoxuhang.geode_plus.server.world.feature.config;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.util.valueproviders.IntProvider;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.placement.CaveSurface;

public record GeodeCrystalSpikeConfig(BlockStateProvider crystalState,
                                      BlockStateProvider clusterState,
                                      IntProvider xzRadius,
                                      CaveSurface crystalDirection) implements FeatureConfiguration {
    public static final Codec<GeodeCrystalSpikeConfig> CODEC = RecordCodecBuilder.create(codec -> codec.group(
                    BlockStateProvider.CODEC.fieldOf("crystal_state").forGetter(GeodeCrystalSpikeConfig::crystalState),
                    BlockStateProvider.CODEC.fieldOf("cluster_state").forGetter(GeodeCrystalSpikeConfig::clusterState),
                    IntProvider.CODEC.fieldOf("xz_radius").forGetter(GeodeCrystalSpikeConfig::xzRadius),
                    CaveSurface.CODEC.fieldOf("crystal_direction").forGetter(GeodeCrystalSpikeConfig::crystalDirection))
            .apply(codec, GeodeCrystalSpikeConfig::new));
}
