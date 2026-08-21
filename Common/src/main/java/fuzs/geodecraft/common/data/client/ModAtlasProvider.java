package fuzs.geodecraft.common.data.client;

import fuzs.puzzleslib.api.client.data.v2.AbstractAtlasProvider;
import fuzs.puzzleslib.api.data.v2.core.DataProviderContext;
import fuzs.geodecraft.common.client.renderer.blockentity.PedestalRenderer;

public class ModAtlasProvider extends AbstractAtlasProvider {

    public ModAtlasProvider(DataProviderContext context) {
        super(context);
    }

    @Override
    public void addAtlases() {
        this.addMaterial(PedestalRenderer.MATERIAL);
    }
}
