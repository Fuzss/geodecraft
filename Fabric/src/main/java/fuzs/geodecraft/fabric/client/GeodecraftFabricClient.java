package fuzs.geodecraft.fabric.client;

import fuzs.geodecraft.common.Geodecraft;
import fuzs.geodecraft.common.client.GeodecraftClient;
import fuzs.puzzleslib.api.client.core.v1.ClientModConstructor;
import net.fabricmc.api.ClientModInitializer;

public class GeodecraftFabricClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        ClientModConstructor.construct(Geodecraft.MOD_ID, GeodecraftClient::new);
    }
}
