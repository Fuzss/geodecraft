package fuzs.geodecraft.common.data.client;

import fuzs.geodecraft.common.Geodecraft;
import fuzs.puzzleslib.api.client.data.v2.AbstractModelProvider;
import fuzs.puzzleslib.api.client.data.v2.models.ModelLocationHelper;
import fuzs.puzzleslib.api.client.data.v2.models.ModelTemplateHelper;
import fuzs.puzzleslib.api.data.v2.core.DataProviderContext;
import net.minecraft.data.models.BlockModelGenerators;
import net.minecraft.data.models.ItemModelGenerators;
import net.minecraft.data.models.model.*;
import net.minecraft.world.level.block.Block;
import net.yeoxuhang.geode_plus.server.registry.BlockRegistry;
import net.yeoxuhang.geode_plus.server.registry.ItemRegistry;

public class GeodePlusItemModelProvider extends AbstractModelProvider {
    public static final ModelTemplate PEDESTAL_TEMPLATE = ModelTemplateHelper.createBlockModelTemplate(Geodecraft.id(
            "template_pedestal"), TextureSlot.TOP, TextureSlot.BOTTOM, TextureSlot.SIDE);
    public static final TexturedModel.Provider PEDESTAL_PROVIDER = TexturedModel.createDefault(TextureMapping::cubeBottomTop,
            PEDESTAL_TEMPLATE);
    public static final ModelTemplate SMALL_AMETHYST_BUD_INVENTORY = ModelTemplates.createItem("small_amethyst_bud",
            TextureSlot.LAYER0);
    public static final ModelTemplate MEDIUM_AMETHYST_BUD_INVENTORY = ModelTemplates.createItem("medium_amethyst_bud",
            TextureSlot.LAYER0);
    public static final ModelTemplate LARGE_AMETHYST_BUD_INVENTORY = ModelTemplates.createItem("large_amethyst_bud",
            TextureSlot.LAYER0);
    public static final ModelTemplate AMETHYST_CLUSTER_INVENTORY = ModelTemplates.createItem("amethyst_cluster",
            TextureSlot.LAYER0);

    public GeodePlusItemModelProvider(DataProviderContext context) {
        super(context);
    }

