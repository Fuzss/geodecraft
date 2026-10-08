package fuzs.geodecraft.common.handler;

import fuzs.geodecraft.common.Geodecraft;
import fuzs.geodecraft.common.config.CommonConfig;
import fuzs.geodecraft.common.init.PlacedFeatureRegistry;
import fuzs.geodecraft.common.init.TagRegistry;
import fuzs.puzzleslib.common.api.biome.v2.BiomeLoadingPhase;
import fuzs.puzzleslib.common.api.biome.v2.BiomeTransformer;
import fuzs.puzzleslib.common.api.core.v1.context.BiomeTransformationsContext;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.GenerationStep;

public class BiomeModificationsHandler {

    public static void init(BiomeTransformationsContext registrar) {
        if (Geodecraft.CONFIG.get(CommonConfig.class).celestiteGeodes) {
            registrar.registerBiomeTransformation(BiomeLoadingPhase.ADD,
                    (HolderGetter.Provider registryAccess, Holder<Biome> biome) -> {
                        return biome.is(TagRegistry.Biomes.HAS_CELESTITE_GEODE);
                    },
                    (HolderGetter.Provider registryAccess, Holder<Biome> biome, BiomeTransformer.Context transformation) -> {
                        transformation.generation()
                                .addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION,
                                        registryAccess.getOrThrow(PlacedFeatureRegistry.CELESTITE_GEODE));
                    });
        }

