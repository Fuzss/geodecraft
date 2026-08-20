package net.yeoxuhang.geode_plus;

import fuzs.geodecraft.common.Geodecraft;
import fuzs.puzzleslib.api.data.v2.AbstractRecipeProvider;
import fuzs.puzzleslib.api.data.v2.core.DataProviderContext;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import net.yeoxuhang.geode_plus.server.registry.ItemRegistry;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GeodePlusRecipeProvider extends AbstractRecipeProvider {

    public GeodePlusRecipeProvider(DataProviderContext context) {
        super(context);
    }

    @Override
    public void addRecipes(RecipeOutput output) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.GUNPOWDER, 4)
                .requires(ItemRegistry.CELESTITE_SHARD.value())
                .unlockedBy("has_celestite", has(ItemRegistry.CELESTITE_SHARD.value()))
                .save(output);
        crystalGlassFromGlassAndCrystal(output,
                ItemRegistry.WRAPPIST_GLASS.value(),
                ItemRegistry.WRAPPIST_SHARD.value());
        crystalGlassFromGlassAndCrystal(output,
                ItemRegistry.CELESTITE_GLASS.value(),
                ItemRegistry.CELESTITE_SHARD.value());
        crystalGlassFromGlassAndCrystal(output, ItemRegistry.PINK_TOPAZ_GLASS.value(), ItemRegistry.PINK_TOPAZ.value());

        crystalsFromCrystalsBlocks(output, ItemRegistry.WRAPPIST_SHARD.value(), ItemRegistry.WRAPPIST_BLOCK.value(), 4);
        crystalsFromCrystalsBlocks(output, ItemRegistry.PINK_TOPAZ.value(), ItemRegistry.PINK_TOPAZ_BLOCK.value(), 4);
        crystalsFromCrystalsBlocks(output,
                ItemRegistry.CELESTITE_SHARD.value(),
                ItemRegistry.CELESTITE_BLOCK.value(),
                4);
        crystalsFromCrystalsBlocks(output, Items.DIAMOND, ItemRegistry.DIAMOND_CRYSTAL_BLOCK.value(), 4);
        crystalsFromCrystalsBlocks(output, Items.EMERALD, ItemRegistry.EMERALD_CLUSTER_BLOCK.value(), 4);
        crystalsFromCrystalsBlocks(output, Items.LAPIS_LAZULI, ItemRegistry.LAPIS_CLUSTER_BLOCK.value(), 4);
        crystalsFromCrystalsBlocks(output, Items.REDSTONE, ItemRegistry.REDSTONE_CRYSTAL_BLOCK.value(), 4);
        crystalsFromCrystalsBlocks(output, Items.GLOWSTONE_DUST, ItemRegistry.GLOWSTONE_CLUSTER_BLOCK.value(), 4);
        crystalsFromCrystalsBlocks(output, Items.PRISMARINE_SHARD, ItemRegistry.PRISMARINE_CLUSTER_BLOCK.value(), 4);
        crystalsFromCrystalsBlocks(output, Items.QUARTZ, ItemRegistry.QUARTZ_CRYSTAL_BLOCK.value(), 4);
        crystalsFromCrystalsBlocks(output, Items.NETHERITE_SCRAP, ItemRegistry.ANCIENT_DEBRIS_CLUSTER_BLOCK.value(), 4);
        crystalsFromCrystalsBlocks(output, Items.GOLD_NUGGET, ItemRegistry.GOLD_NUGGET_CLUSTER_BLOCK.value(), 4);
        crystalsFromCrystalsBlocks(output, Items.ECHO_SHARD, ItemRegistry.ECHO_CRYSTAL_BLOCK.value(), 4);
        crystalsFromCrystalsBlocks(output, Items.AMETHYST_SHARD, Blocks.AMETHYST_BLOCK, 4);
        twoByTwoPacker(output,
                RecipeCategory.BUILDING_BLOCKS,
                ItemRegistry.PINK_TOPAZ_BLOCK.value(),
                ItemRegistry.PINK_TOPAZ.value());
        twoByTwoPacker(output,
                RecipeCategory.BUILDING_BLOCKS,
                ItemRegistry.CELESTITE_BLOCK.value(),
                ItemRegistry.CELESTITE_SHARD.value());
        twoByTwoPacker(output,
                RecipeCategory.BUILDING_BLOCKS,
                ItemRegistry.ANCIENT_DEBRIS_CLUSTER_BLOCK.value(),
                ItemRegistry.ANCIENT_DEBRIS_CLUSTER.value());
        twoByTwoPacker(output,
                RecipeCategory.BUILDING_BLOCKS,
                ItemRegistry.DIAMOND_CRYSTAL_BLOCK.value(),
                ItemRegistry.DIAMOND_CRYSTAL.value());
        twoByTwoPacker(output,
                RecipeCategory.BUILDING_BLOCKS,
                ItemRegistry.EMERALD_CLUSTER_BLOCK.value(),
                ItemRegistry.EMERALD_CLUSTER.value());
        twoByTwoPacker(output,
                RecipeCategory.BUILDING_BLOCKS,
                ItemRegistry.LAPIS_CLUSTER_BLOCK.value(),
                ItemRegistry.LAPIS_CLUSTER.value());
        twoByTwoPacker(output,
                RecipeCategory.BUILDING_BLOCKS,
                ItemRegistry.REDSTONE_CRYSTAL_BLOCK.value(),
                ItemRegistry.REDSTONE_CRYSTAL.value());
        twoByTwoPacker(output,
                RecipeCategory.BUILDING_BLOCKS,
                ItemRegistry.ECHO_CRYSTAL_BLOCK.value(),
                ItemRegistry.ECHO_CRYSTAL.value());

        twoByTwoPacker(output,
                RecipeCategory.BUILDING_BLOCKS,
                ItemRegistry.WRAPPIST_BLOCK.value(),
                ItemRegistry.WRAPPIST_SHARD.value());
        twoByTwoPacker(output,
                RecipeCategory.BUILDING_BLOCKS,
                ItemRegistry.GLOWSTONE_CLUSTER_BLOCK.value(),
                ItemRegistry.GLOWSTONE_CLUSTER.value());
        twoByTwoPacker(output,
                RecipeCategory.BUILDING_BLOCKS,
                ItemRegistry.PRISMARINE_CLUSTER_BLOCK.value(),
                ItemRegistry.PRISMARINE_CLUSTER.value());
        twoByTwoPacker(output,
                RecipeCategory.BUILDING_BLOCKS,
                ItemRegistry.GOLD_NUGGET_CLUSTER_BLOCK.value(),
                ItemRegistry.GOLD_NUGGET_CLUSTER.value());
        twoByTwoPacker(output,
                RecipeCategory.BUILDING_BLOCKS,
                ItemRegistry.QUARTZ_CRYSTAL_BLOCK.value(),
                ItemRegistry.QUARTZ_CRYSTAL.value());
        wall(output,
                RecipeCategory.BUILDING_BLOCKS,
                ItemRegistry.SMOOTH_END_STONE_WALL.value(),
                ItemRegistry.SMOOTH_END_STONE.value());
        slabBuilder(RecipeCategory.BUILDING_BLOCKS,
                ItemRegistry.SMOOTH_END_STONE_SLAB.value(),
                Ingredient.of(ItemRegistry.SMOOTH_END_STONE.value())).unlockedBy("has_smooth_end_stone",
                has(ItemRegistry.SMOOTH_END_STONE.value())).save(output);
        stairBuilder(ItemRegistry.SMOOTH_END_STONE_STAIRS.value(),
                Ingredient.of(ItemRegistry.SMOOTH_END_STONE.value())).unlockedBy("has_smooth_end_stone",
                has(ItemRegistry.SMOOTH_END_STONE.value())).save(output);
        wall(output, RecipeCategory.BUILDING_BLOCKS, ItemRegistry.GALCITE_WALL.value(), ItemRegistry.GALCITE.value());
        slabBuilder(RecipeCategory.BUILDING_BLOCKS,
                ItemRegistry.GALCITE_SLAB.value(),
                Ingredient.of(ItemRegistry.GALCITE.value())).unlockedBy("has_galcite",
                has(ItemRegistry.GALCITE.value())).save(output);
        stairBuilder(ItemRegistry.GALCITE_STAIRS.value(), Ingredient.of(ItemRegistry.GALCITE.value())).unlockedBy(
                "has_galcite",
                has(ItemRegistry.SMOOTH_END_STONE.value())).save(output);

        stonecutterResultFromBase(output,
                RecipeCategory.BUILDING_BLOCKS,
                ItemRegistry.SMOOTH_END_STONE_STAIRS.value(),
                ItemRegistry.SMOOTH_END_STONE.value());
        stonecutterResultFromBase(output,
                RecipeCategory.BUILDING_BLOCKS,
                ItemRegistry.SMOOTH_END_STONE_SLAB.value(),
                ItemRegistry.SMOOTH_END_STONE.value(),
                2);
        stonecutterResultFromBase(output,
                RecipeCategory.BUILDING_BLOCKS,
                ItemRegistry.SMOOTH_END_STONE_WALL.value(),
                ItemRegistry.SMOOTH_END_STONE.value());
        stonecutterResultFromBase(output,
                RecipeCategory.BUILDING_BLOCKS,
                ItemRegistry.GALCITE_STAIRS.value(),
                ItemRegistry.GALCITE.value());
        stonecutterResultFromBase(output,
                RecipeCategory.BUILDING_BLOCKS,
                ItemRegistry.GALCITE_SLAB.value(),
                ItemRegistry.GALCITE.value(),
                2);
        stonecutterResultFromBase(output,
                RecipeCategory.BUILDING_BLOCKS,
                ItemRegistry.GALCITE_WALL.value(),
                ItemRegistry.GALCITE.value());

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Blocks.END_STONE),
                RecipeCategory.BUILDING_BLOCKS,
                ItemRegistry.SMOOTH_END_STONE.value().asItem().asItem(),
                0.1F,
                200).unlockedBy("has_end_stone", has(Blocks.END_STONE)).save(output);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ItemRegistry.WRAPPIST_PEDESTAL.value())
                .define('#', Blocks.END_STONE_BRICKS)
                .define('O', Items.PRISMARINE_SHARD)
                .define('W', ItemRegistry.WRAPPIST_SHARD.value())
                .pattern("W W")
                .pattern("O#O")
                .unlockedBy("has_wrappist_shard", has(ItemRegistry.WRAPPIST_SHARD.value()))
                .save(output);

        copySmithingTemplate(output,
                ItemRegistry.WRAP_ARMOR_TRIM_SMITHING_TEMPLATE.value(),
                ItemRegistry.WRAPPIST_BLOCK.value());
        copySmithingTemplate(output,
                ItemRegistry.CELESTE_ARMOR_TRIM_SMITHING_TEMPLATE.value(),
                ItemRegistry.CELESTITE_BLOCK.value());
        copySmithingTemplate(output,
                ItemRegistry.HEART_ARMOR_TRIM_SMITHING_TEMPLATE.value(),
                ItemRegistry.PINK_TOPAZ_BLOCK.value());

        smithingTrims().forEach((arg, arg2) -> {
            trimSmithing(output, arg, arg2);
        });
    }

    protected static void crystalsFromCrystalsBlocks(RecipeOutput consumer, ItemLike arg, ItemLike arg2, int i) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, arg, i)
                .requires(arg2)
                .group("crystals")
                .unlockedBy("has_crystal_block", has(arg2))
                .save(consumer, getItemName(arg2) + "_to_" + getItemName(arg));
    }

    protected static void crystalGlassFromGlassAndCrystal(RecipeOutput consumer, ItemLike arg, ItemLike arg2) {
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, arg, 8)
                .define('#', Blocks.GLASS)
                .define('X', arg2)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .group("crystal_glass")
                .unlockedBy("has_for_glass_crystal", has(Blocks.GLASS))
                .save(consumer);
    }

    public static Map<Item, ResourceLocation> smithingTrims() {
        return Stream.of(ItemRegistry.WRAP_ARMOR_TRIM_SMITHING_TEMPLATE.value(),
                        ItemRegistry.CELESTE_ARMOR_TRIM_SMITHING_TEMPLATE.value(),
                        ItemRegistry.HEART_ARMOR_TRIM_SMITHING_TEMPLATE.value())
                .collect(Collectors.toMap(Function.identity(), (item) -> {
                    return Geodecraft.id(getItemName(item) + "_smithing_trim");
                }));
    }
}