    @Override
    public void addBlockModels(BlockModelGenerators generator) {
        generator.createTrivialBlock(BlockRegistry.WRAPPIST_PEDESTAL.value(), PEDESTAL_PROVIDER);

        generator.createTrivialCube(BlockRegistry.ANCIENT_DEBRIS_CLUSTER_BLOCK.value());
        generator.createTrivialCube(BlockRegistry.DIAMOND_CRYSTAL_BLOCK.value());
        generator.createTrivialCube(BlockRegistry.EMERALD_CLUSTER_BLOCK.value());
        generator.createTrivialCube(BlockRegistry.LAPIS_CLUSTER_BLOCK.value());
        generator.createTrivialCube(BlockRegistry.REDSTONE_CRYSTAL_BLOCK.value());

        generator.family(BlockRegistry.SMOOTH_END_STONE.value())
                .stairs(BlockRegistry.SMOOTH_END_STONE_STAIRS.value())
                .slab(BlockRegistry.SMOOTH_END_STONE_SLAB.value())
                .wall(BlockRegistry.SMOOTH_END_STONE_WALL.value());
        generator.family(BlockRegistry.GALCITE.value())
                .stairs(BlockRegistry.GALCITE_STAIRS.value())
                .slab(BlockRegistry.GALCITE_SLAB.value())
                .wall(BlockRegistry.GALCITE_WALL.value());

        generator.createTrivialCube(BlockRegistry.WRAPPIST_BLOCK.value());
        generator.createTrivialCube(BlockRegistry.BUDDING_WRAPPIST.value());
        generator.createTrivialCube(BlockRegistry.BUDDING_NETHER_QUARTZ.value());
        generator.createTrivialCube(BlockRegistry.BUDDING_GLOWSTONE.value());
        generator.createTrivialCube(BlockRegistry.BUDDING_ECHO.value());
        generator.createTrivialCube(BlockRegistry.BUDDING_BLACKSTONE_GLOWSTONE.value());
        generator.createTrivialCube(BlockRegistry.BUDDING_BLACKSTONE_NETHER_QUARTZ.value());
        generator.createTrivialCube(BlockRegistry.BUDDING_BASALT_NETHER_QUARTZ.value());
        generator.createTrivialCube(BlockRegistry.BUDDING_BASALT_GLOWSTONE.value());
        generator.createTrivialCube(BlockRegistry.NETHER_QUARTZ_CRYSTAL_BLOCK.value());
        generator.createTrivialCube(BlockRegistry.GOLD_NUGGET_CLUSTER_BLOCK.value());
        generator.createTrivialCube(BlockRegistry.GLOWSTONE_CLUSTER_BLOCK.value());
        generator.createTrivialCube(BlockRegistry.PRISMARINE_CLUSTER_BLOCK.value());
        generator.createTrivialCube(BlockRegistry.BUDDING_GOLD_NUGGET.value());
        generator.createTrivialCube(BlockRegistry.BUDDING_BASALT_GOLD_NUGGET.value());
        generator.createTrivialCube(BlockRegistry.BUDDING_BLACKSTONE_GOLD_NUGGET.value());
        generator.createTrivialCube(BlockRegistry.BUDDING_ANCIENT_DEBRIS.value());
        generator.createTrivialCube(BlockRegistry.BUDDING_BASALT_ANCIENT_DEBRIS.value());
        generator.createTrivialCube(BlockRegistry.BUDDING_BLACKSTONE_ANCIENT_DEBRIS.value());
        generator.createTrivialCube(BlockRegistry.BUDDING_LAPIS.value());
        generator.createTrivialCube(BlockRegistry.BUDDING_REDSTONE.value());
        generator.createTrivialCube(BlockRegistry.BUDDING_EMERALD.value());
        generator.createTrivialCube(BlockRegistry.BUDDING_DIAMOND.value());
        generator.createTrivialCube(BlockRegistry.BUDDING_DEEPSLATE_LAPIS.value());
        generator.createTrivialCube(BlockRegistry.BUDDING_DEEPSLATE_REDSTONE.value());
        generator.createTrivialCube(BlockRegistry.BUDDING_DEEPSLATE_EMERALD.value());
        generator.createTrivialCube(BlockRegistry.BUDDING_DEEPSLATE_DIAMOND.value());
        generator.createTrivialCube(BlockRegistry.BUDDING_SCULK_LAPIS.value());
        generator.createTrivialCube(BlockRegistry.BUDDING_SCULK_REDSTONE.value());
        generator.createTrivialCube(BlockRegistry.BUDDING_SCULK_EMERALD.value());
        generator.createTrivialCube(BlockRegistry.BUDDING_SCULK_DIAMOND.value());
        generator.createTrivialCube(BlockRegistry.BUDDING_PRISMARINE.value());
        generator.createTrivialCube(BlockRegistry.BUDDING_CELESTITE.value());
        generator.createTrivialCube(BlockRegistry.CELESTITE_BLOCK.value());
        generator.createTrivialCube(BlockRegistry.BUDDING_PINK_TOPAZ.value());
        generator.createTrivialCube(BlockRegistry.PINK_TOPAZ_BLOCK.value());
        generator.createTrivialCube(BlockRegistry.ECHO_CRYSTAL_BLOCK.value());

        generator.createTrivialCube(BlockRegistry.WRAPPIST_GLASS.value());
        generator.createTrivialCube(BlockRegistry.CELESTITE_GLASS.value());
        generator.createTrivialCube(BlockRegistry.PINK_TOPAZ_GLASS.value());

        this.createAmethystClusters(BlockRegistry.SMALL_ECHO_BUD.value(),
                BlockRegistry.MEDIUM_ECHO_BUD.value(),
                BlockRegistry.LARGE_ECHO_BUD.value(),
                BlockRegistry.ECHO_CRYSTAL.value(),
                generator);

        this.createAmethystClusters(BlockRegistry.SMALL_NETHER_QUARTZ_BUD.value(),
                BlockRegistry.MEDIUM_NETHER_QUARTZ_BUD.value(),
                BlockRegistry.LARGE_NETHER_QUARTZ_BUD.value(),
                BlockRegistry.NETHER_QUARTZ_CRYSTAL.value(),
                generator);

        this.createAmethystClusters(BlockRegistry.SMALL_GOLD_NUGGET_BUD.value(),
                BlockRegistry.MEDIUM_GOLD_NUGGET_BUD.value(),
                BlockRegistry.LARGE_GOLD_NUGGET_BUD.value(),
                BlockRegistry.GOLD_NUGGET_CLUSTER.value(),
                generator);

        this.createAmethystClusters(BlockRegistry.SMALL_WRAPPIST_BUD.value(),
                BlockRegistry.MEDIUM_WRAPPIST_BUD.value(),
                BlockRegistry.LARGE_WRAPPIST_BUD.value(),
                BlockRegistry.WRAPPIST_CLUSTER.value(),
                generator);

        this.createAmethystClusters(BlockRegistry.SMALL_GLOWSTONE_BUD.value(),
                BlockRegistry.MEDIUM_GLOWSTONE_BUD.value(),
                BlockRegistry.LARGE_GLOWSTONE_BUD.value(),
                BlockRegistry.GLOWSTONE_CLUSTER.value(),
                generator);

        this.createAmethystClusters(BlockRegistry.SMALL_ANCIENT_DEBRIS_BUD.value(),
                BlockRegistry.MEDIUM_ANCIENT_DEBRIS_BUD.value(),
                BlockRegistry.LARGE_ANCIENT_DEBRIS_BUD.value(),
                BlockRegistry.ANCIENT_DEBRIS_CLUSTER.value(),
                generator);

        this.createAmethystClusters(BlockRegistry.SMALL_LAPIS_BUD.value(),
                BlockRegistry.MEDIUM_LAPIS_BUD.value(),
                BlockRegistry.LARGE_LAPIS_BUD.value(),
                BlockRegistry.LAPIS_CLUSTER.value(),
                generator);

        this.createAmethystClusters(BlockRegistry.SMALL_REDSTONE_BUD.value(),
                BlockRegistry.MEDIUM_REDSTONE_BUD.value(),
                BlockRegistry.LARGE_REDSTONE_BUD.value(),
                BlockRegistry.REDSTONE_CRYSTAL.value(),
                generator);

        this.createAmethystClusters(BlockRegistry.SMALL_EMERALD_BUD.value(),
                BlockRegistry.MEDIUM_EMERALD_BUD.value(),
                BlockRegistry.LARGE_EMERALD_BUD.value(),
                BlockRegistry.EMERALD_CLUSTER.value(),
                generator);

        this.createAmethystClusters(BlockRegistry.SMALL_DIAMOND_BUD.value(),
                BlockRegistry.MEDIUM_DIAMOND_BUD.value(),
                BlockRegistry.LARGE_DIAMOND_BUD.value(),
                BlockRegistry.DIAMOND_CRYSTAL.value(),
                generator);

        this.createAmethystClusters(BlockRegistry.SMALL_PRISMARINE_BUD.value(),
                BlockRegistry.MEDIUM_PRISMARINE_BUD.value(),
                BlockRegistry.LARGE_PRISMARINE_BUD.value(),
                BlockRegistry.PRISMARINE_CLUSTER.value(),
                generator);

        this.createAmethystClusters(BlockRegistry.SMALL_CELESTITE_BUD.value(),
                BlockRegistry.MEDIUM_CELESTITE_BUD.value(),
                BlockRegistry.LARGE_CELESTITE_BUD.value(),
                BlockRegistry.CELESTITE_CLUSTER.value(),
                generator);

        this.createAmethystClusters(BlockRegistry.SMALL_PINK_TOPAZ_BUD.value(),
                BlockRegistry.MEDIUM_PINK_TOPAZ_BUD.value(),
                BlockRegistry.LARGE_PINK_TOPAZ_BUD.value(),
                BlockRegistry.PINK_TOPAZ_CRYSTAL.value(),
                generator);
    }

