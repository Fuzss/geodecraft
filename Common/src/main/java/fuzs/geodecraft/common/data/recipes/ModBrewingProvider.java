package fuzs.geodecraft.common.data.recipes;

import fuzs.geodecraft.common.init.ItemRegistry;
import fuzs.geodecraft.common.init.PotionRegistry;
import fuzs.puzzleslib.common.api.data.v3.recipes.AbstractBrewingProvider;
import net.minecraft.advancements.Advancement;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.alchemy.Potions;
import net.minecraft.world.item.crafting.Recipe;

public class ModBrewingProvider extends AbstractBrewingProvider {

    public ModBrewingProvider(BootstrapContext<Recipe<?>> recipeOutput, BootstrapContext<Advancement> advancementOutput) {
        super(recipeOutput, advancementOutput);
    }

    @Override
    protected void buildMixes() {
        this.buildStartMix(ItemRegistry.CELESTITE_SHARD.value(), Potions.STRENGTH);
        this.buildStartMix(ItemRegistry.PINK_TOPAZ_SHARD.value(), Potions.LUCK);
        this.buildStartMix(ItemRegistry.WRAPPIST_SHARD.value(), PotionRegistry.HASTE);
        this.buildMix(PotionRegistry.HASTE, Items.REDSTONE, PotionRegistry.LONG_HASTE);
        this.buildMix(PotionRegistry.HASTE, Items.GLOWSTONE_DUST, PotionRegistry.STRONG_HASTE);
    }
}
