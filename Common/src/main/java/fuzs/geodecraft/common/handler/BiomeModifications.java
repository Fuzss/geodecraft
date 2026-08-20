package fuzs.geodecraft.common.handler;

import fuzs.geodecraft.common.Geodecraft;
import fuzs.geodecraft.common.config.CommonConfig;
import fuzs.puzzleslib.api.biome.v1.BiomeLoadingContext;
import fuzs.puzzleslib.api.biome.v1.BiomeLoadingPhase;
import fuzs.puzzleslib.api.biome.v1.BiomeModificationContext;
import fuzs.puzzleslib.api.core.v2.context.BiomeModificationsContext;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.yeoxuhang.geode_plus.server.registry.PlacedFeatureRegistry;
import net.yeoxuhang.geode_plus.server.registry.TagRegistry;

public class BiomeModifications {

    public static void init(BiomeModificationsContext registrar) {
        if (Geodecraft.CONFIG.get(CommonConfig.class).prismarineGeodes) {
            registrar.registerBiomeModification(BiomeLoadingPhase.ADDITIONS,
                    (BiomeLoadingContext context) -> context.is(TagRegistry.Biomes.HAS_PRISMARINE_GEODE),
                    (BiomeModificationContext context) -> {
                        context.generationSettings()
                                .addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION,
                                        PlacedFeatureRegistry.PRISMARINE_GEODE);
                    });
        }

