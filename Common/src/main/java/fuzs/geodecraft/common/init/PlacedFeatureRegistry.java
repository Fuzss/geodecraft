package fuzs.geodecraft.common.init;

import fuzs.geodecraft.common.Geodecraft;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.Feature;
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

    public static final ResourceKey<PlacedFeature> PRISMARINE_GEODE = register("prismarine_geode");
    public static final ResourceKey<PlacedFeature> WRAPPIST_GEODE = register("wrappist_geode");
    public static final ResourceKey<PlacedFeature> ECHO_GEODE = register("echo_geode");
    public static final ResourceKey<PlacedFeature> QUARTZ_CRYSTAL_SPIKE = register("quartz_crystal_spike");
    public static final ResourceKey<PlacedFeature> QUARTZ_CRYSTAL_SPIKE_FLOOR = register("quartz_crystal_spike_floor");
    public static final ResourceKey<PlacedFeature> GLOWSTONE_CRYSTAL_SPIKE = register("glowstone_crystal_spike");
    public static final ResourceKey<PlacedFeature> GLOWSTONE_CRYSTAL_SPIKE_FLOOR = register(
            "glowstone_crystal_spike_floor");
    public static final ResourceKey<PlacedFeature> ECHO_CRYSTAL_SPIKE = register("echo_crystal_spike");
    public static final ResourceKey<PlacedFeature> ECHO_CRYSTAL_SPIKE_FLOOR = register("echo_crystal_spike_floor");
    public static final ResourceKey<PlacedFeature> PRISMARINE_CRYSTAL_SPIKE = register("prismarine_crystal_spike");
    public static final ResourceKey<PlacedFeature> WRAPPIST_CRYSTAL_SPIKE = register("wrappist_crystal_spike");
    public static final ResourceKey<PlacedFeature> WRAPPIST_CRYSTAL_SPIKE_FLOOR = register(
            "wrappist_crystal_spike_floor");
    public static final ResourceKey<PlacedFeature> ANCIENT_DEBRIS_GEODE = register("ancient_debris_geode");
    public static final ResourceKey<PlacedFeature> BASALT_ANCIENT_DEBRIS_GEODE = register("basalt_ancient_debris_geode");
    public static final ResourceKey<PlacedFeature> BLACKSTONE_ANCIENT_DEBRIS_GEODE = register(
            "blackstone_ancient_debris_geode");
    public static final ResourceKey<PlacedFeature> GLOWSTONE_GEODE = register("glowstone_geode");
    public static final ResourceKey<PlacedFeature> BASALT_GLOWSTONE_GEODE = register("basalt_glowstone_geode");
    public static final ResourceKey<PlacedFeature> BLACKSTONE_GLOWSTONE_GEODE = register("blackstone_glowstone_geode");
    public static final ResourceKey<PlacedFeature> GOLD_NUGGET_GEODE = register("gold_nugget_geode");
    public static final ResourceKey<PlacedFeature> BASALT_GOLD_NUGGET_GEODE = register("basalt_gold_nugget_geode");
    public static final ResourceKey<PlacedFeature> BLACKSTONE_GOLD_NUGGET_GEODE = register(
            "blackstone_gold_nugget_geode");

    public static final ResourceKey<PlacedFeature> QUARTZ_GEODE = register("quartz_geode");
    public static final ResourceKey<PlacedFeature> BASALT_QUARTZ_GEODE = register("basalt_quartz_geode");
    public static final ResourceKey<PlacedFeature> BLACKSTONE_QUARTZ_GEODE = register("blackstone_quartz_geode");

    public static final ResourceKey<PlacedFeature> DIAMOND_GEODE = register("diamond_geode");
    public static final ResourceKey<PlacedFeature> DEEPSLATE_DIAMOND_GEODE = register("deepslate_diamond_geode");
    public static final ResourceKey<PlacedFeature> SCULK_DIAMOND_GEODE = register("sculk_diamond_geode");

    public static final ResourceKey<PlacedFeature> EMERALD_GEODE = register("emerald_geode");
    public static final ResourceKey<PlacedFeature> DEEPSLATE_EMERALD_GEODE = register("deepslate_emerald_geode");
    public static final ResourceKey<PlacedFeature> SCULK_EMERALD_GEODE = register("sculk_emerald_geode");

    public static final ResourceKey<PlacedFeature> LAPIS_GEODE = register("lapis_geode");
    public static final ResourceKey<PlacedFeature> DEEPSLATE_LAPIS_GEODE = register("deepslate_lapis_geode");
    public static final ResourceKey<PlacedFeature> SCULK_LAPIS_GEODE = register("sculk_lapis_geode");

    public static final ResourceKey<PlacedFeature> REDSTONE_GEODE = register("redstone_geode");
    public static final ResourceKey<PlacedFeature> DEEPSLATE_REDSTONE_GEODE = register("deepslate_redstone_geode");
    public static final ResourceKey<PlacedFeature> SCULK_REDSTONE_GEODE = register("sculk_redstone_geode");

    public static final ResourceKey<PlacedFeature> CELESTITE_GEODE = register("celestite_geode");
    public static final ResourceKey<PlacedFeature> PINK_TOPAZ_GEODE = register("pink_topaz_geode");

    public static void bootstrap(BootstrapContext<PlacedFeature> context) {
        HolderGetter<Feature> configuredFeatures = context.lookup(Registries.FEATURE);

        register(context,
                PRISMARINE_GEODE,
                configuredFeatures.getOrThrow(FeatureRegistry.PRISMARINE_GEODE),
                RARITY_CRYSTAL_GEODE,
                InSquarePlacement.spread(),
                RANGE_SUBMERGED_GEODE,
                BiomeFilter.biome());
        register(context,
                WRAPPIST_GEODE,
                configuredFeatures.getOrThrow(FeatureRegistry.WRAPPIST_GEODE),
                RARITY_UNCOMMON_ORE_GEODE,
                InSquarePlacement.spread(),
                HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6), VerticalAnchor.aboveBottom(38)),
                BiomeFilter.biome());
        register(context,
                ECHO_GEODE,
                configuredFeatures.getOrThrow(FeatureRegistry.ECHO_GEODE),
                RARITY_CRYSTAL_GEODE,
                InSquarePlacement.spread(),
                RANGE_CRYSTAL_GEODE,
                BiomeFilter.biome());

        register(context,
                DIAMOND_GEODE,
                configuredFeatures.getOrThrow(FeatureRegistry.DIAMOND_GEODE),
                RARITY_RARE_ORE_GEODE,
                InSquarePlacement.spread(),
                RANGE_STONE_GEODE,
                BiomeFilter.biome());
        register(context,
                DEEPSLATE_DIAMOND_GEODE,
                configuredFeatures.getOrThrow(FeatureRegistry.DEEPSLATE_DIAMOND_GEODE),
                RARITY_RARE_ORE_GEODE,
                InSquarePlacement.spread(),
                RANGE_DEEPSLATE_GEODE,
                BiomeFilter.biome());
        register(context,
                SCULK_DIAMOND_GEODE,
                configuredFeatures.getOrThrow(FeatureRegistry.SCULK_DIAMOND_GEODE),
                RARITY_RARE_ORE_GEODE,
                InSquarePlacement.spread(),
                RANGE_CRYSTAL_GEODE,
                BiomeFilter.biome());

        register(context,
                EMERALD_GEODE,
                configuredFeatures.getOrThrow(FeatureRegistry.EMERALD_GEODE),
                RARITY_RARE_ORE_GEODE,
                InSquarePlacement.spread(),
                RANGE_STONE_GEODE,
                BiomeFilter.biome());
        register(context,
                DEEPSLATE_EMERALD_GEODE,
                configuredFeatures.getOrThrow(FeatureRegistry.DEEPSLATE_EMERALD_GEODE),
                RARITY_RARE_ORE_GEODE,
                InSquarePlacement.spread(),
                RANGE_DEEPSLATE_GEODE,
                BiomeFilter.biome());
        register(context,
                SCULK_EMERALD_GEODE,
                configuredFeatures.getOrThrow(FeatureRegistry.SCULK_EMERALD_GEODE),
                RARITY_RARE_ORE_GEODE,
                InSquarePlacement.spread(),
                RANGE_CRYSTAL_GEODE,
                BiomeFilter.biome());

        register(context,
                LAPIS_GEODE,
                configuredFeatures.getOrThrow(FeatureRegistry.LAPIS_GEODE),
                RARITY_UNCOMMON_ORE_GEODE,
                InSquarePlacement.spread(),
                RANGE_STONE_GEODE,
                BiomeFilter.biome());
        register(context,
                DEEPSLATE_LAPIS_GEODE,
                configuredFeatures.getOrThrow(FeatureRegistry.DEEPSLATE_LAPIS_GEODE),
                RARITY_UNCOMMON_ORE_GEODE,
                InSquarePlacement.spread(),
                RANGE_DEEPSLATE_GEODE,
                BiomeFilter.biome());
        register(context,
                SCULK_LAPIS_GEODE,
                configuredFeatures.getOrThrow(FeatureRegistry.SCULK_LAPIS_GEODE),
                RARITY_UNCOMMON_ORE_GEODE,
                InSquarePlacement.spread(),
                RANGE_CRYSTAL_GEODE,
                BiomeFilter.biome());

        register(context,
                REDSTONE_GEODE,
                configuredFeatures.getOrThrow(FeatureRegistry.REDSTONE_GEODE),
                RARITY_UNCOMMON_ORE_GEODE,
                InSquarePlacement.spread(),
                RANGE_STONE_GEODE,
                BiomeFilter.biome());
        register(context,
                DEEPSLATE_REDSTONE_GEODE,
                configuredFeatures.getOrThrow(FeatureRegistry.DEEPSLATE_REDSTONE_GEODE),
                RARITY_UNCOMMON_ORE_GEODE,
                InSquarePlacement.spread(),
                RANGE_DEEPSLATE_GEODE,
                BiomeFilter.biome());
        register(context,
                SCULK_REDSTONE_GEODE,
                configuredFeatures.getOrThrow(FeatureRegistry.SCULK_REDSTONE_GEODE),
                RARITY_UNCOMMON_ORE_GEODE,
                InSquarePlacement.spread(),
                RANGE_CRYSTAL_GEODE,
                BiomeFilter.biome());

        register(context,
                ANCIENT_DEBRIS_GEODE,
                configuredFeatures.getOrThrow(FeatureRegistry.ANCIENT_DEBRIS_GEODE),
                RARITY_NETHER_GEODE,
                InSquarePlacement.spread(),
                RANGE_NETHER_GEODE,
                BiomeFilter.biome());
        register(context,
                BASALT_ANCIENT_DEBRIS_GEODE,
                configuredFeatures.getOrThrow(FeatureRegistry.BASALT_ANCIENT_DEBRIS_GEODE),
                RARITY_NETHER_GEODE,
                InSquarePlacement.spread(),
                RANGE_NETHER_GEODE,
                BiomeFilter.biome());
        register(context,
                BLACKSTONE_ANCIENT_DEBRIS_GEODE,
                configuredFeatures.getOrThrow(FeatureRegistry.BLACKSTONE_ANCIENT_DEBRIS_GEODE),
                RARITY_NETHER_GEODE,
                InSquarePlacement.spread(),
                RANGE_NETHER_GEODE,
                BiomeFilter.biome());

        register(context,
                GOLD_NUGGET_GEODE,
                configuredFeatures.getOrThrow(FeatureRegistry.GOLD_NUGGET_GEODE),
                RARITY_NETHER_GEODE,
                InSquarePlacement.spread(),
                RANGE_NETHER_GEODE,
                BiomeFilter.biome());
        register(context,
                BASALT_GOLD_NUGGET_GEODE,
                configuredFeatures.getOrThrow(FeatureRegistry.BASALT_GOLD_NUGGET_GEODE),
                RARITY_NETHER_GEODE,
                InSquarePlacement.spread(),
                RANGE_NETHER_GEODE,
                BiomeFilter.biome());
        register(context,
                BLACKSTONE_GOLD_NUGGET_GEODE,
                configuredFeatures.getOrThrow(FeatureRegistry.BLACKSTONE_GOLD_NUGGET_GEODE),
                RARITY_NETHER_GEODE,
                InSquarePlacement.spread(),
                RANGE_NETHER_GEODE,
                BiomeFilter.biome());

        register(context,
                GLOWSTONE_GEODE,
                configuredFeatures.getOrThrow(FeatureRegistry.GLOWSTONE_GEODE),
                RARITY_NETHER_GEODE,
                InSquarePlacement.spread(),
                RANGE_NETHER_GEODE,
                BiomeFilter.biome());
        register(context,
                BASALT_GLOWSTONE_GEODE,
                configuredFeatures.getOrThrow(FeatureRegistry.BASALT_GLOWSTONE_GEODE),
                RARITY_NETHER_GEODE,
                InSquarePlacement.spread(),
                RANGE_NETHER_GEODE,
                BiomeFilter.biome());
        register(context,
                BLACKSTONE_GLOWSTONE_GEODE,
                configuredFeatures.getOrThrow(FeatureRegistry.BLACKSTONE_GLOWSTONE_GEODE),
                RARITY_NETHER_GEODE,
                InSquarePlacement.spread(),
                RANGE_NETHER_GEODE,
                BiomeFilter.biome());

        register(context,
                QUARTZ_GEODE,
                configuredFeatures.getOrThrow(FeatureRegistry.QUARTZ_GEODE),
                RARITY_NETHER_GEODE,
                InSquarePlacement.spread(),
                RANGE_NETHER_GEODE,
                BiomeFilter.biome());
        register(context,
                BASALT_QUARTZ_GEODE,
                configuredFeatures.getOrThrow(FeatureRegistry.BASALT_QUARTZ_GEODE),
                RARITY_NETHER_GEODE,
                InSquarePlacement.spread(),
                RANGE_NETHER_GEODE,
                BiomeFilter.biome());
        register(context,
                BLACKSTONE_QUARTZ_GEODE,
                configuredFeatures.getOrThrow(FeatureRegistry.BLACKSTONE_QUARTZ_GEODE),
                RARITY_NETHER_GEODE,
                InSquarePlacement.spread(),
                RANGE_NETHER_GEODE,
                BiomeFilter.biome());

        register(context,
                QUARTZ_CRYSTAL_SPIKE,
                configuredFeatures.getOrThrow(FeatureRegistry.NETHER_QUARTZ_CRYSTAL_SPIKE),
                CountPlacement.of(5),
                InSquarePlacement.spread(),
                RANGE_NETHER_GEODE,
                BiomeFilter.biome());
        register(context,
                QUARTZ_CRYSTAL_SPIKE_FLOOR,
                configuredFeatures.getOrThrow(FeatureRegistry.NETHER_QUARTZ_CRYSTAL_SPIKE_FLOOR),
                CountPlacement.of(5),
                InSquarePlacement.spread(),
                RANGE_NETHER_GEODE,
                BiomeFilter.biome());
        register(context,
                GLOWSTONE_CRYSTAL_SPIKE,
                configuredFeatures.getOrThrow(FeatureRegistry.GLOWSTONE_CRYSTAL_SPIKE),
                CountPlacement.of(5),
                InSquarePlacement.spread(),
                RANGE_NETHER_GEODE,
                BiomeFilter.biome());
        register(context,
                GLOWSTONE_CRYSTAL_SPIKE_FLOOR,
                configuredFeatures.getOrThrow(FeatureRegistry.GLOWSTONE_CRYSTAL_SPIKE_FLOOR),
                CountPlacement.of(5),
                InSquarePlacement.spread(),
                RANGE_NETHER_GEODE,
                BiomeFilter.biome());
        register(context,
                ECHO_CRYSTAL_SPIKE,
                configuredFeatures.getOrThrow(FeatureRegistry.ECHO_CRYSTAL_SPIKE),
                CountPlacement.of(5),
                InSquarePlacement.spread(),
                RANGE_CRYSTAL_GEODE,
                BiomeFilter.biome());
        register(context,
                ECHO_CRYSTAL_SPIKE_FLOOR,
                configuredFeatures.getOrThrow(FeatureRegistry.ECHO_CRYSTAL_SPIKE_FLOOR),
                CountPlacement.of(5),
                InSquarePlacement.spread(),
                RANGE_CRYSTAL_GEODE,
                BiomeFilter.biome());
        register(context,
                WRAPPIST_CRYSTAL_SPIKE,
                configuredFeatures.getOrThrow(FeatureRegistry.WRAPPIST_CRYSTAL_SPIKE),
                CountPlacement.of(1),
                InSquarePlacement.spread(),
                HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(16), VerticalAnchor.aboveBottom(64)),
                BiomeFilter.biome());
        register(context,
                WRAPPIST_CRYSTAL_SPIKE_FLOOR,
                configuredFeatures.getOrThrow(FeatureRegistry.WRAPPIST_CRYSTAL_SPIKE_FLOOR),
                CountPlacement.of(1),
                InSquarePlacement.spread(),
                HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(16), VerticalAnchor.aboveBottom(64)),
                BiomeFilter.biome());
        register(context,
                PRISMARINE_CRYSTAL_SPIKE,
                configuredFeatures.getOrThrow(FeatureRegistry.PRISMARINE_CRYSTAL_SPIKE),
                RARITY_NETHER_GEODE,
                InSquarePlacement.spread(),
                RANGE_SUBMERGED_GEODE,
                BiomeFilter.biome());

        register(context,
                CELESTITE_GEODE,
                configuredFeatures.getOrThrow(FeatureRegistry.CELESTITE_GEODE),
                RARITY_CRYSTAL_GEODE,
                InSquarePlacement.spread(),
                RANGE_CRYSTAL_GEODE,
                BiomeFilter.biome());
        register(context,
                PINK_TOPAZ_GEODE,
                configuredFeatures.getOrThrow(FeatureRegistry.PINK_TOPAZ_GEODE),
                RARITY_CRYSTAL_GEODE,
                InSquarePlacement.spread(),
                RANGE_CRYSTAL_GEODE,
                BiomeFilter.biome());
    }

    private static ResourceKey<PlacedFeature> register(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, Geodecraft.id(name));
    }

    private static void register(BootstrapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<Feature> configuration, List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }

    private static void register(BootstrapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<Feature> configuration, PlacementModifier... modifiers) {
        register(context, key, configuration, List.of(modifiers));
    }
}
