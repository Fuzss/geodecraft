package fuzs.geodecraft.common.init;

import fuzs.geodecraft.common.Geodecraft;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.equipment.trim.TrimPattern;
import net.minecraft.world.item.equipment.trim.TrimPatterns;

public class TrimPatternRegistry {
    public static final ResourceKey<TrimPattern> WRAP = register("wrap");
    public static final ResourceKey<TrimPattern> CELESTE = register("celeste");
    public static final ResourceKey<TrimPattern> HEART = register("heart");

    public static void bootstrap(BootstrapContext<TrimPattern> context) {
        TrimPatterns.register(context, WRAP);
        TrimPatterns.register(context, CELESTE);
        TrimPatterns.register(context, HEART);
    }

    private static ResourceKey<TrimPattern> register(String name) {
        return ResourceKey.create(Registries.TRIM_PATTERN, Geodecraft.id(name));
    }
}
