package fuzs.geodecraft.common.client.renderer.blockentity;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Axis;
import fuzs.geodecraft.common.Geodecraft;
import fuzs.geodecraft.common.client.renderer.blockentity.state.PedestalRenderState;
import fuzs.geodecraft.common.world.level.block.entity.PedestalBlockEntity;
import fuzs.puzzleslib.common.api.client.init.v1.ModelLayerFactory;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.renderer.SubmitNodeCollector;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.renderer.blockentity.state.VaultRenderState;
import net.minecraft.client.renderer.entity.ItemEntityRenderer;
import net.minecraft.client.renderer.entity.state.ItemClusterRenderState;
import net.minecraft.client.renderer.feature.ModelFeatureRenderer;
import net.minecraft.client.renderer.item.ItemModelResolver;
import net.minecraft.client.renderer.rendertype.RenderTypes;
import net.minecraft.client.renderer.state.level.CameraRenderState;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.client.renderer.texture.TextureAtlas;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.client.resources.model.sprite.SpriteGetter;
import net.minecraft.client.resources.model.sprite.SpriteId;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraft.world.item.ItemDisplayContext;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.phys.Vec3;

public class PedestalRenderer implements BlockEntityRenderer<PedestalBlockEntity, PedestalRenderState> {
    static final ModelLayerFactory FACTORY = ModelLayerFactory.from(Geodecraft.MOD_ID);
    public static final ModelLayerLocation PEDESTAL = FACTORY.registerModelLayer("pedestal");
    public static final SpriteId MATERIAL = new SpriteId(TextureAtlas.LOCATION_BLOCKS,
            Geodecraft.id("entity/pedestal/pedestal_crystals"));

    private final ItemModelResolver itemModelResolver;
    private final SpriteGetter sprites;
    private final ModelPart crystals;
    private final RandomSource random = RandomSource.create();

    public PedestalRenderer(BlockEntityRendererProvider.Context context) {
        this.itemModelResolver = context.itemModelResolver();
        this.sprites = context.sprites();
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
    public PedestalRenderState createRenderState() {
        return new PedestalRenderState();
    }

    @Override
    public void extractRenderState(PedestalBlockEntity blockEntity, PedestalRenderState renderState, float partialTick, Vec3 cameraPos, ModelFeatureRenderer.CrumblingOverlay crumblingOverlay) {
        BlockEntityRenderer.super.extractRenderState(blockEntity,
                renderState,
                partialTick,
                cameraPos,
                crumblingOverlay);
        renderState.rotation = blockEntity.getTime(partialTick);
        ItemStack item = blockEntity.getItem(0);
        if (blockEntity.getLevel() != null && !item.isEmpty()) {
            ItemClusterRenderState displayItem = new ItemClusterRenderState();
            this.itemModelResolver.updateForTopItem(displayItem.item,
                    item,
                    ItemDisplayContext.GROUND,
                    blockEntity.getLevel(),
                    null,
                    0);
            displayItem.count = ItemClusterRenderState.getRenderedAmount(item.getCount());
            displayItem.seed = ItemClusterRenderState.getSeedForItemStack(item);
            renderState.displayItem = displayItem;
        }
    }

    @Override
    public void submit(PedestalRenderState renderState, PoseStack poseStack, SubmitNodeCollector nodeCollector, CameraRenderState cameraRenderState) {
        this.submitCrystals(renderState, poseStack, nodeCollector);
        this.submitItem(renderState, poseStack, nodeCollector);
    }

    private void submitCrystals(PedestalRenderState renderState, PoseStack poseStack, SubmitNodeCollector nodeCollector) {
        poseStack.pushPose();
        this.crystals.yRot = -(renderState.rotation / 35.0F) % 360.0F;
        poseStack.mulPose(Axis.XP.rotationDegrees(-180.0F));
        TextureAtlasSprite sprite = this.sprites.get(MATERIAL);
        nodeCollector.submitModelPart(this.crystals,
                poseStack,
                MATERIAL.renderType(RenderTypes::entityCutout),
                renderState.lightCoords,
                OverlayTexture.NO_OVERLAY,
                sprite);
        poseStack.popPose();
    }

    /**
     * @see net.minecraft.client.renderer.blockentity.VaultRenderer#submit(VaultRenderState, PoseStack,
     *         SubmitNodeCollector, CameraRenderState)
     */
    private void submitItem(PedestalRenderState renderState, PoseStack poseStack, SubmitNodeCollector nodeCollector) {
        if (renderState.displayItem != null) {
            poseStack.pushPose();
            poseStack.translate(0.5F, 0.4F, 0.5F);
            float offsetY = Mth.sin(renderState.rotation / 8.0F) * 0.025F;
            poseStack.translate(0.0F, offsetY + 0.3125F, 0.0F);
            poseStack.mulPose(Axis.YP.rotationDegrees(Mth.wrapDegrees(renderState.rotation / 2.0F)));
            ItemEntityRenderer.renderMultipleFromCount(poseStack,
                    nodeCollector,
                    renderState.lightCoords,
                    renderState.displayItem,
                    this.random);
            poseStack.popPose();
        }
    }
}
