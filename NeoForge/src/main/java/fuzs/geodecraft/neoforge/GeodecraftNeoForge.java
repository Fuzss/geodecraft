package fuzs.geodecraft.neoforge;

import fuzs.geodecraft.common.Geodecraft;
import fuzs.geodecraft.common.data.loot.ModBlockLootProvider;
import fuzs.geodecraft.common.data.loot.ModChestLootProvider;
import fuzs.geodecraft.common.data.recipes.ModBrewingProvider;
import fuzs.geodecraft.common.data.recipes.ModRecipeProvider;
import fuzs.geodecraft.common.data.tags.ModBiomeTagsProvider;
import fuzs.geodecraft.common.data.tags.ModBlockTagsProvider;
import fuzs.geodecraft.common.data.tags.ModItemTagsProvider;
import fuzs.geodecraft.common.init.FeatureRegistry;
import fuzs.geodecraft.common.init.PlacedFeatureRegistry;
import fuzs.geodecraft.common.init.TrimMaterialRegistry;
import fuzs.geodecraft.common.init.TrimPatternRegistry;
import fuzs.puzzleslib.common.api.core.v1.ModConstructor;
import fuzs.puzzleslib.neoforge.api.data.v3.core.DataProviderBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.server.packs.PackType;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.neoforged.fml.common.Mod;

@Mod(Geodecraft.MOD_ID)
public class GeodecraftNeoForge {

    public GeodecraftNeoForge() {
        ModConstructor.construct(Geodecraft.MOD_ID, Geodecraft::new);
        DataProviderBuilder.of(Geodecraft.MOD_ID)
                .addWorldBootstrap(Registries.FEATURE, FeatureRegistry::bootstrap)
                .addWorldBootstrap(Registries.PLACED_FEATURE, PlacedFeatureRegistry::bootstrap)
                .addWorldBootstrap(Registries.TRIM_MATERIAL, TrimMaterialRegistry::bootstrap)
                .addWorldBootstrap(Registries.TRIM_PATTERN, TrimPatternRegistry::bootstrap)
                .addLootProvider(ModBlockLootProvider::new, LootContextParamSets.BLOCK)
                .addLootProvider(ModChestLootProvider::new, LootContextParamSets.CHEST)
                .addProvider(ModBiomeTagsProvider::new, ModBlockTagsProvider::new, ModItemTagsProvider::new)
                .addRecipeProvider(ModRecipeProvider::new)
                .addRecipeProvider(ModBrewingProvider::new);
        DataProviderBuilder.ofBuiltIn(Geodecraft.SILK_TOUCH_BUDDING_BLOCKS_ID, PackType.SERVER_DATA)
                .addLootProvider(ModBlockLootProvider.SilkTouchBuddingBlocks::new, LootContextParamSets.BLOCK);
    }
}
