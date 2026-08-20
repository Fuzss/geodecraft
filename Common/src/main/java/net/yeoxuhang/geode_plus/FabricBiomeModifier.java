package net.yeoxuhang.geode_plus;

import fuzs.puzzleslib.api.biome.v1.BiomeLoadingContext;
import fuzs.puzzleslib.api.biome.v1.BiomeLoadingPhase;
import fuzs.puzzleslib.api.biome.v1.BiomeModificationContext;
import fuzs.puzzleslib.api.core.v2.context.BiomeModificationsContext;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.yeoxuhang.geode_plus.config.ServerConfig;
import net.yeoxuhang.geode_plus.server.registry.PlacedFeatureRegistry;
import net.yeoxuhang.geode_plus.server.registry.TagRegistry;

public class FabricBiomeModifier {

    public static void init(BiomeModificationsContext registrar) {
        if (ServerConfig.WorldGeneration.shouldGeneratePrismarineGeodes) {
            registrar.registerBiomeModification(BiomeLoadingPhase.ADDITIONS,
                    (BiomeLoadingContext context) -> context.is(TagRegistry.Biomes.HAS_PRISMARINE_GEODE) && !context.is(
                            TagRegistry.Biomes.BLACKLIST_BIOMES),
                    (BiomeModificationContext context) -> {
                        context.generationSettings()
                                .addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION,
                                        PlacedFeatureRegistry.PRISMARINE_GEODE);
                    });
        }

