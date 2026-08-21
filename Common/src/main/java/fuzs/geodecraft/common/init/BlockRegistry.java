package fuzs.geodecraft.common.init;

import fuzs.geodecraft.common.world.level.block.*;
import net.minecraft.core.Holder;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.MapColor;
import fuzs.geodecraft.common.world.level.block.PedestalBlock;

public class BlockRegistry {
    public static final Holder.Reference<Block> PINK_TOPAZ_CRYSTAL = ModRegistry.REGISTRY.registerBlock(
            "pink_topaz_crystal",
            (BlockBehaviour.Properties properties) -> new AmethystClusterBlock(7, 3, properties),
            () -> BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_PINK)
                    .forceSolidOn()
                    .noOcclusion()
                    .randomTicks()
                    .sound(SoundType.AMETHYST)
                    .strength(3.0F)
                    .lightLevel((BlockState state) -> 8));
    public static final Holder.Reference<Block> LARGE_PINK_TOPAZ_BUD = ModRegistry.REGISTRY.registerBlock(
            "large_pink_topaz_bud",
            (BlockBehaviour.Properties properties) -> new AmethystClusterBlock(5, 3, properties),
            () -> BlockBehaviour.Properties.ofFullCopy(PINK_TOPAZ_CRYSTAL.value()).lightLevel((BlockState state) -> 2));
    public static final Holder.Reference<Block> MEDIUM_PINK_TOPAZ_BUD = ModRegistry.REGISTRY.registerBlock(
            "medium_pink_topaz_bud",
            (BlockBehaviour.Properties properties) -> new AmethystClusterBlock(4, 3, properties),
            () -> BlockBehaviour.Properties.ofFullCopy(PINK_TOPAZ_CRYSTAL.value()).lightLevel((BlockState state) -> 1));
    public static final Holder.Reference<Block> SMALL_PINK_TOPAZ_BUD = ModRegistry.REGISTRY.registerBlock(
            "small_pink_topaz_bud",
            (BlockBehaviour.Properties properties) -> new AmethystClusterBlock(3, 4, properties),
            () -> BlockBehaviour.Properties.ofFullCopy(PINK_TOPAZ_CRYSTAL.value()));

    public static final Holder.Reference<Block> BUDDING_PINK_TOPAZ = ModRegistry.REGISTRY.registerBlock(
            "budding_pink_topaz",
            BuddingGrantEffectBlock::pinkTopaz,
            () -> BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_PINK)
                    .randomTicks()
                    .strength(3.0F)
                    .sound(SoundType.AMETHYST)
                    .requiresCorrectToolForDrops());
    public static final Holder.Reference<Block> PINK_TOPAZ_BLOCK = ModRegistry.REGISTRY.registerBlock("pink_topaz_block",
            Block::new,
            () -> BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_PINK)
                    .strength(4.0F)
                    .sound(SoundType.AMETHYST));

    public static final Holder.Reference<Block> CELESTITE_CLUSTER = ModRegistry.REGISTRY.registerBlock(
            "celestite_cluster",
            (BlockBehaviour.Properties properties) -> new AmethystClusterBlock(7, 3, properties),
            () -> BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_CYAN)
                    .forceSolidOn()
                    .noOcclusion()
                    .randomTicks()
                    .sound(SoundType.AMETHYST)
                    .strength(3.0F)
                    .lightLevel((BlockState state) -> 8));
    public static final Holder.Reference<Block> LARGE_CELESTITE_BUD = ModRegistry.REGISTRY.registerBlock(
            "large_celestite_bud",
            (BlockBehaviour.Properties properties) -> new AmethystClusterBlock(5, 3, properties),
            () -> BlockBehaviour.Properties.ofFullCopy(CELESTITE_CLUSTER.value()).lightLevel((BlockState state) -> 2));
    public static final Holder.Reference<Block> MEDIUM_CELESTITE_BUD = ModRegistry.REGISTRY.registerBlock(
            "medium_celestite_bud",
            (BlockBehaviour.Properties properties) -> new AmethystClusterBlock(4, 3, properties),
            () -> BlockBehaviour.Properties.ofFullCopy(CELESTITE_CLUSTER.value()).lightLevel((BlockState state) -> 1));
    public static final Holder.Reference<Block> SMALL_CELESTITE_BUD = ModRegistry.REGISTRY.registerBlock(
            "small_celestite_bud",
            (BlockBehaviour.Properties properties) -> new AmethystClusterBlock(3, 4, properties),
            () -> BlockBehaviour.Properties.ofFullCopy(CELESTITE_CLUSTER.value()));

    public static final Holder.Reference<Block> BUDDING_CELESTITE = ModRegistry.REGISTRY.registerBlock(
            "budding_celestite",
            BuddingGrantEffectBlock::celestite,
            () -> BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_CYAN)
                    .randomTicks()
                    .strength(3.0F)
                    .sound(SoundType.AMETHYST)
                    .requiresCorrectToolForDrops());

    public static final Holder.Reference<Block> CELESTITE_BLOCK = ModRegistry.REGISTRY.registerBlock("celestite_block",
            Block::new,
            () -> BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_CYAN).strength(4.0F).sound(SoundType.STONE));

    public static final Holder.Reference<Block> PRISMARINE_CLUSTER_BLOCK = ModRegistry.REGISTRY.registerBlock(
            "prismarine_cluster_block",
            Block::new,
            () -> BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_CYAN).strength(4.0F).sound(SoundType.STONE));
    public static final Holder.Reference<Block> PRISMARINE_CLUSTER = ModRegistry.REGISTRY.registerBlock(
            "prismarine_cluster",
            (BlockBehaviour.Properties properties) -> {
                return new AmethystClusterBlock(7.0F, 3.0F, properties);
            },
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.AMETHYST_CLUSTER)
                    .mapColor(MapColor.COLOR_CYAN)
                    .strength(3.0F)
                    .lightLevel((BlockState state) -> 8));
    public static final Holder.Reference<Block> LARGE_PRISMARINE_BUD = ModRegistry.REGISTRY.registerBlock(
            "large_prismarine_bud",
            (BlockBehaviour.Properties properties) -> {
                return new AmethystClusterBlock(5.0F, 3.0F, properties);
            },
            () -> BlockBehaviour.Properties.ofFullCopy(PRISMARINE_CLUSTER.value()).lightLevel((BlockState state) -> 2));
    public static final Holder.Reference<Block> MEDIUM_PRISMARINE_BUD = ModRegistry.REGISTRY.registerBlock(
            "medium_prismarine_bud",
            (BlockBehaviour.Properties properties) -> {
                return new AmethystClusterBlock(4.0F, 3.0F, properties);
            },
            () -> BlockBehaviour.Properties.ofFullCopy(PRISMARINE_CLUSTER.value()).lightLevel((BlockState state) -> 1));
    public static final Holder.Reference<Block> SMALL_PRISMARINE_BUD = ModRegistry.REGISTRY.registerBlock(
            "small_prismarine_bud",
            (BlockBehaviour.Properties properties) -> {
                return new AmethystClusterBlock(3.0F, 4.0F, properties);
            },
            () -> BlockBehaviour.Properties.ofFullCopy(PRISMARINE_CLUSTER.value()));

    public static final Holder.Reference<Block> BUDDING_PRISMARINE = ModRegistry.REGISTRY.registerBlock(
            "budding_prismarine",
            BuddingBlock::prismarine,
            () -> BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_CYAN)
                    .randomTicks()
                    .strength(3.0F)
                    .sound(SoundType.AMETHYST)
                    .requiresCorrectToolForDrops());

    public static final Holder.Reference<Block> LAPIS_LAZULI_CLUSTER = ModRegistry.REGISTRY.registerBlock(
            "lapis_lazuli_cluster",
            (BlockBehaviour.Properties properties) -> DropExperienceClusterBlock.cluster(UniformInt.of(2, 5),
                    properties),
            () -> BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_BLUE)
                    .forceSolidOn()
                    .noOcclusion()
                    .randomTicks()
                    .sound(SoundType.AMETHYST)
                    .strength(3.0F)
                    .lightLevel((BlockState state) -> 8));
    public static final Holder.Reference<Block> LARGE_LAPIS_LAZULI_BUD = ModRegistry.REGISTRY.registerBlock(
            "large_lapis_lazuli_bud",
            (BlockBehaviour.Properties properties) -> DropExperienceClusterBlock.large(UniformInt.of(1, 4), properties),
            () -> BlockBehaviour.Properties.ofFullCopy(LAPIS_LAZULI_CLUSTER.value())
                    .sound(SoundType.AMETHYST)
                    .lightLevel((BlockState state) -> 2));
    public static final Holder.Reference<Block> MEDIUM_LAPIS_LAZULI_BUD = ModRegistry.REGISTRY.registerBlock(
            "medium_lapis_lazuli_bud",
            (BlockBehaviour.Properties properties) -> DropExperienceClusterBlock.medium(UniformInt.of(0, 3),
                    properties),
            () -> BlockBehaviour.Properties.ofFullCopy(LAPIS_LAZULI_CLUSTER.value())
                    .sound(SoundType.AMETHYST)
                    .lightLevel((BlockState state) -> 1));
    public static final Holder.Reference<Block> SMALL_LAPIS_LAZULI_BUD = ModRegistry.REGISTRY.registerBlock(
            "small_lapis_lazuli_bud",
            (BlockBehaviour.Properties properties) -> DropExperienceClusterBlock.small(UniformInt.of(0, 2), properties),
            () -> BlockBehaviour.Properties.ofFullCopy(LAPIS_LAZULI_CLUSTER.value()).sound(SoundType.AMETHYST));

    public static final Holder.Reference<Block> BUDDING_LAPIS_LAZULI = ModRegistry.REGISTRY.registerBlock(
            "budding_lapis_lazuli",
            BuddingDropExperienceBlock::lapisLazuli,
            () -> BlockBehaviour.Properties.of()
                    .mapColor(MapColor.STONE)
                    .randomTicks()
                    .strength(3.0F)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops());
    public static final Holder.Reference<Block> BUDDING_DEEPSLATE_LAPIS_LAZULI = ModRegistry.REGISTRY.registerBlock(
            "budding_deepslate_lapis_lazuli",
            BuddingDropExperienceBlock::lapisLazuli,
            () -> BlockBehaviour.Properties.of()
                    .mapColor(MapColor.DEEPSLATE)
                    .randomTicks()
                    .strength(5.0F)
                    .sound(SoundType.DEEPSLATE)
                    .requiresCorrectToolForDrops());
    public static final Holder.Reference<Block> BUDDING_SCULK_LAPIS_LAZULI = ModRegistry.REGISTRY.registerBlock(
            "budding_sculk_lapis_lazuli",
            BuddingDropExperienceBlock::lapisLazuli,
            () -> BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_BLACK)
                    .randomTicks()
                    .strength(3.0F)
                    .sound(SoundType.SCULK)
                    .requiresCorrectToolForDrops());
    public static final Holder.Reference<Block> LAPIS_LAZULI_CLUSTER_BLOCK = ModRegistry.REGISTRY.registerBlock(
            "lapis_lazuli_cluster_block",
            Block::new,
            () -> BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLUE).strength(4.0F).sound(SoundType.STONE));

    public static final Holder.Reference<Block> REDSTONE_CRYSTAL = ModRegistry.REGISTRY.registerBlock("redstone_crystal",
            (BlockBehaviour.Properties properties) -> new RedstoneOreClusterBlock(RedstoneOreClusterBlock.CLUSTER_HEIGHT,
                    RedstoneOreClusterBlock.CLUSTER_OFFSET,
                    UniformInt.of(1, 5),
                    properties),
            () -> BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_RED)
                    .forceSolidOn()
                    .noOcclusion()
                    .randomTicks()
                    .sound(SoundType.AMETHYST)
                    .strength(3.0F)
                    .lightLevel((BlockState state) -> 8));
    public static final Holder.Reference<Block> LARGE_REDSTONE_BUD = ModRegistry.REGISTRY.registerBlock(
            "large_redstone_bud",
            (BlockBehaviour.Properties properties) -> new RedstoneOreClusterBlock(RedstoneOreClusterBlock.LARGE_CLUSTER_HEIGHT,
                    RedstoneOreClusterBlock.LARGE_CLUSTER_OFFSET,
                    UniformInt.of(1, 5),
                    properties),
            () -> BlockBehaviour.Properties.ofFullCopy(REDSTONE_CRYSTAL.value())
                    .sound(SoundType.AMETHYST)
                    .lightLevel((BlockState state) -> 2));
    public static final Holder.Reference<Block> MEDIUM_REDSTONE_BUD = ModRegistry.REGISTRY.registerBlock(
            "medium_redstone_bud",
            (BlockBehaviour.Properties properties) -> new RedstoneOreClusterBlock(RedstoneOreClusterBlock.MEDIUM_CLUSTER_HEIGHT,
                    RedstoneOreClusterBlock.MEDIUM_CLUSTER_OFFSET,
                    UniformInt.of(1, 5),
                    properties),
            () -> BlockBehaviour.Properties.ofFullCopy(REDSTONE_CRYSTAL.value())
                    .sound(SoundType.AMETHYST)
                    .lightLevel((BlockState state) -> 1));
    public static final Holder.Reference<Block> SMALL_REDSTONE_BUD = ModRegistry.REGISTRY.registerBlock(
            "small_redstone_bud",
            (BlockBehaviour.Properties properties) -> new RedstoneOreClusterBlock(RedstoneOreClusterBlock.SMALL_CLUSTER_HEIGHT,
                    RedstoneOreClusterBlock.SMALL_CLUSTER_OFFSET,
                    UniformInt.of(1, 5),
                    properties),
            () -> BlockBehaviour.Properties.ofFullCopy(REDSTONE_CRYSTAL.value()).sound(SoundType.AMETHYST));

    public static final Holder.Reference<Block> BUDDING_REDSTONE = ModRegistry.REGISTRY.registerBlock("budding_redstone",
            BuddingDropExperienceBlock::redstone,
            () -> BlockBehaviour.Properties.of()
                    .mapColor(MapColor.STONE)
                    .randomTicks()
                    .strength(3.0F)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops());
    public static final Holder.Reference<Block> BUDDING_DEEPSLATE_REDSTONE = ModRegistry.REGISTRY.registerBlock(
            "budding_deepslate_redstone",
            BuddingDropExperienceBlock::redstone,
            () -> BlockBehaviour.Properties.of()
                    .mapColor(MapColor.DEEPSLATE)
                    .randomTicks()
                    .strength(5.0F)
                    .sound(SoundType.DEEPSLATE)
                    .requiresCorrectToolForDrops());
    public static final Holder.Reference<Block> BUDDING_SCULK_REDSTONE = ModRegistry.REGISTRY.registerBlock(
            "budding_sculk_redstone",
            BuddingDropExperienceBlock::redstone,
            () -> BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_BLACK)
                    .randomTicks()
                    .strength(3.0F)
                    .sound(SoundType.SCULK)
                    .requiresCorrectToolForDrops());
    public static final Holder.Reference<Block> REDSTONE_CRYSTAL_BLOCK = ModRegistry.REGISTRY.registerBlock(
            "redstone_crystal_block",
            Block::new,
            () -> BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_RED).strength(4.0F).sound(SoundType.STONE));

    public static final Holder.Reference<Block> EMERALD_CLUSTER = ModRegistry.REGISTRY.registerBlock("emerald_cluster",
            (BlockBehaviour.Properties properties) -> DropExperienceClusterBlock.cluster(UniformInt.of(3, 7),
                    properties),
            () -> BlockBehaviour.Properties.of()
                    .mapColor(MapColor.EMERALD)
                    .forceSolidOn()
                    .noOcclusion()
                    .randomTicks()
                    .sound(SoundType.AMETHYST)
                    .strength(3.0F)
                    .lightLevel((BlockState state) -> 8));
    public static final Holder.Reference<Block> LARGE_EMERALD_BUD = ModRegistry.REGISTRY.registerBlock(
            "large_emerald_bud",
            (BlockBehaviour.Properties properties) -> DropExperienceClusterBlock.large(UniformInt.of(2, 6), properties),
            () -> BlockBehaviour.Properties.ofFullCopy(EMERALD_CLUSTER.value())
                    .sound(SoundType.AMETHYST)
                    .lightLevel((BlockState state) -> 2));
    public static final Holder.Reference<Block> MEDIUM_EMERALD_BUD = ModRegistry.REGISTRY.registerBlock(
            "medium_emerald_bud",
            (BlockBehaviour.Properties properties) -> DropExperienceClusterBlock.medium(UniformInt.of(1, 5),
                    properties),
            () -> BlockBehaviour.Properties.ofFullCopy(EMERALD_CLUSTER.value())
                    .sound(SoundType.AMETHYST)
                    .lightLevel((BlockState state) -> 1));
    public static final Holder.Reference<Block> SMALL_EMERALD_BUD = ModRegistry.REGISTRY.registerBlock(
            "small_emerald_bud",
            (BlockBehaviour.Properties properties) -> DropExperienceClusterBlock.small(UniformInt.of(0, 4), properties),
            () -> BlockBehaviour.Properties.ofFullCopy(EMERALD_CLUSTER.value()).sound(SoundType.AMETHYST));

    public static final Holder.Reference<Block> BUDDING_EMERALD = ModRegistry.REGISTRY.registerBlock("budding_emerald",
            BuddingDropExperienceBlock::emerald,
            () -> BlockBehaviour.Properties.of()
                    .mapColor(MapColor.STONE)
                    .randomTicks()
                    .strength(3.0F)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops());
    public static final Holder.Reference<Block> BUDDING_DEEPSLATE_EMERALD = ModRegistry.REGISTRY.registerBlock(
            "budding_deepslate_emerald",
            BuddingDropExperienceBlock::emerald,
            () -> BlockBehaviour.Properties.of()
                    .mapColor(MapColor.DEEPSLATE)
                    .randomTicks()
                    .strength(5.0F)
                    .sound(SoundType.DEEPSLATE)
                    .requiresCorrectToolForDrops());
    public static final Holder.Reference<Block> BUDDING_SCULK_EMERALD = ModRegistry.REGISTRY.registerBlock(
            "budding_sculk_emerald",
            BuddingDropExperienceBlock::emerald,
            () -> BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_BLACK)
                    .randomTicks()
                    .strength(3.0F)
                    .sound(SoundType.SCULK)
                    .requiresCorrectToolForDrops());
    public static final Holder.Reference<Block> EMERALD_CLUSTER_BLOCK = ModRegistry.REGISTRY.registerBlock(
            "emerald_cluster_block",
            Block::new,
            () -> BlockBehaviour.Properties.of().mapColor(MapColor.EMERALD).strength(4.0F).sound(SoundType.STONE));

    public static final Holder.Reference<Block> DIAMOND_CRYSTAL = ModRegistry.REGISTRY.registerBlock("diamond_crystal",
            (BlockBehaviour.Properties properties) -> DropExperienceClusterBlock.cluster(UniformInt.of(3, 7),
                    properties),
            () -> BlockBehaviour.Properties.of()
                    .mapColor(MapColor.DIAMOND)
                    .forceSolidOn()
                    .noOcclusion()
                    .randomTicks()
                    .sound(SoundType.AMETHYST)
                    .strength(3.0F)
                    .lightLevel((BlockState state) -> 8));
    public static final Holder.Reference<Block> LARGE_DIAMOND_BUD = ModRegistry.REGISTRY.registerBlock(
            "large_diamond_bud",
            (BlockBehaviour.Properties properties) -> DropExperienceClusterBlock.large(UniformInt.of(2, 6), properties),
            () -> BlockBehaviour.Properties.ofFullCopy(DIAMOND_CRYSTAL.value())
                    .sound(SoundType.AMETHYST)
                    .lightLevel((BlockState state) -> 2));
    public static final Holder.Reference<Block> MEDIUM_DIAMOND_BUD = ModRegistry.REGISTRY.registerBlock(
            "medium_diamond_bud",
            (BlockBehaviour.Properties properties) -> DropExperienceClusterBlock.medium(UniformInt.of(1, 5),
                    properties),
            () -> BlockBehaviour.Properties.ofFullCopy(DIAMOND_CRYSTAL.value())
                    .sound(SoundType.AMETHYST)
                    .lightLevel((BlockState state) -> 1));
    public static final Holder.Reference<Block> SMALL_DIAMOND_BUD = ModRegistry.REGISTRY.registerBlock(
            "small_diamond_bud",
            (BlockBehaviour.Properties properties) -> DropExperienceClusterBlock.small(UniformInt.of(0, 4), properties),
            () -> BlockBehaviour.Properties.ofFullCopy(DIAMOND_CRYSTAL.value()).sound(SoundType.AMETHYST));

    public static final Holder.Reference<Block> BUDDING_DIAMOND = ModRegistry.REGISTRY.registerBlock("budding_diamond",
            BuddingDropExperienceBlock::diamond,
            () -> BlockBehaviour.Properties.of()
                    .mapColor(MapColor.STONE)
                    .randomTicks()
                    .strength(3.0F)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops());

    public static final Holder.Reference<Block> BUDDING_DEEPSLATE_DIAMOND = ModRegistry.REGISTRY.registerBlock(
            "budding_deepslate_diamond",
            BuddingDropExperienceBlock::diamond,
            () -> BlockBehaviour.Properties.of()
                    .mapColor(MapColor.DEEPSLATE)
                    .randomTicks()
                    .strength(5.0F)
                    .sound(SoundType.DEEPSLATE)
                    .requiresCorrectToolForDrops());

    public static final Holder.Reference<Block> BUDDING_SCULK_DIAMOND = ModRegistry.REGISTRY.registerBlock(
            "budding_sculk_diamond",
            BuddingDropExperienceBlock::diamond,
            () -> BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_BLACK)
                    .randomTicks()
                    .strength(3.0F)
                    .sound(SoundType.SCULK)
                    .requiresCorrectToolForDrops());
    public static final Holder.Reference<Block> DIAMOND_CRYSTAL_BLOCK = ModRegistry.REGISTRY.registerBlock(
            "diamond_crystal_block",
            Block::new,
            () -> BlockBehaviour.Properties.of().mapColor(MapColor.DIAMOND).strength(4.0F).sound(SoundType.STONE));

    public static final Holder.Reference<Block> NETHER_QUARTZ_CRYSTAL = ModRegistry.REGISTRY.registerBlock(
            "nether_quartz_crystal",
            (BlockBehaviour.Properties properties) -> DropExperienceClusterBlock.cluster(UniformInt.of(2, 5),
                    properties),
            () -> BlockBehaviour.Properties.of()
                    .mapColor(MapColor.QUARTZ)
                    .forceSolidOn()
                    .noOcclusion()
                    .randomTicks()
                    .sound(SoundType.NETHER_ORE)
                    .strength(3.0F)
                    .lightLevel((BlockState state) -> 8));
    public static final Holder.Reference<Block> LARGE_NETHER_QUARTZ_BUD = ModRegistry.REGISTRY.registerBlock(
            "large_nether_quartz_bud",
            (BlockBehaviour.Properties properties) -> DropExperienceClusterBlock.large(UniformInt.of(1, 4), properties),
            () -> BlockBehaviour.Properties.ofFullCopy(NETHER_QUARTZ_CRYSTAL.value())
                    .sound(SoundType.NETHER_ORE)
                    .lightLevel((BlockState state) -> 2));
    public static final Holder.Reference<Block> MEDIUM_NETHER_QUARTZ_BUD = ModRegistry.REGISTRY.registerBlock(
            "medium_nether_quartz_bud",
            (BlockBehaviour.Properties properties) -> DropExperienceClusterBlock.medium(UniformInt.of(0, 3),
                    properties),
            () -> BlockBehaviour.Properties.ofFullCopy(NETHER_QUARTZ_CRYSTAL.value())
                    .sound(SoundType.NETHER_ORE)
                    .lightLevel((BlockState state) -> 1));
    public static final Holder.Reference<Block> SMALL_NETHER_QUARTZ_BUD = ModRegistry.REGISTRY.registerBlock(
            "small_nether_quartz_bud",
            (BlockBehaviour.Properties properties) -> DropExperienceClusterBlock.small(UniformInt.of(0, 2), properties),
            () -> BlockBehaviour.Properties.ofFullCopy(NETHER_QUARTZ_CRYSTAL.value()).sound(SoundType.NETHER_ORE));

    public static final Holder.Reference<Block> BUDDING_NETHER_QUARTZ = ModRegistry.REGISTRY.registerBlock(
            "budding_nether_quartz",
            BuddingDropExperienceBlock::netherQuartz,
            () -> BlockBehaviour.Properties.of()
                    .mapColor(MapColor.NETHER)
                    .randomTicks()
                    .strength(3.0F)
                    .sound(SoundType.NETHER_ORE)
                    .requiresCorrectToolForDrops());
    public static final Holder.Reference<Block> BUDDING_BASALT_NETHER_QUARTZ = ModRegistry.REGISTRY.registerBlock(
            "budding_basalt_nether_quartz",
            BuddingDropExperienceBlock::netherQuartz,
            () -> BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_BLACK)
                    .randomTicks()
                    .strength(3.0F)
                    .sound(SoundType.BASALT)
                    .requiresCorrectToolForDrops());
    public static final Holder.Reference<Block> BUDDING_BLACKSTONE_NETHER_QUARTZ = ModRegistry.REGISTRY.registerBlock(
            "budding_blackstone_nether_quartz",
            BuddingDropExperienceBlock::netherQuartz,
            () -> BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_BLACK)
                    .randomTicks()
                    .strength(3.0F)
                    .sound(SoundType.NETHER_ORE)
                    .requiresCorrectToolForDrops());
    public static final Holder.Reference<Block> NETHER_QUARTZ_CRYSTAL_BLOCK = ModRegistry.REGISTRY.registerBlock(
            "nether_quartz_crystal_block",
            Block::new,
            () -> BlockBehaviour.Properties.of().mapColor(MapColor.QUARTZ).strength(3.0F).sound(SoundType.STONE));

    public static final Holder.Reference<Block> GOLD_NUGGET_CLUSTER = ModRegistry.REGISTRY.registerBlock(
            "gold_nugget_cluster",
            (BlockBehaviour.Properties properties) -> DropExperienceClusterBlock.cluster(UniformInt.of(0, 1),
                    properties),
            () -> BlockBehaviour.Properties.of()
                    .mapColor(MapColor.GOLD)
                    .forceSolidOn()
                    .noOcclusion()
                    .randomTicks()
                    .sound(SoundType.NETHER_GOLD_ORE)
                    .strength(3.0F)
                    .lightLevel((BlockState state) -> 8));
    public static final Holder.Reference<Block> LARGE_GOLD_NUGGET_BUD = ModRegistry.REGISTRY.registerBlock(
            "large_gold_nugget_bud",
            (BlockBehaviour.Properties properties) -> DropExperienceClusterBlock.large(UniformInt.of(0, 1), properties),
            () -> BlockBehaviour.Properties.ofFullCopy(GOLD_NUGGET_CLUSTER.value())
                    .sound(SoundType.NETHER_GOLD_ORE)
                    .lightLevel((BlockState state) -> 2));
    public static final Holder.Reference<Block> MEDIUM_GOLD_NUGGET_BUD = ModRegistry.REGISTRY.registerBlock(
            "medium_gold_nugget_bud",
            (BlockBehaviour.Properties properties) -> DropExperienceClusterBlock.medium(UniformInt.of(0, 1),
                    properties),
            () -> BlockBehaviour.Properties.ofFullCopy(GOLD_NUGGET_CLUSTER.value())
                    .sound(SoundType.NETHER_GOLD_ORE)
                    .lightLevel((BlockState state) -> 1));
    public static final Holder.Reference<Block> SMALL_GOLD_NUGGET_BUD = ModRegistry.REGISTRY.registerBlock(
            "small_gold_nugget_bud",
            (BlockBehaviour.Properties properties) -> DropExperienceClusterBlock.small(UniformInt.of(0, 1), properties),
            () -> BlockBehaviour.Properties.ofFullCopy(GOLD_NUGGET_CLUSTER.value()).sound(SoundType.NETHER_GOLD_ORE));

    public static final Holder.Reference<Block> BUDDING_GOLD_NUGGET = ModRegistry.REGISTRY.registerBlock(
            "budding_gold_nugget",
            BuddingDropExperienceBlock::goldNugget,
            () -> BlockBehaviour.Properties.of()
                    .mapColor(MapColor.NETHER)
                    .randomTicks()
                    .strength(3.0F)
                    .sound(SoundType.NETHER_GOLD_ORE)
                    .requiresCorrectToolForDrops());
    public static final Holder.Reference<Block> BUDDING_BASALT_GOLD_NUGGET = ModRegistry.REGISTRY.registerBlock(
            "budding_basalt_gold_nugget",
            BuddingDropExperienceBlock::goldNugget,
            () -> BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_BLACK)
                    .randomTicks()
                    .strength(3.0F)
                    .sound(SoundType.NETHER_GOLD_ORE)
                    .requiresCorrectToolForDrops());
    public static final Holder.Reference<Block> BUDDING_BLACKSTONE_GOLD_NUGGET = ModRegistry.REGISTRY.registerBlock(
            "budding_blackstone_gold_nugget",
            BuddingDropExperienceBlock::goldNugget,
            () -> BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_BLACK)
                    .randomTicks()
                    .strength(3.0F)
                    .sound(SoundType.NETHER_GOLD_ORE)
                    .requiresCorrectToolForDrops());
    public static final Holder.Reference<Block> GOLD_NUGGET_CLUSTER_BLOCK = ModRegistry.REGISTRY.registerBlock(
            "gold_nugget_cluster_block",
            Block::new,
            () -> BlockBehaviour.Properties.of().mapColor(MapColor.GOLD).strength(4.0F).sound(SoundType.STONE));

    public static final Holder.Reference<Block> GLOWSTONE_CLUSTER = ModRegistry.REGISTRY.registerBlock(
            "glowstone_cluster",
            (BlockBehaviour.Properties properties) -> {
                return new AmethystClusterBlock(7.0F, 3.0F, properties);
            },
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.AMETHYST_CLUSTER)
                    .mapColor(MapColor.SAND)
                    .sound(SoundType.GLASS)
                    .strength(3.0F)
                    .lightLevel((BlockState state) -> 15));
    public static final Holder.Reference<Block> LARGE_GLOWSTONE_BUD = ModRegistry.REGISTRY.registerBlock(
            "large_glowstone_bud",
            (BlockBehaviour.Properties properties) -> {
                return new AmethystClusterBlock(5.0F, 3.0F, properties);
            },
            () -> BlockBehaviour.Properties.ofFullCopy(GLOWSTONE_CLUSTER.value()).lightLevel((BlockState state) -> 13));
    public static final Holder.Reference<Block> MEDIUM_GLOWSTONE_BUD = ModRegistry.REGISTRY.registerBlock(
            "medium_glowstone_bud",
            (BlockBehaviour.Properties properties) -> {
                return new AmethystClusterBlock(4.0F, 3.0F, properties);
            },
            () -> BlockBehaviour.Properties.ofFullCopy(GLOWSTONE_CLUSTER.value()).lightLevel((BlockState state) -> 11));
    public static final Holder.Reference<Block> SMALL_GLOWSTONE_BUD = ModRegistry.REGISTRY.registerBlock(
            "small_glowstone_bud",
            (BlockBehaviour.Properties properties) -> {
                return new AmethystClusterBlock(3.0F, 4.0F, properties);
            },
            () -> BlockBehaviour.Properties.ofFullCopy(GLOWSTONE_CLUSTER.value()).lightLevel((BlockState state) -> 9));

    public static final Holder.Reference<Block> BUDDING_GLOWSTONE = ModRegistry.REGISTRY.registerBlock(
            "budding_glowstone",
            BuddingBlock::glowstone,
            () -> BlockBehaviour.Properties.of()
                    .mapColor(MapColor.NETHER)
                    .randomTicks()
                    .strength(3.0F)
                    .sound(SoundType.GLASS)
                    .requiresCorrectToolForDrops()
                    .lightLevel((BlockState state) -> 10));
    public static final Holder.Reference<Block> BUDDING_BASALT_GLOWSTONE = ModRegistry.REGISTRY.registerBlock(
            "budding_basalt_glowstone",
            BuddingBlock::glowstone,
            () -> BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_BLACK)
                    .randomTicks()
                    .strength(3.0F)
                    .sound(SoundType.GLASS)
                    .requiresCorrectToolForDrops()
                    .lightLevel((BlockState state) -> 10));
    public static final Holder.Reference<Block> BUDDING_BLACKSTONE_GLOWSTONE = ModRegistry.REGISTRY.registerBlock(
            "budding_blackstone_glowstone",
            BuddingBlock::glowstone,
            () -> BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_BLACK)
                    .randomTicks()
                    .strength(3.0F)
                    .sound(SoundType.GLASS)
                    .requiresCorrectToolForDrops()
                    .lightLevel((BlockState state) -> 10));
    public static final Holder.Reference<Block> GLOWSTONE_CLUSTER_BLOCK = ModRegistry.REGISTRY.registerBlock(
            "glowstone_cluster_block",
            Block::new,
            () -> BlockBehaviour.Properties.of()
                    .mapColor(MapColor.SAND)
                    .strength(4.0F)
                    .sound(SoundType.GLASS)
                    .lightLevel((BlockState state) -> 15));

    public static final Holder.Reference<Block> ANCIENT_DEBRIS_CLUSTER = ModRegistry.REGISTRY.registerBlock(
            "ancient_debris_cluster",
            (BlockBehaviour.Properties properties) -> new AmethystClusterBlock(7, 3, properties),
            () -> BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_BROWN)
                    .forceSolidOn()
                    .noOcclusion()
                    .randomTicks()
                    .sound(SoundType.ANCIENT_DEBRIS)
                    .strength(10.0F)
                    .lightLevel((BlockState state) -> 8));
    public static final Holder.Reference<Block> LARGE_ANCIENT_DEBRIS_BUD = ModRegistry.REGISTRY.registerBlock(
            "large_ancient_debris_bud",
            (BlockBehaviour.Properties properties) -> new AmethystClusterBlock(5, 3, properties),
            () -> BlockBehaviour.Properties.ofFullCopy(ANCIENT_DEBRIS_CLUSTER.value())
                    .sound(SoundType.ANCIENT_DEBRIS)
                    .lightLevel((BlockState state) -> 5));
    public static final Holder.Reference<Block> MEDIUM_ANCIENT_DEBRIS_BUD = ModRegistry.REGISTRY.registerBlock(
            "medium_ancient_debris_bud",
            (BlockBehaviour.Properties properties) -> new AmethystClusterBlock(4, 3, properties),
            () -> BlockBehaviour.Properties.ofFullCopy(ANCIENT_DEBRIS_CLUSTER.value())
                    .sound(SoundType.ANCIENT_DEBRIS)
                    .lightLevel((BlockState state) -> 3));
    public static final Holder.Reference<Block> SMALL_ANCIENT_DEBRIS_BUD = ModRegistry.REGISTRY.registerBlock(
            "small_ancient_debris_bud",
            (BlockBehaviour.Properties properties) -> new AmethystClusterBlock(3, 4, properties),
            () -> BlockBehaviour.Properties.ofFullCopy(ANCIENT_DEBRIS_CLUSTER.value())
                    .sound(SoundType.ANCIENT_DEBRIS)
                    .lightLevel((BlockState state) -> 2));

    public static final Holder.Reference<Block> BUDDING_ANCIENT_DEBRIS = ModRegistry.REGISTRY.registerBlock(
            "budding_ancient_debris",
            BuddingBlock::ancientDebris,
            () -> BlockBehaviour.Properties.of()
                    .mapColor(MapColor.NETHER)
                    .randomTicks()
                    .strength(10.0F)
                    .sound(SoundType.ANCIENT_DEBRIS)
                    .requiresCorrectToolForDrops()
                    .lightLevel((BlockState state) -> 10));
    public static final Holder.Reference<Block> BUDDING_BASALT_ANCIENT_DEBRIS = ModRegistry.REGISTRY.registerBlock(
            "budding_basalt_ancient_debris",
            BuddingBlock::ancientDebris,
            () -> BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_BLACK)
                    .randomTicks()
                    .strength(10.0F)
                    .sound(SoundType.ANCIENT_DEBRIS)
                    .requiresCorrectToolForDrops()
                    .lightLevel((BlockState state) -> 10));
    public static final Holder.Reference<Block> BUDDING_BLACKSTONE_ANCIENT_DEBRIS = ModRegistry.REGISTRY.registerBlock(
            "budding_blackstone_ancient_debris",
            BuddingBlock::ancientDebris,
            () -> BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_BLACK)
                    .randomTicks()
                    .strength(10.0F)
                    .sound(SoundType.ANCIENT_DEBRIS)
                    .requiresCorrectToolForDrops()
                    .lightLevel((BlockState state) -> 10));
    public static final Holder.Reference<Block> ANCIENT_DEBRIS_CLUSTER_BLOCK = ModRegistry.REGISTRY.registerBlock(
            "ancient_debris_cluster_block",
            Block::new,
            () -> BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BROWN).strength(4.0F).sound(SoundType.STONE));

    public static final Holder.Reference<Block> SMOOTH_END_STONE = ModRegistry.REGISTRY.registerBlock("smooth_end_stone",
            Block::new,
            () -> BlockBehaviour.Properties.of().mapColor(MapColor.SAND).strength(4.0F).sound(SoundType.BASALT));
    public static final Holder.Reference<Block> SMOOTH_END_STONE_STAIRS = ModRegistry.REGISTRY.registerBlock(
            "smooth_end_stone_stairs",
            (BlockBehaviour.Properties properties) -> new StairBlock(SMOOTH_END_STONE.value().defaultBlockState(),
                    properties),
            () -> BlockBehaviour.Properties.ofFullCopy(SMOOTH_END_STONE.value()));
    public static final Holder.Reference<Block> SMOOTH_END_STONE_SLAB = ModRegistry.REGISTRY.registerBlock(
            "smooth_end_stone_slab",
            SlabBlock::new,
            () -> BlockBehaviour.Properties.of().mapColor(MapColor.SAND).strength(4.0F).sound(SoundType.BASALT));
    public static final Holder.Reference<Block> SMOOTH_END_STONE_WALL = ModRegistry.REGISTRY.registerBlock(
            "smooth_end_stone_wall",
            WallBlock::new,
            () -> BlockBehaviour.Properties.ofFullCopy(SMOOTH_END_STONE.value()));

    public static final Holder.Reference<Block> GALCITE = ModRegistry.REGISTRY.registerBlock("galcite",
            Block::new,
            () -> BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_BLACK)
                    .strength(5.0F, 1200)
                    .sound(SoundType.CALCITE));
    public static final Holder.Reference<Block> GALCITE_STAIRS = ModRegistry.REGISTRY.registerBlock("galcite_stairs",
            (BlockBehaviour.Properties properties) -> new StairBlock(GALCITE.value().defaultBlockState(), properties),
            () -> BlockBehaviour.Properties.ofFullCopy(GALCITE.value()));
    public static final Holder.Reference<Block> GALCITE_SLAB = ModRegistry.REGISTRY.registerBlock("galcite_slab",
            SlabBlock::new,
            () -> BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_BLACK)
                    .strength(4.0F)
                    .sound(SoundType.CALCITE));
    public static final Holder.Reference<Block> GALCITE_WALL = ModRegistry.REGISTRY.registerBlock("galcite_wall",
            WallBlock::new,
            () -> BlockBehaviour.Properties.ofFullCopy(GALCITE.value()));

    public static final Holder.Reference<Block> WRAPPIST_CLUSTER = ModRegistry.REGISTRY.registerBlock("wrappist_cluster",
            (BlockBehaviour.Properties properties) -> new AmethystClusterBlock(7, 3, properties),
            () -> BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_LIGHT_BLUE)
                    .forceSolidOn()
                    .noOcclusion()
                    .randomTicks()
                    .sound(SoundType.AMETHYST_CLUSTER)
                    .strength(3.0F)
                    .lightLevel((BlockState state) -> 8));
    public static final Holder.Reference<Block> LARGE_WRAPPIST_BUD = ModRegistry.REGISTRY.registerBlock(
            "large_wrappist_bud",
            (BlockBehaviour.Properties properties) -> new AmethystClusterBlock(5, 3, properties),
            () -> BlockBehaviour.Properties.ofFullCopy(WRAPPIST_CLUSTER.value())
                    .sound(SoundType.MEDIUM_AMETHYST_BUD)
                    .lightLevel((BlockState state) -> 6));
    public static final Holder.Reference<Block> MEDIUM_WRAPPIST_BUD = ModRegistry.REGISTRY.registerBlock(
            "medium_wrappist_bud",
            (BlockBehaviour.Properties properties) -> new AmethystClusterBlock(4, 3, properties),
            () -> BlockBehaviour.Properties.ofFullCopy(WRAPPIST_CLUSTER.value())
                    .sound(SoundType.LARGE_AMETHYST_BUD)
                    .lightLevel((BlockState state) -> 3));
    public static final Holder.Reference<Block> SMALL_WRAPPIST_BUD = ModRegistry.REGISTRY.registerBlock(
            "small_wrappist_bud",
            (BlockBehaviour.Properties properties) -> new AmethystClusterBlock(3, 4, properties),
            () -> BlockBehaviour.Properties.ofFullCopy(WRAPPIST_CLUSTER.value())
                    .sound(SoundType.SMALL_AMETHYST_BUD)
                    .lightLevel((BlockState state) -> 2));

    public static final Holder.Reference<Block> BUDDING_WRAPPIST = ModRegistry.REGISTRY.registerBlock("budding_wrappist",
            BuddingGrantEffectBlock::wrappist,
            () -> BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_LIGHT_BLUE)
                    .randomTicks()
                    .strength(5.0F)
                    .sound(SoundType.AMETHYST)
                    .requiresCorrectToolForDrops());
    public static final Holder.Reference<Block> WRAPPIST_BLOCK = ModRegistry.REGISTRY.registerBlock("wrappist_block",
            Block::new,
            () -> BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_LIGHT_BLUE)
                    .strength(5.0F)
                    .sound(SoundType.AMETHYST));

    public static final Holder.Reference<Block> ECHO_CRYSTAL = ModRegistry.REGISTRY.registerBlock("echo_crystal",
            (BlockBehaviour.Properties properties) -> DropExperienceClusterBlock.cluster(UniformInt.of(3, 7),
                    properties),
            () -> BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_BLACK)
                    .forceSolidOn()
                    .noOcclusion()
                    .randomTicks()
                    .sound(SoundType.SCULK_CATALYST)
                    .strength(4.0F)
                    .lightLevel((BlockState state) -> 3));
    public static final Holder.Reference<Block> LARGE_ECHO_BUD = ModRegistry.REGISTRY.registerBlock("large_echo_bud",
            (BlockBehaviour.Properties properties) -> DropExperienceClusterBlock.large(UniformInt.of(2, 6), properties),
            () -> BlockBehaviour.Properties.ofFullCopy(ECHO_CRYSTAL.value())
                    .sound(SoundType.SCULK_CATALYST)
                    .lightLevel((BlockState state) -> 2));
    public static final Holder.Reference<Block> MEDIUM_ECHO_BUD = ModRegistry.REGISTRY.registerBlock("medium_echo_bud",
            (BlockBehaviour.Properties properties) -> DropExperienceClusterBlock.medium(UniformInt.of(1, 5),
                    properties),
            () -> BlockBehaviour.Properties.ofFullCopy(ECHO_CRYSTAL.value())
                    .sound(SoundType.SCULK_CATALYST)
                    .lightLevel((BlockState state) -> 1));
    public static final Holder.Reference<Block> SMALL_ECHO_BUD = ModRegistry.REGISTRY.registerBlock("small_echo_bud",
            (BlockBehaviour.Properties properties) -> DropExperienceClusterBlock.small(UniformInt.of(0, 4), properties),
            () -> BlockBehaviour.Properties.ofFullCopy(ECHO_CRYSTAL.value()).sound(SoundType.SCULK_CATALYST));

    public static final Holder.Reference<Block> BUDDING_ECHO = ModRegistry.REGISTRY.registerBlock("budding_echo",
            BuddingEchoCrystalBlock::echoCrystal,
            () -> BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_BLACK)
                    .randomTicks()
                    .strength(5.0F)
                    .sound(SoundType.SCULK)
                    .requiresCorrectToolForDrops());
    public static final Holder.Reference<Block> ECHO_CRYSTAL_BLOCK = ModRegistry.REGISTRY.registerBlock(
            "echo_crystal_block",
            Block::new,
            () -> BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_BLACK)
                    .strength(5.0F)
                    .sound(SoundType.SCULK_CATALYST));

    public static final Holder.Reference<Block> PEDESTAL = ModRegistry.REGISTRY.registerBlock(
            "pedestal",
            PedestalBlock::new,
            () -> BlockBehaviour.Properties.ofFullCopy(WRAPPIST_BLOCK.value())
                    .explosionResistance(100.0F)
                    .randomTicks()
                    .noOcclusion()
                    .lightLevel((BlockState state) -> 8));

    public static final Holder.Reference<Block> WRAPPIST_GLASS = ModRegistry.REGISTRY.registerBlock("wrappist_glass",
            TransparentBlock::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.GLASS)
                    .explosionResistance(100.0F)
                    .mapColor(MapColor.COLOR_LIGHT_BLUE));
    public static final Holder.Reference<Block> CELESTITE_GLASS = ModRegistry.REGISTRY.registerBlock("celestite_glass",
            TransparentBlock::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.GLASS).mapColor(MapColor.COLOR_CYAN));
    public static final Holder.Reference<Block> PINK_TOPAZ_GLASS = ModRegistry.REGISTRY.registerBlock("pink_topaz_glass",
            TransparentBlock::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.GLASS).mapColor(MapColor.COLOR_PINK));

    public static void bootstrap() {
        // NO-OP
    }
}
