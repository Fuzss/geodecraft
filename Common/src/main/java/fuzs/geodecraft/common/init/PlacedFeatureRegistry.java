package fuzs.geodecraft.common.init;

import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.*;

import java.util.List;

public class PlacedFeatureRegistry {
    public static final RarityFilter RARITY_CRYSTAL_GEODE = RarityFilter.onAverageOnceEvery(24);
    public static final RarityFilter RARITY_UNCOMMON_ORE_GEODE = RarityFilter.onAverageOnceEvery(48);
    public static final RarityFilter RARITY_RARE_ORE_GEODE = RarityFilter.onAverageOnceEvery(72);
    public static final RarityFilter RARITY_NETHER_GEODE = RarityFilter.onAverageOnceEvery(32);

    public static final HeightRangePlacement RANGE_CRYSTAL_GEODE = HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(
            6), VerticalAnchor.absolute(30));
    public static final HeightRangePlacement RANGE_SUBMERGED_GEODE = HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(
            32), VerticalAnchor.aboveBottom(96));
    public static final HeightRangePlacement RANGE_STONE_GEODE = HeightRangePlacement.uniform(VerticalAnchor.absolute(0),
            VerticalAnchor.absolute(30));
    public static final HeightRangePlacement RANGE_DEEPSLATE_GEODE = HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(
            6), VerticalAnchor.absolute(0));
    public static final PlacementModifier RANGE_NETHER_GEODE = PlacementUtils.RANGE_10_10;

    public static final ResourceKey<PlacedFeature> PRISMARINE_GEODE = createKey("prismarine_geode");
    public static final ResourceKey<PlacedFeature> WRAPPIST_GEODE = createKey("wrappist_geode");
    public static final ResourceKey<PlacedFeature> ECHO_GEODE = createKey("echo_geode");
    public static final ResourceKey<PlacedFeature> QUARTZ_CRYSTAL_SPIKE = createKey("quartz_crystal_spike");
    public static final ResourceKey<PlacedFeature> QUARTZ_CRYSTAL_SPIKE_FLOOR = createKey("quartz_crystal_spike_floor");
    public static final ResourceKey<PlacedFeature> GLOWSTONE_CRYSTAL_SPIKE = createKey("glowstone_crystal_spike");
    public static final ResourceKey<PlacedFeature> GLOWSTONE_CRYSTAL_SPIKE_FLOOR = createKey(
            "glowstone_crystal_spike_floor");
    public static final ResourceKey<PlacedFeature> ECHO_CRYSTAL_SPIKE = createKey("echo_crystal_spike");
    public static final ResourceKey<PlacedFeature> ECHO_CRYSTAL_SPIKE_FLOOR = createKey("echo_crystal_spike_floor");
    public static final ResourceKey<PlacedFeature> PRISMARINE_CRYSTAL_SPIKE = createKey("prismarine_crystal_spike");
    public static final ResourceKey<PlacedFeature> WRAPPIST_CRYSTAL_SPIKE = createKey("wrappist_crystal_spike");
    public static final ResourceKey<PlacedFeature> ANCIENT_DEBRIS_GEODE = createKey("ancient_debris_geode");
    public static final ResourceKey<PlacedFeature> BASALT_ANCIENT_DEBRIS_GEODE = createKey("basalt_ancient_debris_geode");
    public static final ResourceKey<PlacedFeature> BLACKSTONE_ANCIENT_DEBRIS_GEODE = createKey(
            "blackstone_ancient_debris_geode");
    public static final ResourceKey<PlacedFeature> GLOWSTONE_GEODE = createKey("glowstone_geode");
    public static final ResourceKey<PlacedFeature> BASALT_GLOWSTONE_GEODE = createKey("basalt_glowstone_geode");
    public static final ResourceKey<PlacedFeature> BLACKSTONE_GLOWSTONE_GEODE = createKey("blackstone_glowstone_geode");
    public static final ResourceKey<PlacedFeature> GOLD_NUGGET_GEODE = createKey("gold_nugget_geode");
    public static final ResourceKey<PlacedFeature> BASALT_GOLD_NUGGET_GEODE = createKey("basalt_gold_nugget_geode");
    public static final ResourceKey<PlacedFeature> BLACKSTONE_GOLD_NUGGET_GEODE = createKey(
            "blackstone_gold_nugget_geode");

    public static final ResourceKey<PlacedFeature> QUARTZ_GEODE = createKey("quartz_geode");
    public static final ResourceKey<PlacedFeature> BASALT_QUARTZ_GEODE = createKey("basalt_quartz_geode");
    public static final ResourceKey<PlacedFeature> BLACKSTONE_QUARTZ_GEODE = createKey("blackstone_quartz_geode");

    public static final ResourceKey<PlacedFeature> DIAMOND_GEODE = createKey("diamond_geode");
    public static final ResourceKey<PlacedFeature> DEEPSLATE_DIAMOND_GEODE = createKey("deepslate_diamond_geode");
    public static final ResourceKey<PlacedFeature> SCULK_DIAMOND_GEODE = createKey("sculk_diamond_geode");

    public static final ResourceKey<PlacedFeature> EMERALD_GEODE = createKey("emerald_geode");
    public static final ResourceKey<PlacedFeature> DEEPSLATE_EMERALD_GEODE = createKey("deepslate_emerald_geode");
    public static final ResourceKey<PlacedFeature> SCULK_EMERALD_GEODE = createKey("sculk_emerald_geode");

    public static final ResourceKey<PlacedFeature> LAPIS_GEODE = createKey("lapis_geode");
    public static final ResourceKey<PlacedFeature> DEEPSLATE_LAPIS_GEODE = createKey("deepslate_lapis_geode");
    public static final ResourceKey<PlacedFeature> SCULK_LAPIS_GEODE = createKey("sculk_lapis_geode");

    public static final ResourceKey<PlacedFeature> REDSTONE_GEODE = createKey("redstone_geode");
    public static final ResourceKey<PlacedFeature> DEEPSLATE_REDSTONE_GEODE = createKey("deepslate_redstone_geode");
    public static final ResourceKey<PlacedFeature> SCULK_REDSTONE_GEODE = createKey("sculk_redstone_geode");

    public static final ResourceKey<PlacedFeature> CELESTITE_GEODE = createKey("celestite_geode");
    public static final ResourceKey<PlacedFeature> PINK_TOPAZ_GEODE = createKey("pink_topaz_geode");

    public static void bootstrap(BootstrapContext<PlacedFeature> context) {
        HolderGetter<ConfiguredFeature<?, ?>> configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

        register(context,
                PRISMARINE_GEODE,
                configuredFeatures.getOrThrow(ConfiguredFeatureRegistry.PRISMARINE_GEODE),
                RARITY_CRYSTAL_GEODE,
                InSquarePlacement.spread(),
                RANGE_SUBMERGED_GEODE,
                BiomeFilter.biome());
        register(context,
                WRAPPIST_GEODE,
                configuredFeatures.getOrThrow(ConfiguredFeatureRegistry.WRAPPIST_GEODE),
                RARITY_UNCOMMON_ORE_GEODE,
                InSquarePlacement.spread(),
                HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6), VerticalAnchor.aboveBottom(38)),
                BiomeFilter.biome());
        register(context,
                ECHO_GEODE,
                configuredFeatures.getOrThrow(ConfiguredFeatureRegistry.ECHO_GEODE),
                RARITY_CRYSTAL_GEODE,
                InSquarePlacement.spread(),
                RANGE_CRYSTAL_GEODE,
                BiomeFilter.biome());

        register(context,
                DIAMOND_GEODE,
                configuredFeatures.getOrThrow(ConfiguredFeatureRegistry.DIAMOND_GEODE),
                RARITY_RARE_ORE_GEODE,
                InSquarePlacement.spread(),
                RANGE_STONE_GEODE,
                BiomeFilter.biome());
        register(context,
                DEEPSLATE_DIAMOND_GEODE,
                configuredFeatures.getOrThrow(ConfiguredFeatureRegistry.DEEPSLATE_DIAMOND_GEODE),
                RARITY_RARE_ORE_GEODE,
                InSquarePlacement.spread(),
                RANGE_DEEPSLATE_GEODE,
                BiomeFilter.biome());
        register(context,
                SCULK_DIAMOND_GEODE,
                configuredFeatures.getOrThrow(ConfiguredFeatureRegistry.SCULK_DIAMOND_GEODE),
                RARITY_RARE_ORE_GEODE,
                InSquarePlacement.spread(),
                RANGE_CRYSTAL_GEODE,
                BiomeFilter.biome());

        register(context,
                EMERALD_GEODE,
                configuredFeatures.getOrThrow(ConfiguredFeatureRegistry.EMERALD_GEODE),
                RARITY_RARE_ORE_GEODE,
                InSquarePlacement.spread(),
                RANGE_STONE_GEODE,
                BiomeFilter.biome());
        register(context,
                DEEPSLATE_EMERALD_GEODE,
                configuredFeatures.getOrThrow(ConfiguredFeatureRegistry.DEEPSLATE_EMERALD_GEODE),
                RARITY_RARE_ORE_GEODE,
                InSquarePlacement.spread(),
                RANGE_DEEPSLATE_GEODE,
                BiomeFilter.biome());
        register(context,
                SCULK_EMERALD_GEODE,
                configuredFeatures.getOrThrow(ConfiguredFeatureRegistry.SCULK_EMERALD_GEODE),
                RARITY_RARE_ORE_GEODE,
                InSquarePlacement.spread(),
                RANGE_CRYSTAL_GEODE,
                BiomeFilter.biome());

        register(context,
                LAPIS_GEODE,
                configuredFeatures.getOrThrow(ConfiguredFeatureRegistry.LAPIS_GEODE),
                RARITY_UNCOMMON_ORE_GEODE,
                InSquarePlacement.spread(),
                RANGE_STONE_GEODE,
                BiomeFilter.biome());
        register(context,
                DEEPSLATE_LAPIS_GEODE,
                configuredFeatures.getOrThrow(ConfiguredFeatureRegistry.DEEPSLATE_LAPIS_GEODE),
                RARITY_UNCOMMON_ORE_GEODE,
                InSquarePlacement.spread(),
                RANGE_DEEPSLATE_GEODE,
                BiomeFilter.biome());
        register(context,
                SCULK_LAPIS_GEODE,
                configuredFeatures.getOrThrow(ConfiguredFeatureRegistry.SCULK_LAPIS_GEODE),
                RARITY_UNCOMMON_ORE_GEODE,
                InSquarePlacement.spread(),
                RANGE_CRYSTAL_GEODE,
                BiomeFilter.biome());

        register(context,
                REDSTONE_GEODE,
                configuredFeatures.getOrThrow(ConfiguredFeatureRegistry.REDSTONE_GEODE),
                RARITY_UNCOMMON_ORE_GEODE,
                InSquarePlacement.spread(),
                RANGE_STONE_GEODE,
                BiomeFilter.biome());
        register(context,
                DEEPSLATE_REDSTONE_GEODE,
                configuredFeatures.getOrThrow(ConfiguredFeatureRegistry.DEEPSLATE_REDSTONE_GEODE),
                RARITY_UNCOMMON_ORE_GEODE,
                InSquarePlacement.spread(),
                RANGE_DEEPSLATE_GEODE,
                BiomeFilter.biome());
        register(context,
                SCULK_REDSTONE_GEODE,
                configuredFeatures.getOrThrow(ConfiguredFeatureRegistry.SCULK_REDSTONE_GEODE),
                RARITY_UNCOMMON_ORE_GEODE,
                InSquarePlacement.spread(),
                RANGE_CRYSTAL_GEODE,
                BiomeFilter.biome());

        register(context,
                ANCIENT_DEBRIS_GEODE,
                configuredFeatures.getOrThrow(ConfiguredFeatureRegistry.ANCIENT_DEBRIS_GEODE),
                RARITY_NETHER_GEODE,
                InSquarePlacement.spread(),
                RANGE_NETHER_GEODE,
                BiomeFilter.biome());
        register(context,
                BASALT_ANCIENT_DEBRIS_GEODE,
                configuredFeatures.getOrThrow(ConfiguredFeatureRegistry.BASALT_ANCIENT_DEBRIS_GEODE),
                RARITY_NETHER_GEODE,
                InSquarePlacement.spread(),
                RANGE_NETHER_GEODE,
                BiomeFilter.biome());
        register(context,
                BLACKSTONE_ANCIENT_DEBRIS_GEODE,
                configuredFeatures.getOrThrow(ConfiguredFeatureRegistry.BLACKSTONE_ANCIENT_DEBRIS_GEODE),
                RARITY_NETHER_GEODE,
                InSquarePlacement.spread(),
                RANGE_NETHER_GEODE,
                BiomeFilter.biome());

        register(context,
                GOLD_NUGGET_GEODE,
                configuredFeatures.getOrThrow(ConfiguredFeatureRegistry.GOLD_NUGGET_GEODE),
                RARITY_NETHER_GEODE,
                InSquarePlacement.spread(),
                RANGE_NETHER_GEODE,
                BiomeFilter.biome());
        register(context,
                BASALT_GOLD_NUGGET_GEODE,
                configuredFeatures.getOrThrow(ConfiguredFeatureRegistry.BASALT_GOLD_NUGGET_GEODE),
                RARITY_NETHER_GEODE,
                InSquarePlacement.spread(),
                RANGE_NETHER_GEODE,
                BiomeFilter.biome());
        register(context,
                BLACKSTONE_GOLD_NUGGET_GEODE,
                configuredFeatures.getOrThrow(ConfiguredFeatureRegistry.BLACKSTONE_GOLD_NUGGET_GEODE),
                RARITY_NETHER_GEODE,
                InSquarePlacement.spread(),
                RANGE_NETHER_GEODE,
                BiomeFilter.biome());

        register(context,
                GLOWSTONE_GEODE,
                configuredFeatures.getOrThrow(ConfiguredFeatureRegistry.GLOWSTONE_GEODE),
                RARITY_NETHER_GEODE,
                InSquarePlacement.spread(),
                RANGE_NETHER_GEODE,
                BiomeFilter.biome());
        register(context,
                BASALT_GLOWSTONE_GEODE,
                configuredFeatures.getOrThrow(ConfiguredFeatureRegistry.BASALT_GLOWSTONE_GEODE),
                RARITY_NETHER_GEODE,
                InSquarePlacement.spread(),
                RANGE_NETHER_GEODE,
                BiomeFilter.biome());
        register(context,
                BLACKSTONE_GLOWSTONE_GEODE,
                configuredFeatures.getOrThrow(ConfiguredFeatureRegistry.BLACKSTONE_GLOWSTONE_GEODE),
                RARITY_NETHER_GEODE,
                InSquarePlacement.spread(),
                RANGE_NETHER_GEODE,
                BiomeFilter.biome());

        register(context,
                QUARTZ_GEODE,
                configuredFeatures.getOrThrow(ConfiguredFeatureRegistry.QUARTZ_GEODE),
                RARITY_NETHER_GEODE,
                InSquarePlacement.spread(),
                RANGE_NETHER_GEODE,
                BiomeFilter.biome());
        register(context,
                BASALT_QUARTZ_GEODE,
                configuredFeatures.getOrThrow(ConfiguredFeatureRegistry.BASALT_QUARTZ_GEODE),
                RARITY_NETHER_GEODE,
                InSquarePlacement.spread(),
                RANGE_NETHER_GEODE,
                BiomeFilter.biome());
        register(context,
                BLACKSTONE_QUARTZ_GEODE,
                configuredFeatures.getOrThrow(ConfiguredFeatureRegistry.BLACKSTONE_QUARTZ_GEODE),
                RARITY_NETHER_GEODE,
                InSquarePlacement.spread(),
                RANGE_NETHER_GEODE,
                BiomeFilter.biome());

        register(context,
                QUARTZ_CRYSTAL_SPIKE,
                configuredFeatures.getOrThrow(ConfiguredFeatureRegistry.NETHER_QUARTZ_CRYSTAL_SPIKE),
                CountPlacement.of(5),
                InSquarePlacement.spread(),
                RANGE_NETHER_GEODE,
                BiomeFilter.biome());
        register(context,
                QUARTZ_CRYSTAL_SPIKE_FLOOR,
                configuredFeatures.getOrThrow(ConfiguredFeatureRegistry.NETHER_QUARTZ_CRYSTAL_SPIKE_FLOOR),
                CountPlacement.of(5),
                InSquarePlacement.spread(),
                RANGE_NETHER_GEODE,
                BiomeFilter.biome());
        register(context,
                GLOWSTONE_CRYSTAL_SPIKE,
                configuredFeatures.getOrThrow(ConfiguredFeatureRegistry.GLOWSTONE_CRYSTAL_SPIKE),
                CountPlacement.of(5),
                InSquarePlacement.spread(),
                RANGE_NETHER_GEODE,
                BiomeFilter.biome());
        register(context,
                GLOWSTONE_CRYSTAL_SPIKE_FLOOR,
                configuredFeatures.getOrThrow(ConfiguredFeatureRegistry.GLOWSTONE_CRYSTAL_SPIKE_FLOOR),
                CountPlacement.of(5),
                InSquarePlacement.spread(),
                RANGE_NETHER_GEODE,
                BiomeFilter.biome());
        register(context,
                ECHO_CRYSTAL_SPIKE,
                configuredFeatures.getOrThrow(ConfiguredFeatureRegistry.ECHO_CRYSTAL_SPIKE),
                CountPlacement.of(5),
                InSquarePlacement.spread(),
                RANGE_CRYSTAL_GEODE,
                BiomeFilter.biome());
        register(context,
                ECHO_CRYSTAL_SPIKE_FLOOR,
                configuredFeatures.getOrThrow(ConfiguredFeatureRegistry.ECHO_CRYSTAL_SPIKE_FLOOR),
                CountPlacement.of(5),
                InSquarePlacement.spread(),
                RANGE_CRYSTAL_GEODE,
                BiomeFilter.biome());
        register(context,
                WRAPPIST_CRYSTAL_SPIKE,
                configuredFeatures.getOrThrow(ConfiguredFeatureRegistry.WRAPPIST_CRYSTAL_SPIKE),
                CountPlacement.of(1),
                InSquarePlacement.spread(),
                HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6), VerticalAnchor.absolute(64)),
                BiomeFilter.biome());
        register(context,
                PRISMARINE_CRYSTAL_SPIKE,
                configuredFeatures.getOrThrow(ConfiguredFeatureRegistry.PRISMARINE_CRYSTAL_SPIKE),
                RARITY_NETHER_GEODE,
                InSquarePlacement.spread(),
                RANGE_SUBMERGED_GEODE,
                BiomeFilter.biome());

        register(context,
                CELESTITE_GEODE,
                configuredFeatures.getOrThrow(ConfiguredFeatureRegistry.CELESTITE_GEODE),
                RARITY_CRYSTAL_GEODE,
                InSquarePlacement.spread(),
                RANGE_CRYSTAL_GEODE,
                BiomeFilter.biome());
        register(context,
                PINK_TOPAZ_GEODE,
                configuredFeatures.getOrThrow(ConfiguredFeatureRegistry.PINK_TOPAZ_GEODE),
                RARITY_CRYSTAL_GEODE,
                InSquarePlacement.spread(),
                RANGE_CRYSTAL_GEODE,
                BiomeFilter.biome());
    }

    private static ResourceKey<PlacedFeature> createKey(String name) {
        return ModRegistry.REGISTRIES.makeResourceKey(Registries.PLACED_FEATURE, name);
    }

    private static void register(BootstrapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration, List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }

    private static void register(BootstrapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration, PlacementModifier... modifiers) {
        register(context, key, configuration, List.of(modifiers));
    }
}
