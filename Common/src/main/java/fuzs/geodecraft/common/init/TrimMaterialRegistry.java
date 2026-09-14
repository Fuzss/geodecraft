package fuzs.geodecraft.common.init;

import fuzs.puzzleslib.common.api.data.v2.AbstractDatapackRegistriesProvider;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.equipment.trim.TrimMaterial;

public class TrimMaterialRegistry {
    public static final ResourceKey<TrimMaterial> WRAPPIST = createTrimMaterial("wrappist");
    public static final ResourceKey<TrimMaterial> CELESTITE = createTrimMaterial("celestite");
    public static final ResourceKey<TrimMaterial> PINK_TOPAZ = createTrimMaterial("pink_topaz");

    public static void bootstrapMaterials(BootstrapContext<TrimMaterial> context) {
        AbstractDatapackRegistriesProvider.registerTrimMaterial(context,
                WRAPPIST,
                ItemRegistry.WRAPPIST_SHARD.value(),
                0X5E9FCE);
        AbstractDatapackRegistriesProvider.registerTrimMaterial(context,
                CELESTITE,
                ItemRegistry.CELESTITE_SHARD.value(),
                0XB2D3F7);
        AbstractDatapackRegistriesProvider.registerTrimMaterial(context,
                PINK_TOPAZ,
                ItemRegistry.PINK_TOPAZ_SHARD.value(),
                0XFBB7E7);
    }

    static ResourceKey<TrimMaterial> createTrimMaterial(String name) {
        return ModRegistry.REGISTRIES.makeResourceKey(Registries.TRIM_MATERIAL, name);
    }
}
