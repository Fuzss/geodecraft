package fuzs.geodecraft.common.init;

import net.minecraft.core.Holder;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SmithingTemplateItem;

public class ItemRegistry {
    // TODO make these be found in dungeons in the biome rather than dropping from clusters randomly
    public static final Holder.Reference<Item> WRAP_ARMOR_TRIM_SMITHING_TEMPLATE = ModRegistry.REGISTRY.registerItem(
            "wrap_armor_trim_smithing_template",
            () -> SmithingTemplateItem.createArmorTrimTemplate(TrimPatternRegistry.WRAP));
    public static final Holder.Reference<Item> CELESTE_ARMOR_TRIM_SMITHING_TEMPLATE = ModRegistry.REGISTRY.registerItem(
            "celeste_armor_trim_smithing_template",
            () -> SmithingTemplateItem.createArmorTrimTemplate(TrimPatternRegistry.CELESTE));
    public static final Holder.Reference<Item> HEART_ARMOR_TRIM_SMITHING_TEMPLATE = ModRegistry.REGISTRY.registerItem(
            "heart_armor_trim_smithing_template",
            () -> SmithingTemplateItem.createArmorTrimTemplate(TrimPatternRegistry.HEART));

    public static final Holder.Reference<Item> PINK_TOPAZ = ModRegistry.REGISTRY.registerItem("pink_topaz");
    public static final Holder.Reference<Item> CELESTITE_SHARD = ModRegistry.REGISTRY.registerItem("celestite_shard");
    public static final Holder.Reference<Item> WRAPPIST_SHARD = ModRegistry.REGISTRY.registerItem("wrappist_shard");

    public static final Holder.Reference<Item> WRAPPIST_GLASS = ModRegistry.REGISTRY.registerBlockItem(BlockRegistry.WRAPPIST_GLASS);
    public static final Holder.Reference<Item> CELESTITE_GLASS = ModRegistry.REGISTRY.registerBlockItem(BlockRegistry.CELESTITE_GLASS);
    public static final Holder.Reference<Item> PINK_TOPAZ_GLASS = ModRegistry.REGISTRY.registerBlockItem(BlockRegistry.PINK_TOPAZ_GLASS);

    public static final Holder.Reference<Item> WRAPPIST_PEDESTAL = ModRegistry.REGISTRY.registerBlockItem(BlockRegistry.PEDESTAL);
    public static final Holder.Reference<Item> WRAPPIST_BLOCK = ModRegistry.REGISTRY.registerBlockItem(BlockRegistry.WRAPPIST_BLOCK);
    public static final Holder.Reference<Item> BUDDING_WRAPPIST = ModRegistry.REGISTRY.registerBlockItem(BlockRegistry.BUDDING_WRAPPIST);
    public static final Holder.Reference<Item> WRAPPIST_CLUSTER = ModRegistry.REGISTRY.registerBlockItem(BlockRegistry.WRAPPIST_CLUSTER);
    public static final Holder.Reference<Item> LARGE_WRAPPIST_BUD = ModRegistry.REGISTRY.registerBlockItem(BlockRegistry.LARGE_WRAPPIST_BUD);
    public static final Holder.Reference<Item> MEDIUM_WRAPPIST_BUD = ModRegistry.REGISTRY.registerBlockItem(
            BlockRegistry.MEDIUM_WRAPPIST_BUD);
    public static final Holder.Reference<Item> SMALL_WRAPPIST_BUD = ModRegistry.REGISTRY.registerBlockItem(BlockRegistry.SMALL_WRAPPIST_BUD);

    public static final Holder.Reference<Item> CELESTITE_BLOCK = ModRegistry.REGISTRY.registerBlockItem(BlockRegistry.CELESTITE_BLOCK);
    public static final Holder.Reference<Item> BUDDING_CELESTITE = ModRegistry.REGISTRY.registerBlockItem(BlockRegistry.BUDDING_CELESTITE);
    public static final Holder.Reference<Item> CELESTITE_CLUSTER = ModRegistry.REGISTRY.registerBlockItem(BlockRegistry.CELESTITE_CLUSTER);
    public static final Holder.Reference<Item> LARGE_CELESTITE_BUD = ModRegistry.REGISTRY.registerBlockItem(
            BlockRegistry.LARGE_CELESTITE_BUD);
    public static final Holder.Reference<Item> MEDIUM_CELESTITE_BUD = ModRegistry.REGISTRY.registerBlockItem(
            BlockRegistry.MEDIUM_CELESTITE_BUD);
    public static final Holder.Reference<Item> SMALL_CELESTITE_BUD = ModRegistry.REGISTRY.registerBlockItem(
            BlockRegistry.SMALL_CELESTITE_BUD);

