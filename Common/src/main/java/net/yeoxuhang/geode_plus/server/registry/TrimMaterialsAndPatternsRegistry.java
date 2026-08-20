package net.yeoxuhang.geode_plus.server.registry;

import net.minecraft.Util;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.Style;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.armortrim.TrimMaterial;
import net.minecraft.world.item.armortrim.TrimPattern;
import net.yeoxuhang.geode_plus.GeodePlus;

import java.util.Map;

public class TrimMaterialsAndPatternsRegistry {
    public static final ResourceKey<TrimMaterial> WRAPPIST = createTrimMaterial("wrappist");
    public static final ResourceKey<TrimMaterial> CELESTITE = createTrimMaterial("celestite");
    public static final ResourceKey<TrimMaterial> PINK_TOPAZ = createTrimMaterial("pink_topaz");
    public static final ResourceKey<TrimPattern> WRAP = createTrimPattern("wrap");
    public static final ResourceKey<TrimPattern> CELESTE = createTrimPattern("celeste");
    public static final ResourceKey<TrimPattern> HEART = createTrimPattern("heart");

    public static void bootstrapMaterials(BootstrapContext<TrimMaterial> context) {
        createMaterial(context, WRAPPIST, ItemRegistry.WRAPPIST_SHARD.value(), Style.EMPTY.withColor(0X5E9FCE), 0.9F);
        createMaterial(context, CELESTITE, ItemRegistry.CELESTITE_SHARD.value(), Style.EMPTY.withColor(0XB2D3F7), 0.8F);
        createMaterial(context, PINK_TOPAZ, ItemRegistry.PINK_TOPAZ.value(), Style.EMPTY.withColor(0XFBB7E7), 0.1F);
    }

    public static void bootstrapPatterns(BootstrapContext<TrimPattern> context) {
        createPattern(context, ItemRegistry.WRAP_ARMOR_TRIM_SMITHING_TEMPLATE.value(), WRAP);
        createPattern(context, ItemRegistry.CELESTE_ARMOR_TRIM_SMITHING_TEMPLATE.value(), CELESTE);
        createPattern(context, ItemRegistry.HEART_ARMOR_TRIM_SMITHING_TEMPLATE.value(), HEART);
    }

    private static void createMaterial(BootstrapContext<TrimMaterial> context, ResourceKey<TrimMaterial> resourceKey, Item item, Style style, float f) {
        createMaterial(context, resourceKey, item, style, f, Map.of());
    }

    private static void createMaterial(BootstrapContext<TrimMaterial> context, ResourceKey<TrimMaterial> resourceKey, Item item, Style style, float f, Map<Holder<ArmorMaterial>, String> map) {
        TrimMaterial trimMaterial = TrimMaterial.create(resourceKey.location().getPath(),
                item,
                f,
                Component.translatable(Util.makeDescriptionId("trim_material", resourceKey.location()))
                        .withStyle(style),
                map);
        context.register(resourceKey, trimMaterial);
    }

    private static void createPattern(BootstrapContext<TrimPattern> context, Item item, ResourceKey<TrimPattern> resourceKey) {
        TrimPattern trimPattern = new TrimPattern(resourceKey.location(),
                BuiltInRegistries.ITEM.wrapAsHolder(item),
                Component.translatable(Util.makeDescriptionId("trim_pattern", resourceKey.location())),
                false);
        context.register(resourceKey, trimPattern);
    }

    private static ResourceKey<TrimMaterial> createTrimMaterial(String string) {
        return ResourceKey.create(Registries.TRIM_MATERIAL, GeodePlus.id(string));
    }

    private static ResourceKey<TrimPattern> createTrimPattern(String string) {
        return ResourceKey.create(Registries.TRIM_PATTERN, GeodePlus.id(string));
    }
}
