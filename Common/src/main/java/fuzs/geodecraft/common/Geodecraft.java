package fuzs.geodecraft.common;

import fuzs.puzzleslib.api.core.v1.ModConstructor;
import fuzs.puzzleslib.api.core.v2.context.BiomeModificationsContext;
import fuzs.puzzleslib.api.event.v1.server.RegisterPotionBrewingMixesCallback;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.alchemy.Potions;
import net.yeoxuhang.geode_plus.FabricBiomeModifier;
import net.yeoxuhang.geode_plus.server.registry.ItemRegistry;
import net.yeoxuhang.geode_plus.server.registry.ModRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Geodecraft implements ModConstructor {
    public static final String MOD_ID = "geodecraft";
    public static final String MOD_NAME = "Geodecraft";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_NAME);

    @Override
    public void onConstructMod() {
        ModRegistry.bootstrap();
        registerEventHandlers();
    }

    private static void registerEventHandlers() {
        RegisterPotionBrewingMixesCallback.EVENT.register((RegisterPotionBrewingMixesCallback.Builder builder) -> {
            builder.registerPotionRecipe(Potions.WATER, ItemRegistry.WRAPPIST_SHARD.value(), Potions.SLOW_FALLING);
            builder.registerPotionRecipe(Potions.WATER, ItemRegistry.CELESTITE_SHARD.value(), Potions.STRONG_HEALING);
            builder.registerPotionRecipe(Potions.WATER, ItemRegistry.PINK_TOPAZ.value(), Potions.LUCK);
        });
    }

    @Override
    public void onRegisterBiomeModifications(BiomeModificationsContext context) {
        FabricBiomeModifier.init(context);
    }

    public static ResourceLocation id(String path) {
        return ResourceLocation.fromNamespaceAndPath(MOD_ID, path);
    }
}
