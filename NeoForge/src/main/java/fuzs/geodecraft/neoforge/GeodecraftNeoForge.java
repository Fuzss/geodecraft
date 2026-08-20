package fuzs.geodecraft.neoforge;

import fuzs.geodecraft.common.Geodecraft;
import fuzs.puzzleslib.api.core.v1.ModConstructor;
import net.neoforged.fml.common.Mod;

@Mod(Geodecraft.MOD_ID)
public class GeodecraftNeoForge {

    public GeodecraftNeoForge() {
        ModConstructor.construct(Geodecraft.MOD_ID, Geodecraft::new);
    }
}
