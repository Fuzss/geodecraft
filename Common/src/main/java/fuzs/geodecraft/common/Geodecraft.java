package fuzs.geodecraft.common;

import fuzs.geodecraft.common.config.CommonConfig;
import fuzs.geodecraft.common.handler.BiomeModificationsHandler;
import fuzs.geodecraft.common.init.ItemRegistry;
import fuzs.geodecraft.common.init.ModRegistry;
import fuzs.geodecraft.common.init.PotionRegistry;
import fuzs.puzzleslib.common.api.config.v3.ConfigHolder;
import fuzs.puzzleslib.common.api.core.v1.ModConstructor;
import fuzs.puzzleslib.common.api.core.v1.context.PackRepositorySourcesContext;
import fuzs.puzzleslib.common.api.core.v1.context.BiomeModificationsContext;
import fuzs.puzzleslib.common.api.event.v1.server.LootTableLoadCallback;
import fuzs.puzzleslib.common.api.event.v1.server.RegisterPotionBrewingMixesCallback;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.alchemy.Potions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Geodecraft implements ModConstructor {
    public static final String MOD_ID = "geodecraft";
    public static final String MOD_NAME = "Geodecraft";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_NAME);

    public static final ConfigHolder CONFIG = ConfigHolder.builder(MOD_ID).common(CommonConfig.class);
    public static final Identifier SILK_TOUCH_BUDDING_BLOCKS_ID = id("silk_touch_budding_blocks");

    @Override
    public void onConstructMod() {
        ModRegistry.bootstrap();
        registerEventHandlers();
    }

    private static void registerEventHandlers() {
        LootTableLoadCallback.EVENT.register(ModRegistry::onLootTableLoad);
        RegisterPotionBrewingMixesCallback.EVENT.register((RegisterPotionBrewingMixesCallback.Builder builder) -> {
            builder.registerStartPotionRecipe(ItemRegistry.CELESTITE_SHARD.value(), Potions.STRENGTH);
            builder.registerStartPotionRecipe(ItemRegistry.PINK_TOPAZ_SHARD.value(), Potions.LUCK);
            builder.registerStartPotionRecipe(ItemRegistry.WRAPPIST_SHARD.value(), PotionRegistry.HASTE);
            builder.registerPotionRecipe(PotionRegistry.HASTE, Items.REDSTONE, PotionRegistry.LONG_HASTE);
            builder.registerPotionRecipe(PotionRegistry.HASTE, Items.GLOWSTONE_DUST, PotionRegistry.STRONG_HASTE);
        });
    }

    @Override
    public void onRegisterBiomeModifications(BiomeModificationsContext context) {
        BiomeModificationsHandler.init(context);
    }

    @Override
    public void onAddDataPackFinders(PackRepositorySourcesContext context) {
        context.registerBuiltInPack(SILK_TOUCH_BUDDING_BLOCKS_ID,
                Component.literal("Silk Touch Budding Blocks"),
                false);
    }

    public static Identifier id(String path) {
        return Identifier.fromNamespaceAndPath(MOD_ID, path);
    }
}
