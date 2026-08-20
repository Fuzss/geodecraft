package net.yeoxuhang.geode_plus.server.registry;

import fuzs.puzzleslib.api.init.v3.registry.RegistryManager;
import net.minecraft.core.Holder;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.yeoxuhang.geode_plus.GeodePlus;

public class ModRegistry {
    static final RegistryManager REGISTRY = RegistryManager.from(GeodePlus.MOD_ID);
    public static final Holder.Reference<CreativeModeTab> CREATIVE_MODE_TAB = REGISTRY.registerCreativeModeTab(() -> new ItemStack(
                    ItemRegistry.WRAPPIST_SHARD),
            (CreativeModeTab.ItemDisplayParameters parameters, CreativeModeTab.Output output) -> {
                output.accept(ItemRegistry.WRAP_ARMOR_TRIM_SMITHING_TEMPLATE.value());
                output.accept(ItemRegistry.CELESTE_ARMOR_TRIM_SMITHING_TEMPLATE.value());
                output.accept(ItemRegistry.HEART_ARMOR_TRIM_SMITHING_TEMPLATE.value());
                output.accept(ItemRegistry.WRAPPIST_SHARD.value());
                output.accept(ItemRegistry.CELESTITE_SHARD.value());
                output.accept(ItemRegistry.PINK_TOPAZ.value());

                output.accept(ItemRegistry.WRAPPIST_GLASS.value());
                output.accept(ItemRegistry.CELESTITE_GLASS.value());
                output.accept(ItemRegistry.PINK_TOPAZ_GLASS.value());

                output.accept(ItemRegistry.WRAPPIST_PEDESTAL.value());

                output.accept(ItemRegistry.WRAPPIST_BLOCK.value());
                output.accept(ItemRegistry.BUDDING_WRAPPIST.value());
                output.accept(ItemRegistry.WRAPPIST_CLUSTER.value());
                output.accept(ItemRegistry.LARGE_WRAPPIST_BUD.value());
                output.accept(ItemRegistry.MEDIUM_WRAPPIST_BUD.value());
                output.accept(ItemRegistry.SMALL_WRAPPIST_BUD.value());

                output.accept(ItemRegistry.CELESTITE_BLOCK.value());
                output.accept(ItemRegistry.BUDDING_CELESTITE.value());
                output.accept(ItemRegistry.CELESTITE_CLUSTER.value());
                output.accept(ItemRegistry.LARGE_CELESTITE_BUD.value());
                output.accept(ItemRegistry.MEDIUM_CELESTITE_BUD.value());
                output.accept(ItemRegistry.SMALL_CELESTITE_BUD.value());

                output.accept(ItemRegistry.PINK_TOPAZ_BLOCK.value());
                output.accept(ItemRegistry.BUDDING_PINK_TOPAZ.value());
                output.accept(ItemRegistry.PINK_TOPAZ_CRYSTAL.value());
                output.accept(ItemRegistry.LARGE_PINK_TOPAZ_BUD.value());
                output.accept(ItemRegistry.MEDIUM_PINK_TOPAZ_BUD.value());
                output.accept(ItemRegistry.SMALL_PINK_TOPAZ_BUD.value());

                output.accept(ItemRegistry.PRISMARINE_CLUSTER_BLOCK.value());
                output.accept(ItemRegistry.BUDDING_PRISMARINE.value());
                output.accept(ItemRegistry.PRISMARINE_CLUSTER.value());
                output.accept(ItemRegistry.LARGE_PRISMARINE_BUD.value());
                output.accept(ItemRegistry.MEDIUM_PRISMARINE_BUD.value());
                output.accept(ItemRegistry.SMALL_PRISMARINE_BUD.value());

                output.accept(ItemRegistry.LAPIS_CLUSTER_BLOCK.value());
                output.accept(ItemRegistry.BUDDING_LAPIS.value());
                output.accept(ItemRegistry.BUDDING_DEEPSLATE_LAPIS.value());
                output.accept(ItemRegistry.BUDDING_SCULK_LAPIS.value());
                output.accept(ItemRegistry.LAPIS_CLUSTER.value());
                output.accept(ItemRegistry.LARGE_LAPIS_BUD.value());
                output.accept(ItemRegistry.MEDIUM_LAPIS_BUD.value());
                output.accept(ItemRegistry.SMALL_LAPIS_BUD.value());

                output.accept(ItemRegistry.REDSTONE_CRYSTAL_BLOCK.value());
                output.accept(ItemRegistry.BUDDING_REDSTONE.value());
                output.accept(ItemRegistry.BUDDING_DEEPSLATE_REDSTONE.value());
                output.accept(ItemRegistry.BUDDING_SCULK_REDSTONE.value());
                output.accept(ItemRegistry.REDSTONE_CRYSTAL.value());
                output.accept(ItemRegistry.LARGE_REDSTONE_BUD.value());
                output.accept(ItemRegistry.MEDIUM_REDSTONE_BUD.value());
                output.accept(ItemRegistry.SMALL_REDSTONE_BUD.value());

                output.accept(ItemRegistry.EMERALD_CLUSTER_BLOCK.value());
                output.accept(ItemRegistry.BUDDING_EMERALD.value());
                output.accept(ItemRegistry.BUDDING_DEEPSLATE_EMERALD.value());
                output.accept(ItemRegistry.BUDDING_SCULK_EMERALD.value());
                output.accept(ItemRegistry.EMERALD_CLUSTER.value());
                output.accept(ItemRegistry.LARGE_EMERALD_BUD.value());
                output.accept(ItemRegistry.MEDIUM_EMERALD_BUD.value());
                output.accept(ItemRegistry.SMALL_EMERALD_BUD.value());

                output.accept(ItemRegistry.DIAMOND_CRYSTAL_BLOCK.value());
                output.accept(ItemRegistry.BUDDING_DIAMOND.value());
                output.accept(ItemRegistry.BUDDING_DEEPSLATE_DIAMOND.value());
                output.accept(ItemRegistry.BUDDING_SCULK_DIAMOND.value());
                output.accept(ItemRegistry.DIAMOND_CRYSTAL.value());
                output.accept(ItemRegistry.LARGE_DIAMOND_BUD.value());
                output.accept(ItemRegistry.MEDIUM_DIAMOND_BUD.value());
                output.accept(ItemRegistry.SMALL_DIAMOND_BUD.value());

                output.accept(ItemRegistry.QUARTZ_CRYSTAL_BLOCK.value());
                output.accept(ItemRegistry.BUDDING_NETHER_QUARTZ.value());
                output.accept(ItemRegistry.BUDDING_BASALT_QUARTZ.value());
                output.accept(ItemRegistry.BUDDING_BLACKSTONE_QUARTZ.value());
                output.accept(ItemRegistry.QUARTZ_CRYSTAL.value());
                output.accept(ItemRegistry.LARGE_QUARTZ_BUD.value());
                output.accept(ItemRegistry.MEDIUM_QUARTZ_BUD.value());
                output.accept(ItemRegistry.SMALL_QUARTZ_BUD.value());

                output.accept(ItemRegistry.GOLD_NUGGET_CLUSTER_BLOCK.value());
                output.accept(ItemRegistry.BUDDING_GOLD_NUGGET.value());
                output.accept(ItemRegistry.BUDDING_BASALT_GOLD_NUGGET.value());
                output.accept(ItemRegistry.BUDDING_BLACKSTONE_GOLD_NUGGET.value());
                output.accept(ItemRegistry.GOLD_NUGGET_CLUSTER.value());
                output.accept(ItemRegistry.LARGE_GOLD_NUGGET_BUD.value());
                output.accept(ItemRegistry.MEDIUM_GOLD_NUGGET_BUD.value());
                output.accept(ItemRegistry.SMALL_GOLD_NUGGET_BUD.value());

                output.accept(ItemRegistry.GLOWSTONE_CLUSTER_BLOCK.value());
                output.accept(ItemRegistry.BUDDING_GLOWSTONE.value());
                output.accept(ItemRegistry.BUDDING_BASALT_GLOWSTONE.value());
                output.accept(ItemRegistry.BUDDING_BLACKSTONE_GLOWSTONE.value());
                output.accept(ItemRegistry.GLOWSTONE_CLUSTER.value());
                output.accept(ItemRegistry.LARGE_GLOWSTONE_BUD.value());
                output.accept(ItemRegistry.MEDIUM_GLOWSTONE_BUD.value());
                output.accept(ItemRegistry.SMALL_GLOWSTONE_BUD.value());

                output.accept(ItemRegistry.ANCIENT_DEBRIS_CLUSTER_BLOCK.value());
                output.accept(ItemRegistry.BUDDING_ANCIENT_DEBRIS.value());
                output.accept(ItemRegistry.BUDDING_BASALT_ANCIENT_DEBRIS.value());
                output.accept(ItemRegistry.BUDDING_BLACKSTONE_ANCIENT_DEBRIS.value());
                output.accept(ItemRegistry.ANCIENT_DEBRIS_CLUSTER.value());
                output.accept(ItemRegistry.LARGE_ANCIENT_DEBRIS_BUD.value());
                output.accept(ItemRegistry.MEDIUM_ANCIENT_DEBRIS_BUD.value());
                output.accept(ItemRegistry.SMALL_ANCIENT_DEBRIS_BUD.value());

                output.accept(ItemRegistry.SMOOTH_END_STONE.value());
                output.accept(ItemRegistry.SMOOTH_END_STONE_STAIRS.value());
                output.accept(ItemRegistry.SMOOTH_END_STONE_SLAB.value());
                output.accept(ItemRegistry.SMOOTH_END_STONE_WALL.value());

                output.accept(ItemRegistry.GALCITE.value());
                output.accept(ItemRegistry.GALCITE_STAIRS.value());
                output.accept(ItemRegistry.GALCITE_SLAB.value());
                output.accept(ItemRegistry.GALCITE_WALL.value());

                output.accept(ItemRegistry.ECHO_CRYSTAL_BLOCK.value());
                output.accept(ItemRegistry.BUDDING_ECHO.value());
                output.accept(ItemRegistry.ECHO_CRYSTAL.value());
                output.accept(ItemRegistry.LARGE_ECHO_BUD.value());
                output.accept(ItemRegistry.MEDIUM_ECHO_BUD.value());
                output.accept(ItemRegistry.SMALL_ECHO_BUD.value());
            });

    public static void bootstrap() {
        ItemRegistry.bootstrap();
        TrimMaterialsAndPatternsRegistry.bootstrap();
        BlockRegistry.bootstrap();
        BlockEntityRegistry.bootstrap();
        FeatureRegistry.bootstrap();
        PlacedFeatureRegistry.bootstrap();
        ConfiguredFeatureRegistry.bootstrap();
    }
}