    /**
     * @see BlockModelGenerators#createAmethystClusters()
     */
    public final void createAmethystClusters(Block smallBudBlock, Block mediumBudBlock, Block largeBudBlock, Block clusterBlock, BlockModelGenerators generator) {
        this.createAmethystCluster(smallBudBlock, SMALL_AMETHYST_BUD_INVENTORY, generator);
        this.createAmethystCluster(mediumBudBlock, MEDIUM_AMETHYST_BUD_INVENTORY, generator);
        this.createAmethystCluster(largeBudBlock, LARGE_AMETHYST_BUD_INVENTORY, generator);
        this.createAmethystCluster(clusterBlock, AMETHYST_CLUSTER_INVENTORY, generator);
    }

    /**
     * @see BlockModelGenerators#createSimpleFlatItemModel(Block)
     */
    public final void createAmethystCluster(Block block, ModelTemplate template, BlockModelGenerators generator) {
        generator.createAmethystCluster(block);
        template.create(ModelLocationHelper.getItemModel(block.asItem()),
                TextureMapping.layer0(ModelLocationHelper.getBlockTexture(block)),
                generator.modelOutput);
    }

    @Override
    public void addItemModels(ItemModelGenerators generator) {
        generator.generateFlatItem(ItemRegistry.WRAP_ARMOR_TRIM_SMITHING_TEMPLATE.value(), ModelTemplates.FLAT_ITEM);
        generator.generateFlatItem(ItemRegistry.CELESTE_ARMOR_TRIM_SMITHING_TEMPLATE.value(), ModelTemplates.FLAT_ITEM);
        generator.generateFlatItem(ItemRegistry.HEART_ARMOR_TRIM_SMITHING_TEMPLATE.value(), ModelTemplates.FLAT_ITEM);

        generator.generateFlatItem(ItemRegistry.PINK_TOPAZ.value(), ModelTemplates.FLAT_ITEM);
        generator.generateFlatItem(ItemRegistry.CELESTITE_SHARD.value(), ModelTemplates.FLAT_ITEM);
        generator.generateFlatItem(ItemRegistry.WRAPPIST_SHARD.value(), ModelTemplates.FLAT_ITEM);
    }
}
