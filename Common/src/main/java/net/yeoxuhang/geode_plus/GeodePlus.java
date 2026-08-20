package net.yeoxuhang.geode_plus;

import fuzs.geodecraft.common.Geodecraft;
import fuzs.puzzleslib.api.item.v2.EnchantingHelper;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.storage.loot.LootParams;
import net.yeoxuhang.geode_plus.server.config.ServerConfigs;
import org.slf4j.Logger;

import java.io.IOException;

public class GeodePlus {
    public static ServerConfigs CONFIG;
    public static final String MOD_ID = Geodecraft.MOD_ID;
    public static final Logger LOGGER = Geodecraft.LOGGER;

    public static void setUpConfig(ServerConfigs config) {
        CONFIG = config;
    }

    public static ResourceLocation id(String s) {
        return Geodecraft.id(s);
    }

    public static void logWarning(String msg) {
        LOGGER.warn("Geode Plus: " + msg);
    }

    public static void logWarning(String s, IOException e) {
        LOGGER.warn("Geode Plus:" + s, e);
    }

    public static boolean hasSilkTouch(LootParams.Builder builder, ItemStack pickaxe) {
        return hasSilkTouch(builder.getLevel(), pickaxe);
    }

    public static boolean hasSilkTouch(Level level, ItemStack pickaxe) {
        return EnchantingHelper.getItemEnchantmentLevel(level.registryAccess(), Enchantments.SILK_TOUCH, pickaxe) > 0;
    }
}