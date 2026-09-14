package fuzs.geodecraft.common.data;

import com.mojang.datafixers.util.Pair;
import fuzs.geodecraft.common.init.ItemRegistry;
import fuzs.geodecraft.common.init.TrimPatternRegistry;
import fuzs.puzzleslib.common.api.data.v2.AbstractRecipeProvider;
import fuzs.puzzleslib.common.api.data.v2.core.DataProviderContext;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder;
import net.minecraft.data.recipes.packs.VanillaRecipeProvider;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.CookingBookCategory;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.equipment.trim.TrimPattern;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;

import java.util.stream.Stream;

public class ModRecipeProvider extends AbstractRecipeProvider {

    public ModRecipeProvider(DataProviderContext context) {
        super(context);
    }

    @Override
    public void addRecipes(RecipeOutput output) {
        this.luminousGlass(ItemRegistry.WRAPPIST_GLASS.value(), ItemRegistry.WRAPPIST_SHARD.value());
        this.luminousGlass(ItemRegistry.CELESTITE_GLASS.value(), ItemRegistry.CELESTITE_SHARD.value());
        this.luminousGlass(ItemRegistry.PINK_TOPAZ_GLASS.value(), ItemRegistry.PINK_TOPAZ_SHARD.value());

        this.crystalUnpacker(ItemRegistry.WRAPPIST_SHARD.value(), ItemRegistry.WRAPPIST_BLOCK.value());
        this.crystalUnpacker(ItemRegistry.PINK_TOPAZ_SHARD.value(), ItemRegistry.PINK_TOPAZ_BLOCK.value());
        this.crystalUnpacker(ItemRegistry.CELESTITE_SHARD.value(), ItemRegistry.CELESTITE_BLOCK.value());
        this.crystalUnpacker(Items.DIAMOND, ItemRegistry.DIAMOND_CRYSTAL_BLOCK.value());
        this.crystalUnpacker(Items.EMERALD, ItemRegistry.EMERALD_CRYSTAL_BLOCK.value());
        this.crystalUnpacker(Items.LAPIS_LAZULI, ItemRegistry.LAPIS_LAZULI_CRYSTAL_BLOCK.value());
        this.crystalUnpacker(Items.REDSTONE, ItemRegistry.REDSTONE_CRYSTAL_BLOCK.value());
        this.crystalUnpacker(Items.GLOWSTONE_DUST, ItemRegistry.GLOWSTONE_CRYSTAL_BLOCK.value());
        this.crystalUnpacker(Items.PRISMARINE_SHARD, ItemRegistry.PRISMARINE_CRYSTAL_BLOCK.value());
        this.crystalUnpacker(Items.QUARTZ, ItemRegistry.NETHER_QUARTZ_CRYSTAL_BLOCK.value());
        this.crystalUnpacker(Items.NETHERITE_SCRAP, ItemRegistry.ANCIENT_DEBRIS_CRYSTAL_BLOCK.value());
        this.crystalUnpacker(Items.GOLD_NUGGET, ItemRegistry.NETHER_GOLD_CRYSTAL_BLOCK.value());
        this.crystalUnpacker(Items.ECHO_SHARD, ItemRegistry.ECHO_CRYSTAL_BLOCK.value());
        this.crystalUnpacker(Items.AMETHYST_SHARD, Blocks.AMETHYST_BLOCK);

        this.twoByTwoPacker(RecipeCategory.BUILDING_BLOCKS,
                ItemRegistry.PINK_TOPAZ_BLOCK.value(),
                ItemRegistry.PINK_TOPAZ_SHARD.value());
        this.twoByTwoPacker(RecipeCategory.BUILDING_BLOCKS,
                ItemRegistry.CELESTITE_BLOCK.value(),
                ItemRegistry.CELESTITE_SHARD.value());
        this.twoByTwoPacker(RecipeCategory.BUILDING_BLOCKS,
                ItemRegistry.WRAPPIST_BLOCK.value(),
                ItemRegistry.WRAPPIST_SHARD.value());

        this.twoByTwoPacker(RecipeCategory.BUILDING_BLOCKS,
                ItemRegistry.PRISMARINE_CRYSTAL_BLOCK.value(),
                ItemRegistry.PRISMARINE_CRYSTAL.value());
        this.twoByTwoPacker(RecipeCategory.BUILDING_BLOCKS,
                ItemRegistry.DIAMOND_CRYSTAL_BLOCK.value(),
                ItemRegistry.DIAMOND_CRYSTAL.value());
        this.twoByTwoPacker(RecipeCategory.BUILDING_BLOCKS,
                ItemRegistry.EMERALD_CRYSTAL_BLOCK.value(),
                ItemRegistry.EMERALD_CRYSTAL.value());
        this.twoByTwoPacker(RecipeCategory.BUILDING_BLOCKS,
                ItemRegistry.LAPIS_LAZULI_CRYSTAL_BLOCK.value(),
                ItemRegistry.LAPIS_LAZULI_CRYSTAL.value());
        this.twoByTwoPacker(RecipeCategory.BUILDING_BLOCKS,
                ItemRegistry.REDSTONE_CRYSTAL_BLOCK.value(),
                ItemRegistry.REDSTONE_CRYSTAL.value());
        this.twoByTwoPacker(RecipeCategory.BUILDING_BLOCKS,
                ItemRegistry.ECHO_CRYSTAL_BLOCK.value(),
                ItemRegistry.ECHO_CRYSTAL.value());

        this.twoByTwoPacker(RecipeCategory.BUILDING_BLOCKS,
                ItemRegistry.GLOWSTONE_CRYSTAL_BLOCK.value(),
                ItemRegistry.GLOWSTONE_CRYSTAL.value());
        this.twoByTwoPacker(RecipeCategory.BUILDING_BLOCKS,
                ItemRegistry.NETHER_GOLD_CRYSTAL_BLOCK.value(),
                ItemRegistry.NETHER_GOLD_CRYSTAL.value());
        this.twoByTwoPacker(RecipeCategory.BUILDING_BLOCKS,
                ItemRegistry.NETHER_QUARTZ_CRYSTAL_BLOCK.value(),
                ItemRegistry.NETHER_QUARTZ_CRYSTAL.value());
        this.twoByTwoPacker(RecipeCategory.BUILDING_BLOCKS,
                ItemRegistry.ANCIENT_DEBRIS_CRYSTAL_BLOCK.value(),
                ItemRegistry.ANCIENT_DEBRIS_CRYSTAL.value());

        this.slabBuilder(RecipeCategory.BUILDING_BLOCKS,
                        ItemRegistry.SMOOTH_END_STONE_SLAB.value(),
                        Ingredient.of(ItemRegistry.SMOOTH_END_STONE.value()))
                .unlockedBy(getHasName(ItemRegistry.SMOOTH_END_STONE.value()),
                        this.has(ItemRegistry.SMOOTH_END_STONE.value()))
                .save(output);
        this.stairBuilder(ItemRegistry.SMOOTH_END_STONE_STAIRS.value(),
                        Ingredient.of(ItemRegistry.SMOOTH_END_STONE.value()))
                .unlockedBy(getHasName(ItemRegistry.SMOOTH_END_STONE.value()),
                        this.has(ItemRegistry.SMOOTH_END_STONE.value()))
                .save(output);

        this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,
                ItemRegistry.SMOOTH_END_STONE_STAIRS.value(),
                ItemRegistry.SMOOTH_END_STONE.value());
        this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,
                ItemRegistry.SMOOTH_END_STONE_SLAB.value(),
                ItemRegistry.SMOOTH_END_STONE.value(),
                2);

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Blocks.END_STONE),
                RecipeCategory.BUILDING_BLOCKS,
                CookingBookCategory.BLOCKS,
                ItemRegistry.SMOOTH_END_STONE.value().asItem(),
                0.1F,
                200).unlockedBy(getHasName(Blocks.END_STONE), this.has(Blocks.END_STONE)).save(output);

        ShapedRecipeBuilder.shaped(this.items(), RecipeCategory.BUILDING_BLOCKS, ItemRegistry.PEDESTAL.value())
                .define('#', Blocks.END_STONE_BRICKS)
                .define('O', Items.PRISMARINE_SHARD)
                .define('W', ItemRegistry.WRAPPIST_SHARD.value())
                .pattern("W W")
                .pattern("O#O")
                .unlockedBy(getHasName(ItemRegistry.WRAPPIST_SHARD.value()),
                        this.has(ItemRegistry.WRAPPIST_SHARD.value()))
                .save(output);

        this.copySmithingTemplate(ItemRegistry.WRAP_ARMOR_TRIM_SMITHING_TEMPLATE.value(),
                ItemRegistry.WRAPPIST_BLOCK.value());
        this.copySmithingTemplate(ItemRegistry.CELESTE_ARMOR_TRIM_SMITHING_TEMPLATE.value(),
                ItemRegistry.CELESTITE_BLOCK.value());
        this.copySmithingTemplate(ItemRegistry.HEART_ARMOR_TRIM_SMITHING_TEMPLATE.value(),
                ItemRegistry.PINK_TOPAZ_BLOCK.value());

        smithingTrims().forEach((VanillaRecipeProvider.TrimTemplate trimTemplate) -> {
            this.trimSmithing(trimTemplate.template(), trimTemplate.patternId(), trimTemplate.recipeId());
        });
    }

    protected void crystalUnpacker(ItemLike result, ItemLike material) {
        this.oneToOneConversionRecipe(result, material, "crystals", 4);
    }

    protected void luminousGlass(ItemLike result, ItemLike material) {
        ShapedRecipeBuilder.shaped(this.items(), RecipeCategory.BUILDING_BLOCKS, result, 2)
                .define('G', Blocks.GLASS)
                .define('S', material)
                .pattern(" S ")
                .pattern("SGS")
                .pattern(" S ")
                .group("luminous_glass")
                .unlockedBy(getHasName(material), this.has(material))
                .save(this.output);
    }

    /**
     * @see VanillaRecipeProvider#smithingTrims()
     */
    public static Stream<VanillaRecipeProvider.TrimTemplate> smithingTrims() {
        return Stream.of(new Pair<>(ItemRegistry.WRAP_ARMOR_TRIM_SMITHING_TEMPLATE.value(), TrimPatternRegistry.WRAP),
                        new Pair<>(ItemRegistry.CELESTE_ARMOR_TRIM_SMITHING_TEMPLATE.value(), TrimPatternRegistry.CELESTE),
                        new Pair<>(ItemRegistry.HEART_ARMOR_TRIM_SMITHING_TEMPLATE.value(), TrimPatternRegistry.HEART))
                .map((Pair<Item, ResourceKey<TrimPattern>> pair) -> {
                    Item item = pair.getFirst();
                    ResourceKey<TrimPattern> patternKey = pair.getSecond();
                    return new VanillaRecipeProvider.TrimTemplate(item,
                            patternKey,
                            ResourceKey.create(Registries.RECIPE,
                                    Identifier.withDefaultNamespace(getItemName(item) + "_smithing_trim")));
                });
    }
}
