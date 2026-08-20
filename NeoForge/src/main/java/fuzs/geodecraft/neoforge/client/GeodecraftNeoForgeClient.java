package fuzs.geodecraft.neoforge.client;

import fuzs.geodecraft.common.Geodecraft;
import fuzs.geodecraft.common.client.GeodecraftClient;
import fuzs.geodecraft.common.data.client.ModModelProvider;
import fuzs.geodecraft.common.data.client.ModLanguageProvider;
import fuzs.geodecraft.common.data.client.ModAtlasProvider;
import fuzs.puzzleslib.api.client.core.v1.ClientModConstructor;
import fuzs.puzzleslib.neoforge.api.data.v2.core.DataProviderHelper;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.fml.common.Mod;

@Mod(value = Geodecraft.MOD_ID, dist = Dist.CLIENT)
public class GeodecraftNeoForgeClient {

    public GeodecraftNeoForgeClient() {
        ClientModConstructor.construct(Geodecraft.MOD_ID, GeodecraftClient::new);
        DataProviderHelper.registerDataProviders(Geodecraft.MOD_ID,
                ModLanguageProvider::new,
                ModModelProvider::new,
                ModAtlasProvider::new);
    }
}
