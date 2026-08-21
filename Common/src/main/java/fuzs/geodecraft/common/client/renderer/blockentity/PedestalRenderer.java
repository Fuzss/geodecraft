package fuzs.geodecraft.common.client.renderer.blockentity;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.math.Axis;
import fuzs.geodecraft.common.Geodecraft;
import fuzs.geodecraft.common.world.level.block.entity.PedestalBlockEntity;
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
import net.minecraft.client.renderer.blockentity.VaultRenderer;
import net.minecraft.client.renderer.entity.ItemEntityRenderer;
import net.minecraft.client.renderer.entity.ItemRenderer;
import net.minecraft.client.renderer.texture.TextureAtlas;
import net.minecraft.client.resources.model.Material;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraft.world.item.ItemStack;

public class PedestalRenderer implements BlockEntityRenderer<PedestalBlockEntity> {
    static final ModelLayerFactory FACTORY = ModelLayerFactory.from(Geodecraft.MOD_ID);
    public static final ModelLayerLocation PEDESTAL = FACTORY.registerModelLayer("pedestal");
    public static final Material MATERIAL = new Material(TextureAtlas.LOCATION_BLOCKS,
            Geodecraft.id("entity/pedestal/pedestal_crystals"));

    private final ItemRenderer itemRenderer;
    private final ModelPart crystals;
    private final RandomSource random = RandomSource.create();

    public PedestalRenderer(BlockEntityRendererProvider.Context context) {
        this.itemRenderer = context.getItemRenderer();
        this.crystals = context.bakeLayer(PEDESTAL).getChild("crystals");
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
    public void render(PedestalBlockEntity blockEntity, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, int lightCoords, int packedOverlay) {
        this.renderCrystals(blockEntity, partialTick, poseStack, bufferSource, lightCoords, packedOverlay);
        this.renderItem(blockEntity, partialTick, poseStack, bufferSource, lightCoords);
    }

    private void renderCrystals(PedestalBlockEntity blockEntity, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, int lightCoords, int packedOverlay) {
        poseStack.pushPose();
        float time = blockEntity.getTime(partialTick);
        this.crystals.yRot = -(time / 35.0F) % 360.0F;
        poseStack.mulPose(Axis.XP.rotationDegrees(-180.0F));
        VertexConsumer vertexConsumer = MATERIAL.buffer(bufferSource, RenderType::entityCutoutNoCull);
        this.crystals.render(poseStack, vertexConsumer, lightCoords, packedOverlay);
        poseStack.popPose();
    }

    private void renderItem(PedestalBlockEntity blockEntity, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, int lightCoords) {
        if (blockEntity.getLevel() != null) {
            ItemStack item = blockEntity.getItem(0);
            if (!item.isEmpty()) {
                this.random.setSeed(ItemEntityRenderer.getSeedForItemStack(item));
                poseStack.pushPose();
                float time = blockEntity.getTime(partialTick);
                float offsetY = Mth.sin(time / 8.0F) * 0.025F;
                poseStack.translate(0.0F, offsetY + 0.3125F, -0.0F);
                VaultRenderer.renderItemInside(1.0F,
                        blockEntity.getLevel(),
                        poseStack,
                        bufferSource,
                        lightCoords,
                        item,
                        this.itemRenderer,
                        0.0F,
                        Mth.wrapDegrees(time / 2.0F),
                        this.random);
                poseStack.popPose();
            }
        }
    }
}
