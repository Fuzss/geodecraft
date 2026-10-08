package fuzs.geodecraft.common.init;

import fuzs.geodecraft.common.Geodecraft;
import fuzs.puzzleslib.common.api.init.v3.registry.ContentRegistrationHelper;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.equipment.trim.TrimMaterial;

public class TrimMaterialRegistry {
    public static final ResourceKey<TrimMaterial> WRAPPIST = register("wrappist");
    public static final ResourceKey<TrimMaterial> CELESTITE = register("celestite");
    public static final ResourceKey<TrimMaterial> PINK_TOPAZ = register("pink_topaz");

    public static void bootstrap(BootstrapContext<TrimMaterial> context) {
        ContentRegistrationHelper.registerTrimMaterial(context, WRAPPIST, 0X5E9FCE, Geodecraft.id("trim/wrappist"));
        ContentRegistrationHelper.registerTrimMaterial(context, CELESTITE, 0XB2D3F7, Geodecraft.id("trim/celestite"));
        ContentRegistrationHelper.registerTrimMaterial(context, PINK_TOPAZ, 0XFBB7E7, Geodecraft.id("trim/pink_topaz"));
    }

    private static ResourceKey<TrimMaterial> register(String name) {
        return ResourceKey.create(Registries.TRIM_MATERIAL, Geodecraft.id(name));
    }
}
