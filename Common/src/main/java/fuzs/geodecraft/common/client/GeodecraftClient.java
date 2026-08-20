package fuzs.geodecraft.common.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.math.Axis;
import fuzs.puzzleslib.api.client.core.v1.ClientModConstructor;
import fuzs.puzzleslib.api.client.core.v1.context.BlockEntityRenderersContext;
import fuzs.puzzleslib.api.client.core.v1.context.BuiltinModelItemRendererContext;
import fuzs.puzzleslib.api.client.core.v1.context.LayerDefinitionsContext;
import fuzs.puzzleslib.api.client.core.v1.context.RenderTypesContext;
import fuzs.puzzleslib.api.client.init.v1.ReloadingBuiltInItemRenderer;
import fuzs.puzzleslib.api.core.v1.ContentRegistrationFlags;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.ItemRenderer;
import net.minecraft.server.packs.resources.ResourceManager;
import net.minecraft.world.item.ItemDisplayContext;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.yeoxuhang.geode_plus.client.GeodePlusClient;
import net.yeoxuhang.geode_plus.client.model.WrappistPedestalBlockEntityModel;
import net.yeoxuhang.geode_plus.client.render.WrappistPedestalBlockEntityRenderer;
import net.yeoxuhang.geode_plus.server.registry.BlockEntityRegistry;
import net.yeoxuhang.geode_plus.server.registry.ItemRegistry;

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

    @Override
    public void onRegisterBuiltinModelItemRenderers(BuiltinModelItemRendererContext context) {
        context.registerItemRenderer(ItemRegistry.WRAPPIST_PEDESTAL.value(), new ReloadingBuiltInItemRenderer() {
            private WrappistPedestalBlockEntityModel model;

            @Override
            public void renderByItem(ItemStack itemStack, ItemDisplayContext itemDisplayContext, PoseStack poseStack, MultiBufferSource bufferSource, int lightCoords, int packedOverlay) {
                poseStack.pushPose();
                float scale = 16.0F / 14.0F;
                poseStack.scale(scale, scale, scale);
                poseStack.translate(0.8F, 1.0F, 0.0F);
                poseStack.mulPose(Axis.XP.rotationDegrees(-180.0F));
                VertexConsumer vertexConsumer = ItemRenderer.getFoilBufferDirect(bufferSource,
                        this.model.renderType(WrappistPedestalBlockEntityRenderer.TEXTURE_LOCATION),
                        false,
                        itemStack.hasFoil());
                this.model.renderToBuffer(poseStack, vertexConsumer, lightCoords, packedOverlay);
                poseStack.popPose();
            }

            @Override
            public void onResourceManagerReload(ResourceManager resourceManager) {
                this.model = new WrappistPedestalBlockEntityModel(Minecraft.getInstance()
                        .getEntityModels()
                        .bakeLayer(GeodePlusClient.WRAPPIST_PEDESTAL));
            }
        });
    }

    @Override
    public ContentRegistrationFlags[] getContentRegistrationFlags() {
        return new ContentRegistrationFlags[]{ContentRegistrationFlags.DYNAMIC_RENDERERS};
    }
}
