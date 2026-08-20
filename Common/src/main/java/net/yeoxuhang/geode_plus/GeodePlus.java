package net.yeoxuhang.geode_plus;

import fuzs.puzzleslib.api.item.v2.EnchantingHelper;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.storage.loot.LootParams;

@Deprecated
public class GeodePlus {
    public static boolean hasSilkTouch(LootParams.Builder builder, ItemStack pickaxe) {
        return hasSilkTouch(builder.getLevel(), pickaxe);
    }

    public static boolean hasSilkTouch(Level level, ItemStack pickaxe) {
        return EnchantingHelper.getItemEnchantmentLevel(level.registryAccess(), Enchantments.SILK_TOUCH, pickaxe) > 0;
    }
}