    public static final Holder.Reference<Item> PINK_TOPAZ_BLOCK = ModRegistry.REGISTRY.registerBlockItem(BlockRegistry.PINK_TOPAZ_BLOCK);
    public static final Holder.Reference<Item> BUDDING_PINK_TOPAZ = ModRegistry.REGISTRY.registerBlockItem(BlockRegistry.BUDDING_PINK_TOPAZ);
    public static final Holder.Reference<Item> PINK_TOPAZ_CRYSTAL = ModRegistry.REGISTRY.registerBlockItem(BlockRegistry.PINK_TOPAZ_CLUSTER);
    public static final Holder.Reference<Item> LARGE_PINK_TOPAZ_BUD = ModRegistry.REGISTRY.registerBlockItem(
            BlockRegistry.LARGE_PINK_TOPAZ_BUD);
    public static final Holder.Reference<Item> MEDIUM_PINK_TOPAZ_BUD = ModRegistry.REGISTRY.registerBlockItem(
            BlockRegistry.MEDIUM_PINK_TOPAZ_BUD);
    public static final Holder.Reference<Item> SMALL_PINK_TOPAZ_BUD = ModRegistry.REGISTRY.registerBlockItem(
            BlockRegistry.SMALL_PINK_TOPAZ_BUD);

    public static final Holder.Reference<Item> PRISMARINE_CLUSTER_BLOCK = ModRegistry.REGISTRY.registerBlockItem(
            BlockRegistry.PRISMARINE_CLUSTER_BLOCK);
    public static final Holder.Reference<Item> BUDDING_PRISMARINE = ModRegistry.REGISTRY.registerBlockItem(BlockRegistry.BUDDING_PRISMARINE);
    public static final Holder.Reference<Item> PRISMARINE_CLUSTER = ModRegistry.REGISTRY.registerBlockItem(BlockRegistry.PRISMARINE_CLUSTER);
    public static final Holder.Reference<Item> LARGE_PRISMARINE_BUD = ModRegistry.REGISTRY.registerBlockItem(
            BlockRegistry.LARGE_PRISMARINE_BUD);
    public static final Holder.Reference<Item> MEDIUM_PRISMARINE_BUD = ModRegistry.REGISTRY.registerBlockItem(
            BlockRegistry.MEDIUM_PRISMARINE_BUD);
    public static final Holder.Reference<Item> SMALL_PRISMARINE_BUD = ModRegistry.REGISTRY.registerBlockItem(
            BlockRegistry.SMALL_PRISMARINE_BUD);

    public static final Holder.Reference<Item> LAPIS_CLUSTER_BLOCK = ModRegistry.REGISTRY.registerBlockItem(
            BlockRegistry.LAPIS_LAZULI_CLUSTER_BLOCK);
    public static final Holder.Reference<Item> BUDDING_LAPIS = ModRegistry.REGISTRY.registerBlockItem(BlockRegistry.BUDDING_LAPIS_LAZULI);
    public static final Holder.Reference<Item> BUDDING_DEEPSLATE_LAPIS = ModRegistry.REGISTRY.registerBlockItem(
            BlockRegistry.BUDDING_DEEPSLATE_LAPIS_LAZULI);
    public static final Holder.Reference<Item> BUDDING_SCULK_LAPIS = ModRegistry.REGISTRY.registerBlockItem(
            BlockRegistry.BUDDING_SCULK_LAPIS_LAZULI);
    public static final Holder.Reference<Item> LAPIS_CLUSTER = ModRegistry.REGISTRY.registerBlockItem(BlockRegistry.LAPIS_LAZULI_CLUSTER);
    public static final Holder.Reference<Item> LARGE_LAPIS_BUD = ModRegistry.REGISTRY.registerBlockItem(BlockRegistry.LARGE_LAPIS_LAZULI_BUD);
    public static final Holder.Reference<Item> MEDIUM_LAPIS_BUD = ModRegistry.REGISTRY.registerBlockItem(BlockRegistry.MEDIUM_LAPIS_LAZULI_BUD);
    public static final Holder.Reference<Item> SMALL_LAPIS_BUD = ModRegistry.REGISTRY.registerBlockItem(BlockRegistry.SMALL_LAPIS_LAZULI_BUD);