        if (Geodecraft.CONFIG.get(CommonConfig.class).pinkTopazGeodes) {
            registrar.registerBiomeTransformation(BiomeLoadingPhase.ADD,
                    (HolderGetter.Provider registryAccess, Holder<Biome> biome) -> {
                        return biome.is(TagRegistry.Biomes.HAS_PINK_TOPAZ_GEODE);
                    },
                    (HolderGetter.Provider registryAccess, Holder<Biome> biome, BiomeTransformer.Context transformation) -> {
                        transformation.generation()
                                .addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION,
                                        registryAccess.getOrThrow(PlacedFeatureRegistry.PINK_TOPAZ_GEODE));
                    });
        }

        if (Geodecraft.CONFIG.get(CommonConfig.class).wrappistGeodes) {
            registrar.registerBiomeTransformation(BiomeLoadingPhase.ADD,
                    (HolderGetter.Provider registryAccess, Holder<Biome> biome) -> {
                        return biome.is(TagRegistry.Biomes.HAS_WRAPPIST_GEODE);
                    },
                    (HolderGetter.Provider registryAccess, Holder<Biome> biome, BiomeTransformer.Context transformation) -> {
                        transformation.generation()
                                .addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION,
                                        registryAccess.getOrThrow(PlacedFeatureRegistry.WRAPPIST_GEODE));
                    });
        }
        if (Geodecraft.CONFIG.get(CommonConfig.class).prismarineGeodes) {
            registrar.registerBiomeTransformation(BiomeLoadingPhase.ADD,
                    (HolderGetter.Provider registryAccess, Holder<Biome> biome) -> {
                        return biome.is(TagRegistry.Biomes.HAS_PRISMARINE_GEODE);
                    },
                    (HolderGetter.Provider registryAccess, Holder<Biome> biome, BiomeTransformer.Context transformation) -> {
                        transformation.generation()
                                .addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION,
                                        registryAccess.getOrThrow(PlacedFeatureRegistry.PRISMARINE_GEODE));
                    });
        }

        if (Geodecraft.CONFIG.get(CommonConfig.class).echoGeodes) {
            registrar.registerBiomeTransformation(BiomeLoadingPhase.ADD,
                    (HolderGetter.Provider registryAccess, Holder<Biome> biome) -> {
                        return biome.is(TagRegistry.Biomes.HAS_ECHO_GEODE);
                    },
                    (HolderGetter.Provider registryAccess, Holder<Biome> biome, BiomeTransformer.Context transformation) -> {
                        transformation.generation()
                                .addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION,
                                        registryAccess.getOrThrow(PlacedFeatureRegistry.ECHO_GEODE));
                    });
        }

        if (Geodecraft.CONFIG.get(CommonConfig.class).redstoneGeodes) {
            registrar.registerBiomeTransformation(BiomeLoadingPhase.ADD,
                    (HolderGetter.Provider registryAccess, Holder<Biome> biome) -> {
                        return biome.is(TagRegistry.Biomes.HAS_REDSTONE_GEODE);
                    },
                    (HolderGetter.Provider registryAccess, Holder<Biome> biome, BiomeTransformer.Context transformation) -> {
                        transformation.generation()
                                .addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION,
                                        registryAccess.getOrThrow(PlacedFeatureRegistry.REDSTONE_GEODE));
                        transformation.generation()
                                .addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION,
                                        registryAccess.getOrThrow(PlacedFeatureRegistry.DEEPSLATE_REDSTONE_GEODE));
                    });

            registrar.registerBiomeTransformation(BiomeLoadingPhase.ADD,
                    (HolderGetter.Provider registryAccess, Holder<Biome> biome) -> {
                        return biome.is(TagRegistry.Biomes.HAS_ECHO_GEODE);
                    },
                    (HolderGetter.Provider registryAccess, Holder<Biome> biome, BiomeTransformer.Context transformation) -> {
                        transformation.generation()
                                .addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION,
                                        registryAccess.getOrThrow(PlacedFeatureRegistry.SCULK_REDSTONE_GEODE));
                    });
        }

        if (Geodecraft.CONFIG.get(CommonConfig.class).emeraldGeodes) {
            registrar.registerBiomeTransformation(BiomeLoadingPhase.ADD,
                    (HolderGetter.Provider registryAccess, Holder<Biome> biome) -> {
                        return biome.is(TagRegistry.Biomes.HAS_EMERALD_GEODE);
                    },
                    (HolderGetter.Provider registryAccess, Holder<Biome> biome, BiomeTransformer.Context transformation) -> {
                        transformation.generation()
                                .addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION,
                                        registryAccess.getOrThrow(PlacedFeatureRegistry.EMERALD_GEODE));
                        transformation.generation()
                                .addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION,
                                        registryAccess.getOrThrow(PlacedFeatureRegistry.DEEPSLATE_EMERALD_GEODE));
                    });

            registrar.registerBiomeTransformation(BiomeLoadingPhase.ADD,
                    (HolderGetter.Provider registryAccess, Holder<Biome> biome) -> {
                        return biome.is(TagRegistry.Biomes.HAS_ECHO_GEODE);
                    },
                    (HolderGetter.Provider registryAccess, Holder<Biome> biome, BiomeTransformer.Context transformation) -> {
                        transformation.generation()
                                .addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION,
                                        registryAccess.getOrThrow(PlacedFeatureRegistry.SCULK_EMERALD_GEODE));
                    });
        }

        if (Geodecraft.CONFIG.get(CommonConfig.class).lapisGeodes) {
            registrar.registerBiomeTransformation(BiomeLoadingPhase.ADD,
                    (HolderGetter.Provider registryAccess, Holder<Biome> biome) -> {
                        return biome.is(TagRegistry.Biomes.HAS_LAPIS_LAZULI_GEODE);
                    },
                    (HolderGetter.Provider registryAccess, Holder<Biome> biome, BiomeTransformer.Context transformation) -> {
                        transformation.generation()
                                .addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION,
                                        registryAccess.getOrThrow(PlacedFeatureRegistry.LAPIS_GEODE));
                        transformation.generation()
                                .addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION,
                                        registryAccess.getOrThrow(PlacedFeatureRegistry.DEEPSLATE_LAPIS_GEODE));
                    });

            registrar.registerBiomeTransformation(BiomeLoadingPhase.ADD,
                    (HolderGetter.Provider registryAccess, Holder<Biome> biome) -> {
                        return biome.is(TagRegistry.Biomes.HAS_ECHO_GEODE);
                    },
                    (HolderGetter.Provider registryAccess, Holder<Biome> biome, BiomeTransformer.Context transformation) -> {
                        transformation.generation()
                                .addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION,
                                        registryAccess.getOrThrow(PlacedFeatureRegistry.SCULK_LAPIS_GEODE));
                    });
        }

        if (Geodecraft.CONFIG.get(CommonConfig.class).diamondGeodes) {
            registrar.registerBiomeTransformation(BiomeLoadingPhase.ADD,
                    (HolderGetter.Provider registryAccess, Holder<Biome> biome) -> {
                        return biome.is(TagRegistry.Biomes.HAS_DIAMOND_GEODE);
                    },
                    (HolderGetter.Provider registryAccess, Holder<Biome> biome, BiomeTransformer.Context transformation) -> {
                        transformation.generation()
                                .addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION,
                                        registryAccess.getOrThrow(PlacedFeatureRegistry.DIAMOND_GEODE));
                        transformation.generation()
                                .addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION,
                                        registryAccess.getOrThrow(PlacedFeatureRegistry.DEEPSLATE_DIAMOND_GEODE));
                    });

            registrar.registerBiomeTransformation(BiomeLoadingPhase.ADD,
                    (HolderGetter.Provider registryAccess, Holder<Biome> biome) -> {
                        return biome.is(TagRegistry.Biomes.HAS_ECHO_GEODE);
                    },
                    (HolderGetter.Provider registryAccess, Holder<Biome> biome, BiomeTransformer.Context transformation) -> {
                        transformation.generation()
                                .addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION,
                                        registryAccess.getOrThrow(PlacedFeatureRegistry.SCULK_DIAMOND_GEODE));
                    });
        }

        if (Geodecraft.CONFIG.get(CommonConfig.class).glowstoneGeodes) {
            registrar.registerBiomeTransformation(BiomeLoadingPhase.ADD,
                    (HolderGetter.Provider registryAccess, Holder<Biome> biome) -> {
                        return biome.is(TagRegistry.Biomes.HAS_NETHER_GLOWSTONE_GEODE);
                    },
                    (HolderGetter.Provider registryAccess, Holder<Biome> biome, BiomeTransformer.Context transformation) -> {
                        transformation.generation()
                                .addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION,
                                        registryAccess.getOrThrow(PlacedFeatureRegistry.GLOWSTONE_GEODE));
                    });

            registrar.registerBiomeTransformation(BiomeLoadingPhase.ADD,
                    (HolderGetter.Provider registryAccess, Holder<Biome> biome) -> {
                        return biome.is(TagRegistry.Biomes.HAS_BASALT_GLOWSTONE_GEODE);
                    },
                    (HolderGetter.Provider registryAccess, Holder<Biome> biome, BiomeTransformer.Context transformation) -> {
                        transformation.generation()
                                .addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION,
                                        registryAccess.getOrThrow(PlacedFeatureRegistry.BASALT_GLOWSTONE_GEODE));
                    });

            registrar.registerBiomeTransformation(BiomeLoadingPhase.ADD,
                    (HolderGetter.Provider registryAccess, Holder<Biome> biome) -> {
                        return biome.is(TagRegistry.Biomes.HAS_BLACKSTONE_GLOWSTONE_GEODE);
                    },
                    (HolderGetter.Provider registryAccess, Holder<Biome> biome, BiomeTransformer.Context transformation) -> {
                        transformation.generation()
                                .addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION,
                                        registryAccess.getOrThrow(PlacedFeatureRegistry.BLACKSTONE_GLOWSTONE_GEODE));
                    });
        }

        if (Geodecraft.CONFIG.get(CommonConfig.class).netherGoldGeodes) {
            registrar.registerBiomeTransformation(BiomeLoadingPhase.ADD,
                    (HolderGetter.Provider registryAccess, Holder<Biome> biome) -> {
                        return biome.is(TagRegistry.Biomes.HAS_NETHER_GOLD_NUGGET_GEODE);
                    },
                    (HolderGetter.Provider registryAccess, Holder<Biome> biome, BiomeTransformer.Context transformation) -> {
                        transformation.generation()
                                .addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION,
                                        registryAccess.getOrThrow(PlacedFeatureRegistry.GOLD_NUGGET_GEODE));
                    });

            registrar.registerBiomeTransformation(BiomeLoadingPhase.ADD,
                    (HolderGetter.Provider registryAccess, Holder<Biome> biome) -> {
                        return biome.is(TagRegistry.Biomes.HAS_BASALT_GOLD_NUGGET_GEODE);
                    },
                    (HolderGetter.Provider registryAccess, Holder<Biome> biome, BiomeTransformer.Context transformation) -> {
                        transformation.generation()
                                .addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION,
                                        registryAccess.getOrThrow(PlacedFeatureRegistry.BASALT_GOLD_NUGGET_GEODE));
                    });

            registrar.registerBiomeTransformation(BiomeLoadingPhase.ADD,
                    (HolderGetter.Provider registryAccess, Holder<Biome> biome) -> {
                        return biome.is(TagRegistry.Biomes.HAS_BLACKSTONE_GOLD_NUGGET_GEODE);
                    },
                    (HolderGetter.Provider registryAccess, Holder<Biome> biome, BiomeTransformer.Context transformation) -> {
                        transformation.generation()
                                .addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION,
                                        registryAccess.getOrThrow(PlacedFeatureRegistry.BLACKSTONE_GOLD_NUGGET_GEODE));
                    });
        }

        if (Geodecraft.CONFIG.get(CommonConfig.class).netherQuartzGeodes) {
            registrar.registerBiomeTransformation(BiomeLoadingPhase.ADD,
                    (HolderGetter.Provider registryAccess, Holder<Biome> biome) -> {
                        return biome.is(TagRegistry.Biomes.HAS_NETHER_QUARTZ_GEODE);
                    },
                    (HolderGetter.Provider registryAccess, Holder<Biome> biome, BiomeTransformer.Context transformation) -> {
                        transformation.generation()
                                .addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION,
                                        registryAccess.getOrThrow(PlacedFeatureRegistry.QUARTZ_GEODE));
                    });

            registrar.registerBiomeTransformation(BiomeLoadingPhase.ADD,
                    (HolderGetter.Provider registryAccess, Holder<Biome> biome) -> {
                        return biome.is(TagRegistry.Biomes.HAS_BASALT_QUARTZ_GEODE);
                    },
                    (HolderGetter.Provider registryAccess, Holder<Biome> biome, BiomeTransformer.Context transformation) -> {
                        transformation.generation()
                                .addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION,
                                        registryAccess.getOrThrow(PlacedFeatureRegistry.BASALT_QUARTZ_GEODE));
                    });

            registrar.registerBiomeTransformation(BiomeLoadingPhase.ADD,
                    (HolderGetter.Provider registryAccess, Holder<Biome> biome) -> {
                        return biome.is(TagRegistry.Biomes.HAS_BLACKSTONE_QUARTZ_GEODE);
                    },
                    (HolderGetter.Provider registryAccess, Holder<Biome> biome, BiomeTransformer.Context transformation) -> {
                        transformation.generation()
                                .addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION,
                                        registryAccess.getOrThrow(PlacedFeatureRegistry.BLACKSTONE_QUARTZ_GEODE));
                    });
        }

        if (Geodecraft.CONFIG.get(CommonConfig.class).ancientDebrisGeodes) {
            registrar.registerBiomeTransformation(BiomeLoadingPhase.ADD,
                    (HolderGetter.Provider registryAccess, Holder<Biome> biome) -> {
                        return biome.is(TagRegistry.Biomes.HAS_NETHER_ANCIENT_DEBRIS_GEODE);
                    },
                    (HolderGetter.Provider registryAccess, Holder<Biome> biome, BiomeTransformer.Context transformation) -> {
                        transformation.generation()
                                .addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION,
                                        registryAccess.getOrThrow(PlacedFeatureRegistry.ANCIENT_DEBRIS_GEODE));
                    });

            registrar.registerBiomeTransformation(BiomeLoadingPhase.ADD,
                    (HolderGetter.Provider registryAccess, Holder<Biome> biome) -> {
                        return biome.is(TagRegistry.Biomes.HAS_BASALT_ANCIENT_DEBRIS_GEODE);
                    },
                    (HolderGetter.Provider registryAccess, Holder<Biome> biome, BiomeTransformer.Context transformation) -> {
                        transformation.generation()
                                .addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION,
                                        registryAccess.getOrThrow(PlacedFeatureRegistry.BASALT_ANCIENT_DEBRIS_GEODE));
                    });

            registrar.registerBiomeTransformation(BiomeLoadingPhase.ADD,
                    (HolderGetter.Provider registryAccess, Holder<Biome> biome) -> {
                        return biome.is(TagRegistry.Biomes.HAS_BLACKSTONE_ANCIENT_DEBRIS_GEODE);
                    },
                    (HolderGetter.Provider registryAccess, Holder<Biome> biome, BiomeTransformer.Context transformation) -> {
                        transformation.generation()
                                .addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION,
                                        registryAccess.getOrThrow(PlacedFeatureRegistry.BLACKSTONE_ANCIENT_DEBRIS_GEODE));
                    });
        }

        if (Geodecraft.CONFIG.get(CommonConfig.class).prismarineCrystals) {
            registrar.registerBiomeTransformation(BiomeLoadingPhase.ADD,
                    (HolderGetter.Provider registryAccess, Holder<Biome> biome) -> {
                        return biome.is(TagRegistry.Biomes.HAS_PRISMARINE_CRYSTAL);
                    },
                    (HolderGetter.Provider registryAccess, Holder<Biome> biome, BiomeTransformer.Context transformation) -> {
                        transformation.generation()
                                .addFeature(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
                                        registryAccess.getOrThrow(PlacedFeatureRegistry.PRISMARINE_CRYSTAL_SPIKE));
                    });
        }

        if (Geodecraft.CONFIG.get(CommonConfig.class).echoCrystals) {
            registrar.registerBiomeTransformation(BiomeLoadingPhase.ADD,
                    (HolderGetter.Provider registryAccess, Holder<Biome> biome) -> {
                        return biome.is(TagRegistry.Biomes.HAS_ECHO_CRYSTAL);
                    },
                    (HolderGetter.Provider registryAccess, Holder<Biome> biome, BiomeTransformer.Context transformation) -> {
                        transformation.generation()
                                .addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION,
                                        registryAccess.getOrThrow(PlacedFeatureRegistry.ECHO_CRYSTAL_SPIKE));
                        transformation.generation()
                                .addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION,
                                        registryAccess.getOrThrow(PlacedFeatureRegistry.ECHO_CRYSTAL_SPIKE_FLOOR));
                    });
        }

        if (Geodecraft.CONFIG.get(CommonConfig.class).glowstoneCrystals) {
            registrar.registerBiomeTransformation(BiomeLoadingPhase.ADD,
                    (HolderGetter.Provider registryAccess, Holder<Biome> biome) -> {
                        return biome.is(TagRegistry.Biomes.HAS_GLOWSTONE_CRYSTAL);
                    },
                    (HolderGetter.Provider registryAccess, Holder<Biome> biome, BiomeTransformer.Context transformation) -> {
                        transformation.generation()
                                .addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION,
                                        registryAccess.getOrThrow(PlacedFeatureRegistry.GLOWSTONE_CRYSTAL_SPIKE));
                        transformation.generation()
                                .addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION,
                                        registryAccess.getOrThrow(PlacedFeatureRegistry.GLOWSTONE_CRYSTAL_SPIKE_FLOOR));
                    });
        }

        if (Geodecraft.CONFIG.get(CommonConfig.class).netherQuartzCrystals) {
            registrar.registerBiomeTransformation(BiomeLoadingPhase.ADD,
                    (HolderGetter.Provider registryAccess, Holder<Biome> biome) -> {
                        return biome.is(TagRegistry.Biomes.HAS_QUARTZ_CRYSTAL);
                    },
                    (HolderGetter.Provider registryAccess, Holder<Biome> biome, BiomeTransformer.Context transformation) -> {
                        transformation.generation()
                                .addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION,
                                        registryAccess.getOrThrow(PlacedFeatureRegistry.QUARTZ_CRYSTAL_SPIKE));
                        transformation.generation()
                                .addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION,
                                        registryAccess.getOrThrow(PlacedFeatureRegistry.QUARTZ_CRYSTAL_SPIKE_FLOOR));
                    });
        }

        if (Geodecraft.CONFIG.get(CommonConfig.class).wrappistCrystals) {
            registrar.registerBiomeTransformation(BiomeLoadingPhase.ADD,
                    (HolderGetter.Provider registryAccess, Holder<Biome> biome) -> {
                        return biome.is(TagRegistry.Biomes.HAS_WRAPPIST_CRYSTAL);
                    },
                    (HolderGetter.Provider registryAccess, Holder<Biome> biome, BiomeTransformer.Context transformation) -> {
                        transformation.generation()
                                .addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION,
                                        registryAccess.getOrThrow(PlacedFeatureRegistry.WRAPPIST_CRYSTAL_SPIKE));
                        transformation.generation()
                                .addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION,
                                        registryAccess.getOrThrow(PlacedFeatureRegistry.WRAPPIST_CRYSTAL_SPIKE_FLOOR));
                    });
        }
    }
}
