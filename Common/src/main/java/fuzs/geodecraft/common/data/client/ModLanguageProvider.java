package fuzs.geodecraft.common.data.client;

import fuzs.geodecraft.common.Geodecraft;
import fuzs.geodecraft.common.init.*;
import fuzs.puzzleslib.api.client.data.v2.AbstractLanguageProvider;
import fuzs.puzzleslib.api.data.v2.core.DataProviderContext;

public class ModLanguageProvider extends AbstractLanguageProvider {

    public ModLanguageProvider(DataProviderContext context) {
        super(context);
    }

    @Override
    public void addTranslations(TranslationBuilder builder) {
        builder.addCreativeModeTab(ModRegistry.CREATIVE_MODE_TAB, Geodecraft.MOD_NAME);

        builder.add(BlockRegistry.BUDDING_PINK_TOPAZ.value(), "Budding Pink Topaz");
        builder.add(BlockRegistry.PINK_TOPAZ_BLOCK.value(), "Block of Pink Topaz");
        builder.add(BlockRegistry.PINK_TOPAZ_CLUSTER.value(), "Pink Topaz Cluster");
        builder.add(BlockRegistry.LARGE_PINK_TOPAZ_BUD.value(), "Large Pink Topaz Bud");
        builder.add(BlockRegistry.MEDIUM_PINK_TOPAZ_BUD.value(), "Medium Pink Topaz Bud");
        builder.add(BlockRegistry.SMALL_PINK_TOPAZ_BUD.value(), "Small Pink Topaz Bud");

        builder.add(BlockRegistry.BUDDING_CELESTITE.value(), "Budding Celestite");
        builder.add(BlockRegistry.CELESTITE_BLOCK.value(), "Block of Celestite");
        builder.add(BlockRegistry.CELESTITE_CLUSTER.value(), "Celestite Cluster");
        builder.add(BlockRegistry.LARGE_CELESTITE_BUD.value(), "Large Celestite Bud");
        builder.add(BlockRegistry.MEDIUM_CELESTITE_BUD.value(), "Medium Celestite Bud");
        builder.add(BlockRegistry.SMALL_CELESTITE_BUD.value(), "Small Celestite Bud");

        builder.add(BlockRegistry.BUDDING_WRAPPIST.value(), "Budding Wrappist");
        builder.add(BlockRegistry.WRAPPIST_BLOCK.value(), "Block of Wrappist");
        builder.add(BlockRegistry.WRAPPIST_CLUSTER.value(), "Wrappist Cluster");
        builder.add(BlockRegistry.LARGE_WRAPPIST_BUD.value(), "Large Wrappist Bud");
        builder.add(BlockRegistry.MEDIUM_WRAPPIST_BUD.value(), "Medium Wrappist Bud");
        builder.add(BlockRegistry.SMALL_WRAPPIST_BUD.value(), "Small Wrappist Bud");

        builder.add(BlockRegistry.BUDDING_PRISMARINE.value(), "Budding Prismarine");
        builder.add(BlockRegistry.PRISMARINE_CRYSTAL_BLOCK.value(), "Prismarine Crystal Block");
        builder.add(BlockRegistry.PRISMARINE_CRYSTAL.value(), "Prismarine Crystal");
        builder.add(BlockRegistry.LARGE_PRISMARINE_BUD.value(), "Large Prismarine Bud");
        builder.add(BlockRegistry.MEDIUM_PRISMARINE_BUD.value(), "Medium Prismarine Bud");
        builder.add(BlockRegistry.SMALL_PRISMARINE_BUD.value(), "Small Prismarine Bud");

        builder.add(BlockRegistry.BUDDING_LAPIS_LAZULI.value(), "Budding Lapis Lazuli");
        builder.add(BlockRegistry.BUDDING_DEEPSLATE_LAPIS_LAZULI.value(), "Budding Deepslate Lapis Lazuli");
        builder.add(BlockRegistry.BUDDING_SCULK_LAPIS_LAZULI.value(), "Budding Sculk Lapis Lazuli");
        builder.add(BlockRegistry.LAPIS_LAZULI_CRYSTAL_BLOCK.value(), "Lapis Lazuli Crystal Block");
        builder.add(BlockRegistry.LAPIS_LAZULI_CRYSTAL.value(), "Lapis Lazuli Crystal");
        builder.add(BlockRegistry.LARGE_LAPIS_LAZULI_BUD.value(), "Large Lapis Lazuli Bud");
        builder.add(BlockRegistry.MEDIUM_LAPIS_LAZULI_BUD.value(), "Medium Lapis Lazuli Bud");
        builder.add(BlockRegistry.SMALL_LAPIS_LAZULI_BUD.value(), "Small Lapis Lazuli Bud");

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
        builder.add(BlockRegistry.EMERALD_CRYSTAL_BLOCK.value(), "Emerald Crystal Block");
        builder.add(BlockRegistry.EMERALD_CRYSTAL.value(), "Emerald Crystal");
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

        builder.add(BlockRegistry.BUDDING_NETHER_GOLD.value(), "Budding Nether Gold");
        builder.add(BlockRegistry.BUDDING_BASALT_NETHER_GOLD.value(), "Budding Basalt Nether Gold");
        builder.add(BlockRegistry.BUDDING_BLACKSTONE_NETHER_GOLD.value(), "Budding Blackstone Nether Gold");
        builder.add(BlockRegistry.NETHER_GOLD_CRYSTAL_BLOCK.value(), "Nether Gold Crystal Block");
        builder.add(BlockRegistry.NETHER_GOLD_CRYSTAL.value(), "Nether Gold Crystal");
        builder.add(BlockRegistry.LARGE_NETHER_GOLD_BUD.value(), "Large Nether Gold Bud");
        builder.add(BlockRegistry.MEDIUM_NETHER_GOLD_BUD.value(), "Medium Nether Gold Bud");
        builder.add(BlockRegistry.SMALL_NETHER_GOLD_BUD.value(), "Small Nether Gold Bud");

        builder.add(BlockRegistry.BUDDING_GLOWSTONE.value(), "Budding Glowstone");
        builder.add(BlockRegistry.BUDDING_BASALT_GLOWSTONE.value(), "Budding Basalt Glowstone");
        builder.add(BlockRegistry.BUDDING_BLACKSTONE_GLOWSTONE.value(), "Budding Blackstone Glowstone");
        builder.add(BlockRegistry.GLOWSTONE_CRYSTAL_BLOCK.value(), "Glowstone Crystal Block");
        builder.add(BlockRegistry.GLOWSTONE_CRYSTAL.value(), "Glowstone Crystal");
        builder.add(BlockRegistry.LARGE_GLOWSTONE_BUD.value(), "Large Glowstone Bud");
        builder.add(BlockRegistry.MEDIUM_GLOWSTONE_BUD.value(), "Medium Glowstone Bud");
        builder.add(BlockRegistry.SMALL_GLOWSTONE_BUD.value(), "Small Glowstone Bud");

        builder.add(BlockRegistry.BUDDING_ANCIENT_DEBRIS.value(), "Budding Ancient Debris");
        builder.add(BlockRegistry.BUDDING_BASALT_ANCIENT_DEBRIS.value(), "Budding Basalt Ancient Debris");
        builder.add(BlockRegistry.BUDDING_BLACKSTONE_ANCIENT_DEBRIS.value(), "Budding Blackstone Ancient Debris");
        builder.add(BlockRegistry.ANCIENT_DEBRIS_CRYSTAL_BLOCK.value(), "Ancient Debris Crystal Block");
        builder.add(BlockRegistry.ANCIENT_DEBRIS_CRYSTAL.value(), "Ancient Debris Crystal");
        builder.add(BlockRegistry.LARGE_ANCIENT_DEBRIS_BUD.value(), "Large Ancient Debris Bud");
        builder.add(BlockRegistry.MEDIUM_ANCIENT_DEBRIS_BUD.value(), "Medium Ancient Debris Bud");
        builder.add(BlockRegistry.SMALL_ANCIENT_DEBRIS_BUD.value(), "Small Ancient Debris Bud");

        builder.add(BlockRegistry.SMOOTH_END_STONE.value(), "Smooth End Stone");
        builder.add(BlockRegistry.SMOOTH_END_STONE_STAIRS.value(), "Smooth End Stone Stairs");
        builder.add(BlockRegistry.SMOOTH_END_STONE_SLAB.value(), "Smooth End Stone Slab");

        builder.add(BlockRegistry.ECHO_CRYSTAL_BLOCK.value(), "Echo Crystal Block");
        builder.add(BlockRegistry.BUDDING_ECHO.value(), "Budding Echo");
        builder.add(BlockRegistry.ECHO_CRYSTAL.value(), "Echo Crystal");
        builder.add(BlockRegistry.LARGE_ECHO_BUD.value(), "Large Echo Bud");
        builder.add(BlockRegistry.MEDIUM_ECHO_BUD.value(), "Medium Echo Bud");
        builder.add(BlockRegistry.SMALL_ECHO_BUD.value(), "Small Echo Bud");

        builder.add(BlockRegistry.PEDESTAL.value(), "Pedestal");
        builder.add(BlockRegistry.WRAPPIST_GLASS.value(), "Wrappist Glass");
        builder.add(BlockRegistry.CELESTITE_GLASS.value(), "Celestite Glass");
        builder.add(BlockRegistry.PINK_TOPAZ_GLASS.value(), "Pink Topaz Glass");

        builder.add(ItemRegistry.WRAP_ARMOR_TRIM_SMITHING_TEMPLATE.value(), "Wrap Armor Trim Smithing Template");
        builder.add(ItemRegistry.CELESTE_ARMOR_TRIM_SMITHING_TEMPLATE.value(), "Celeste Armor Trim Smithing Template");
        builder.add(ItemRegistry.HEART_ARMOR_TRIM_SMITHING_TEMPLATE.value(), "Heart Armor Trim Smithing Template");
        builder.add(ItemRegistry.PINK_TOPAZ_SHARD.value(), "Pink Topaz Shard");
        builder.add(ItemRegistry.CELESTITE_SHARD.value(), "Celestite Shard");
        builder.add(ItemRegistry.WRAPPIST_SHARD.value(), "Wrappist Shard");

        builder.add(TrimPatternRegistry.WRAP, "Wrap Armor Trim");
        builder.add(TrimPatternRegistry.CELESTE, "Celeste Armor Trim");
        builder.add(TrimPatternRegistry.HEART, "Heart Armor Trim");

        builder.add(TrimMaterialRegistry.WRAPPIST, "Wrappist Material");
        builder.add(TrimMaterialRegistry.CELESTITE, "Celestite Material");
        builder.add(TrimMaterialRegistry.PINK_TOPAZ, "Pink Topaz Material");
    }
}