    public static final Holder.Reference<Item> REDSTONE_CRYSTAL_BLOCK = ModRegistry.REGISTRY.registerBlockItem(
            BlockRegistry.REDSTONE_CRYSTAL_BLOCK);
    public static final Holder.Reference<Item> BUDDING_REDSTONE = ModRegistry.REGISTRY.registerBlockItem(BlockRegistry.BUDDING_REDSTONE);
    public static final Holder.Reference<Item> BUDDING_DEEPSLATE_REDSTONE = ModRegistry.REGISTRY.registerBlockItem(
            BlockRegistry.BUDDING_DEEPSLATE_REDSTONE);
    public static final Holder.Reference<Item> BUDDING_SCULK_REDSTONE = ModRegistry.REGISTRY.registerBlockItem(
            BlockRegistry.BUDDING_SCULK_REDSTONE);
    public static final Holder.Reference<Item> REDSTONE_CRYSTAL = ModRegistry.REGISTRY.registerBlockItem(BlockRegistry.REDSTONE_CRYSTAL);
    public static final Holder.Reference<Item> LARGE_REDSTONE_BUD = ModRegistry.REGISTRY.registerBlockItem(BlockRegistry.LARGE_REDSTONE_BUD);
    public static final Holder.Reference<Item> MEDIUM_REDSTONE_BUD = ModRegistry.REGISTRY.registerBlockItem(
            BlockRegistry.MEDIUM_REDSTONE_BUD);
    public static final Holder.Reference<Item> SMALL_REDSTONE_BUD = ModRegistry.REGISTRY.registerBlockItem(BlockRegistry.SMALL_REDSTONE_BUD);

    public static final Holder.Reference<Item> EMERALD_CLUSTER_BLOCK = ModRegistry.REGISTRY.registerBlockItem(
            BlockRegistry.EMERALD_CLUSTER_BLOCK);
    public static final Holder.Reference<Item> BUDDING_EMERALD = ModRegistry.REGISTRY.registerBlockItem(BlockRegistry.BUDDING_EMERALD);
    public static final Holder.Reference<Item> BUDDING_DEEPSLATE_EMERALD = ModRegistry.REGISTRY.registerBlockItem(
            BlockRegistry.BUDDING_DEEPSLATE_EMERALD);
    public static final Holder.Reference<Item> BUDDING_SCULK_EMERALD = ModRegistry.REGISTRY.registerBlockItem(
            BlockRegistry.BUDDING_SCULK_EMERALD);
    public static final Holder.Reference<Item> EMERALD_CLUSTER = ModRegistry.REGISTRY.registerBlockItem(BlockRegistry.EMERALD_CLUSTER);
    public static final Holder.Reference<Item> LARGE_EMERALD_BUD = ModRegistry.REGISTRY.registerBlockItem(BlockRegistry.LARGE_EMERALD_BUD);
    public static final Holder.Reference<Item> MEDIUM_EMERALD_BUD = ModRegistry.REGISTRY.registerBlockItem(BlockRegistry.MEDIUM_EMERALD_BUD);
    public static final Holder.Reference<Item> SMALL_EMERALD_BUD = ModRegistry.REGISTRY.registerBlockItem(BlockRegistry.SMALL_EMERALD_BUD);

    public static final Holder.Reference<Item> DIAMOND_CRYSTAL_BLOCK = ModRegistry.REGISTRY.registerBlockItem(
            BlockRegistry.DIAMOND_CRYSTAL_BLOCK);
    public static final Holder.Reference<Item> BUDDING_DIAMOND = ModRegistry.REGISTRY.registerBlockItem(BlockRegistry.BUDDING_DIAMOND);
    public static final Holder.Reference<Item> BUDDING_DEEPSLATE_DIAMOND = ModRegistry.REGISTRY.registerBlockItem(
            BlockRegistry.BUDDING_DEEPSLATE_DIAMOND);
    public static final Holder.Reference<Item> BUDDING_SCULK_DIAMOND = ModRegistry.REGISTRY.registerBlockItem(
            BlockRegistry.BUDDING_SCULK_DIAMOND);
    public static final Holder.Reference<Item> DIAMOND_CRYSTAL = ModRegistry.REGISTRY.registerBlockItem(BlockRegistry.DIAMOND_CRYSTAL);
    public static final Holder.Reference<Item> LARGE_DIAMOND_BUD = ModRegistry.REGISTRY.registerBlockItem(BlockRegistry.LARGE_DIAMOND_BUD);
    public static final Holder.Reference<Item> MEDIUM_DIAMOND_BUD = ModRegistry.REGISTRY.registerBlockItem(BlockRegistry.MEDIUM_DIAMOND_BUD);
    public static final Holder.Reference<Item> SMALL_DIAMOND_BUD = ModRegistry.REGISTRY.registerBlockItem(BlockRegistry.SMALL_DIAMOND_BUD);