        if (Geodecraft.CONFIG.get(CommonConfig.class).celestiteGeodes) {
            registrar.registerBiomeModification(BiomeLoadingPhase.ADDITIONS,
                    (BiomeLoadingContext context) -> context.is(TagRegistry.Biomes.HAS_CELESTITE_GEODE),
                    (BiomeModificationContext context) -> {
                        context.generationSettings()
                                .addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION,
                                        PlacedFeatureRegistry.CELESTITE_GEODE);
                    });
        }

        if (Geodecraft.CONFIG.get(CommonConfig.class).pinkTopazGeodes) {
            registrar.registerBiomeModification(BiomeLoadingPhase.ADDITIONS,
                    (BiomeLoadingContext context) -> context.is(TagRegistry.Biomes.HAS_PINK_TOPAZ_GEODE),
                    (BiomeModificationContext context) -> {
                        context.generationSettings()
                                .addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION,
                                        PlacedFeatureRegistry.PINK_TOPAZ_GEODE);
                    });
        }

        if (Geodecraft.CONFIG.get(CommonConfig.class).diamondGeodes) {
            registrar.registerBiomeModification(BiomeLoadingPhase.ADDITIONS,
                    (BiomeLoadingContext context) -> context.is(TagRegistry.Biomes.HAS_DIAMOND_GEODE),
                    (BiomeModificationContext context) -> {
                        context.generationSettings()
                                .addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION,
                                        PlacedFeatureRegistry.DIAMOND_GEODE);
                    });

            registrar.registerBiomeModification(BiomeLoadingPhase.ADDITIONS,
                    (BiomeLoadingContext context) -> context.is(TagRegistry.Biomes.HAS_DIAMOND_GEODE),
                    (BiomeModificationContext context) -> {
                        context.generationSettings()
                                .addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION,
                                        PlacedFeatureRegistry.DEEPSLATE_DIAMOND_GEODE);
                    });

            registrar.registerBiomeModification(BiomeLoadingPhase.ADDITIONS,
                    (BiomeLoadingContext context) -> context.is(TagRegistry.Biomes.HAS_ECHO_GEODE),
                    (BiomeModificationContext context) -> {
                        context.generationSettings()
                                .addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION,
                                        PlacedFeatureRegistry.SCULK_DIAMOND_GEODE);
                    });
        }

        if (Geodecraft.CONFIG.get(CommonConfig.class).emeraldGeodes) {
            registrar.registerBiomeModification(BiomeLoadingPhase.ADDITIONS,
                    (BiomeLoadingContext context) -> context.is(TagRegistry.Biomes.HAS_EMERALD_GEODE),
                    (BiomeModificationContext context) -> {
                        context.generationSettings()
                                .addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION,
                                        PlacedFeatureRegistry.EMERALD_GEODE);
                    });

            registrar.registerBiomeModification(BiomeLoadingPhase.ADDITIONS,
                    (BiomeLoadingContext context) -> context.is(TagRegistry.Biomes.HAS_EMERALD_GEODE),
                    (BiomeModificationContext context) -> {
                        context.generationSettings()
                                .addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION,
                                        PlacedFeatureRegistry.DEEPSLATE_EMERALD_GEODE);
                    });

            registrar.registerBiomeModification(BiomeLoadingPhase.ADDITIONS,
                    (BiomeLoadingContext context) -> context.is(TagRegistry.Biomes.HAS_ECHO_GEODE),
                    (BiomeModificationContext context) -> {
                        context.generationSettings()
                                .addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION,
                                        PlacedFeatureRegistry.SCULK_EMERALD_GEODE);
                    });
        }

        if (Geodecraft.CONFIG.get(CommonConfig.class).lapisGeodes) {
            registrar.registerBiomeModification(BiomeLoadingPhase.ADDITIONS,
                    (BiomeLoadingContext context) -> context.is(TagRegistry.Biomes.HAS_LAPIS_GEODE),
                    (BiomeModificationContext context) -> {
                        context.generationSettings()
                                .addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION,
                                        PlacedFeatureRegistry.LAPIS_GEODE);
                    });

            registrar.registerBiomeModification(BiomeLoadingPhase.ADDITIONS,
                    (BiomeLoadingContext context) -> context.is(TagRegistry.Biomes.HAS_LAPIS_GEODE),
                    (BiomeModificationContext context) -> {
                        context.generationSettings()
                                .addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION,
                                        PlacedFeatureRegistry.DEEPSLATE_LAPIS_GEODE);
                    });

            registrar.registerBiomeModification(BiomeLoadingPhase.ADDITIONS,
                    (BiomeLoadingContext context) -> context.is(TagRegistry.Biomes.HAS_ECHO_GEODE),
                    (BiomeModificationContext context) -> {
                        context.generationSettings()
                                .addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION,
                                        PlacedFeatureRegistry.SCULK_LAPIS_GEODE);
                    });
        }

        if (Geodecraft.CONFIG.get(CommonConfig.class).redstoneGeodes) {
            registrar.registerBiomeModification(BiomeLoadingPhase.ADDITIONS,
                    (BiomeLoadingContext context) -> context.is(TagRegistry.Biomes.HAS_REDSTONE_GEODE),
                    (BiomeModificationContext context) -> {
                        context.generationSettings()
                                .addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION,
                                        PlacedFeatureRegistry.REDSTONE_GEODE);
                    });

            registrar.registerBiomeModification(BiomeLoadingPhase.ADDITIONS,
                    (BiomeLoadingContext context) -> context.is(TagRegistry.Biomes.HAS_REDSTONE_GEODE),
                    (BiomeModificationContext context) -> {
                        context.generationSettings()
                                .addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION,
                                        PlacedFeatureRegistry.DEEPSLATE_REDSTONE_GEODE);
                    });

            registrar.registerBiomeModification(BiomeLoadingPhase.ADDITIONS,
                    (BiomeLoadingContext context) -> context.is(TagRegistry.Biomes.HAS_ECHO_GEODE),
                    (BiomeModificationContext context) -> {
                        context.generationSettings()
                                .addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION,
                                        PlacedFeatureRegistry.SCULK_REDSTONE_GEODE);
                    });
        }

        if (Geodecraft.CONFIG.get(CommonConfig.class).echoGeodes) {
            registrar.registerBiomeModification(BiomeLoadingPhase.ADDITIONS,
                    (BiomeLoadingContext context) -> context.is(TagRegistry.Biomes.HAS_ECHO_GEODE),
                    (BiomeModificationContext context) -> {
                        context.generationSettings()
                                .addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION,
                                        PlacedFeatureRegistry.ECHO_GEODE);
                    });
        }

        if (Geodecraft.CONFIG.get(CommonConfig.class).ancientDebrisGeodes) {
            registrar.registerBiomeModification(BiomeLoadingPhase.ADDITIONS,
                    (BiomeLoadingContext context) -> context.is(TagRegistry.Biomes.HAS_NETHER_ANCIENT_DEBRIS_GEODE),
                    (BiomeModificationContext context) -> {
                        context.generationSettings()
                                .addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION,
                                        PlacedFeatureRegistry.ANCIENT_DEBRIS_GEODE);
                    });

            registrar.registerBiomeModification(BiomeLoadingPhase.ADDITIONS,
                    (BiomeLoadingContext context) -> context.is(TagRegistry.Biomes.HAS_BASALT_ANCIENT_DEBRIS_GEODE),
                    (BiomeModificationContext context) -> {
                        context.generationSettings()
                                .addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION,
                                        PlacedFeatureRegistry.BASALT_ANCIENT_DEBRIS_GEODE);
                    });

            registrar.registerBiomeModification(BiomeLoadingPhase.ADDITIONS,
                    (BiomeLoadingContext context) -> context.is(TagRegistry.Biomes.HAS_BLACKSTONE_ANCIENT_DEBRIS_GEODE),
                    (BiomeModificationContext context) -> {
                        context.generationSettings()
                                .addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION,
                                        PlacedFeatureRegistry.BLACKSTONE_ANCIENT_DEBRIS_GEODE);
                    });
        }

        if (Geodecraft.CONFIG.get(CommonConfig.class).glowstoneGeodes) {
            registrar.registerBiomeModification(BiomeLoadingPhase.ADDITIONS,
                    (BiomeLoadingContext context) -> context.is(TagRegistry.Biomes.HAS_NETHER_GLOWSTONE_GEODE),
                    (BiomeModificationContext context) -> {
                        context.generationSettings()
                                .addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION,
                                        PlacedFeatureRegistry.GLOWSTONE_GEODE);
                    });

            registrar.registerBiomeModification(BiomeLoadingPhase.ADDITIONS,
                    (BiomeLoadingContext context) -> context.is(TagRegistry.Biomes.HAS_BASALT_GLOWSTONE_GEODE),
                    (BiomeModificationContext context) -> {
                        context.generationSettings()
                                .addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION,
                                        PlacedFeatureRegistry.BASALT_GLOWSTONE_GEODE);
                    });

            registrar.registerBiomeModification(BiomeLoadingPhase.ADDITIONS,
                    (BiomeLoadingContext context) -> context.is(TagRegistry.Biomes.HAS_BLACKSTONE_GLOWSTONE_GEODE),
                    (BiomeModificationContext context) -> {
                        context.generationSettings()
                                .addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION,
                                        PlacedFeatureRegistry.BLACKSTONE_GLOWSTONE_GEODE);
                    });
        }

        if (Geodecraft.CONFIG.get(CommonConfig.class).goldGeodes) {
            registrar.registerBiomeModification(BiomeLoadingPhase.ADDITIONS,
                    (BiomeLoadingContext context) -> context.is(TagRegistry.Biomes.HAS_NETHER_GOLD_NUGGET_GEODE),
                    (BiomeModificationContext context) -> {
                        context.generationSettings()
                                .addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION,
                                        PlacedFeatureRegistry.GOLD_NUGGET_GEODE);
                    });

            registrar.registerBiomeModification(BiomeLoadingPhase.ADDITIONS,
                    (BiomeLoadingContext context) -> context.is(TagRegistry.Biomes.HAS_BASALT_GOLD_NUGGET_GEODE),
                    (BiomeModificationContext context) -> {
                        context.generationSettings()
                                .addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION,
                                        PlacedFeatureRegistry.BASALT_GOLD_NUGGET_GEODE);
                    });

            registrar.registerBiomeModification(BiomeLoadingPhase.ADDITIONS,
                    (BiomeLoadingContext context) -> context.is(TagRegistry.Biomes.HAS_BLACKSTONE_GOLD_NUGGET_GEODE),
                    (BiomeModificationContext context) -> {
                        context.generationSettings()
                                .addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION,
                                        PlacedFeatureRegistry.BLACKSTONE_GOLD_NUGGET_GEODE);
                    });
        }

        if (Geodecraft.CONFIG.get(CommonConfig.class).netherQuartzGeodes) {
            registrar.registerBiomeModification(BiomeLoadingPhase.ADDITIONS,
                    (BiomeLoadingContext context) -> context.is(TagRegistry.Biomes.HAS_NETHER_QUARTZ_GEODE),
                    (BiomeModificationContext context) -> {
                        context.generationSettings()
                                .addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION,
                                        PlacedFeatureRegistry.QUARTZ_GEODE);
                    });

            registrar.registerBiomeModification(BiomeLoadingPhase.ADDITIONS,
                    (BiomeLoadingContext context) -> context.is(TagRegistry.Biomes.HAS_BASALT_QUARTZ_GEODE),
                    (BiomeModificationContext context) -> {
                        context.generationSettings()
                                .addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION,
                                        PlacedFeatureRegistry.BASALT_QUARTZ_GEODE);
                    });

            registrar.registerBiomeModification(BiomeLoadingPhase.ADDITIONS,
                    (BiomeLoadingContext context) -> context.is(TagRegistry.Biomes.HAS_BLACKSTONE_QUARTZ_GEODE),
                    (BiomeModificationContext context) -> {
                        context.generationSettings()
                                .addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION,
                                        PlacedFeatureRegistry.BLACKSTONE_QUARTZ_GEODE);
                    });
        }

        if (Geodecraft.CONFIG.get(CommonConfig.class).wrappistGeodes) {
            registrar.registerBiomeModification(BiomeLoadingPhase.ADDITIONS,
                    (BiomeLoadingContext context) -> context.is(TagRegistry.Biomes.HAS_WRAPPIST_GEODE),
                    (BiomeModificationContext context) -> {
                        context.generationSettings()
                                .addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION,
                                        PlacedFeatureRegistry.WRAPPIST_GEODE);
                    });
        }

        if (Geodecraft.CONFIG.get(CommonConfig.class).prismarineCrystals) {
            registrar.registerBiomeModification(BiomeLoadingPhase.ADDITIONS,
                    (BiomeLoadingContext context) -> context.is(TagRegistry.Biomes.HAS_PRISMARINE_CRYSTAL),
                    (BiomeModificationContext context) -> {
                        context.generationSettings()
                                .addFeature(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
                                        PlacedFeatureRegistry.PRISMARINE_CRYSTAL_SPIKE);
                    });
        }

        if (Geodecraft.CONFIG.get(CommonConfig.class).echoShardCrystals) {
            registrar.registerBiomeModification(BiomeLoadingPhase.ADDITIONS,
                    (BiomeLoadingContext context) -> context.is(TagRegistry.Biomes.HAS_ECHO_CRYSTAL),
                    (BiomeModificationContext context) -> {
                        context.generationSettings()
                                .addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION,
                                        PlacedFeatureRegistry.ECHO_CRYSTAL_SPIKE);
                    });

            registrar.registerBiomeModification(BiomeLoadingPhase.ADDITIONS,
                    (BiomeLoadingContext context) -> context.is(TagRegistry.Biomes.HAS_ECHO_CRYSTAL),
                    (BiomeModificationContext context) -> {
                        context.generationSettings()
                                .addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION,
                                        PlacedFeatureRegistry.ECHO_CRYSTAL_SPIKE_FLOOR);
                    });
        }

        if (Geodecraft.CONFIG.get(CommonConfig.class).netherQuartzCrystals) {
            registrar.registerBiomeModification(BiomeLoadingPhase.ADDITIONS,
                    (BiomeLoadingContext context) -> context.is(TagRegistry.Biomes.HAS_QUARTZ_CRYSTAL),
                    (BiomeModificationContext context) -> {
                        context.generationSettings()
                                .addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION,
                                        PlacedFeatureRegistry.QUARTZ_CRYSTAL_SPIKE);
                    });

            registrar.registerBiomeModification(BiomeLoadingPhase.ADDITIONS,
                    (BiomeLoadingContext context) -> context.is(TagRegistry.Biomes.HAS_QUARTZ_CRYSTAL),
                    (BiomeModificationContext context) -> {
                        context.generationSettings()
                                .addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION,
                                        PlacedFeatureRegistry.QUARTZ_CRYSTAL_SPIKE_FLOOR);
                    });
        }

        if (Geodecraft.CONFIG.get(CommonConfig.class).glowstoneCrystals) {
            registrar.registerBiomeModification(BiomeLoadingPhase.ADDITIONS,
                    (BiomeLoadingContext context) -> context.is(TagRegistry.Biomes.HAS_GLOWSTONE_CRYSTAL),
                    (BiomeModificationContext context) -> {
                        context.generationSettings()
                                .addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION,
                                        PlacedFeatureRegistry.GLOWSTONE_CRYSTAL_SPIKE);
                    });

            registrar.registerBiomeModification(BiomeLoadingPhase.ADDITIONS,
                    (BiomeLoadingContext context) -> context.is(TagRegistry.Biomes.HAS_GLOWSTONE_CRYSTAL),
                    (BiomeModificationContext context) -> {
                        context.generationSettings()
                                .addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION,
                                        PlacedFeatureRegistry.GLOWSTONE_CRYSTAL_SPIKE_FLOOR);
                    });
        }

        if (Geodecraft.CONFIG.get(CommonConfig.class).wrappistCrystals) {
            registrar.registerBiomeModification(BiomeLoadingPhase.ADDITIONS,
                    (BiomeLoadingContext context) -> context.is(TagRegistry.Biomes.HAS_WRAPPIST_CRYSTAL),
                    (BiomeModificationContext context) -> {
                        context.generationSettings()
                                .addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION,
                                        PlacedFeatureRegistry.WRAPPIST_CRYSTAL_SPIKE);
                    });
        }
    }
}
