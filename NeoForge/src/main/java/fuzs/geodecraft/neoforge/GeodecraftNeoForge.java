package fuzs.geodecraft.neoforge;

import fuzs.geodecraft.common.Geodecraft;
import fuzs.geodecraft.common.data.ModRecipeProvider;
import fuzs.geodecraft.common.data.loot.ModBlockLootProvider;
import fuzs.geodecraft.common.data.tags.BiomeTagsProvider;
import fuzs.geodecraft.common.data.tags.ModBlockTagsProvider;
import fuzs.geodecraft.common.data.tags.ModItemTagsProvider;
import fuzs.puzzleslib.api.core.v1.ModConstructor;
import fuzs.puzzleslib.neoforge.api.data.v2.core.DataProviderHelper;
import net.neoforged.fml.common.Mod;
import fuzs.geodecraft.common.init.ModRegistry;

@Mod(Geodecraft.MOD_ID)
public class GeodecraftNeoForge {

    public GeodecraftNeoForge() {
        ModConstructor.construct(Geodecraft.MOD_ID, Geodecraft::new);
        DataProviderHelper.registerDataProviders(Geodecraft.MOD_ID,
                ModRegistry.BUILDER,
                ModBlockLootProvider::new,
                BiomeTagsProvider::new,
                ModBlockTagsProvider::new,
                ModItemTagsProvider::new,
                ModRecipeProvider::new);
    }
}