    public static final Holder.Reference<Item> QUARTZ_CRYSTAL_BLOCK = ModRegistry.REGISTRY.registerBlockItem(
            BlockRegistry.NETHER_QUARTZ_CRYSTAL_BLOCK);
    public static final Holder.Reference<Item> BUDDING_NETHER_QUARTZ = ModRegistry.REGISTRY.registerBlockItem(
            BlockRegistry.BUDDING_NETHER_QUARTZ);
    public static final Holder.Reference<Item> BUDDING_BASALT_QUARTZ = ModRegistry.REGISTRY.registerBlockItem(
            BlockRegistry.BUDDING_BASALT_NETHER_QUARTZ);
    public static final Holder.Reference<Item> BUDDING_BLACKSTONE_QUARTZ = ModRegistry.REGISTRY.registerBlockItem(
            BlockRegistry.BUDDING_BLACKSTONE_NETHER_QUARTZ);
    public static final Holder.Reference<Item> QUARTZ_CRYSTAL = ModRegistry.REGISTRY.registerBlockItem(BlockRegistry.NETHER_QUARTZ_CRYSTAL);
    public static final Holder.Reference<Item> LARGE_QUARTZ_BUD = ModRegistry.REGISTRY.registerBlockItem(BlockRegistry.LARGE_NETHER_QUARTZ_BUD);
    public static final Holder.Reference<Item> MEDIUM_QUARTZ_BUD = ModRegistry.REGISTRY.registerBlockItem(BlockRegistry.MEDIUM_NETHER_QUARTZ_BUD);
    public static final Holder.Reference<Item> SMALL_QUARTZ_BUD = ModRegistry.REGISTRY.registerBlockItem(BlockRegistry.SMALL_NETHER_QUARTZ_BUD);

    public static final Holder.Reference<Item> GOLD_NUGGET_CLUSTER_BLOCK = ModRegistry.REGISTRY.registerBlockItem(
            BlockRegistry.GOLD_NUGGET_CLUSTER_BLOCK);
    public static final Holder.Reference<Item> BUDDING_GOLD_NUGGET = ModRegistry.REGISTRY.registerBlockItem(
            BlockRegistry.BUDDING_GOLD_NUGGET);
    public static final Holder.Reference<Item> BUDDING_BASALT_GOLD_NUGGET = ModRegistry.REGISTRY.registerBlockItem(
            BlockRegistry.BUDDING_BASALT_GOLD_NUGGET);
    public static final Holder.Reference<Item> BUDDING_BLACKSTONE_GOLD_NUGGET = ModRegistry.REGISTRY.registerBlockItem(
            BlockRegistry.BUDDING_BLACKSTONE_GOLD_NUGGET);
    public static final Holder.Reference<Item> GOLD_NUGGET_CLUSTER = ModRegistry.REGISTRY.registerBlockItem(
            BlockRegistry.GOLD_NUGGET_CLUSTER);
    public static final Holder.Reference<Item> LARGE_GOLD_NUGGET_BUD = ModRegistry.REGISTRY.registerBlockItem(
            BlockRegistry.LARGE_GOLD_NUGGET_BUD);
    public static final Holder.Reference<Item> MEDIUM_GOLD_NUGGET_BUD = ModRegistry.REGISTRY.registerBlockItem(
            BlockRegistry.MEDIUM_GOLD_NUGGET_BUD);
    public static final Holder.Reference<Item> SMALL_GOLD_NUGGET_BUD = ModRegistry.REGISTRY.registerBlockItem(
            BlockRegistry.SMALL_GOLD_NUGGET_BUD);

    public static final Holder.Reference<Item> GLOWSTONE_CLUSTER_BLOCK = ModRegistry.REGISTRY.registerBlockItem(
            BlockRegistry.GLOWSTONE_CLUSTER_BLOCK);
    public static final Holder.Reference<Item> BUDDING_GLOWSTONE = ModRegistry.REGISTRY.registerBlockItem(BlockRegistry.BUDDING_GLOWSTONE);
    public static final Holder.Reference<Item> BUDDING_BASALT_GLOWSTONE = ModRegistry.REGISTRY.registerBlockItem(
            BlockRegistry.BUDDING_BASALT_GLOWSTONE);
    public static final Holder.Reference<Item> BUDDING_BLACKSTONE_GLOWSTONE = ModRegistry.REGISTRY.registerBlockItem(
            BlockRegistry.BUDDING_BLACKSTONE_GLOWSTONE);
    public static final Holder.Reference<Item> GLOWSTONE_CLUSTER = ModRegistry.REGISTRY.registerBlockItem(BlockRegistry.GLOWSTONE_CLUSTER);
    public static final Holder.Reference<Item> LARGE_GLOWSTONE_BUD = ModRegistry.REGISTRY.registerBlockItem(
            BlockRegistry.LARGE_GLOWSTONE_BUD);
    public static final Holder.Reference<Item> MEDIUM_GLOWSTONE_BUD = ModRegistry.REGISTRY.registerBlockItem(
            BlockRegistry.MEDIUM_GLOWSTONE_BUD);
    public static final Holder.Reference<Item> SMALL_GLOWSTONE_BUD = ModRegistry.REGISTRY.registerBlockItem(
            BlockRegistry.SMALL_GLOWSTONE_BUD);

