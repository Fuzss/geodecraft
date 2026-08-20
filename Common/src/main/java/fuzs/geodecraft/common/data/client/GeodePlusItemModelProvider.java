package fuzs.geodecraft.common.data.client;

import fuzs.geodecraft.common.Geodecraft;
import fuzs.puzzleslib.api.client.data.v2.AbstractModelProvider;
import fuzs.puzzleslib.api.client.data.v2.models.ModelTemplateHelper;
import fuzs.puzzleslib.api.data.v2.core.DataProviderContext;
import net.minecraft.data.models.BlockModelGenerators;
import net.minecraft.data.models.ItemModelGenerators;
import net.minecraft.data.models.model.*;
import net.minecraft.world.level.block.Block;
import net.yeoxuhang.geode_plus.server.registry.BlockRegistry;
import net.yeoxuhang.geode_plus.server.registry.ItemRegistry;

public class GeodePlusItemModelProvider extends AbstractModelProvider {
    public static final ModelTemplate PEDESTAL_INVENTORY = ModelTemplateHelper.createItemModelTemplate(Geodecraft.id(
            "template_pedestal"), TextureSlot.PARTICLE);
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
        this.createPedestal(BlockRegistry.WRAPPIST_PEDESTAL.value(), generator);

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
        generator.createTrivialCube(BlockRegistry.BUDDING_BLACKSTONE_QUARTZ.value());
        generator.createTrivialCube(BlockRegistry.BUDDING_BASALT_QUARTZ.value());
        generator.createTrivialCube(BlockRegistry.BUDDING_BASALT_GLOWSTONE.value());
        generator.createTrivialCube(BlockRegistry.QUARTZ_CRYSTAL_BLOCK.value());
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

        generator.createAmethystCluster(BlockRegistry.ECHO_CRYSTAL.value());
        generator.createAmethystCluster(BlockRegistry.LARGE_ECHO_BUD.value());
        generator.createAmethystCluster(BlockRegistry.MEDIUM_ECHO_BUD.value());
        generator.createAmethystCluster(BlockRegistry.SMALL_ECHO_BUD.value());

        generator.createAmethystCluster(BlockRegistry.QUARTZ_CRYSTAL.value());
        generator.createAmethystCluster(BlockRegistry.LARGE_QUARTZ_BUD.value());
        generator.createAmethystCluster(BlockRegistry.MEDIUM_QUARTZ_BUD.value());
        generator.createAmethystCluster(BlockRegistry.SMALL_QUARTZ_BUD.value());

        generator.createAmethystCluster(BlockRegistry.GOLD_NUGGET_CLUSTER.value());
        generator.createAmethystCluster(BlockRegistry.LARGE_GOLD_NUGGET_BUD.value());
        generator.createAmethystCluster(BlockRegistry.MEDIUM_GOLD_NUGGET_BUD.value());
        generator.createAmethystCluster(BlockRegistry.SMALL_GOLD_NUGGET_BUD.value());

        generator.createAmethystCluster(BlockRegistry.WRAPPIST_CLUSTER.value());
        generator.createAmethystCluster(BlockRegistry.LARGE_WRAPPIST_BUD.value());
        generator.createAmethystCluster(BlockRegistry.MEDIUM_WRAPPIST_BUD.value());
        generator.createAmethystCluster(BlockRegistry.SMALL_WRAPPIST_BUD.value());

        generator.createAmethystCluster(BlockRegistry.GLOWSTONE_CLUSTER.value());
        generator.createAmethystCluster(BlockRegistry.LARGE_GLOWSTONE_BUD.value());
        generator.createAmethystCluster(BlockRegistry.MEDIUM_GLOWSTONE_BUD.value());
        generator.createAmethystCluster(BlockRegistry.SMALL_GLOWSTONE_BUD.value());

