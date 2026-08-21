package fuzs.geodecraft.common.init;

import fuzs.geodecraft.common.world.level.levelgen.feature.configurations.CrystalSpikeConfiguration;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.GeodeBlockSettings;
import net.minecraft.world.level.levelgen.GeodeCrackSettings;
import net.minecraft.world.level.levelgen.GeodeLayerSettings;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.GeodeConfiguration;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.placement.CaveSurface;

import java.util.List;

public class ConfiguredFeatureRegistry {
    public static final ResourceKey<ConfiguredFeature<?, ?>> PRISMARINE_GEODE = registerKey("prismarine_geode");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WRAPPIST_GEODE = registerKey("wrappist_geode");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ECHO_GEODE = registerKey("echo_geode");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_QUARTZ_CRYSTAL_SPIKE = registerKey(
            "nether_quartz_crystal_spike");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_QUARTZ_CRYSTAL_SPIKE_FLOOR = registerKey(
            "nether_quartz_crystal_spike_floor");
    public static final ResourceKey<ConfiguredFeature<?, ?>> GLOWSTONE_CRYSTAL_SPIKE = registerKey(
            "glowstone_crystal_spike");
    public static final ResourceKey<ConfiguredFeature<?, ?>> GLOWSTONE_CRYSTAL_SPIKE_FLOOR = registerKey(
            "glowstone_crystal_spike_floor");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ECHO_CRYSTAL_SPIKE = registerKey("echo_crystal_spike");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ECHO_CRYSTAL_SPIKE_FLOOR = registerKey(
            "echo_crystal_spike_floor");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PRISMARINE_CRYSTAL_SPIKE = registerKey(
            "prismarine_crystal_spike");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WRAPPIST_CRYSTAL_SPIKE = registerKey(
            "wrappist_crystal_spike");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ANCIENT_DEBRIS_GEODE = registerKey("ancient_debris_geode");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BASALT_ANCIENT_DEBRIS_GEODE = registerKey(
            "basalt_ancient_debris_geode");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BLACKSTONE_ANCIENT_DEBRIS_GEODE = registerKey(
            "blackstone_ancient_debris_geode");
    public static final ResourceKey<ConfiguredFeature<?, ?>> GLOWSTONE_GEODE = registerKey("glowstone_geode");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BASALT_GLOWSTONE_GEODE = registerKey(
            "basalt_glowstone_geode");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BLACKSTONE_GLOWSTONE_GEODE = registerKey(
            "blackstone_glowstone_geode");
    public static final ResourceKey<ConfiguredFeature<?, ?>> GOLD_NUGGET_GEODE = registerKey("gold_nugget_geode");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BASALT_GOLD_NUGGET_GEODE = registerKey(
            "basalt_gold_nugget_geode");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BLACKSTONE_GOLD_NUGGET_GEODE = registerKey(
            "blackstone_gold_nugget_geode");

    public static final ResourceKey<ConfiguredFeature<?, ?>> QUARTZ_GEODE = registerKey("quartz_geode");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BASALT_QUARTZ_GEODE = registerKey("basalt_quartz_geode");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BLACKSTONE_QUARTZ_GEODE = registerKey(
            "blackstone_quartz_geode");

    public static final ResourceKey<ConfiguredFeature<?, ?>> DIAMOND_GEODE = registerKey("diamond_geode");
    public static final ResourceKey<ConfiguredFeature<?, ?>> DEEPSLATE_DIAMOND_GEODE = registerKey(
            "deepslate_diamond_geode");
    public static final ResourceKey<ConfiguredFeature<?, ?>> SCULK_DIAMOND_GEODE = registerKey("sculk_diamond_geode");

    public static final ResourceKey<ConfiguredFeature<?, ?>> EMERALD_GEODE = registerKey("emerald_geode");
    public static final ResourceKey<ConfiguredFeature<?, ?>> DEEPSLATE_EMERALD_GEODE = registerKey(
            "deepslate_emerald_geode");
    public static final ResourceKey<ConfiguredFeature<?, ?>> SCULK_EMERALD_GEODE = registerKey("sculk_emerald_geode");

