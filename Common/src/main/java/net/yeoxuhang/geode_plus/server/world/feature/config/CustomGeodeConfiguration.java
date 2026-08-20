package net.yeoxuhang.geode_plus.server.world.feature.config;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.configurations.GeodeConfiguration;

/**
 * A vanilla {@link GeodeConfiguration} with control over the block a crack is opened with, allowing for geodes that
 * flood instead of opening into an air pocket.
 */
public class CustomGeodeConfiguration extends GeodeConfiguration {
    /**
     * {@link MapCodec#assumeMapUnsafe(Codec)} inlines all vanilla fields into this codec instead of nesting them in a
     * sub-object, so vanilla's field definitions never have to be copied and future additions are picked up for free.
     * It is safe here since {@link GeodeConfiguration#CODEC} is built from {@link RecordCodecBuilder}, meaning it
     * always serializes to a map.
     */
    public static final Codec<CustomGeodeConfiguration> CODEC = RecordCodecBuilder.create(instance -> instance.group(
                    MapCodec.assumeMapUnsafe(GeodeConfiguration.CODEC)
                            .forGetter((CustomGeodeConfiguration configuration) -> configuration),
                    BlockState.CODEC.optionalFieldOf("crack_state", Blocks.AIR.defaultBlockState())
                            .forGetter(configuration -> configuration.crackState))
            .apply(instance, CustomGeodeConfiguration::new));

    public final BlockState crackState;

    public CustomGeodeConfiguration(GeodeConfiguration configuration, BlockState crackState) {
        super(configuration.geodeBlockSettings,
                configuration.geodeLayerSettings,
                configuration.geodeCrackSettings,
                configuration.usePotentialPlacementsChance,
                configuration.useAlternateLayer0Chance,
                configuration.placementsRequireLayer0Alternate,
                configuration.outerWallDistance,
                configuration.distributionPoints,
                configuration.pointOffset,
                configuration.minGenOffset,
                configuration.maxGenOffset,
                configuration.noiseMultiplier,
                configuration.invalidBlocksThreshold);
        this.crackState = crackState;
    }
}