        generator.createAmethystCluster(BlockRegistry.ANCIENT_DEBRIS_CLUSTER.value());
        generator.createAmethystCluster(BlockRegistry.LARGE_ANCIENT_DEBRIS_BUD.value());
        generator.createAmethystCluster(BlockRegistry.MEDIUM_ANCIENT_DEBRIS_BUD.value());
        generator.createAmethystCluster(BlockRegistry.SMALL_ANCIENT_DEBRIS_BUD.value());

        generator.createAmethystCluster(BlockRegistry.LAPIS_CLUSTER.value());
        generator.createAmethystCluster(BlockRegistry.LARGE_LAPIS_BUD.value());
        generator.createAmethystCluster(BlockRegistry.MEDIUM_LAPIS_BUD.value());
        generator.createAmethystCluster(BlockRegistry.SMALL_LAPIS_BUD.value());

        generator.createAmethystCluster(BlockRegistry.REDSTONE_CRYSTAL.value());
        generator.createAmethystCluster(BlockRegistry.LARGE_REDSTONE_BUD.value());
        generator.createAmethystCluster(BlockRegistry.MEDIUM_REDSTONE_BUD.value());
        generator.createAmethystCluster(BlockRegistry.SMALL_REDSTONE_BUD.value());

        generator.createAmethystCluster(BlockRegistry.EMERALD_CLUSTER.value());
        generator.createAmethystCluster(BlockRegistry.LARGE_EMERALD_BUD.value());
        generator.createAmethystCluster(BlockRegistry.MEDIUM_EMERALD_BUD.value());
        generator.createAmethystCluster(BlockRegistry.SMALL_EMERALD_BUD.value());

        generator.createAmethystCluster(BlockRegistry.DIAMOND_CRYSTAL.value());
        generator.createAmethystCluster(BlockRegistry.LARGE_DIAMOND_BUD.value());
        generator.createAmethystCluster(BlockRegistry.MEDIUM_DIAMOND_BUD.value());
        generator.createAmethystCluster(BlockRegistry.SMALL_DIAMOND_BUD.value());

        generator.createAmethystCluster(BlockRegistry.PRISMARINE_CLUSTER.value());
        generator.createAmethystCluster(BlockRegistry.LARGE_PRISMARINE_BUD.value());
        generator.createAmethystCluster(BlockRegistry.MEDIUM_PRISMARINE_BUD.value());
        generator.createAmethystCluster(BlockRegistry.SMALL_PRISMARINE_BUD.value());

        generator.createAmethystCluster(BlockRegistry.CELESTITE_CLUSTER.value());
        generator.createAmethystCluster(BlockRegistry.LARGE_CELESTITE_BUD.value());
        generator.createAmethystCluster(BlockRegistry.MEDIUM_CELESTITE_BUD.value());
        generator.createAmethystCluster(BlockRegistry.SMALL_CELESTITE_BUD.value());

