package fuzs.geodecraft.common.client;

import fuzs.puzzleslib.api.client.core.v1.ClientModConstructor;
import fuzs.puzzleslib.api.client.core.v1.context.BlockEntityRenderersContext;
import fuzs.puzzleslib.api.client.core.v1.context.LayerDefinitionsContext;
import fuzs.puzzleslib.api.client.core.v1.context.RenderTypesContext;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.level.block.Block;
import fuzs.geodecraft.common.client.renderer.blockentity.PedestalRenderer;
import fuzs.geodecraft.common.init.BlockEntityRegistry;
import fuzs.geodecraft.common.init.BlockRegistry;

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

    @Override
    public void onRegisterBlockRenderTypes(RenderTypesContext<Block> context) {
        context.registerRenderType(BlockRegistry.PINK_TOPAZ_CLUSTER.value(), RenderType.cutout());
        context.registerRenderType(BlockRegistry.LARGE_PINK_TOPAZ_BUD.value(), RenderType.cutout());
        context.registerRenderType(BlockRegistry.MEDIUM_PINK_TOPAZ_BUD.value(), RenderType.cutout());
        context.registerRenderType(BlockRegistry.SMALL_PINK_TOPAZ_BUD.value(), RenderType.cutout());

        context.registerRenderType(BlockRegistry.CELESTITE_CLUSTER.value(), RenderType.cutout());
        context.registerRenderType(BlockRegistry.LARGE_CELESTITE_BUD.value(), RenderType.cutout());
        context.registerRenderType(BlockRegistry.MEDIUM_CELESTITE_BUD.value(), RenderType.cutout());
        context.registerRenderType(BlockRegistry.SMALL_CELESTITE_BUD.value(), RenderType.cutout());

        context.registerRenderType(BlockRegistry.LAPIS_LAZULI_CLUSTER.value(), RenderType.cutout());
        context.registerRenderType(BlockRegistry.LARGE_LAPIS_LAZULI_BUD.value(), RenderType.cutout());
        context.registerRenderType(BlockRegistry.MEDIUM_LAPIS_LAZULI_BUD.value(), RenderType.cutout());
        context.registerRenderType(BlockRegistry.SMALL_LAPIS_LAZULI_BUD.value(), RenderType.cutout());

        context.registerRenderType(BlockRegistry.REDSTONE_CRYSTAL.value(), RenderType.cutout());
        context.registerRenderType(BlockRegistry.LARGE_REDSTONE_BUD.value(), RenderType.cutout());
        context.registerRenderType(BlockRegistry.MEDIUM_REDSTONE_BUD.value(), RenderType.cutout());
        context.registerRenderType(BlockRegistry.SMALL_REDSTONE_BUD.value(), RenderType.cutout());

        context.registerRenderType(BlockRegistry.EMERALD_CLUSTER.value(), RenderType.cutout());
        context.registerRenderType(BlockRegistry.LARGE_EMERALD_BUD.value(), RenderType.cutout());
        context.registerRenderType(BlockRegistry.MEDIUM_EMERALD_BUD.value(), RenderType.cutout());
        context.registerRenderType(BlockRegistry.SMALL_EMERALD_BUD.value(), RenderType.cutout());

        context.registerRenderType(BlockRegistry.DIAMOND_CRYSTAL.value(), RenderType.cutout());
        context.registerRenderType(BlockRegistry.LARGE_DIAMOND_BUD.value(), RenderType.cutout());
        context.registerRenderType(BlockRegistry.MEDIUM_DIAMOND_BUD.value(), RenderType.cutout());
        context.registerRenderType(BlockRegistry.SMALL_DIAMOND_BUD.value(), RenderType.cutout());

        context.registerRenderType(BlockRegistry.NETHER_QUARTZ_CRYSTAL.value(), RenderType.cutout());
        context.registerRenderType(BlockRegistry.LARGE_NETHER_QUARTZ_BUD.value(), RenderType.cutout());
        context.registerRenderType(BlockRegistry.MEDIUM_NETHER_QUARTZ_BUD.value(), RenderType.cutout());
        context.registerRenderType(BlockRegistry.SMALL_NETHER_QUARTZ_BUD.value(), RenderType.cutout());

        context.registerRenderType(BlockRegistry.GOLD_NUGGET_CLUSTER.value(), RenderType.cutout());
        context.registerRenderType(BlockRegistry.LARGE_GOLD_NUGGET_BUD.value(), RenderType.cutout());
        context.registerRenderType(BlockRegistry.MEDIUM_GOLD_NUGGET_BUD.value(), RenderType.cutout());
        context.registerRenderType(BlockRegistry.SMALL_GOLD_NUGGET_BUD.value(), RenderType.cutout());

        context.registerRenderType(BlockRegistry.GLOWSTONE_CLUSTER.value(), RenderType.cutout());
        context.registerRenderType(BlockRegistry.LARGE_GLOWSTONE_BUD.value(), RenderType.cutout());
        context.registerRenderType(BlockRegistry.MEDIUM_GLOWSTONE_BUD.value(), RenderType.cutout());
        context.registerRenderType(BlockRegistry.SMALL_GLOWSTONE_BUD.value(), RenderType.cutout());

        context.registerRenderType(BlockRegistry.ANCIENT_DEBRIS_CLUSTER.value(), RenderType.cutout());
        context.registerRenderType(BlockRegistry.LARGE_ANCIENT_DEBRIS_BUD.value(), RenderType.cutout());
        context.registerRenderType(BlockRegistry.MEDIUM_ANCIENT_DEBRIS_BUD.value(), RenderType.cutout());
        context.registerRenderType(BlockRegistry.SMALL_ANCIENT_DEBRIS_BUD.value(), RenderType.cutout());

        context.registerRenderType(BlockRegistry.ECHO_CRYSTAL.value(), RenderType.cutout());
        context.registerRenderType(BlockRegistry.LARGE_ECHO_BUD.value(), RenderType.cutout());
        context.registerRenderType(BlockRegistry.MEDIUM_ECHO_BUD.value(), RenderType.cutout());
        context.registerRenderType(BlockRegistry.SMALL_ECHO_BUD.value(), RenderType.cutout());

        context.registerRenderType(BlockRegistry.WRAPPIST_CLUSTER.value(), RenderType.cutout());
        context.registerRenderType(BlockRegistry.LARGE_WRAPPIST_BUD.value(), RenderType.cutout());
        context.registerRenderType(BlockRegistry.MEDIUM_WRAPPIST_BUD.value(), RenderType.cutout());
        context.registerRenderType(BlockRegistry.SMALL_WRAPPIST_BUD.value(), RenderType.cutout());

        context.registerRenderType(BlockRegistry.PRISMARINE_CLUSTER.value(), RenderType.cutout());
        context.registerRenderType(BlockRegistry.LARGE_PRISMARINE_BUD.value(), RenderType.cutout());
        context.registerRenderType(BlockRegistry.MEDIUM_PRISMARINE_BUD.value(), RenderType.cutout());
        context.registerRenderType(BlockRegistry.SMALL_PRISMARINE_BUD.value(), RenderType.cutout());

        context.registerRenderType(BlockRegistry.WRAPPIST_GLASS.value(), RenderType.cutout());
        context.registerRenderType(BlockRegistry.CELESTITE_GLASS.value(), RenderType.cutout());
        context.registerRenderType(BlockRegistry.PINK_TOPAZ_GLASS.value(), RenderType.cutout());

        context.registerRenderType(BlockRegistry.PEDESTAL.value(), RenderType.cutout());
    }
}