    public static final ResourceKey<ConfiguredFeature<?, ?>> LAPIS_GEODE = registerKey("lapis_geode");
    public static final ResourceKey<ConfiguredFeature<?, ?>> DEEPSLATE_LAPIS_GEODE = registerKey("deepslate_lapis_geode");
    public static final ResourceKey<ConfiguredFeature<?, ?>> SCULK_LAPIS_GEODE = registerKey("sculk_lapis_geode");

    public static final ResourceKey<ConfiguredFeature<?, ?>> REDSTONE_GEODE = registerKey("redstone_geode");
    public static final ResourceKey<ConfiguredFeature<?, ?>> DEEPSLATE_REDSTONE_GEODE = registerKey(
            "deepslate_redstone_geode");
    public static final ResourceKey<ConfiguredFeature<?, ?>> SCULK_REDSTONE_GEODE = registerKey("sculk_redstone_geode");

    public static final ResourceKey<ConfiguredFeature<?, ?>> CELESTITE_GEODE = registerKey("celestite_geode");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PINK_TOPAZ_GEODE = registerKey("pink_topaz_geode");

    public static void bootstrap(BootstrapContext<ConfiguredFeature<?, ?>> context) {
        registerCrystalSpike(context,
                NETHER_QUARTZ_CRYSTAL_SPIKE,
                BlockRegistry.NETHER_QUARTZ_CRYSTAL_BLOCK.value(),
                BlockRegistry.NETHER_QUARTZ_CRYSTAL.value(),
                Blocks.BLACKSTONE,
                TagRegistry.Blocks.NETHER_QUARTZ_CRYSTAL_SPIKE_MAY_PLACE_ON,
                CaveSurface.CEILING);
        registerCrystalSpike(context,
                NETHER_QUARTZ_CRYSTAL_SPIKE_FLOOR,
                BlockRegistry.NETHER_QUARTZ_CRYSTAL_BLOCK.value(),
                BlockRegistry.NETHER_QUARTZ_CRYSTAL.value(),
                Blocks.BLACKSTONE,
                TagRegistry.Blocks.NETHER_QUARTZ_CRYSTAL_SPIKE_MAY_PLACE_ON,
                CaveSurface.FLOOR);
        registerCrystalSpike(context,
                GLOWSTONE_CRYSTAL_SPIKE,
                BlockRegistry.GLOWSTONE_CLUSTER_BLOCK.value(),
                BlockRegistry.GLOWSTONE_CLUSTER.value(),
                Blocks.BLACKSTONE,
                TagRegistry.Blocks.GLOWSTONE_CRYSTAL_SPIKE_MAY_PLACE_ON,
                CaveSurface.CEILING);
        registerCrystalSpike(context,
                GLOWSTONE_CRYSTAL_SPIKE_FLOOR,
                BlockRegistry.GLOWSTONE_CLUSTER_BLOCK.value(),
                BlockRegistry.GLOWSTONE_CLUSTER.value(),
                Blocks.BLACKSTONE,
                TagRegistry.Blocks.GLOWSTONE_CRYSTAL_SPIKE_MAY_PLACE_ON,
                CaveSurface.FLOOR);
        registerCrystalSpike(context,
                ECHO_CRYSTAL_SPIKE,
                Blocks.SCULK,
                BlockRegistry.ECHO_CRYSTAL.value(),
                Blocks.SCULK,
                TagRegistry.Blocks.ECHO_CRYSTAL_SPIKE_MAY_PLACE_ON,
                CaveSurface.CEILING);
        registerCrystalSpike(context,
                ECHO_CRYSTAL_SPIKE_FLOOR,
                Blocks.SCULK,
                BlockRegistry.ECHO_CRYSTAL.value(),
                Blocks.SCULK,
                TagRegistry.Blocks.ECHO_CRYSTAL_SPIKE_MAY_PLACE_ON,
                CaveSurface.FLOOR);
        registerCrystalSpike(context,
                WRAPPIST_CRYSTAL_SPIKE,
                BlockRegistry.WRAPPIST_BLOCK.value(),
                BlockRegistry.WRAPPIST_CLUSTER.value(),
                BlockRegistry.SMOOTH_END_STONE.value(),
                TagRegistry.Blocks.WRAPPIST_CRYSTAL_SPIKE_MAY_PLACE_ON,
                CaveSurface.FLOOR);
        registerCrystalSpike(context,
                PRISMARINE_CRYSTAL_SPIKE,
                BlockRegistry.PRISMARINE_CLUSTER_BLOCK.value(),
                BlockRegistry.PRISMARINE_CLUSTER.value(),
                Blocks.PRISMARINE,
                TagRegistry.Blocks.PRISMARINE_CRYSTAL_SPIKE_MAY_PLACE_ON,
                CaveSurface.FLOOR);
        registerGeode(context,
                ANCIENT_DEBRIS_GEODE,
                BlockRegistry.BUDDING_ANCIENT_DEBRIS.value(),
                Blocks.NETHERRACK,
                List.of(BlockRegistry.SMALL_ANCIENT_DEBRIS_BUD.value(),
                        BlockRegistry.MEDIUM_ANCIENT_DEBRIS_BUD.value(),
                        BlockRegistry.LARGE_ANCIENT_DEBRIS_BUD.value(),
                        BlockRegistry.ANCIENT_DEBRIS_CLUSTER.value()));
        registerGeode(context,
                BASALT_ANCIENT_DEBRIS_GEODE,
                BlockRegistry.BUDDING_BASALT_ANCIENT_DEBRIS.value(),
                Blocks.NETHERRACK,
                List.of(BlockRegistry.SMALL_ANCIENT_DEBRIS_BUD.value(),
                        BlockRegistry.MEDIUM_ANCIENT_DEBRIS_BUD.value(),
                        BlockRegistry.LARGE_ANCIENT_DEBRIS_BUD.value(),
                        BlockRegistry.ANCIENT_DEBRIS_CLUSTER.value()));
        registerGeode(context,
                BLACKSTONE_ANCIENT_DEBRIS_GEODE,
                BlockRegistry.BUDDING_BLACKSTONE_ANCIENT_DEBRIS.value(),
                Blocks.NETHERRACK,
                List.of(BlockRegistry.SMALL_ANCIENT_DEBRIS_BUD.value(),
                        BlockRegistry.MEDIUM_ANCIENT_DEBRIS_BUD.value(),
                        BlockRegistry.LARGE_ANCIENT_DEBRIS_BUD.value(),
                        BlockRegistry.ANCIENT_DEBRIS_CLUSTER.value()));
        registerGeode(context,
                GLOWSTONE_GEODE,
                BlockRegistry.BUDDING_GLOWSTONE.value(),
                Blocks.NETHERRACK,
                List.of(BlockRegistry.SMALL_GLOWSTONE_BUD.value(),
                        BlockRegistry.MEDIUM_GLOWSTONE_BUD.value(),
                        BlockRegistry.LARGE_GLOWSTONE_BUD.value(),
                        BlockRegistry.GLOWSTONE_CLUSTER.value()));
        registerGeode(context,
                BASALT_GLOWSTONE_GEODE,
                BlockRegistry.BUDDING_BASALT_GLOWSTONE.value(),
                Blocks.NETHERRACK,
                List.of(BlockRegistry.SMALL_GLOWSTONE_BUD.value(),
                        BlockRegistry.MEDIUM_GLOWSTONE_BUD.value(),
                        BlockRegistry.LARGE_GLOWSTONE_BUD.value(),
                        BlockRegistry.GLOWSTONE_CLUSTER.value()));
        registerGeode(context,
                BLACKSTONE_GLOWSTONE_GEODE,
                BlockRegistry.BUDDING_BLACKSTONE_GLOWSTONE.value(),
                Blocks.NETHERRACK,
                List.of(BlockRegistry.SMALL_GLOWSTONE_BUD.value(),
                        BlockRegistry.MEDIUM_GLOWSTONE_BUD.value(),
                        BlockRegistry.LARGE_GLOWSTONE_BUD.value(),
                        BlockRegistry.GLOWSTONE_CLUSTER.value()));
        registerGeode(context,
                GOLD_NUGGET_GEODE,
                BlockRegistry.BUDDING_GOLD_NUGGET.value(),
                Blocks.NETHERRACK,
                List.of(BlockRegistry.SMALL_GOLD_NUGGET_BUD.value(),
                        BlockRegistry.MEDIUM_GOLD_NUGGET_BUD.value(),
                        BlockRegistry.LARGE_GOLD_NUGGET_BUD.value(),
                        BlockRegistry.GOLD_NUGGET_CLUSTER.value()));
        registerGeode(context,
                BASALT_GOLD_NUGGET_GEODE,
                BlockRegistry.BUDDING_BASALT_GOLD_NUGGET.value(),
                Blocks.NETHERRACK,
                List.of(BlockRegistry.SMALL_GOLD_NUGGET_BUD.value(),
                        BlockRegistry.MEDIUM_GOLD_NUGGET_BUD.value(),
                        BlockRegistry.LARGE_GOLD_NUGGET_BUD.value(),
                        BlockRegistry.GOLD_NUGGET_CLUSTER.value()));
        registerGeode(context,
                BLACKSTONE_GOLD_NUGGET_GEODE,
                BlockRegistry.BUDDING_BLACKSTONE_GOLD_NUGGET.value(),
                Blocks.NETHERRACK,
                List.of(BlockRegistry.SMALL_GOLD_NUGGET_BUD.value(),
                        BlockRegistry.MEDIUM_GOLD_NUGGET_BUD.value(),
                        BlockRegistry.LARGE_GOLD_NUGGET_BUD.value(),
                        BlockRegistry.GOLD_NUGGET_CLUSTER.value()));
        registerGeode(context,
                QUARTZ_GEODE,
                BlockRegistry.BUDDING_NETHER_QUARTZ.value(),
                Blocks.NETHERRACK,
                List.of(BlockRegistry.SMALL_NETHER_QUARTZ_BUD.value(),
                        BlockRegistry.MEDIUM_NETHER_QUARTZ_BUD.value(),
                        BlockRegistry.LARGE_NETHER_QUARTZ_BUD.value(),
                        BlockRegistry.NETHER_QUARTZ_CRYSTAL.value()));
        registerGeode(context,
                BASALT_QUARTZ_GEODE,
                BlockRegistry.BUDDING_BASALT_NETHER_QUARTZ.value(),
                Blocks.NETHERRACK,
                List.of(BlockRegistry.SMALL_NETHER_QUARTZ_BUD.value(),
                        BlockRegistry.MEDIUM_NETHER_QUARTZ_BUD.value(),
                        BlockRegistry.LARGE_NETHER_QUARTZ_BUD.value(),
                        BlockRegistry.NETHER_QUARTZ_CRYSTAL.value()));
        registerGeode(context,
                BLACKSTONE_QUARTZ_GEODE,
                BlockRegistry.BUDDING_BLACKSTONE_NETHER_QUARTZ.value(),
                Blocks.NETHERRACK,
                List.of(BlockRegistry.SMALL_NETHER_QUARTZ_BUD.value(),
                        BlockRegistry.MEDIUM_NETHER_QUARTZ_BUD.value(),
                        BlockRegistry.LARGE_NETHER_QUARTZ_BUD.value(),
                        BlockRegistry.NETHER_QUARTZ_CRYSTAL.value()));
        registerGeode(context,
                ECHO_GEODE,
                BlockRegistry.BUDDING_ECHO.value(),
                Blocks.SCULK,
                List.of(BlockRegistry.SMALL_ECHO_BUD.value(),
                        BlockRegistry.MEDIUM_ECHO_BUD.value(),
                        BlockRegistry.LARGE_ECHO_BUD.value(),
                        BlockRegistry.ECHO_CRYSTAL.value()));
        registerGeode(context,
                WRAPPIST_GEODE,
                BlockRegistry.BUDDING_WRAPPIST.value(),
                BlockRegistry.WRAPPIST_BLOCK.value(),
                BlockRegistry.GALCITE.value(),
                BlockRegistry.SMOOTH_END_STONE.value(),
                List.of(BlockRegistry.SMALL_WRAPPIST_BUD.value(),
                        BlockRegistry.MEDIUM_WRAPPIST_BUD.value(),
                        BlockRegistry.LARGE_WRAPPIST_BUD.value(),
                        BlockRegistry.WRAPPIST_CLUSTER.value()));
        registerGeode(context,
                PRISMARINE_GEODE,
                Blocks.WATER,
                BlockRegistry.BUDDING_PRISMARINE.value(),
                Blocks.PRISMARINE,
                Blocks.PRISMARINE,
                Blocks.PRISMARINE,
                List.of(BlockRegistry.SMALL_PRISMARINE_BUD.value(),
                        BlockRegistry.MEDIUM_PRISMARINE_BUD.value(),
                        BlockRegistry.LARGE_PRISMARINE_BUD.value(),
                        BlockRegistry.PRISMARINE_CLUSTER.value()));
        registerGeode(context,
                DIAMOND_GEODE,
                BlockRegistry.BUDDING_DIAMOND.value(),
                Blocks.STONE,
                List.of(BlockRegistry.SMALL_DIAMOND_BUD.value(),
                        BlockRegistry.MEDIUM_DIAMOND_BUD.value(),
                        BlockRegistry.LARGE_DIAMOND_BUD.value(),
                        BlockRegistry.DIAMOND_CRYSTAL.value()));
        registerGeode(context,
                DEEPSLATE_DIAMOND_GEODE,
                BlockRegistry.BUDDING_DEEPSLATE_DIAMOND.value(),
                Blocks.DEEPSLATE,
                List.of(BlockRegistry.SMALL_DIAMOND_BUD.value(),
                        BlockRegistry.MEDIUM_DIAMOND_BUD.value(),
                        BlockRegistry.LARGE_DIAMOND_BUD.value(),
                        BlockRegistry.DIAMOND_CRYSTAL.value()));
        registerGeode(context,
                SCULK_DIAMOND_GEODE,
                BlockRegistry.BUDDING_SCULK_DIAMOND.value(),
                Blocks.SCULK,
                List.of(BlockRegistry.SMALL_DIAMOND_BUD.value(),
                        BlockRegistry.MEDIUM_DIAMOND_BUD.value(),
                        BlockRegistry.LARGE_DIAMOND_BUD.value(),
                        BlockRegistry.DIAMOND_CRYSTAL.value()));
        registerGeode(context,
                EMERALD_GEODE,
                BlockRegistry.BUDDING_EMERALD.value(),
                Blocks.STONE,
                List.of(BlockRegistry.SMALL_EMERALD_BUD.value(),
                        BlockRegistry.MEDIUM_EMERALD_BUD.value(),
                        BlockRegistry.LARGE_EMERALD_BUD.value(),
                        BlockRegistry.EMERALD_CLUSTER.value()));
        registerGeode(context,
                DEEPSLATE_EMERALD_GEODE,
                BlockRegistry.BUDDING_DEEPSLATE_EMERALD.value(),
                Blocks.DEEPSLATE,
                List.of(BlockRegistry.SMALL_EMERALD_BUD.value(),
                        BlockRegistry.MEDIUM_EMERALD_BUD.value(),
                        BlockRegistry.LARGE_EMERALD_BUD.value(),
                        BlockRegistry.EMERALD_CLUSTER.value()));
        registerGeode(context,
                SCULK_EMERALD_GEODE,
                BlockRegistry.BUDDING_SCULK_EMERALD.value(),
                Blocks.SCULK,
                List.of(BlockRegistry.SMALL_EMERALD_BUD.value(),
                        BlockRegistry.MEDIUM_EMERALD_BUD.value(),
                        BlockRegistry.LARGE_EMERALD_BUD.value(),
                        BlockRegistry.EMERALD_CLUSTER.value()));
        registerGeode(context,
                LAPIS_GEODE,
                BlockRegistry.BUDDING_LAPIS_LAZULI.value(),
                Blocks.STONE,
                List.of(BlockRegistry.SMALL_LAPIS_LAZULI_BUD.value(),
                        BlockRegistry.MEDIUM_LAPIS_LAZULI_BUD.value(),
                        BlockRegistry.LARGE_LAPIS_LAZULI_BUD.value(),
                        BlockRegistry.LAPIS_LAZULI_CLUSTER.value()));
        registerGeode(context,
                DEEPSLATE_LAPIS_GEODE,
                BlockRegistry.BUDDING_DEEPSLATE_LAPIS_LAZULI.value(),
                Blocks.DEEPSLATE,
                List.of(BlockRegistry.SMALL_LAPIS_LAZULI_BUD.value(),
                        BlockRegistry.MEDIUM_LAPIS_LAZULI_BUD.value(),
                        BlockRegistry.LARGE_LAPIS_LAZULI_BUD.value(),
                        BlockRegistry.LAPIS_LAZULI_CLUSTER.value()));
        registerGeode(context,
                SCULK_LAPIS_GEODE,
                BlockRegistry.BUDDING_SCULK_LAPIS_LAZULI.value(),
                Blocks.SCULK,
                List.of(BlockRegistry.SMALL_LAPIS_LAZULI_BUD.value(),
                        BlockRegistry.MEDIUM_LAPIS_LAZULI_BUD.value(),
                        BlockRegistry.LARGE_LAPIS_LAZULI_BUD.value(),
                        BlockRegistry.LAPIS_LAZULI_CLUSTER.value()));
        registerGeode(context,
                REDSTONE_GEODE,
                BlockRegistry.BUDDING_REDSTONE.value(),
                Blocks.STONE,
                List.of(BlockRegistry.SMALL_REDSTONE_BUD.value(),
                        BlockRegistry.MEDIUM_REDSTONE_BUD.value(),
                        BlockRegistry.LARGE_REDSTONE_BUD.value(),
                        BlockRegistry.REDSTONE_CRYSTAL.value()));
        registerGeode(context,
                DEEPSLATE_REDSTONE_GEODE,
                BlockRegistry.BUDDING_DEEPSLATE_REDSTONE.value(),
                Blocks.DEEPSLATE,
                List.of(BlockRegistry.SMALL_REDSTONE_BUD.value(),
                        BlockRegistry.MEDIUM_REDSTONE_BUD.value(),
                        BlockRegistry.LARGE_REDSTONE_BUD.value(),
                        BlockRegistry.REDSTONE_CRYSTAL.value()));
        registerGeode(context,
                SCULK_REDSTONE_GEODE,
                BlockRegistry.BUDDING_SCULK_REDSTONE.value(),
                Blocks.SCULK,
                List.of(BlockRegistry.SMALL_REDSTONE_BUD.value(),
                        BlockRegistry.MEDIUM_REDSTONE_BUD.value(),
                        BlockRegistry.LARGE_REDSTONE_BUD.value(),
                        BlockRegistry.REDSTONE_CRYSTAL.value()));
        registerGeode(context,
                CELESTITE_GEODE,
                BlockRegistry.BUDDING_CELESTITE.value(),
                BlockRegistry.CELESTITE_BLOCK.value(),
                Blocks.CALCITE,
                Blocks.SMOOTH_BASALT,
                List.of(BlockRegistry.SMALL_CELESTITE_BUD.value(),
                        BlockRegistry.MEDIUM_CELESTITE_BUD.value(),
                        BlockRegistry.LARGE_CELESTITE_BUD.value(),
                        BlockRegistry.CELESTITE_CLUSTER.value()));
        registerGeode(context,
                PINK_TOPAZ_GEODE,
                BlockRegistry.BUDDING_PINK_TOPAZ.value(),
                BlockRegistry.PINK_TOPAZ_BLOCK.value(),
                Blocks.CALCITE,
                Blocks.SMOOTH_BASALT,
                List.of(BlockRegistry.SMALL_PINK_TOPAZ_BUD.value(),
                        BlockRegistry.MEDIUM_PINK_TOPAZ_BUD.value(),
                        BlockRegistry.LARGE_PINK_TOPAZ_BUD.value(),
                        BlockRegistry.PINK_TOPAZ_CRYSTAL.value()));
    }

    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ModRegistry.REGISTRY.makeResourceKey(Registries.CONFIGURED_FEATURE, name);
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstrapContext<ConfiguredFeature<?, ?>> context, ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }

    private static void registerCrystalSpike(BootstrapContext<ConfiguredFeature<?, ?>> context, ResourceKey<ConfiguredFeature<?, ?>> key, Block crystalBlock, Block clusterBlock, Block bloomBlock, TagKey<Block> placeableOn, CaveSurface crystalDirection) {
        register(context,
                key,
                FeatureRegistry.CRYSTAL_SPIKE.value(),
                new CrystalSpikeConfiguration(BlockStateProvider.simple(crystalBlock),
                        BlockStateProvider.simple(clusterBlock),
                        BlockStateProvider.simple(bloomBlock),
                        placeableOn,
                        UniformInt.of(1, 3),
                        crystalDirection));
    }

    private static void registerGeode(BootstrapContext<ConfiguredFeature<?, ?>> context, ResourceKey<ConfiguredFeature<?, ?>> key, Block buddingBlock, Block layerBlock, List<Block> innerPlacements) {
        registerGeode(context, key, buddingBlock, layerBlock, layerBlock, layerBlock, innerPlacements);
    }

    private static void registerGeode(BootstrapContext<ConfiguredFeature<?, ?>> context, ResourceKey<ConfiguredFeature<?, ?>> key, Block buddingBlock, Block innerLayerBlock, Block middleLayerBlock, Block outerLayerBlock, List<Block> innerPlacements) {
        registerGeode(context,
                key,
                Blocks.AIR,
                buddingBlock,
                innerLayerBlock,
                middleLayerBlock,
                outerLayerBlock,
                innerPlacements);
    }

    private static void registerGeode(BootstrapContext<ConfiguredFeature<?, ?>> context, ResourceKey<ConfiguredFeature<?, ?>> key, Block fillingBlock, Block buddingBlock, Block innerLayerBlock, Block middleLayerBlock, Block outerLayerBlock, List<Block> innerPlacements) {
        register(context,
                key,
                Feature.GEODE,
                new GeodeConfiguration(new GeodeBlockSettings(BlockStateProvider.simple(fillingBlock),
                        BlockStateProvider.simple(innerLayerBlock),
                        BlockStateProvider.simple(buddingBlock),
                        BlockStateProvider.simple(middleLayerBlock),
                        BlockStateProvider.simple(outerLayerBlock),
                        innerPlacements.stream().map(Block::defaultBlockState).toList(),
                        BlockTags.FEATURES_CANNOT_REPLACE,
                        BlockTags.GEODE_INVALID_BLOCKS),
                        new GeodeLayerSettings(1.7, 2.2, 3.2, 4.2),
                        new GeodeCrackSettings(0.95, 2.0, 2),
                        0.35,
                        0.083,
                        true,
                        UniformInt.of(4, 6),
                        UniformInt.of(3, 4),
                        UniformInt.of(1, 2),
                        -16,
                        16,
                        0.05,
                        1));
    }
}
