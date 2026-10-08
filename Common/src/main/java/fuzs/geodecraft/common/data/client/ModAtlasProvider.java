package fuzs.geodecraft.common.data.client;

import fuzs.geodecraft.common.client.renderer.blockentity.PedestalRenderer;
import fuzs.puzzleslib.common.api.client.data.v3.atlas.AbstractAtlasProvider;
import fuzs.puzzleslib.common.api.data.v3.core.DataProviderContext;

public class ModAtlasProvider extends AbstractAtlasProvider {

    public ModAtlasProvider(DataProviderContext context) {
        super(context);
    }

    @Override
    public void addAtlases() {
        this.addMaterial(PedestalRenderer.MATERIAL);
    }
}
