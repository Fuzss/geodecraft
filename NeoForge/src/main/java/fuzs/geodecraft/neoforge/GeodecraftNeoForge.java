package fuzs.geodecraft.neoforge;

import fuzs.geodecraft.common.Geodecraft;
import fuzs.geodecraft.common.data.ModRecipeProvider;
import fuzs.geodecraft.common.data.loot.ModBlockLootProvider;
import fuzs.geodecraft.common.data.loot.ModChestLootProvider;
import fuzs.geodecraft.common.data.tags.ModBiomeTagsProvider;
import fuzs.geodecraft.common.data.tags.ModBlockTagsProvider;
import fuzs.geodecraft.common.data.tags.ModItemTagsProvider;
import fuzs.geodecraft.common.init.ModRegistry;
import fuzs.puzzleslib.api.core.v1.ModConstructor;
import fuzs.puzzleslib.neoforge.api.data.v2.core.DataProviderHelper;
import net.minecraft.server.packs.PackType;
import net.neoforged.fml.common.Mod;

@Mod(Geodecraft.MOD_ID)
public class GeodecraftNeoForge {

    public GeodecraftNeoForge() {
        ModConstructor.construct(Geodecraft.MOD_ID, Geodecraft::new);
        DataProviderHelper.registerDataProviders(Geodecraft.MOD_ID,
                ModRegistry.REGISTRIES_BUILDER,
                ModBlockLootProvider::new,
                ModChestLootProvider::new,
                ModBiomeTagsProvider::new,
                ModBlockTagsProvider::new,
                ModItemTagsProvider::new,
                ModRecipeProvider::new);
        DataProviderHelper.registerDataProviders(Geodecraft.SILK_TOUCH_BUDDING_BLOCKS_ID,
                PackType.SERVER_DATA,
                ModBlockLootProvider.SilkTouchBuddingBlocks::new);
    }
}
