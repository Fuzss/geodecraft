package fuzs.geodecraft.common.init;

import net.minecraft.Util;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.armortrim.TrimPattern;

public class TrimPatternRegistry {
    public static final ResourceKey<TrimPattern> WRAP = createTrimPattern("wrap");
    public static final ResourceKey<TrimPattern> CELESTE = createTrimPattern("celeste");
    public static final ResourceKey<TrimPattern> HEART = createTrimPattern("heart");

    public static void bootstrapPatterns(BootstrapContext<TrimPattern> context) {
        createPattern(context, ItemRegistry.WRAP_ARMOR_TRIM_SMITHING_TEMPLATE.value(), WRAP);
        createPattern(context, ItemRegistry.CELESTE_ARMOR_TRIM_SMITHING_TEMPLATE.value(), CELESTE);
        createPattern(context, ItemRegistry.HEART_ARMOR_TRIM_SMITHING_TEMPLATE.value(), HEART);
    }

    private static void createPattern(BootstrapContext<TrimPattern> context, Item item, ResourceKey<TrimPattern> resourceKey) {
        TrimPattern trimPattern = new TrimPattern(resourceKey.location(),
                BuiltInRegistries.ITEM.wrapAsHolder(item),
                Component.translatable(Util.makeDescriptionId("trim_pattern", resourceKey.location())),
                false);
        context.register(resourceKey, trimPattern);
    }

    private static ResourceKey<TrimPattern> createTrimPattern(String name) {
        return ModRegistry.REGISTRY.makeResourceKey(Registries.TRIM_PATTERN, name);
    }
}
