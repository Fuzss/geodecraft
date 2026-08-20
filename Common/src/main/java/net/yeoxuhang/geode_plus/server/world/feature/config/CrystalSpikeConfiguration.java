package net.yeoxuhang.geode_plus.server.world.feature.config;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.tags.TagKey;
import net.minecraft.util.valueproviders.IntProvider;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.placement.CaveSurface;

/**
 * @param crystalState     the block the spike itself is built from
 * @param clusterState     the cluster block growing on the finished spike
 * @param bloomState       the block terrain around the spike base is converted into
 * @param placeableOn      terrain the spike may grow from, this is also the terrain replaced by {@link #bloomState}
 * @param xzRadius         horizontal radius of the spike base
 * @param crystalDirection whether the spike hangs from a ceiling or grows from a floor
 */
public record CrystalSpikeConfiguration(BlockStateProvider crystalState,
                                        BlockStateProvider clusterState,
                                        BlockStateProvider bloomState,
                                        TagKey<Block> placeableOn,
                                        IntProvider xzRadius,
                                        CaveSurface crystalDirection) implements FeatureConfiguration {
    public static final Codec<CrystalSpikeConfiguration> CODEC = RecordCodecBuilder.create(instance -> instance.group(
                    BlockStateProvider.CODEC.fieldOf("crystal_state").forGetter(CrystalSpikeConfiguration::crystalState),
                    BlockStateProvider.CODEC.fieldOf("cluster_state").forGetter(CrystalSpikeConfiguration::clusterState),
                    BlockStateProvider.CODEC.fieldOf("bloom_state").forGetter(CrystalSpikeConfiguration::bloomState),
                    TagKey.hashedCodec(Registries.BLOCK)
                            .fieldOf("placeable_on")
                            .forGetter(CrystalSpikeConfiguration::placeableOn),
                    IntProvider.CODEC.fieldOf("xz_radius").forGetter(CrystalSpikeConfiguration::xzRadius),
                    CaveSurface.CODEC.fieldOf("crystal_direction").forGetter(CrystalSpikeConfiguration::crystalDirection))
            .apply(instance, CrystalSpikeConfiguration::new));
}
