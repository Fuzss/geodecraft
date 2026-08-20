package fuzs.geodecraft.common.init;

import net.minecraft.Util;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.Style;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.armortrim.TrimMaterial;

import java.util.Map;

public class TrimMaterialRegistry {
    public static final ResourceKey<TrimMaterial> WRAPPIST = createTrimMaterial("wrappist");
    public static final ResourceKey<TrimMaterial> CELESTITE = createTrimMaterial("celestite");
    public static final ResourceKey<TrimMaterial> PINK_TOPAZ = createTrimMaterial("pink_topaz");

    public static void bootstrapMaterials(BootstrapContext<TrimMaterial> context) {
        createMaterial(context, WRAPPIST, ItemRegistry.WRAPPIST_SHARD.value(), Style.EMPTY.withColor(0X5E9FCE), 0.9F);
        createMaterial(context, CELESTITE, ItemRegistry.CELESTITE_SHARD.value(), Style.EMPTY.withColor(0XB2D3F7), 0.8F);
        createMaterial(context, PINK_TOPAZ, ItemRegistry.PINK_TOPAZ.value(), Style.EMPTY.withColor(0XFBB7E7), 0.1F);
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

    static ResourceKey<TrimMaterial> createTrimMaterial(String name) {
        return ModRegistry.REGISTRY.makeResourceKey(Registries.TRIM_MATERIAL, name);
    }
}