        generator.createAmethystCluster(BlockRegistry.PINK_TOPAZ_CRYSTAL.value());
        generator.createAmethystCluster(BlockRegistry.LARGE_PINK_TOPAZ_BUD.value());
        generator.createAmethystCluster(BlockRegistry.MEDIUM_PINK_TOPAZ_BUD.value());
        generator.createAmethystCluster(BlockRegistry.SMALL_PINK_TOPAZ_BUD.value());
    }

    public final void createPedestal(Block block, BlockModelGenerators generator) {
        generator.createTrivialBlock(block, TexturedModel.PARTICLE_ONLY);
        PEDESTAL_INVENTORY.create(ModelLocationUtils.getModelLocation(block.asItem()),
                TextureMapping.particle(block),
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

        generator.generateFlatItem(ItemRegistry.DIAMOND_CRYSTAL.value(), AMETHYST_CLUSTER_INVENTORY);
        generator.generateFlatItem(ItemRegistry.SMALL_DIAMOND_BUD.value(), SMALL_AMETHYST_BUD_INVENTORY);
        generator.generateFlatItem(ItemRegistry.MEDIUM_DIAMOND_BUD.value(), MEDIUM_AMETHYST_BUD_INVENTORY);
        generator.generateFlatItem(ItemRegistry.LARGE_DIAMOND_BUD.value(), LARGE_AMETHYST_BUD_INVENTORY);

        generator.generateFlatItem(ItemRegistry.EMERALD_CLUSTER.value(), AMETHYST_CLUSTER_INVENTORY);
        generator.generateFlatItem(ItemRegistry.SMALL_EMERALD_BUD.value(), SMALL_AMETHYST_BUD_INVENTORY);
        generator.generateFlatItem(ItemRegistry.MEDIUM_EMERALD_BUD.value(), MEDIUM_AMETHYST_BUD_INVENTORY);
        generator.generateFlatItem(ItemRegistry.LARGE_EMERALD_BUD.value(), LARGE_AMETHYST_BUD_INVENTORY);

        generator.generateFlatItem(ItemRegistry.LAPIS_CLUSTER.value(), AMETHYST_CLUSTER_INVENTORY);
        generator.generateFlatItem(ItemRegistry.SMALL_LAPIS_BUD.value(), SMALL_AMETHYST_BUD_INVENTORY);
        generator.generateFlatItem(ItemRegistry.MEDIUM_LAPIS_BUD.value(), MEDIUM_AMETHYST_BUD_INVENTORY);
        generator.generateFlatItem(ItemRegistry.LARGE_LAPIS_BUD.value(), LARGE_AMETHYST_BUD_INVENTORY);

        generator.generateFlatItem(ItemRegistry.REDSTONE_CRYSTAL.value(), AMETHYST_CLUSTER_INVENTORY);
        generator.generateFlatItem(ItemRegistry.SMALL_REDSTONE_BUD.value(), SMALL_AMETHYST_BUD_INVENTORY);
        generator.generateFlatItem(ItemRegistry.MEDIUM_REDSTONE_BUD.value(), MEDIUM_AMETHYST_BUD_INVENTORY);
        generator.generateFlatItem(ItemRegistry.LARGE_REDSTONE_BUD.value(), LARGE_AMETHYST_BUD_INVENTORY);

        generator.generateFlatItem(ItemRegistry.ECHO_CRYSTAL.value(), AMETHYST_CLUSTER_INVENTORY);
        generator.generateFlatItem(ItemRegistry.SMALL_ECHO_BUD.value(), SMALL_AMETHYST_BUD_INVENTORY);
        generator.generateFlatItem(ItemRegistry.MEDIUM_ECHO_BUD.value(), MEDIUM_AMETHYST_BUD_INVENTORY);
        generator.generateFlatItem(ItemRegistry.LARGE_ECHO_BUD.value(), LARGE_AMETHYST_BUD_INVENTORY);

        generator.generateFlatItem(ItemRegistry.GLOWSTONE_CLUSTER.value(), AMETHYST_CLUSTER_INVENTORY);
        generator.generateFlatItem(ItemRegistry.SMALL_GLOWSTONE_BUD.value(), SMALL_AMETHYST_BUD_INVENTORY);
        generator.generateFlatItem(ItemRegistry.MEDIUM_GLOWSTONE_BUD.value(), MEDIUM_AMETHYST_BUD_INVENTORY);
        generator.generateFlatItem(ItemRegistry.LARGE_GLOWSTONE_BUD.value(), LARGE_AMETHYST_BUD_INVENTORY);

        generator.generateFlatItem(ItemRegistry.ANCIENT_DEBRIS_CLUSTER.value(), AMETHYST_CLUSTER_INVENTORY);
        generator.generateFlatItem(ItemRegistry.SMALL_ANCIENT_DEBRIS_BUD.value(), SMALL_AMETHYST_BUD_INVENTORY);
        generator.generateFlatItem(ItemRegistry.MEDIUM_ANCIENT_DEBRIS_BUD.value(), MEDIUM_AMETHYST_BUD_INVENTORY);
        generator.generateFlatItem(ItemRegistry.LARGE_ANCIENT_DEBRIS_BUD.value(), LARGE_AMETHYST_BUD_INVENTORY);

        generator.generateFlatItem(ItemRegistry.GOLD_NUGGET_CLUSTER.value(), AMETHYST_CLUSTER_INVENTORY);
        generator.generateFlatItem(ItemRegistry.SMALL_GOLD_NUGGET_BUD.value(), SMALL_AMETHYST_BUD_INVENTORY);
        generator.generateFlatItem(ItemRegistry.MEDIUM_GOLD_NUGGET_BUD.value(), MEDIUM_AMETHYST_BUD_INVENTORY);
        generator.generateFlatItem(ItemRegistry.LARGE_GOLD_NUGGET_BUD.value(), LARGE_AMETHYST_BUD_INVENTORY);

        generator.generateFlatItem(ItemRegistry.WRAPPIST_CLUSTER.value(), AMETHYST_CLUSTER_INVENTORY);
        generator.generateFlatItem(ItemRegistry.SMALL_WRAPPIST_BUD.value(), SMALL_AMETHYST_BUD_INVENTORY);
        generator.generateFlatItem(ItemRegistry.MEDIUM_WRAPPIST_BUD.value(), MEDIUM_AMETHYST_BUD_INVENTORY);
        generator.generateFlatItem(ItemRegistry.LARGE_WRAPPIST_BUD.value(), LARGE_AMETHYST_BUD_INVENTORY);

        generator.generateFlatItem(ItemRegistry.QUARTZ_CRYSTAL.value(), AMETHYST_CLUSTER_INVENTORY);
        generator.generateFlatItem(ItemRegistry.SMALL_QUARTZ_BUD.value(), SMALL_AMETHYST_BUD_INVENTORY);
        generator.generateFlatItem(ItemRegistry.MEDIUM_QUARTZ_BUD.value(), MEDIUM_AMETHYST_BUD_INVENTORY);
        generator.generateFlatItem(ItemRegistry.LARGE_QUARTZ_BUD.value(), LARGE_AMETHYST_BUD_INVENTORY);

        generator.generateFlatItem(ItemRegistry.PRISMARINE_CLUSTER.value(), AMETHYST_CLUSTER_INVENTORY);
        generator.generateFlatItem(ItemRegistry.SMALL_PRISMARINE_BUD.value(), SMALL_AMETHYST_BUD_INVENTORY);
        generator.generateFlatItem(ItemRegistry.MEDIUM_PRISMARINE_BUD.value(), MEDIUM_AMETHYST_BUD_INVENTORY);
        generator.generateFlatItem(ItemRegistry.LARGE_PRISMARINE_BUD.value(), LARGE_AMETHYST_BUD_INVENTORY);

        generator.generateFlatItem(ItemRegistry.CELESTITE_CLUSTER.value(), AMETHYST_CLUSTER_INVENTORY);
        generator.generateFlatItem(ItemRegistry.SMALL_CELESTITE_BUD.value(), SMALL_AMETHYST_BUD_INVENTORY);
        generator.generateFlatItem(ItemRegistry.MEDIUM_CELESTITE_BUD.value(), MEDIUM_AMETHYST_BUD_INVENTORY);
        generator.generateFlatItem(ItemRegistry.LARGE_CELESTITE_BUD.value(), LARGE_AMETHYST_BUD_INVENTORY);

        generator.generateFlatItem(ItemRegistry.PINK_TOPAZ_CRYSTAL.value(), AMETHYST_CLUSTER_INVENTORY);
        generator.generateFlatItem(ItemRegistry.SMALL_PINK_TOPAZ_BUD.value(), SMALL_AMETHYST_BUD_INVENTORY);
        generator.generateFlatItem(ItemRegistry.MEDIUM_PINK_TOPAZ_BUD.value(), MEDIUM_AMETHYST_BUD_INVENTORY);
        generator.generateFlatItem(ItemRegistry.LARGE_PINK_TOPAZ_BUD.value(), LARGE_AMETHYST_BUD_INVENTORY);
    }
}
