package fuzs.geodecraft.common.data;

import fuzs.geodecraft.common.Geodecraft;
import fuzs.geodecraft.common.init.ItemRegistry;
import fuzs.puzzleslib.api.data.v2.AbstractRecipeProvider;
import fuzs.puzzleslib.api.data.v2.core.DataProviderContext;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder;
import net.minecraft.data.recipes.packs.VanillaRecipeProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ModRecipeProvider extends AbstractRecipeProvider {

    public ModRecipeProvider(DataProviderContext context) {
        super(context);
    }

    @Override
    public void addRecipes(RecipeOutput output) {
        luminousGlass(output, ItemRegistry.WRAPPIST_GLASS.value(), ItemRegistry.WRAPPIST_SHARD.value());
        luminousGlass(output, ItemRegistry.CELESTITE_GLASS.value(), ItemRegistry.CELESTITE_SHARD.value());
        luminousGlass(output, ItemRegistry.PINK_TOPAZ_GLASS.value(), ItemRegistry.PINK_TOPAZ_SHARD.value());

        crystalUnpacker(output, ItemRegistry.WRAPPIST_SHARD.value(), ItemRegistry.WRAPPIST_BLOCK.value());
        crystalUnpacker(output, ItemRegistry.PINK_TOPAZ_SHARD.value(), ItemRegistry.PINK_TOPAZ_BLOCK.value());
        crystalUnpacker(output, ItemRegistry.CELESTITE_SHARD.value(), ItemRegistry.CELESTITE_BLOCK.value());
        crystalUnpacker(output, Items.DIAMOND, ItemRegistry.DIAMOND_CRYSTAL_BLOCK.value());
        crystalUnpacker(output, Items.EMERALD, ItemRegistry.EMERALD_CRYSTAL_BLOCK.value());
        crystalUnpacker(output, Items.LAPIS_LAZULI, ItemRegistry.LAPIS_LAZULI_CRYSTAL_BLOCK.value());
        crystalUnpacker(output, Items.REDSTONE, ItemRegistry.REDSTONE_CRYSTAL_BLOCK.value());
        crystalUnpacker(output, Items.GLOWSTONE_DUST, ItemRegistry.GLOWSTONE_CRYSTAL_BLOCK.value());
        crystalUnpacker(output, Items.PRISMARINE_SHARD, ItemRegistry.PRISMARINE_CRYSTAL_BLOCK.value());
        crystalUnpacker(output, Items.QUARTZ, ItemRegistry.NETHER_QUARTZ_CRYSTAL_BLOCK.value());
        crystalUnpacker(output, Items.NETHERITE_SCRAP, ItemRegistry.ANCIENT_DEBRIS_CRYSTAL_BLOCK.value());
        crystalUnpacker(output, Items.GOLD_NUGGET, ItemRegistry.NETHER_GOLD_CRYSTAL_BLOCK.value());
        crystalUnpacker(output, Items.ECHO_SHARD, ItemRegistry.ECHO_CRYSTAL_BLOCK.value());
        crystalUnpacker(output, Items.AMETHYST_SHARD, Blocks.AMETHYST_BLOCK);

        twoByTwoPacker(output,
                RecipeCategory.BUILDING_BLOCKS,
                ItemRegistry.PINK_TOPAZ_BLOCK.value(),
                ItemRegistry.PINK_TOPAZ_SHARD.value());
        twoByTwoPacker(output,
                RecipeCategory.BUILDING_BLOCKS,
                ItemRegistry.CELESTITE_BLOCK.value(),
                ItemRegistry.CELESTITE_SHARD.value());
        twoByTwoPacker(output,
                RecipeCategory.BUILDING_BLOCKS,
                ItemRegistry.WRAPPIST_BLOCK.value(),
                ItemRegistry.WRAPPIST_SHARD.value());

        twoByTwoPacker(output,
                RecipeCategory.BUILDING_BLOCKS,
                ItemRegistry.PRISMARINE_CRYSTAL_BLOCK.value(),
                ItemRegistry.PRISMARINE_CRYSTAL.value());
        twoByTwoPacker(output,
                RecipeCategory.BUILDING_BLOCKS,
                ItemRegistry.DIAMOND_CRYSTAL_BLOCK.value(),
                ItemRegistry.DIAMOND_CRYSTAL.value());
        twoByTwoPacker(output,
                RecipeCategory.BUILDING_BLOCKS,
                ItemRegistry.EMERALD_CRYSTAL_BLOCK.value(),
                ItemRegistry.EMERALD_CRYSTAL.value());
        twoByTwoPacker(output,
                RecipeCategory.BUILDING_BLOCKS,
                ItemRegistry.LAPIS_LAZULI_CRYSTAL_BLOCK.value(),
                ItemRegistry.LAPIS_LAZULI_CRYSTAL.value());
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
                ItemRegistry.GLOWSTONE_CRYSTAL_BLOCK.value(),
                ItemRegistry.GLOWSTONE_CRYSTAL.value());
        twoByTwoPacker(output,
                RecipeCategory.BUILDING_BLOCKS,
                ItemRegistry.NETHER_GOLD_CRYSTAL_BLOCK.value(),
                ItemRegistry.NETHER_GOLD_CRYSTAL.value());
        twoByTwoPacker(output,
                RecipeCategory.BUILDING_BLOCKS,
                ItemRegistry.NETHER_QUARTZ_CRYSTAL_BLOCK.value(),
                ItemRegistry.NETHER_QUARTZ_CRYSTAL.value());
        twoByTwoPacker(output,
                RecipeCategory.BUILDING_BLOCKS,
                ItemRegistry.ANCIENT_DEBRIS_CRYSTAL_BLOCK.value(),
                ItemRegistry.ANCIENT_DEBRIS_CRYSTAL.value());

        slabBuilder(RecipeCategory.BUILDING_BLOCKS,
                ItemRegistry.SMOOTH_END_STONE_SLAB.value(),
                Ingredient.of(ItemRegistry.SMOOTH_END_STONE.value())).unlockedBy(getHasName(ItemRegistry.SMOOTH_END_STONE.value()),
                has(ItemRegistry.SMOOTH_END_STONE.value())).save(output);
        stairBuilder(ItemRegistry.SMOOTH_END_STONE_STAIRS.value(),
                Ingredient.of(ItemRegistry.SMOOTH_END_STONE.value())).unlockedBy(getHasName(ItemRegistry.SMOOTH_END_STONE.value()),
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

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Blocks.END_STONE),
                RecipeCategory.BUILDING_BLOCKS,
                ItemRegistry.SMOOTH_END_STONE.value().asItem().asItem(),
                0.1F,
                200).unlockedBy(getHasName(Blocks.END_STONE), has(Blocks.END_STONE)).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ItemRegistry.WRAPPIST_PEDESTAL.value())
                .define('#', Blocks.END_STONE_BRICKS)
                .define('O', Items.PRISMARINE_SHARD)
                .define('W', ItemRegistry.WRAPPIST_SHARD.value())
                .pattern("W W")
                .pattern("O#O")
                .unlockedBy(getHasName(ItemRegistry.WRAPPIST_SHARD.value()), has(ItemRegistry.WRAPPIST_SHARD.value()))
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

        smithingTrims().forEach((Item ingredient, ResourceLocation id) -> {
            trimSmithing(output, ingredient, id);
        });
    }

    protected static void crystalUnpacker(RecipeOutput recipeOutput, ItemLike result, ItemLike material) {
        oneToOneConversionRecipe(recipeOutput, result, material, "crystals", 4);
    }

    protected static void luminousGlass(RecipeOutput recipeOutput, ItemLike result, ItemLike material) {
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, result, 2)
                .define('G', Blocks.GLASS)
                .define('S', material)
                .pattern(" S ")
                .pattern("SGS")
                .pattern(" S ")
                .group("luminous_glass")
                .unlockedBy(getHasName(material), has(material))
                .save(recipeOutput);
    }

    /**
     * @see VanillaRecipeProvider#smithingTrims()
     */
    public static Map<Item, ResourceLocation> smithingTrims() {
        return Stream.of(ItemRegistry.WRAP_ARMOR_TRIM_SMITHING_TEMPLATE.value(),
                        ItemRegistry.CELESTE_ARMOR_TRIM_SMITHING_TEMPLATE.value(),
                        ItemRegistry.HEART_ARMOR_TRIM_SMITHING_TEMPLATE.value())
                .collect(Collectors.toMap(Function.identity(), (Item item) -> {
                    return Geodecraft.id(getItemName(item) + "_smithing_trim");
                }));
    }
}
