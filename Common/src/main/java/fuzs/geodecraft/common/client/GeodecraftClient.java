package fuzs.geodecraft.common.client;

import fuzs.puzzleslib.api.client.core.v1.ClientModConstructor;
import fuzs.puzzleslib.api.client.core.v1.context.BlockEntityRenderersContext;
import fuzs.puzzleslib.api.client.core.v1.context.LayerDefinitionsContext;
import fuzs.puzzleslib.api.client.core.v1.context.RenderTypesContext;
import net.minecraft.world.level.block.Block;
import net.yeoxuhang.geode_plus.client.GeodePlusClient;
import net.yeoxuhang.geode_plus.client.model.WrappistPedestalBlockEntityModel;
import net.yeoxuhang.geode_plus.client.render.WrappistPedestalBlockEntityRenderer;
import net.yeoxuhang.geode_plus.server.registry.BlockEntityRegistry;

public class GeodecraftClient implements ClientModConstructor {
    @Override
    public void onRegisterBlockEntityRenderers(BlockEntityRenderersContext context) {
        context.registerBlockEntityRenderer(BlockEntityRegistry.WRAPPIST_PEDESTAL.value(),
                WrappistPedestalBlockEntityRenderer::new);
    }

    @Override
    public void onRegisterLayerDefinitions(LayerDefinitionsContext context) {
        context.registerLayerDefinition(GeodePlusClient.WRAPPIST_PEDESTAL,
                WrappistPedestalBlockEntityModel::createBodyLayer);
    }

    @Override
    public void onRegisterBlockRenderTypes(RenderTypesContext<Block> context) {
        GeodePlusClient.renderTypes(map -> map.forEach(context::registerRenderType));
    }
}
