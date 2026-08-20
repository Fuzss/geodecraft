package fuzs.geodecraft.common.client.renderer.blockentity;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.math.Axis;
import fuzs.geodecraft.common.Geodecraft;
import fuzs.puzzleslib.api.client.init.v1.ModelLayerFactory;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.renderer.entity.ItemRenderer;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.client.renderer.texture.TextureAtlas;
import net.minecraft.client.resources.model.Material;
import net.minecraft.util.Mth;
import net.minecraft.world.item.ItemDisplayContext;
import net.minecraft.world.level.Level;
import net.yeoxuhang.geode_plus.server.block.entity.WrappistPedestalBlockEntity;

public class WrappistPedestalRenderer<T extends WrappistPedestalBlockEntity> implements BlockEntityRenderer<T> {
    static final ModelLayerFactory FACTORY = ModelLayerFactory.from(Geodecraft.MOD_ID);
    public static final ModelLayerLocation WRAPPIST_PEDESTAL = FACTORY.registerModelLayer("wrappist_pedestal");
    public static final Material MATERIAL = new Material(TextureAtlas.LOCATION_BLOCKS,
            Geodecraft.id("entity/wrappist_pedestal/wrappist_pedestal_crystals"));

    private final ItemRenderer itemRenderer;
    private final ModelPart crystals;

    public WrappistPedestalRenderer(BlockEntityRendererProvider.Context context) {
        this.itemRenderer = context.getItemRenderer();
        this.crystals = context.bakeLayer(WRAPPIST_PEDESTAL).getChild("crystals");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition mesh = new MeshDefinition();
        PartDefinition root = mesh.getRoot();

        PartDefinition crystals = root.addOrReplaceChild("crystals",
                CubeListBuilder.create(),
                PartPose.offset(8.0F, -14.0F, -8.0F));

        crystals.addOrReplaceChild("crystal1",
                CubeListBuilder.create().texOffs(0, 0).addBox(-2.5F, -3.0F, 0.0F, 5.0F, 8.0F, 0.0F),
                PartPose.offsetAndRotation(0.0F, -1.0F, -7.0F, Mth.PI / 8.0F, 0.0F, 0.0F));

        crystals.addOrReplaceChild("crystal2",
                CubeListBuilder.create().texOffs(0, 4).addBox(0.0F, -2.0F, -2.0F, 0.0F, 6.0F, 4.0F),
                PartPose.offsetAndRotation(-7.0F, -1.0F, 0.0F, 0.0F, 0.0F, -Mth.PI / 8.0F));

        crystals.addOrReplaceChild("crystal3",
                CubeListBuilder.create().texOffs(0, 0).addBox(-2.5F, -3.0F, 0.0F, 5.0F, 8.0F, 0.0F),
                PartPose.offsetAndRotation(0.0F, -1.0F, 7.0F, -Mth.PI / 8.0F, 0.0F, 0.0F));

        crystals.addOrReplaceChild("crystal4",
                CubeListBuilder.create().texOffs(0, 4).addBox(0.0F, -2.0F, -2.0F, 0.0F, 6.0F, 4.0F),
                PartPose.offsetAndRotation(7.0F, -1.0F, 0.0F, 0.0F, 0.0F, Mth.PI / 8.0F));

        return LayerDefinition.create(mesh, 16, 16);
    }

    @Override
    public void render(T blockEntity, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, int lightCoords, int packedOverlay) {
        // TODO the level may not be present, instead use a tick counter on the block entity client side
        Level world = blockEntity.getLevel();
        float gameTime = world.getGameTime() + partialTick;
        float offsetY = Mth.sin(gameTime / 8.0F) * 0.025F;
        float crystalTick = gameTime / 35.0F;
        float tick = gameTime / 10.0F;
        poseStack.mulPose(Axis.XP.rotationDegrees(-180.0F));
        this.crystals.yRot = -crystalTick % 360.0F;
        VertexConsumer vertexConsumer = MATERIAL.buffer(bufferSource, RenderType::entityCutoutNoCull);
        this.crystals.render(poseStack, vertexConsumer, lightCoords, packedOverlay);
        if (blockEntity.hasLevel() && !blockEntity.isEmpty()) {
            poseStack.pushPose();
            poseStack.translate(0.5, (double) offsetY - 1.0, -0.5);
            poseStack.scale(0.35F, 0.35F, 0.35F);
            poseStack.mulPose(Axis.YP.rotationDegrees(tick % 360.0F));
            poseStack.mulPose(Axis.XP.rotationDegrees(-180.0F));
            this.itemRenderer.renderStatic(blockEntity.getItem(0),
                    ItemDisplayContext.FIXED,
                    lightCoords,
                    OverlayTexture.NO_OVERLAY,
                    poseStack,
                    bufferSource,
                    blockEntity.getLevel(),
                    packedOverlay);
            poseStack.popPose();
        }
    }
}
