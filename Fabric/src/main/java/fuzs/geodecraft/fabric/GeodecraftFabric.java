package fuzs.geodecraft.fabric;

import fuzs.geodecraft.common.Geodecraft;
import fuzs.puzzleslib.api.core.v1.ModConstructor;
import net.fabricmc.api.ModInitializer;

public class GeodecraftFabric implements ModInitializer {

    @Override
    public void onInitialize() {
        ModConstructor.construct(Geodecraft.MOD_ID, Geodecraft::new);
    }
}