    public static final Holder.Reference<Item> ANCIENT_DEBRIS_CLUSTER_BLOCK = ModRegistry.REGISTRY.registerBlockItem(
            BlockRegistry.ANCIENT_DEBRIS_CLUSTER_BLOCK);
    public static final Holder.Reference<Item> BUDDING_ANCIENT_DEBRIS = ModRegistry.REGISTRY.registerBlockItem(
            BlockRegistry.BUDDING_ANCIENT_DEBRIS);
    public static final Holder.Reference<Item> BUDDING_BASALT_ANCIENT_DEBRIS = ModRegistry.REGISTRY.registerBlockItem(
            BlockRegistry.BUDDING_BASALT_ANCIENT_DEBRIS);
    public static final Holder.Reference<Item> BUDDING_BLACKSTONE_ANCIENT_DEBRIS = ModRegistry.REGISTRY.registerBlockItem(
            BlockRegistry.BUDDING_BLACKSTONE_ANCIENT_DEBRIS);
    public static final Holder.Reference<Item> ANCIENT_DEBRIS_CLUSTER = ModRegistry.REGISTRY.registerBlockItem(
            BlockRegistry.ANCIENT_DEBRIS_CLUSTER);
    public static final Holder.Reference<Item> LARGE_ANCIENT_DEBRIS_BUD = ModRegistry.REGISTRY.registerBlockItem(
            BlockRegistry.LARGE_ANCIENT_DEBRIS_BUD);
    public static final Holder.Reference<Item> MEDIUM_ANCIENT_DEBRIS_BUD = ModRegistry.REGISTRY.registerBlockItem(
            BlockRegistry.MEDIUM_ANCIENT_DEBRIS_BUD);
    public static final Holder.Reference<Item> SMALL_ANCIENT_DEBRIS_BUD = ModRegistry.REGISTRY.registerBlockItem(
            BlockRegistry.SMALL_ANCIENT_DEBRIS_BUD);

    public static final Holder.Reference<Item> SMOOTH_END_STONE = ModRegistry.REGISTRY.registerBlockItem(BlockRegistry.SMOOTH_END_STONE);
    public static final Holder.Reference<Item> SMOOTH_END_STONE_STAIRS = ModRegistry.REGISTRY.registerBlockItem(
            BlockRegistry.SMOOTH_END_STONE_STAIRS);
    public static final Holder.Reference<Item> SMOOTH_END_STONE_SLAB = ModRegistry.REGISTRY.registerBlockItem(
            BlockRegistry.SMOOTH_END_STONE_SLAB);

    public static final Holder.Reference<Item> ECHO_CRYSTAL_BLOCK = ModRegistry.REGISTRY.registerBlockItem(BlockRegistry.ECHO_CRYSTAL_BLOCK);
    public static final Holder.Reference<Item> BUDDING_ECHO = ModRegistry.REGISTRY.registerBlockItem(BlockRegistry.BUDDING_ECHO);
    public static final Holder.Reference<Item> ECHO_CRYSTAL = ModRegistry.REGISTRY.registerBlockItem(BlockRegistry.ECHO_CRYSTAL);
    public static final Holder.Reference<Item> LARGE_ECHO_BUD = ModRegistry.REGISTRY.registerBlockItem(BlockRegistry.LARGE_ECHO_BUD);
    public static final Holder.Reference<Item> MEDIUM_ECHO_BUD = ModRegistry.REGISTRY.registerBlockItem(BlockRegistry.MEDIUM_ECHO_BUD);
    public static final Holder.Reference<Item> SMALL_ECHO_BUD = ModRegistry.REGISTRY.registerBlockItem(BlockRegistry.SMALL_ECHO_BUD);

    public static void bootstrap() {
        // NO-OP
    }
}
