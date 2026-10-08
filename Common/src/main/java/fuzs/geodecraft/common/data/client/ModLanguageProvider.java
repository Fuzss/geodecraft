package fuzs.geodecraft.common.data.client;

import fuzs.geodecraft.common.Geodecraft;
import fuzs.geodecraft.common.init.*;
import fuzs.puzzleslib.common.api.client.data.v3.language.AbstractLanguageProvider;
import fuzs.puzzleslib.common.api.data.v3.core.DataProviderContext;

public class ModLanguageProvider extends AbstractLanguageProvider {

    public ModLanguageProvider(DataProviderContext context) {
        super(context);
    }

    @Override
    public void addTranslations() {
        this.addCreativeModeTab(ModRegistry.CREATIVE_MODE_TAB, Geodecraft.MOD_NAME);

        this.add(BlockRegistry.BUDDING_PINK_TOPAZ.value(), "Budding Pink Topaz");
        this.add(BlockRegistry.PINK_TOPAZ_BLOCK.value(), "Block of Pink Topaz");
        this.add(BlockRegistry.PINK_TOPAZ_CLUSTER.value(), "Pink Topaz Cluster");
        this.add(BlockRegistry.LARGE_PINK_TOPAZ_BUD.value(), "Large Pink Topaz Bud");
        this.add(BlockRegistry.MEDIUM_PINK_TOPAZ_BUD.value(), "Medium Pink Topaz Bud");
        this.add(BlockRegistry.SMALL_PINK_TOPAZ_BUD.value(), "Small Pink Topaz Bud");

        this.add(BlockRegistry.BUDDING_CELESTITE.value(), "Budding Celestite");
        this.add(BlockRegistry.CELESTITE_BLOCK.value(), "Block of Celestite");
        this.add(BlockRegistry.CELESTITE_CLUSTER.value(), "Celestite Cluster");
        this.add(BlockRegistry.LARGE_CELESTITE_BUD.value(), "Large Celestite Bud");
        this.add(BlockRegistry.MEDIUM_CELESTITE_BUD.value(), "Medium Celestite Bud");
        this.add(BlockRegistry.SMALL_CELESTITE_BUD.value(), "Small Celestite Bud");

        this.add(BlockRegistry.BUDDING_WRAPPIST.value(), "Budding Wrappist");
        this.add(BlockRegistry.WRAPPIST_BLOCK.value(), "Block of Wrappist");
        this.add(BlockRegistry.WRAPPIST_CLUSTER.value(), "Wrappist Cluster");
        this.add(BlockRegistry.LARGE_WRAPPIST_BUD.value(), "Large Wrappist Bud");
        this.add(BlockRegistry.MEDIUM_WRAPPIST_BUD.value(), "Medium Wrappist Bud");
        this.add(BlockRegistry.SMALL_WRAPPIST_BUD.value(), "Small Wrappist Bud");

        this.add(BlockRegistry.BUDDING_PRISMARINE.value(), "Budding Prismarine");
        this.add(BlockRegistry.PRISMARINE_CRYSTAL_BLOCK.value(), "Prismarine Crystal Block");
        this.add(BlockRegistry.PRISMARINE_CRYSTAL.value(), "Prismarine Crystal");
        this.add(BlockRegistry.LARGE_PRISMARINE_BUD.value(), "Large Prismarine Bud");
        this.add(BlockRegistry.MEDIUM_PRISMARINE_BUD.value(), "Medium Prismarine Bud");
        this.add(BlockRegistry.SMALL_PRISMARINE_BUD.value(), "Small Prismarine Bud");

        this.add(BlockRegistry.BUDDING_LAPIS_LAZULI.value(), "Budding Lapis Lazuli");
        this.add(BlockRegistry.BUDDING_DEEPSLATE_LAPIS_LAZULI.value(), "Budding Deepslate Lapis Lazuli");
        this.add(BlockRegistry.BUDDING_SCULK_LAPIS_LAZULI.value(), "Budding Sculk Lapis Lazuli");
        this.add(BlockRegistry.LAPIS_LAZULI_CRYSTAL_BLOCK.value(), "Lapis Lazuli Crystal Block");
        this.add(BlockRegistry.LAPIS_LAZULI_CRYSTAL.value(), "Lapis Lazuli Crystal");
        this.add(BlockRegistry.LARGE_LAPIS_LAZULI_BUD.value(), "Large Lapis Lazuli Bud");
        this.add(BlockRegistry.MEDIUM_LAPIS_LAZULI_BUD.value(), "Medium Lapis Lazuli Bud");
        this.add(BlockRegistry.SMALL_LAPIS_LAZULI_BUD.value(), "Small Lapis Lazuli Bud");

        this.add(BlockRegistry.BUDDING_REDSTONE.value(), "Budding Redstone");
        this.add(BlockRegistry.BUDDING_DEEPSLATE_REDSTONE.value(), "Budding Deepslate Redstone");
        this.add(BlockRegistry.BUDDING_SCULK_REDSTONE.value(), "Budding Sculk Redstone");
        this.add(BlockRegistry.REDSTONE_CRYSTAL_BLOCK.value(), "Redstone Crystal Block");
        this.add(BlockRegistry.REDSTONE_CRYSTAL.value(), "Redstone Crystal");
        this.add(BlockRegistry.LARGE_REDSTONE_BUD.value(), "Large Redstone Bud");
        this.add(BlockRegistry.MEDIUM_REDSTONE_BUD.value(), "Medium Redstone Bud");
        this.add(BlockRegistry.SMALL_REDSTONE_BUD.value(), "Small Redstone Bud");

        this.add(BlockRegistry.BUDDING_EMERALD.value(), "Budding Emerald");
        this.add(BlockRegistry.BUDDING_DEEPSLATE_EMERALD.value(), "Budding Deepslate Emerald");
        this.add(BlockRegistry.BUDDING_SCULK_EMERALD.value(), "Budding Sculk Emerald");
        this.add(BlockRegistry.EMERALD_CRYSTAL_BLOCK.value(), "Emerald Crystal Block");
        this.add(BlockRegistry.EMERALD_CRYSTAL.value(), "Emerald Crystal");
        this.add(BlockRegistry.LARGE_EMERALD_BUD.value(), "Large Emerald Bud");
        this.add(BlockRegistry.MEDIUM_EMERALD_BUD.value(), "Medium Emerald Bud");
        this.add(BlockRegistry.SMALL_EMERALD_BUD.value(), "Small Emerald Bud");

        this.add(BlockRegistry.BUDDING_DIAMOND.value(), "Budding Diamond");
        this.add(BlockRegistry.BUDDING_DEEPSLATE_DIAMOND.value(), "Budding Deepslate Diamond");
        this.add(BlockRegistry.BUDDING_SCULK_DIAMOND.value(), "Budding Sculk Diamond");
        this.add(BlockRegistry.DIAMOND_CRYSTAL_BLOCK.value(), "Diamond Crystal Block");
        this.add(BlockRegistry.DIAMOND_CRYSTAL.value(), "Diamond Crystal");
        this.add(BlockRegistry.LARGE_DIAMOND_BUD.value(), "Large Diamond Bud");
        this.add(BlockRegistry.MEDIUM_DIAMOND_BUD.value(), "Medium Diamond Bud");
        this.add(BlockRegistry.SMALL_DIAMOND_BUD.value(), "Small Diamond Bud");

        this.add(BlockRegistry.BUDDING_NETHER_QUARTZ.value(), "Budding Nether Quartz");
        this.add(BlockRegistry.BUDDING_BASALT_NETHER_QUARTZ.value(), "Budding Basalt Nether Quartz");
        this.add(BlockRegistry.BUDDING_BLACKSTONE_NETHER_QUARTZ.value(), "Budding Blackstone Nether Quartz");
        this.add(BlockRegistry.NETHER_QUARTZ_CRYSTAL_BLOCK.value(), "Nether Quartz Crystal Block");
        this.add(BlockRegistry.NETHER_QUARTZ_CRYSTAL.value(), "Nether Quartz Crystal");
        this.add(BlockRegistry.LARGE_NETHER_QUARTZ_BUD.value(), "Large Nether Quartz Bud");
        this.add(BlockRegistry.MEDIUM_NETHER_QUARTZ_BUD.value(), "Medium Nether Quartz Bud");
        this.add(BlockRegistry.SMALL_NETHER_QUARTZ_BUD.value(), "Small Nether Quartz Bud");

        this.add(BlockRegistry.BUDDING_NETHER_GOLD.value(), "Budding Nether Gold");
        this.add(BlockRegistry.BUDDING_BASALT_NETHER_GOLD.value(), "Budding Basalt Nether Gold");
        this.add(BlockRegistry.BUDDING_BLACKSTONE_NETHER_GOLD.value(), "Budding Blackstone Nether Gold");
        this.add(BlockRegistry.NETHER_GOLD_CRYSTAL_BLOCK.value(), "Nether Gold Crystal Block");
        this.add(BlockRegistry.NETHER_GOLD_CRYSTAL.value(), "Nether Gold Crystal");
        this.add(BlockRegistry.LARGE_NETHER_GOLD_BUD.value(), "Large Nether Gold Bud");
        this.add(BlockRegistry.MEDIUM_NETHER_GOLD_BUD.value(), "Medium Nether Gold Bud");
        this.add(BlockRegistry.SMALL_NETHER_GOLD_BUD.value(), "Small Nether Gold Bud");

        this.add(BlockRegistry.BUDDING_GLOWSTONE.value(), "Budding Glowstone");
        this.add(BlockRegistry.BUDDING_BASALT_GLOWSTONE.value(), "Budding Basalt Glowstone");
        this.add(BlockRegistry.BUDDING_BLACKSTONE_GLOWSTONE.value(), "Budding Blackstone Glowstone");
        this.add(BlockRegistry.GLOWSTONE_CRYSTAL_BLOCK.value(), "Glowstone Crystal Block");
        this.add(BlockRegistry.GLOWSTONE_CRYSTAL.value(), "Glowstone Crystal");
        this.add(BlockRegistry.LARGE_GLOWSTONE_BUD.value(), "Large Glowstone Bud");
        this.add(BlockRegistry.MEDIUM_GLOWSTONE_BUD.value(), "Medium Glowstone Bud");
        this.add(BlockRegistry.SMALL_GLOWSTONE_BUD.value(), "Small Glowstone Bud");

        this.add(BlockRegistry.BUDDING_ANCIENT_DEBRIS.value(), "Budding Ancient Debris");
        this.add(BlockRegistry.BUDDING_BASALT_ANCIENT_DEBRIS.value(), "Budding Basalt Ancient Debris");
        this.add(BlockRegistry.BUDDING_BLACKSTONE_ANCIENT_DEBRIS.value(), "Budding Blackstone Ancient Debris");
        this.add(BlockRegistry.ANCIENT_DEBRIS_CRYSTAL_BLOCK.value(), "Ancient Debris Crystal Block");
        this.add(BlockRegistry.ANCIENT_DEBRIS_CRYSTAL.value(), "Ancient Debris Crystal");
        this.add(BlockRegistry.LARGE_ANCIENT_DEBRIS_BUD.value(), "Large Ancient Debris Bud");
        this.add(BlockRegistry.MEDIUM_ANCIENT_DEBRIS_BUD.value(), "Medium Ancient Debris Bud");
        this.add(BlockRegistry.SMALL_ANCIENT_DEBRIS_BUD.value(), "Small Ancient Debris Bud");

        this.add(BlockRegistry.SMOOTH_END_STONE.value(), "Smooth End Stone");
        this.add(BlockRegistry.SMOOTH_END_STONE_STAIRS.value(), "Smooth End Stone Stairs");
        this.add(BlockRegistry.SMOOTH_END_STONE_SLAB.value(), "Smooth End Stone Slab");

        this.add(BlockRegistry.ECHO_CRYSTAL_BLOCK.value(), "Echo Crystal Block");
        this.add(BlockRegistry.BUDDING_ECHO.value(), "Budding Echo");
        this.add(BlockRegistry.ECHO_CRYSTAL.value(), "Echo Crystal");
        this.add(BlockRegistry.LARGE_ECHO_BUD.value(), "Large Echo Bud");
        this.add(BlockRegistry.MEDIUM_ECHO_BUD.value(), "Medium Echo Bud");
        this.add(BlockRegistry.SMALL_ECHO_BUD.value(), "Small Echo Bud");

        this.add(BlockRegistry.PEDESTAL.value(), "Pedestal");
        this.add(BlockRegistry.WRAPPIST_GLASS.value(), "Wrappist Glass");
        this.add(BlockRegistry.CELESTITE_GLASS.value(), "Celestite Glass");
        this.add(BlockRegistry.PINK_TOPAZ_GLASS.value(), "Pink Topaz Glass");

        this.add(ItemRegistry.WRAP_ARMOR_TRIM_SMITHING_TEMPLATE.value(), "Wrap Armor Trim Smithing Template");
        this.add(ItemRegistry.CELESTE_ARMOR_TRIM_SMITHING_TEMPLATE.value(), "Celeste Armor Trim Smithing Template");
        this.add(ItemRegistry.HEART_ARMOR_TRIM_SMITHING_TEMPLATE.value(), "Heart Armor Trim Smithing Template");
        this.add(ItemRegistry.PINK_TOPAZ_SHARD.value(), "Pink Topaz Shard");
        this.add(ItemRegistry.CELESTITE_SHARD.value(), "Celestite Shard");
        this.add(ItemRegistry.WRAPPIST_SHARD.value(), "Wrappist Shard");

        this.add(TrimPatternRegistry.WRAP, "Wrap Armor Trim");
        this.add(TrimPatternRegistry.CELESTE, "Celeste Armor Trim");
        this.add(TrimPatternRegistry.HEART, "Heart Armor Trim");

        this.add(TrimMaterialRegistry.WRAPPIST, "Wrappist Material");
        this.add(TrimMaterialRegistry.CELESTITE, "Celestite Material");
        this.add(TrimMaterialRegistry.PINK_TOPAZ, "Pink Topaz Material");

        this.addPotion(PotionRegistry.HASTE, "Haste");
    }
}
