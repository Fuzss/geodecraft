package fuzs.geodecraft.neoforge;

import fuzs.geodecraft.common.Geodecraft;
import fuzs.geodecraft.common.data.GeodePlusRecipeProvider;
import fuzs.geodecraft.common.data.loot.GeodePlusBlockLootTableProvider;
import fuzs.geodecraft.common.data.tags.GeodePlusBiomeTagProvider;
import fuzs.geodecraft.common.data.tags.GeodePlusBlockTagProvider;
import fuzs.geodecraft.common.data.tags.GeodePlusItemTagProvider;
import fuzs.puzzleslib.api.core.v1.ModConstructor;
import fuzs.puzzleslib.neoforge.api.data.v2.core.DataProviderHelper;
import net.neoforged.fml.common.Mod;
import net.yeoxuhang.geode_plus.server.registry.ModRegistry;

@Mod(Geodecraft.MOD_ID)
public class GeodecraftNeoForge {

    public GeodecraftNeoForge() {
        ModConstructor.construct(Geodecraft.MOD_ID, Geodecraft::new);
        DataProviderHelper.registerDataProviders(Geodecraft.MOD_ID,
                ModRegistry.BUILDER,
                GeodePlusBlockLootTableProvider::new,
                GeodePlusBiomeTagProvider::new,
                GeodePlusBlockTagProvider::new,
                GeodePlusItemTagProvider::new,
                GeodePlusRecipeProvider::new);
    }
}