        if (ServerConfig.WorldGeneration.shouldGenerateCelestiteGeodes) {
            registrar.registerBiomeModification(BiomeLoadingPhase.ADDITIONS,
                    (BiomeLoadingContext context) -> context.is(TagRegistry.Biomes.HAS_CELESTITE_GEODE) && !context.is(
                            TagRegistry.Biomes.BLACKLIST_BIOMES),
                    (BiomeModificationContext context) -> {
                        context.generationSettings()
                                .addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION,
                                        PlacedFeatureRegistry.CELESTITE_GEODE);
                    });
        }

        if (ServerConfig.WorldGeneration.shouldGeneratePinkTopazGeodes) {
            registrar.registerBiomeModification(BiomeLoadingPhase.ADDITIONS,
                    (BiomeLoadingContext context) -> context.is(TagRegistry.Biomes.HAS_PINK_TOPAZ_GEODE) && !context.is(
                            TagRegistry.Biomes.BLACKLIST_BIOMES),
                    (BiomeModificationContext context) -> {
                        context.generationSettings()
                                .addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION,
                                        PlacedFeatureRegistry.PINK_TOPAZ_GEODE);
                    });
        }

        if (ServerConfig.WorldGeneration.shouldGenerateDiamondGeodes) {
            registrar.registerBiomeModification(BiomeLoadingPhase.ADDITIONS,
                    (BiomeLoadingContext context) -> context.is(TagRegistry.Biomes.HAS_DIAMOND_GEODE) && !context.is(
                            TagRegistry.Biomes.BLACKLIST_BIOMES),
                    (BiomeModificationContext context) -> {
                        context.generationSettings()
                                .addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION,
                                        PlacedFeatureRegistry.DIAMOND_GEODE);
                    });

            registrar.registerBiomeModification(BiomeLoadingPhase.ADDITIONS,
                    (BiomeLoadingContext context) -> context.is(TagRegistry.Biomes.HAS_DIAMOND_GEODE) && !context.is(
                            TagRegistry.Biomes.BLACKLIST_BIOMES),
                    (BiomeModificationContext context) -> {
                        context.generationSettings()
                                .addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION,
                                        PlacedFeatureRegistry.DEEPSLATE_DIAMOND_GEODE);
                    });

            registrar.registerBiomeModification(BiomeLoadingPhase.ADDITIONS,
                    (BiomeLoadingContext context) -> context.is(TagRegistry.Biomes.HAS_ECHO_GEODE) && !context.is(
                            TagRegistry.Biomes.BLACKLIST_BIOMES),
                    (BiomeModificationContext context) -> {
                        context.generationSettings()
                                .addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION,
                                        PlacedFeatureRegistry.SCULK_DIAMOND_GEODE);
                    });
        }

        if (ServerConfig.WorldGeneration.shouldGenerateEmeraldGeodes) {
            registrar.registerBiomeModification(BiomeLoadingPhase.ADDITIONS,
                    (BiomeLoadingContext context) -> context.is(TagRegistry.Biomes.HAS_EMERALD_GEODE) && !context.is(
                            TagRegistry.Biomes.BLACKLIST_BIOMES),
                    (BiomeModificationContext context) -> {
                        context.generationSettings()
                                .addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION,
                                        PlacedFeatureRegistry.EMERALD_GEODE);
                    });

            registrar.registerBiomeModification(BiomeLoadingPhase.ADDITIONS,
                    (BiomeLoadingContext context) -> context.is(TagRegistry.Biomes.HAS_EMERALD_GEODE) && !context.is(
                            TagRegistry.Biomes.BLACKLIST_BIOMES),
                    (BiomeModificationContext context) -> {
                        context.generationSettings()
                                .addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION,
                                        PlacedFeatureRegistry.DEEPSLATE_EMERALD_GEODE);
                    });

            registrar.registerBiomeModification(BiomeLoadingPhase.ADDITIONS,
                    (BiomeLoadingContext context) -> context.is(TagRegistry.Biomes.HAS_ECHO_GEODE) && !context.is(
                            TagRegistry.Biomes.BLACKLIST_BIOMES),
                    (BiomeModificationContext context) -> {
                        context.generationSettings()
                                .addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION,
                                        PlacedFeatureRegistry.SCULK_EMERALD_GEODE);
                    });
        }

        if (ServerConfig.WorldGeneration.shouldGenerateLapisGeodes) {
            registrar.registerBiomeModification(BiomeLoadingPhase.ADDITIONS,
                    (BiomeLoadingContext context) -> context.is(TagRegistry.Biomes.HAS_LAPIS_GEODE) && !context.is(
                            TagRegistry.Biomes.BLACKLIST_BIOMES),
                    (BiomeModificationContext context) -> {
                        context.generationSettings()
                                .addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION,
                                        PlacedFeatureRegistry.LAPIS_GEODE);
                    });

            registrar.registerBiomeModification(BiomeLoadingPhase.ADDITIONS,
                    (BiomeLoadingContext context) -> context.is(TagRegistry.Biomes.HAS_LAPIS_GEODE) && !context.is(
                            TagRegistry.Biomes.BLACKLIST_BIOMES),
                    (BiomeModificationContext context) -> {
                        context.generationSettings()
                                .addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION,
                                        PlacedFeatureRegistry.DEEPSLATE_LAPIS_GEODE);
                    });

            registrar.registerBiomeModification(BiomeLoadingPhase.ADDITIONS,
                    (BiomeLoadingContext context) -> context.is(TagRegistry.Biomes.HAS_ECHO_GEODE) && !context.is(
                            TagRegistry.Biomes.BLACKLIST_BIOMES),
                    (BiomeModificationContext context) -> {
                        context.generationSettings()
                                .addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION,
                                        PlacedFeatureRegistry.SCULK_LAPIS_GEODE);
                    });
        }

        if (ServerConfig.WorldGeneration.shouldGenerateRedstoneGeodes) {
            registrar.registerBiomeModification(BiomeLoadingPhase.ADDITIONS,
                    (BiomeLoadingContext context) -> context.is(TagRegistry.Biomes.HAS_REDSTONE_GEODE) && !context.is(
                            TagRegistry.Biomes.BLACKLIST_BIOMES),
                    (BiomeModificationContext context) -> {
                        context.generationSettings()
                                .addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION,
                                        PlacedFeatureRegistry.REDSTONE_GEODE);
                    });

            registrar.registerBiomeModification(BiomeLoadingPhase.ADDITIONS,
                    (BiomeLoadingContext context) -> context.is(TagRegistry.Biomes.HAS_REDSTONE_GEODE) && !context.is(
                            TagRegistry.Biomes.BLACKLIST_BIOMES),
                    (BiomeModificationContext context) -> {
                        context.generationSettings()
                                .addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION,
                                        PlacedFeatureRegistry.DEEPSLATE_REDSTONE_GEODE);
                    });

            registrar.registerBiomeModification(BiomeLoadingPhase.ADDITIONS,
                    (BiomeLoadingContext context) -> context.is(TagRegistry.Biomes.HAS_ECHO_GEODE) && !context.is(
                            TagRegistry.Biomes.BLACKLIST_BIOMES),
                    (BiomeModificationContext context) -> {
                        context.generationSettings()
                                .addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION,
                                        PlacedFeatureRegistry.SCULK_REDSTONE_GEODE);
                    });
        }

        if (ServerConfig.WorldGeneration.shouldGenerateEchoGeodes) {
            registrar.registerBiomeModification(BiomeLoadingPhase.ADDITIONS,
                    (BiomeLoadingContext context) -> context.is(TagRegistry.Biomes.HAS_ECHO_GEODE) && !context.is(
                            TagRegistry.Biomes.BLACKLIST_BIOMES),
                    (BiomeModificationContext context) -> {
                        context.generationSettings()
                                .addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION,
                                        PlacedFeatureRegistry.ECHO_GEODE);
                    });
        }

        if (ServerConfig.WorldGeneration.shouldGenerateNetherDebrisGeodes) {
            registrar.registerBiomeModification(BiomeLoadingPhase.ADDITIONS,
                    (BiomeLoadingContext context) -> context.is(TagRegistry.Biomes.HAS_NETHER_ANCIENT_DEBRIS_GEODE)
                            && !context.is(TagRegistry.Biomes.BLACKLIST_BIOMES),
                    (BiomeModificationContext context) -> {
                        context.generationSettings()
                                .addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION,
                                        PlacedFeatureRegistry.ANCIENT_DEBRIS_GEODE);
                    });

            registrar.registerBiomeModification(BiomeLoadingPhase.ADDITIONS,
                    (BiomeLoadingContext context) -> context.is(TagRegistry.Biomes.HAS_BASALT_ANCIENT_DEBRIS_GEODE)
                            && !context.is(TagRegistry.Biomes.BLACKLIST_BIOMES),
                    (BiomeModificationContext context) -> {
                        context.generationSettings()
                                .addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION,
                                        PlacedFeatureRegistry.BASALT_ANCIENT_DEBRIS_GEODE);
                    });

            registrar.registerBiomeModification(BiomeLoadingPhase.ADDITIONS,
                    (BiomeLoadingContext context) -> context.is(TagRegistry.Biomes.HAS_BLACKSTONE_ANCIENT_DEBRIS_GEODE)
                            && !context.is(TagRegistry.Biomes.BLACKLIST_BIOMES),
                    (BiomeModificationContext context) -> {
                        context.generationSettings()
                                .addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION,
                                        PlacedFeatureRegistry.BLACKSTONE_ANCIENT_DEBRIS_GEODE);
                    });
        }

        if (ServerConfig.WorldGeneration.shouldGenerateNetherGlowstoneGeodes) {
            registrar.registerBiomeModification(BiomeLoadingPhase.ADDITIONS,
                    (BiomeLoadingContext context) -> context.is(TagRegistry.Biomes.HAS_NETHER_GLOWSTONE_GEODE)
                            && !context.is(TagRegistry.Biomes.BLACKLIST_BIOMES),
                    (BiomeModificationContext context) -> {
                        context.generationSettings()
                                .addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION,
                                        PlacedFeatureRegistry.GLOWSTONE_GEODE);
                    });

            registrar.registerBiomeModification(BiomeLoadingPhase.ADDITIONS,
                    (BiomeLoadingContext context) -> context.is(TagRegistry.Biomes.HAS_BASALT_GLOWSTONE_GEODE)
                            && !context.is(TagRegistry.Biomes.BLACKLIST_BIOMES),
                    (BiomeModificationContext context) -> {
                        context.generationSettings()
                                .addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION,
                                        PlacedFeatureRegistry.BASALT_GLOWSTONE_GEODE);
                    });

            registrar.registerBiomeModification(BiomeLoadingPhase.ADDITIONS,
                    (BiomeLoadingContext context) -> context.is(TagRegistry.Biomes.HAS_BLACKSTONE_GLOWSTONE_GEODE)
                            && !context.is(TagRegistry.Biomes.BLACKLIST_BIOMES),
                    (BiomeModificationContext context) -> {
                        context.generationSettings()
                                .addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION,
                                        PlacedFeatureRegistry.BLACKSTONE_GLOWSTONE_GEODE);
                    });
        }

        if (ServerConfig.WorldGeneration.shouldGenerateNetherGoldNuggetGeodes) {
            registrar.registerBiomeModification(BiomeLoadingPhase.ADDITIONS,
                    (BiomeLoadingContext context) -> context.is(TagRegistry.Biomes.HAS_NETHER_GOLD_NUGGET_GEODE)
                            && !context.is(TagRegistry.Biomes.BLACKLIST_BIOMES),
                    (BiomeModificationContext context) -> {
                        context.generationSettings()
                                .addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION,
                                        PlacedFeatureRegistry.GOLD_NUGGET_GEODE);
                    });

            registrar.registerBiomeModification(BiomeLoadingPhase.ADDITIONS,
                    (BiomeLoadingContext context) -> context.is(TagRegistry.Biomes.HAS_BASALT_GOLD_NUGGET_GEODE)
                            && !context.is(TagRegistry.Biomes.BLACKLIST_BIOMES),
                    (BiomeModificationContext context) -> {
                        context.generationSettings()
                                .addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION,
                                        PlacedFeatureRegistry.BASALT_GOLD_NUGGET_GEODE);
                    });

            registrar.registerBiomeModification(BiomeLoadingPhase.ADDITIONS,
                    (BiomeLoadingContext context) -> context.is(TagRegistry.Biomes.HAS_BLACKSTONE_GOLD_NUGGET_GEODE)
                            && !context.is(TagRegistry.Biomes.BLACKLIST_BIOMES),
                    (BiomeModificationContext context) -> {
                        context.generationSettings()
                                .addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION,
                                        PlacedFeatureRegistry.BLACKSTONE_GOLD_NUGGET_GEODE);
                    });
        }

        if (ServerConfig.WorldGeneration.shouldGenerateNetherQuartzGeodes) {
            registrar.registerBiomeModification(BiomeLoadingPhase.ADDITIONS,
                    (BiomeLoadingContext context) -> context.is(TagRegistry.Biomes.HAS_NETHER_QUARTZ_GEODE)
                            && !context.is(TagRegistry.Biomes.BLACKLIST_BIOMES),
                    (BiomeModificationContext context) -> {
                        context.generationSettings()
                                .addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION,
                                        PlacedFeatureRegistry.QUARTZ_GEODE);
                    });

            registrar.registerBiomeModification(BiomeLoadingPhase.ADDITIONS,
                    (BiomeLoadingContext context) -> context.is(TagRegistry.Biomes.HAS_BASALT_QUARTZ_GEODE)
                            && !context.is(TagRegistry.Biomes.BLACKLIST_BIOMES),
                    (BiomeModificationContext context) -> {
                        context.generationSettings()
                                .addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION,
                                        PlacedFeatureRegistry.BASALT_QUARTZ_GEODE);
                    });

            registrar.registerBiomeModification(BiomeLoadingPhase.ADDITIONS,
                    (BiomeLoadingContext context) -> context.is(TagRegistry.Biomes.HAS_BLACKSTONE_QUARTZ_GEODE)
                            && !context.is(TagRegistry.Biomes.BLACKLIST_BIOMES),
                    (BiomeModificationContext context) -> {
                        context.generationSettings()
                                .addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION,
                                        PlacedFeatureRegistry.BLACKSTONE_QUARTZ_GEODE);
                    });
        }

        if (ServerConfig.WorldGeneration.shouldGenerateWrappistGeodes) {
            registrar.registerBiomeModification(BiomeLoadingPhase.ADDITIONS,
                    (BiomeLoadingContext context) -> context.is(TagRegistry.Biomes.HAS_WRAPPIST_GEODE) && !context.is(
                            TagRegistry.Biomes.BLACKLIST_BIOMES),
                    (BiomeModificationContext context) -> {
                        context.generationSettings()
                                .addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION,
                                        PlacedFeatureRegistry.WRAPPIST_GEODE);
                    });
        }

        if (ServerConfig.WorldGeneration.shouldGeneratePrismarineCrystal) {
            registrar.registerBiomeModification(BiomeLoadingPhase.ADDITIONS,
                    (BiomeLoadingContext context) -> context.is(TagRegistry.Biomes.HAS_PRISMARINE_CRYSTAL),
                    (BiomeModificationContext context) -> {
                        context.generationSettings()
                                .addFeature(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
                                        PlacedFeatureRegistry.PRISMARINE_CRYSTAL_SPIKE);
                    });
        }

        if (ServerConfig.WorldGeneration.shouldGenerateEchoCrystal) {
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

        if (ServerConfig.WorldGeneration.shouldGenerateQuartzCrystal) {
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

        if (ServerConfig.WorldGeneration.shouldGenerateGlowstoneCrystal) {
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

        if (ServerConfig.WorldGeneration.shouldGenerateWrappistCrystal) {
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
