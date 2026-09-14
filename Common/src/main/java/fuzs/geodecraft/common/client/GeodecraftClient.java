package fuzs.geodecraft.common.client;

import fuzs.puzzleslib.common.api.client.core.v1.ClientModConstructor;
import fuzs.puzzleslib.common.api.client.core.v1.context.BlockEntityRenderersContext;
import fuzs.puzzleslib.common.api.client.core.v1.context.LayerDefinitionsContext;
import fuzs.geodecraft.common.client.renderer.blockentity.PedestalRenderer;
import fuzs.geodecraft.common.init.BlockEntityRegistry;

public class GeodecraftClient implements ClientModConstructor {
    @Override
    public void onRegisterBlockEntityRenderers(BlockEntityRenderersContext context) {
        context.registerBlockEntityRenderer(BlockEntityRegistry.PEDESTAL.value(),
                PedestalRenderer::new);
    }

    @Override
    public void onRegisterLayerDefinitions(LayerDefinitionsContext context) {
        context.registerLayerDefinition(PedestalRenderer.PEDESTAL, PedestalRenderer::createBodyLayer);
    }
}
