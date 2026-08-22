package fuzs.geodecraft.common.init;

import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.armortrim.TrimPattern;
import net.minecraft.world.item.armortrim.TrimPatterns;

public class TrimPatternRegistry {
    public static final ResourceKey<TrimPattern> WRAP = createTrimPattern("wrap");
    public static final ResourceKey<TrimPattern> CELESTE = createTrimPattern("celeste");
    public static final ResourceKey<TrimPattern> HEART = createTrimPattern("heart");

    public static void bootstrapPatterns(BootstrapContext<TrimPattern> context) {
        TrimPatterns.register(context, ItemRegistry.WRAP_ARMOR_TRIM_SMITHING_TEMPLATE.value(), WRAP);
        TrimPatterns.register(context, ItemRegistry.CELESTE_ARMOR_TRIM_SMITHING_TEMPLATE.value(), CELESTE);
        TrimPatterns.register(context, ItemRegistry.HEART_ARMOR_TRIM_SMITHING_TEMPLATE.value(), HEART);
    }

    private static ResourceKey<TrimPattern> createTrimPattern(String name) {
        return ModRegistry.REGISTRIES.makeResourceKey(Registries.TRIM_PATTERN, name);
    }
}
