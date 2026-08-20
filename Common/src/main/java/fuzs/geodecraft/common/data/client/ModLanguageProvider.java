package fuzs.geodecraft.common.data.client;

import fuzs.geodecraft.common.Geodecraft;
import fuzs.puzzleslib.api.client.data.v2.AbstractLanguageProvider;
import fuzs.puzzleslib.api.data.v2.core.DataProviderContext;
import fuzs.geodecraft.common.init.BlockRegistry;
import fuzs.geodecraft.common.init.ItemRegistry;
import fuzs.geodecraft.common.init.ModRegistry;

public class ModLanguageProvider extends AbstractLanguageProvider {

    public ModLanguageProvider(DataProviderContext context) {
        super(context);
    }

    @Override
    public void addTranslations(TranslationBuilder builder) {
        builder.addCreativeModeTab(ModRegistry.CREATIVE_MODE_TAB, Geodecraft.MOD_NAME);

        builder.add(BlockRegistry.BUDDING_PINK_TOPAZ.value(), "Budding Pink Topaz");
        builder.add(BlockRegistry.PINK_TOPAZ_BLOCK.value(), "Pink Topaz Block");
        builder.add(BlockRegistry.PINK_TOPAZ_CRYSTAL.value(), "Pink Topaz Crystal");
        builder.add(BlockRegistry.LARGE_PINK_TOPAZ_BUD.value(), "Large Pink Topaz Bud");
        builder.add(BlockRegistry.MEDIUM_PINK_TOPAZ_BUD.value(), "Medium Pink Topaz Bud");
        builder.add(BlockRegistry.SMALL_PINK_TOPAZ_BUD.value(), "Small Pink Topaz Bud");

        builder.add(BlockRegistry.BUDDING_CELESTITE.value(), "Budding Celestite");
        builder.add(BlockRegistry.CELESTITE_BLOCK.value(), "Celestite Block");
        builder.add(BlockRegistry.CELESTITE_CLUSTER.value(), "Celestite Cluster");
        builder.add(BlockRegistry.LARGE_CELESTITE_BUD.value(), "Large Celestite Bud");
        builder.add(BlockRegistry.MEDIUM_CELESTITE_BUD.value(), "Medium Celestite Bud");
        builder.add(BlockRegistry.SMALL_CELESTITE_BUD.value(), "Small Celestite Bud");

        builder.add(BlockRegistry.BUDDING_PRISMARINE.value(), "Budding Prismarine");
        builder.add(BlockRegistry.PRISMARINE_CLUSTER_BLOCK.value(), "Prismarine Cluster Block");
        builder.add(BlockRegistry.PRISMARINE_CLUSTER.value(), "Prismarine Cluster");
        builder.add(BlockRegistry.LARGE_PRISMARINE_BUD.value(), "Large Prismarine Bud");
        builder.add(BlockRegistry.MEDIUM_PRISMARINE_BUD.value(), "Medium Prismarine Bud");
        builder.add(BlockRegistry.SMALL_PRISMARINE_BUD.value(), "Small Prismarine Bud");

        builder.add(BlockRegistry.BUDDING_LAPIS.value(), "Budding Lapis");
        builder.add(BlockRegistry.BUDDING_DEEPSLATE_LAPIS.value(), "Budding Deepslate Lapis");
        builder.add(BlockRegistry.BUDDING_SCULK_LAPIS.value(), "Budding Sculk Lapis");
        builder.add(BlockRegistry.LAPIS_CLUSTER_BLOCK.value(), "Lapis Cluster Block");
        builder.add(BlockRegistry.LAPIS_CLUSTER.value(), "Lapis Cluster");
        builder.add(BlockRegistry.LARGE_LAPIS_BUD.value(), "Large Lapis Bud");
        builder.add(BlockRegistry.MEDIUM_LAPIS_BUD.value(), "Medium Lapis Bud");
        builder.add(BlockRegistry.SMALL_LAPIS_BUD.value(), "Small Lapis Bud");

        builder.add(BlockRegistry.BUDDING_REDSTONE.value(), "Budding Redstone");
        builder.add(BlockRegistry.BUDDING_DEEPSLATE_REDSTONE.value(), "Budding Deepslate Redstone");
        builder.add(BlockRegistry.BUDDING_SCULK_REDSTONE.value(), "Budding Sculk Redstone");
        builder.add(BlockRegistry.REDSTONE_CRYSTAL_BLOCK.value(), "Redstone Crystal Block");
        builder.add(BlockRegistry.REDSTONE_CRYSTAL.value(), "Redstone Crystal");
        builder.add(BlockRegistry.LARGE_REDSTONE_BUD.value(), "Large Redstone Bud");
        builder.add(BlockRegistry.MEDIUM_REDSTONE_BUD.value(), "Medium Redstone Bud");
        builder.add(BlockRegistry.SMALL_REDSTONE_BUD.value(), "Small Redstone Bud");

        builder.add(BlockRegistry.BUDDING_EMERALD.value(), "Budding Emerald");
        builder.add(BlockRegistry.BUDDING_DEEPSLATE_EMERALD.value(), "Budding Deepslate Emerald");
        builder.add(BlockRegistry.BUDDING_SCULK_EMERALD.value(), "Budding Sculk Emerald");
        builder.add(BlockRegistry.EMERALD_CLUSTER_BLOCK.value(), "Emerald Cluster Block");
        builder.add(BlockRegistry.EMERALD_CLUSTER.value(), "Emerald Cluster");
        builder.add(BlockRegistry.LARGE_EMERALD_BUD.value(), "Large Emerald Bud");
        builder.add(BlockRegistry.MEDIUM_EMERALD_BUD.value(), "Medium Emerald Bud");
        builder.add(BlockRegistry.SMALL_EMERALD_BUD.value(), "Small Emerald Bud");

        builder.add(BlockRegistry.BUDDING_DIAMOND.value(), "Budding Diamond");
        builder.add(BlockRegistry.BUDDING_DEEPSLATE_DIAMOND.value(), "Budding Deepslate Diamond");
        builder.add(BlockRegistry.BUDDING_SCULK_DIAMOND.value(), "Budding Sculk Diamond");
        builder.add(BlockRegistry.DIAMOND_CRYSTAL_BLOCK.value(), "Diamond Crystal Block");
        builder.add(BlockRegistry.DIAMOND_CRYSTAL.value(), "Diamond Crystal");
        builder.add(BlockRegistry.LARGE_DIAMOND_BUD.value(), "Large Diamond Bud");
        builder.add(BlockRegistry.MEDIUM_DIAMOND_BUD.value(), "Medium Diamond Bud");
        builder.add(BlockRegistry.SMALL_DIAMOND_BUD.value(), "Small Diamond Bud");

        builder.add(BlockRegistry.BUDDING_NETHER_QUARTZ.value(), "Budding Nether Quartz");
        builder.add(BlockRegistry.BUDDING_BASALT_NETHER_QUARTZ.value(), "Budding Basalt Nether Quartz");
        builder.add(BlockRegistry.BUDDING_BLACKSTONE_NETHER_QUARTZ.value(), "Budding Blackstone Nether Quartz");
        builder.add(BlockRegistry.NETHER_QUARTZ_CRYSTAL_BLOCK.value(), "Nether Quartz Crystal Block");
        builder.add(BlockRegistry.NETHER_QUARTZ_CRYSTAL.value(), "Nether Quartz Crystal");
        builder.add(BlockRegistry.LARGE_NETHER_QUARTZ_BUD.value(), "Large Nether Quartz Bud");
        builder.add(BlockRegistry.MEDIUM_NETHER_QUARTZ_BUD.value(), "Medium Nether Quartz Bud");
        builder.add(BlockRegistry.SMALL_NETHER_QUARTZ_BUD.value(), "Small Nether Quartz Bud");

        builder.add(BlockRegistry.BUDDING_GOLD_NUGGET.value(), "Budding Gold Nugget");
        builder.add(BlockRegistry.BUDDING_BASALT_GOLD_NUGGET.value(), "Budding Basalt Gold Nugget");
        builder.add(BlockRegistry.BUDDING_BLACKSTONE_GOLD_NUGGET.value(), "Budding Blackstone Gold Nugget");
        builder.add(BlockRegistry.GOLD_NUGGET_CLUSTER_BLOCK.value(), "Gold Nugget Cluster Block");
        builder.add(BlockRegistry.GOLD_NUGGET_CLUSTER.value(), "Gold Nugget Cluster");
        builder.add(BlockRegistry.LARGE_GOLD_NUGGET_BUD.value(), "Large Gold Nugget Bud");
        builder.add(BlockRegistry.MEDIUM_GOLD_NUGGET_BUD.value(), "Medium Gold Nugget Bud");
        builder.add(BlockRegistry.SMALL_GOLD_NUGGET_BUD.value(), "Small Gold Nugget Bud");

        builder.add(BlockRegistry.BUDDING_GLOWSTONE.value(), "Budding Glowstone");
        builder.add(BlockRegistry.BUDDING_BASALT_GLOWSTONE.value(), "Budding Basalt Glowstone");
        builder.add(BlockRegistry.BUDDING_BLACKSTONE_GLOWSTONE.value(), "Budding Blackstone Glowstone");
        builder.add(BlockRegistry.GLOWSTONE_CLUSTER_BLOCK.value(), "Glowstone Cluster Block");
        builder.add(BlockRegistry.GLOWSTONE_CLUSTER.value(), "Glowstone Cluster");
        builder.add(BlockRegistry.LARGE_GLOWSTONE_BUD.value(), "Large Glowstone Bud");
        builder.add(BlockRegistry.MEDIUM_GLOWSTONE_BUD.value(), "Medium Glowstone Bud");
        builder.add(BlockRegistry.SMALL_GLOWSTONE_BUD.value(), "Small Glowstone Bud");

        builder.add(BlockRegistry.BUDDING_ANCIENT_DEBRIS.value(), "Budding Ancient Debris");
        builder.add(BlockRegistry.BUDDING_BASALT_ANCIENT_DEBRIS.value(), "Budding Basalt Ancient Debris");
        builder.add(BlockRegistry.BUDDING_BLACKSTONE_ANCIENT_DEBRIS.value(), "Budding Blackstone Ancient Debris");
        builder.add(BlockRegistry.ANCIENT_DEBRIS_CLUSTER_BLOCK.value(), "Ancient Debris Cluster Block");
        builder.add(BlockRegistry.ANCIENT_DEBRIS_CLUSTER.value(), "Ancient Debris Cluster");
        builder.add(BlockRegistry.LARGE_ANCIENT_DEBRIS_BUD.value(), "Large Ancient Debris Bud");
        builder.add(BlockRegistry.MEDIUM_ANCIENT_DEBRIS_BUD.value(), "Medium Ancient Debris Bud");
        builder.add(BlockRegistry.SMALL_ANCIENT_DEBRIS_BUD.value(), "Small Ancient Debris Bud");

        builder.add(BlockRegistry.SMOOTH_END_STONE.value(), "Smooth End Stone");
        builder.add(BlockRegistry.SMOOTH_END_STONE_STAIRS.value(), "Smooth End Stone Stairs");
        builder.add(BlockRegistry.SMOOTH_END_STONE_SLAB.value(), "Smooth End Stone Slab");
        builder.add(BlockRegistry.SMOOTH_END_STONE_WALL.value(), "Smooth End Stone Wall");

        builder.add(BlockRegistry.GALCITE.value(), "Galcite");
        builder.add(BlockRegistry.GALCITE_STAIRS.value(), "Galcite Stairs");
        builder.add(BlockRegistry.GALCITE_SLAB.value(), "Galcite Slab");
        builder.add(BlockRegistry.GALCITE_WALL.value(), "Galcite Wall");

        builder.add(BlockRegistry.WRAPPIST_BLOCK.value(), "Wrappist Block");
        builder.add(BlockRegistry.BUDDING_WRAPPIST.value(), "Budding Wrappist");
        builder.add(BlockRegistry.WRAPPIST_CLUSTER.value(), "Wrappist Cluster");
        builder.add(BlockRegistry.LARGE_WRAPPIST_BUD.value(), "Large Wrappist Bud");
        builder.add(BlockRegistry.MEDIUM_WRAPPIST_BUD.value(), "Medium Wrappist Bud");
        builder.add(BlockRegistry.SMALL_WRAPPIST_BUD.value(), "Small Wrappist Bud");

        builder.add(BlockRegistry.ECHO_CRYSTAL_BLOCK.value(), "Echo Crystal Block");
        builder.add(BlockRegistry.BUDDING_ECHO.value(), "Budding Echo");
        builder.add(BlockRegistry.ECHO_CRYSTAL.value(), "Echo Crystal");
        builder.add(BlockRegistry.LARGE_ECHO_BUD.value(), "Large Echo Bud");
        builder.add(BlockRegistry.MEDIUM_ECHO_BUD.value(), "Medium Echo Bud");
        builder.add(BlockRegistry.SMALL_ECHO_BUD.value(), "Small Echo Bud");

        builder.add(BlockRegistry.WRAPPIST_PEDESTAL.value(), "Wrappist Pedestal");
        builder.add(BlockRegistry.WRAPPIST_GLASS.value(), "Wrappist Glass");
        builder.add(BlockRegistry.CELESTITE_GLASS.value(), "Celestite Glass");
        builder.add(BlockRegistry.PINK_TOPAZ_GLASS.value(), "Pink Topaz Glass");

        builder.add(ItemRegistry.WRAP_ARMOR_TRIM_SMITHING_TEMPLATE.value(), "Wrap Armor Trim Smithing Template");
        builder.add(ItemRegistry.CELESTE_ARMOR_TRIM_SMITHING_TEMPLATE.value(), "Celeste Armor Trim Smithing Template");
        builder.add(ItemRegistry.HEART_ARMOR_TRIM_SMITHING_TEMPLATE.value(), "Heart Armor Trim Smithing Template");
        builder.add(ItemRegistry.PINK_TOPAZ.value(), "Pink Topaz");
        builder.add(ItemRegistry.CELESTITE_SHARD.value(), "Celestite Shard");
        builder.add(ItemRegistry.WRAPPIST_SHARD.value(), "Wrappist Shard");

        builder.add("trim_pattern.geodecraft.wrap", "Wrap Armor Trim");
        builder.add("trim_pattern.geodecraft.celeste", "Celeste Armor Trim");
        builder.add("trim_pattern.geodecraft.heart", "Heart Armor Trim");

        builder.add("trim_material.geodecraft.wrappist", "Wrappist Material");
        builder.add("trim_material.geodecraft.celestite", "Celestite Material");
        builder.add("trim_material.geodecraft.pink_topaz", "Pink Topaz Material");

        builder.add("wrappist_pedestal.geodecraft.not_enought_xp", "§l§cRequired 30 Levels");
    }
}
