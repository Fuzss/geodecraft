package fuzs.geodecraft.neoforge.client;

import fuzs.geodecraft.common.Geodecraft;
import fuzs.geodecraft.common.client.GeodecraftClient;
import fuzs.puzzleslib.api.client.core.v1.ClientModConstructor;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.fml.common.Mod;

@Mod(value = Geodecraft.MOD_ID, dist = Dist.CLIENT)
public class GeodecraftNeoForgeClient {

    public GeodecraftNeoForgeClient() {
        ClientModConstructor.construct(Geodecraft.MOD_ID, GeodecraftClient::new);
    }
}
