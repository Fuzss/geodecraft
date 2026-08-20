package net.yeoxuhang.geode_plus.server.registry;

import net.minecraft.core.Holder;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.MapColor;
import net.yeoxuhang.geode_plus.server.block.*;

public class BlockRegistry {
    public static final Holder.Reference<Block> BUDDING_PINK_TOPAZ = ModRegistry.REGISTRY.registerBlock(
            "budding_pink_topaz",
            BuddingPinkTopazBlock::new,
            () -> BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_PINK)
                    .randomTicks()
                    .strength(3F)
                    .sound(SoundType.AMETHYST)
                    .requiresCorrectToolForDrops());
    public static final Holder.Reference<Block> PINK_TOPAZ_BLOCK = ModRegistry.REGISTRY.registerBlock("pink_topaz_block",
            Block::new,
            () -> BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PINK).strength(4f).sound(SoundType.AMETHYST));
    public static final Holder.Reference<Block> PINK_TOPAZ_CRYSTAL = ModRegistry.REGISTRY.registerBlock(
            "pink_topaz_crystal",
            (BlockBehaviour.Properties properties) -> new PinkTopazCrystalBlock(7, 3, properties),
            () -> BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_PINK)
                    .forceSolidOn()
                    .noOcclusion()
                    .randomTicks()
                    .sound(SoundType.AMETHYST)
                    .strength(3F)
                    .lightLevel((BlockState state) -> 8));
    public static final Holder.Reference<Block> LARGE_PINK_TOPAZ_BUD = ModRegistry.REGISTRY.registerBlock(
            "large_pink_topaz_bud",
            (BlockBehaviour.Properties properties) -> new PinkTopazCrystalBlock(5, 3, properties),
            () -> BlockBehaviour.Properties.ofFullCopy(PINK_TOPAZ_CRYSTAL.value()).lightLevel((BlockState state) -> 2));
    public static final Holder.Reference<Block> MEDIUM_PINK_TOPAZ_BUD = ModRegistry.REGISTRY.registerBlock(
            "medium_pink_topaz_bud",
            (BlockBehaviour.Properties properties) -> new PinkTopazCrystalBlock(4, 3, properties),
            () -> BlockBehaviour.Properties.ofFullCopy(PINK_TOPAZ_CRYSTAL.value()).lightLevel((BlockState state) -> 1));
    public static final Holder.Reference<Block> SMALL_PINK_TOPAZ_BUD = ModRegistry.REGISTRY.registerBlock(
            "small_pink_topaz_bud",
            (BlockBehaviour.Properties properties) -> new PinkTopazCrystalBlock(3, 4, properties),
            () -> BlockBehaviour.Properties.ofFullCopy(PINK_TOPAZ_CRYSTAL.value()));

    public static final Holder.Reference<Block> BUDDING_CELESTITE = ModRegistry.REGISTRY.registerBlock(
            "budding_celestite",
            BuddingCelestiteBlock::new,
            () -> BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_CYAN)
                    .randomTicks()
                    .strength(3F)
                    .sound(SoundType.AMETHYST)
                    .requiresCorrectToolForDrops());

    public static final Holder.Reference<Block> CELESTITE_BLOCK = ModRegistry.REGISTRY.registerBlock("celestite_block",
            Block::new,
            () -> BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_CYAN).strength(4f).sound(SoundType.STONE));
    public static final Holder.Reference<Block> CELESTITE_CLUSTER = ModRegistry.REGISTRY.registerBlock(
            "celestite_cluster",
            (BlockBehaviour.Properties properties) -> new CelestiteClusterBlock(7, 3, properties),
            () -> BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_CYAN)
                    .forceSolidOn()
                    .noOcclusion()
                    .randomTicks()
                    .sound(SoundType.AMETHYST)
                    .strength(3F)
                    .lightLevel((BlockState state) -> 8));
    public static final Holder.Reference<Block> LARGE_CELESTITE_BUD = ModRegistry.REGISTRY.registerBlock(
            "large_celestite_bud",
            (BlockBehaviour.Properties properties) -> new CelestiteClusterBlock(5, 3, properties),
            () -> BlockBehaviour.Properties.ofFullCopy(CELESTITE_CLUSTER.value()).lightLevel((BlockState state) -> 2));
    public static final Holder.Reference<Block> MEDIUM_CELESTITE_BUD = ModRegistry.REGISTRY.registerBlock(
            "medium_celestite_bud",
            (BlockBehaviour.Properties properties) -> new CelestiteClusterBlock(4, 3, properties),
            () -> BlockBehaviour.Properties.ofFullCopy(CELESTITE_CLUSTER.value()).lightLevel((BlockState state) -> 1));
    public static final Holder.Reference<Block> SMALL_CELESTITE_BUD = ModRegistry.REGISTRY.registerBlock(
            "small_celestite_bud",
            (BlockBehaviour.Properties properties) -> new CelestiteClusterBlock(3, 4, properties),
            () -> BlockBehaviour.Properties.ofFullCopy(CELESTITE_CLUSTER.value()));

    public static final Holder.Reference<Block> BUDDING_PRISMARINE = ModRegistry.REGISTRY.registerBlock(
            "budding_prismarine",
            BuddingPrismarineBlock::new,
            () -> BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_CYAN)
                    .randomTicks()
                    .strength(3F)
                    .sound(SoundType.AMETHYST)
                    .requiresCorrectToolForDrops());

    public static final Holder.Reference<Block> PRISMARINE_CLUSTER_BLOCK = ModRegistry.REGISTRY.registerBlock(
            "prismarine_cluster_block",
            Block::new,
            () -> BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_CYAN).strength(4f).sound(SoundType.STONE));
    public static final Holder.Reference<Block> PRISMARINE_CLUSTER = ModRegistry.REGISTRY.registerBlock(
            "prismarine_cluster",
            (BlockBehaviour.Properties properties) -> new PrismarineClusterBlock(7, 3, properties),
            () -> BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_CYAN)
                    .forceSolidOn()
                    .noOcclusion()
                    .randomTicks()
                    .sound(SoundType.AMETHYST)
                    .strength(3F)
                    .lightLevel((BlockState state) -> 8));
    public static final Holder.Reference<Block> LARGE_PRISMARINE_BUD = ModRegistry.REGISTRY.registerBlock(
            "large_prismarine_bud",
            (BlockBehaviour.Properties properties) -> new PrismarineClusterBlock(5, 3, properties),
            () -> BlockBehaviour.Properties.ofFullCopy(PRISMARINE_CLUSTER.value()).lightLevel((BlockState state) -> 2));
    public static final Holder.Reference<Block> MEDIUM_PRISMARINE_BUD = ModRegistry.REGISTRY.registerBlock(
            "medium_prismarine_bud",
            (BlockBehaviour.Properties properties) -> new PrismarineClusterBlock(4, 3, properties),
            () -> BlockBehaviour.Properties.ofFullCopy(PRISMARINE_CLUSTER.value()).lightLevel((BlockState state) -> 1));
    public static final Holder.Reference<Block> SMALL_PRISMARINE_BUD = ModRegistry.REGISTRY.registerBlock(
            "small_prismarine_bud",
            (BlockBehaviour.Properties properties) -> new PrismarineClusterBlock(3, 4, properties),
            () -> BlockBehaviour.Properties.ofFullCopy(PRISMARINE_CLUSTER.value()));

    public static final Holder.Reference<Block> BUDDING_LAPIS = ModRegistry.REGISTRY.registerBlock("budding_lapis",
            BuddingLapisBlock::new,
            () -> BlockBehaviour.Properties.of()
                    .mapColor(MapColor.STONE)
                    .randomTicks()
                    .strength(3F)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops());

    public static final Holder.Reference<Block> BUDDING_DEEPSLATE_LAPIS = ModRegistry.REGISTRY.registerBlock(
            "budding_deepslate_lapis",
            BuddingLapisBlock::new,
            () -> BlockBehaviour.Properties.of()
                    .mapColor(MapColor.DEEPSLATE)
                    .randomTicks()
                    .strength(5F)
                    .sound(SoundType.DEEPSLATE)
                    .requiresCorrectToolForDrops());

    public static final Holder.Reference<Block> BUDDING_SCULK_LAPIS = ModRegistry.REGISTRY.registerBlock(
            "budding_sculk_lapis",
            BuddingLapisBlock::new,
            () -> BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_BLACK)
                    .randomTicks()
                    .strength(3F)
                    .sound(SoundType.SCULK)
                    .requiresCorrectToolForDrops());
    public static final Holder.Reference<Block> LAPIS_CLUSTER_BLOCK = ModRegistry.REGISTRY.registerBlock(
            "lapis_cluster_block",
            Block::new,
            () -> BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLUE).strength(4f).sound(SoundType.STONE));

    public static final Holder.Reference<Block> LAPIS_CLUSTER = ModRegistry.REGISTRY.registerBlock("lapis_cluster",
            (BlockBehaviour.Properties properties) -> new OresClusterBlock(7, 3, properties),
            () -> BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_BLUE)
                    .forceSolidOn()
                    .noOcclusion()
                    .randomTicks()
                    .sound(SoundType.AMETHYST)
                    .strength(3F)
                    .lightLevel((BlockState state) -> 8));
    public static final Holder.Reference<Block> LARGE_LAPIS_BUD = ModRegistry.REGISTRY.registerBlock("large_lapis_bud",
            (BlockBehaviour.Properties properties) -> new LargeOresClusterBlock(5, 3, properties),
            () -> BlockBehaviour.Properties.ofFullCopy(LAPIS_CLUSTER.value())
                    .sound(SoundType.AMETHYST)
                    .lightLevel((BlockState state) -> 2));
    public static final Holder.Reference<Block> MEDIUM_LAPIS_BUD = ModRegistry.REGISTRY.registerBlock("medium_lapis_bud",
            (BlockBehaviour.Properties properties) -> new MediumOresClusterBlock(4, 3, properties),
            () -> BlockBehaviour.Properties.ofFullCopy(LAPIS_CLUSTER.value())
                    .sound(SoundType.AMETHYST)
                    .lightLevel((BlockState state) -> 1));
    public static final Holder.Reference<Block> SMALL_LAPIS_BUD = ModRegistry.REGISTRY.registerBlock("small_lapis_bud",
            (BlockBehaviour.Properties properties) -> new SmallOresClusterBlock(3, 4, properties),
            () -> BlockBehaviour.Properties.ofFullCopy(LAPIS_CLUSTER.value()).sound(SoundType.AMETHYST));

    public static final Holder.Reference<Block> BUDDING_REDSTONE = ModRegistry.REGISTRY.registerBlock("budding_redstone",
            BuddingRedstoneBlock::new,
            () -> BlockBehaviour.Properties.of()
                    .mapColor(MapColor.STONE)
                    .randomTicks()
                    .strength(3F)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops());
    public static final Holder.Reference<Block> BUDDING_DEEPSLATE_REDSTONE = ModRegistry.REGISTRY.registerBlock(
            "budding_deepslate_redstone",
            BuddingRedstoneBlock::new,
            () -> BlockBehaviour.Properties.of()
                    .mapColor(MapColor.DEEPSLATE)
                    .randomTicks()
                    .strength(5F)
                    .sound(SoundType.DEEPSLATE)
                    .requiresCorrectToolForDrops());
    public static final Holder.Reference<Block> BUDDING_SCULK_REDSTONE = ModRegistry.REGISTRY.registerBlock(
            "budding_sculk_redstone",
            BuddingRedstoneBlock::new,
            () -> BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_BLACK)
                    .randomTicks()
                    .strength(3F)
                    .sound(SoundType.SCULK)
                    .requiresCorrectToolForDrops());
    public static final Holder.Reference<Block> REDSTONE_CRYSTAL_BLOCK = ModRegistry.REGISTRY.registerBlock(
            "redstone_crystal_block",
            Block::new,
            () -> BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_RED).strength(4f).sound(SoundType.STONE));

    public static final Holder.Reference<Block> REDSTONE_CRYSTAL = ModRegistry.REGISTRY.registerBlock("redstone_crystal",
            (BlockBehaviour.Properties properties) -> new RedstoneOresClusterBlock(7, 3, properties),
            () -> BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_RED)
                    .forceSolidOn()
                    .noOcclusion()
                    .randomTicks()
                    .sound(SoundType.AMETHYST)
                    .strength(3F)
                    .lightLevel((BlockState state) -> 8));
    public static final Holder.Reference<Block> LARGE_REDSTONE_BUD = ModRegistry.REGISTRY.registerBlock(
            "large_redstone_bud",
            (BlockBehaviour.Properties properties) -> new RedstoneOresClusterBlock(5, 3, properties),
            () -> BlockBehaviour.Properties.ofFullCopy(REDSTONE_CRYSTAL.value())
                    .sound(SoundType.AMETHYST)
                    .lightLevel((BlockState state) -> 2));
    public static final Holder.Reference<Block> MEDIUM_REDSTONE_BUD = ModRegistry.REGISTRY.registerBlock(
            "medium_redstone_bud",
            (BlockBehaviour.Properties properties) -> new RedstoneOresClusterBlock(4, 3, properties),
            () -> BlockBehaviour.Properties.ofFullCopy(REDSTONE_CRYSTAL.value())
                    .sound(SoundType.AMETHYST)
                    .lightLevel((BlockState state) -> 1));
    public static final Holder.Reference<Block> SMALL_REDSTONE_BUD = ModRegistry.REGISTRY.registerBlock(
            "small_redstone_bud",
            (BlockBehaviour.Properties properties) -> new RedstoneOresClusterBlock(3, 4, properties),
            () -> BlockBehaviour.Properties.ofFullCopy(REDSTONE_CRYSTAL.value()).sound(SoundType.AMETHYST));

    public static final Holder.Reference<Block> BUDDING_EMERALD = ModRegistry.REGISTRY.registerBlock("budding_emerald",
            BuddingEmeraldBlock::new,
            () -> BlockBehaviour.Properties.of()
                    .mapColor(MapColor.STONE)
                    .randomTicks()
                    .strength(3F)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops());
    public static final Holder.Reference<Block> BUDDING_DEEPSLATE_EMERALD = ModRegistry.REGISTRY.registerBlock(
            "budding_deepslate_emerald",
            BuddingEmeraldBlock::new,
            () -> BlockBehaviour.Properties.of()
                    .mapColor(MapColor.DEEPSLATE)
                    .randomTicks()
                    .strength(5F)
                    .sound(SoundType.DEEPSLATE)
                    .requiresCorrectToolForDrops());
    public static final Holder.Reference<Block> BUDDING_SCULK_EMERALD = ModRegistry.REGISTRY.registerBlock(
            "budding_sculk_emerald",
            BuddingEmeraldBlock::new,
            () -> BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_BLACK)
                    .randomTicks()
                    .strength(3F)
                    .sound(SoundType.SCULK)
                    .requiresCorrectToolForDrops());
    public static final Holder.Reference<Block> EMERALD_CLUSTER_BLOCK = ModRegistry.REGISTRY.registerBlock(
            "emerald_cluster_block",
            Block::new,
            () -> BlockBehaviour.Properties.of().mapColor(MapColor.EMERALD).strength(4f).sound(SoundType.STONE));
    public static final Holder.Reference<Block> EMERALD_CLUSTER = ModRegistry.REGISTRY.registerBlock("emerald_cluster",
            (BlockBehaviour.Properties properties) -> new OresClusterBlock(7, 3, properties),
            () -> BlockBehaviour.Properties.of()
                    .mapColor(MapColor.EMERALD)
                    .forceSolidOn()
                    .noOcclusion()
                    .randomTicks()
                    .sound(SoundType.AMETHYST)
                    .strength(3F)
                    .lightLevel((BlockState state) -> 8));
    public static final Holder.Reference<Block> LARGE_EMERALD_BUD = ModRegistry.REGISTRY.registerBlock(
            "large_emerald_bud",
            (BlockBehaviour.Properties properties) -> new LargeOresClusterBlock(5, 3, properties),
            () -> BlockBehaviour.Properties.ofFullCopy(EMERALD_CLUSTER.value())
                    .sound(SoundType.AMETHYST)
                    .lightLevel((BlockState state) -> 2));
    public static final Holder.Reference<Block> MEDIUM_EMERALD_BUD = ModRegistry.REGISTRY.registerBlock(
            "medium_emerald_bud",
            (BlockBehaviour.Properties properties) -> new MediumOresClusterBlock(4, 3, properties),
            () -> BlockBehaviour.Properties.ofFullCopy(EMERALD_CLUSTER.value())
                    .sound(SoundType.AMETHYST)
                    .lightLevel((BlockState state) -> 1));
    public static final Holder.Reference<Block> SMALL_EMERALD_BUD = ModRegistry.REGISTRY.registerBlock(
            "small_emerald_bud",
            (BlockBehaviour.Properties properties) -> new SmallOresClusterBlock(3, 4, properties),
            () -> BlockBehaviour.Properties.ofFullCopy(EMERALD_CLUSTER.value()).sound(SoundType.AMETHYST));

    public static final Holder.Reference<Block> BUDDING_DIAMOND = ModRegistry.REGISTRY.registerBlock("budding_diamond",
            BuddingDiamondBlock::new,
            () -> BlockBehaviour.Properties.of()
                    .mapColor(MapColor.STONE)
                    .randomTicks()
                    .strength(3F)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops());

    public static final Holder.Reference<Block> BUDDING_DEEPSLATE_DIAMOND = ModRegistry.REGISTRY.registerBlock(
            "budding_deepslate_diamond",
            BuddingDiamondBlock::new,
            () -> BlockBehaviour.Properties.of()
                    .mapColor(MapColor.DEEPSLATE)
                    .randomTicks()
                    .strength(5F)
                    .sound(SoundType.DEEPSLATE)
                    .requiresCorrectToolForDrops());

    public static final Holder.Reference<Block> BUDDING_SCULK_DIAMOND = ModRegistry.REGISTRY.registerBlock(
            "budding_sculk_diamond",
            BuddingDiamondBlock::new,
            () -> BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_BLACK)
                    .randomTicks()
                    .strength(3F)
                    .sound(SoundType.SCULK)
                    .requiresCorrectToolForDrops());
    public static final Holder.Reference<Block> DIAMOND_CRYSTAL_BLOCK = ModRegistry.REGISTRY.registerBlock(
            "diamond_crystal_block",
            Block::new,
            () -> BlockBehaviour.Properties.of().mapColor(MapColor.DIAMOND).strength(4f).sound(SoundType.STONE));
    public static final Holder.Reference<Block> DIAMOND_CRYSTAL = ModRegistry.REGISTRY.registerBlock("diamond_crystal",
            (BlockBehaviour.Properties properties) -> new OresClusterBlock(7, 3, properties),
            () -> BlockBehaviour.Properties.of()
                    .mapColor(MapColor.DIAMOND)
                    .forceSolidOn()
                    .noOcclusion()
                    .randomTicks()
                    .sound(SoundType.AMETHYST)
                    .strength(3F)
                    .lightLevel((BlockState state) -> 8));
    public static final Holder.Reference<Block> LARGE_DIAMOND_BUD = ModRegistry.REGISTRY.registerBlock(
            "large_diamond_bud",
            (BlockBehaviour.Properties properties) -> new LargeOresClusterBlock(5, 3, properties),
            () -> BlockBehaviour.Properties.ofFullCopy(DIAMOND_CRYSTAL.value())
                    .sound(SoundType.AMETHYST)
                    .lightLevel((BlockState state) -> 2));
    public static final Holder.Reference<Block> MEDIUM_DIAMOND_BUD = ModRegistry.REGISTRY.registerBlock(
            "medium_diamond_bud",
            (BlockBehaviour.Properties properties) -> new MediumOresClusterBlock(4, 3, properties),
            () -> BlockBehaviour.Properties.ofFullCopy(DIAMOND_CRYSTAL.value())
                    .sound(SoundType.AMETHYST)
                    .lightLevel((BlockState state) -> 1));
    public static final Holder.Reference<Block> SMALL_DIAMOND_BUD = ModRegistry.REGISTRY.registerBlock(
            "small_diamond_bud",
            (BlockBehaviour.Properties properties) -> new SmallOresClusterBlock(3, 4, properties),
            () -> BlockBehaviour.Properties.ofFullCopy(DIAMOND_CRYSTAL.value()).sound(SoundType.AMETHYST));

    public static final Holder.Reference<Block> BUDDING_NETHER_QUARTZ = ModRegistry.REGISTRY.registerBlock(
            "budding_nether_quartz",
            BuddingNetherQuartzBlock::new,
            () -> BlockBehaviour.Properties.of()
                    .mapColor(MapColor.NETHER)
                    .randomTicks()
                    .strength(3F)
                    .sound(SoundType.NETHER_ORE)
                    .requiresCorrectToolForDrops());
    public static final Holder.Reference<Block> BUDDING_BASALT_QUARTZ = ModRegistry.REGISTRY.registerBlock(
            "budding_basalt_quartz",
            BuddingNetherQuartzBlock::new,
            () -> BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_BLACK)
                    .randomTicks()
                    .strength(3F)
                    .sound(SoundType.BASALT)
                    .requiresCorrectToolForDrops());
    public static final Holder.Reference<Block> BUDDING_BLACKSTONE_QUARTZ = ModRegistry.REGISTRY.registerBlock(
            "budding_blackstone_quartz",
            BuddingNetherQuartzBlock::new,
            () -> BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_BLACK)
                    .randomTicks()
                    .strength(3F)
                    .sound(SoundType.NETHER_ORE)
                    .requiresCorrectToolForDrops());
    public static final Holder.Reference<Block> QUARTZ_CRYSTAL_BLOCK = ModRegistry.REGISTRY.registerBlock(
            "nether_quartz_crystal_block",
            Block::new,
            () -> BlockBehaviour.Properties.of().mapColor(MapColor.QUARTZ).strength(3f).sound(SoundType.STONE));

    public static final Holder.Reference<Block> QUARTZ_CRYSTAL = ModRegistry.REGISTRY.registerBlock(
            "nether_quartz_crystal",
            (BlockBehaviour.Properties properties) -> new QuartzCrystalBlock(7, 3, properties),
            () -> BlockBehaviour.Properties.of()
                    .mapColor(MapColor.QUARTZ)
                    .forceSolidOn()
                    .noOcclusion()
                    .randomTicks()
                    .sound(SoundType.NETHER_ORE)
                    .strength(3F)
                    .lightLevel((BlockState state) -> 8));
    public static final Holder.Reference<Block> LARGE_QUARTZ_BUD = ModRegistry.REGISTRY.registerBlock(
            "large_nether_quartz_bud",
            (BlockBehaviour.Properties properties) -> new QuartzCrystalBlock(5, 3, properties),
            () -> BlockBehaviour.Properties.ofFullCopy(QUARTZ_CRYSTAL.value())
                    .sound(SoundType.NETHER_ORE)
                    .lightLevel((BlockState state) -> 2));
    public static final Holder.Reference<Block> MEDIUM_QUARTZ_BUD = ModRegistry.REGISTRY.registerBlock(
            "medium_nether_quartz_bud",
            (BlockBehaviour.Properties properties) -> new QuartzCrystalBlock(4, 3, properties),
            () -> BlockBehaviour.Properties.ofFullCopy(QUARTZ_CRYSTAL.value())
                    .sound(SoundType.NETHER_ORE)
                    .lightLevel((BlockState state) -> 1));
    public static final Holder.Reference<Block> SMALL_QUARTZ_BUD = ModRegistry.REGISTRY.registerBlock(
            "small_nether_quartz_bud",
            (BlockBehaviour.Properties properties) -> new QuartzCrystalBlock(3, 4, properties),
            () -> BlockBehaviour.Properties.ofFullCopy(QUARTZ_CRYSTAL.value()).sound(SoundType.NETHER_ORE));

    public static final Holder.Reference<Block> BUDDING_GOLD_NUGGET = ModRegistry.REGISTRY.registerBlock(
            "budding_nether_gold_nugvalue",
            BuddingNetherGoldBlock::new,
            () -> BlockBehaviour.Properties.of()
                    .mapColor(MapColor.NETHER)
                    .randomTicks()
                    .strength(3F)
                    .sound(SoundType.NETHER_GOLD_ORE)
                    .requiresCorrectToolForDrops());
    public static final Holder.Reference<Block> BUDDING_BASALT_GOLD_NUGGET = ModRegistry.REGISTRY.registerBlock(
            "budding_basalt_gold_nugvalue",
            BuddingNetherGoldBlock::new,
            () -> BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_BLACK)
                    .randomTicks()
                    .strength(3F)
                    .sound(SoundType.NETHER_GOLD_ORE)
                    .requiresCorrectToolForDrops());
    public static final Holder.Reference<Block> BUDDING_BLACKSTONE_GOLD_NUGGET = ModRegistry.REGISTRY.registerBlock(
            "budding_blackstone_gold_nugvalue",
            BuddingNetherGoldBlock::new,
            () -> BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_BLACK)
                    .randomTicks()
                    .strength(3F)
                    .sound(SoundType.NETHER_GOLD_ORE)
                    .requiresCorrectToolForDrops());
    public static final Holder.Reference<Block> GOLD_NUGGET_CLUSTER_BLOCK = ModRegistry.REGISTRY.registerBlock(
            "nether_gold_nugvalue_cluster_block",
            Block::new,
            () -> BlockBehaviour.Properties.of().mapColor(MapColor.GOLD).strength(4f).sound(SoundType.STONE));

    public static final Holder.Reference<Block> GOLD_NUGGET_CLUSTER = ModRegistry.REGISTRY.registerBlock(
            "nether_gold_nugvalue_cluster",
            (BlockBehaviour.Properties properties) -> new NetherGoldClusterBlock(7, 3, properties),
            () -> BlockBehaviour.Properties.of()
                    .mapColor(MapColor.GOLD)
                    .forceSolidOn()
                    .noOcclusion()
                    .randomTicks()
                    .sound(SoundType.NETHER_GOLD_ORE)
                    .strength(3F)
                    .lightLevel((BlockState state) -> 8));
    public static final Holder.Reference<Block> LARGE_GOLD_NUGGET_BUD = ModRegistry.REGISTRY.registerBlock(
            "large_nether_gold_nugvalue_bud",
            (BlockBehaviour.Properties properties) -> new NetherGoldClusterBlock(5, 3, properties),
            () -> BlockBehaviour.Properties.ofFullCopy(GOLD_NUGGET_CLUSTER.value())
                    .sound(SoundType.NETHER_GOLD_ORE)
                    .lightLevel((BlockState state) -> 2));
    public static final Holder.Reference<Block> MEDIUM_GOLD_NUGGET_BUD = ModRegistry.REGISTRY.registerBlock(
            "medium_nether_gold_nugvalue_bud",
            (BlockBehaviour.Properties properties) -> new NetherGoldClusterBlock(4, 3, properties),
            () -> BlockBehaviour.Properties.ofFullCopy(GOLD_NUGGET_CLUSTER.value())
                    .sound(SoundType.NETHER_GOLD_ORE)
                    .lightLevel((BlockState state) -> 1));
    public static final Holder.Reference<Block> SMALL_GOLD_NUGGET_BUD = ModRegistry.REGISTRY.registerBlock(
            "small_nether_gold_nugvalue_bud",
            (BlockBehaviour.Properties properties) -> new NetherGoldClusterBlock(3, 4, properties),
            () -> BlockBehaviour.Properties.ofFullCopy(GOLD_NUGGET_CLUSTER.value()).sound(SoundType.NETHER_GOLD_ORE));

    public static final Holder.Reference<Block> BUDDING_GLOWSTONE = ModRegistry.REGISTRY.registerBlock(
            "budding_nether_glowstone",
            BuddingGlowstoneBlock::new,
            () -> BlockBehaviour.Properties.of()
                    .mapColor(MapColor.NETHER)
                    .randomTicks()
                    .strength(3F)
                    .sound(SoundType.GLASS)
                    .requiresCorrectToolForDrops()
                    .lightLevel((BlockState state) -> 10));
    public static final Holder.Reference<Block> BUDDING_BASALT_GLOWSTONE = ModRegistry.REGISTRY.registerBlock(
            "budding_basalt_glowstone",
            BuddingGlowstoneBlock::new,
            () -> BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_BLACK)
                    .randomTicks()
                    .strength(3F)
                    .sound(SoundType.GLASS)
                    .requiresCorrectToolForDrops()
                    .lightLevel((BlockState state) -> 10));
    public static final Holder.Reference<Block> BUDDING_BLACKSTONE_GLOWSTONE = ModRegistry.REGISTRY.registerBlock(
            "budding_blackstone_glowstone",
            BuddingGlowstoneBlock::new,
            () -> BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_BLACK)
                    .randomTicks()
                    .strength(3F)
                    .sound(SoundType.GLASS)
                    .requiresCorrectToolForDrops()
                    .lightLevel((BlockState state) -> 10));
    public static final Holder.Reference<Block> GLOWSTONE_CLUSTER_BLOCK = ModRegistry.REGISTRY.registerBlock(
            "nether_glowstone_cluster_block",
            Block::new,
            () -> BlockBehaviour.Properties.of()
                    .mapColor(MapColor.SAND)
                    .strength(4f)
                    .sound(SoundType.GLASS)
                    .lightLevel((BlockState state) -> 15));

    public static final Holder.Reference<Block> GLOWSTONE_CLUSTER = ModRegistry.REGISTRY.registerBlock(
            "nether_glowstone_cluster",
            (BlockBehaviour.Properties properties) -> new GlowstoneClusterBlock(7, 3, properties),
            () -> BlockBehaviour.Properties.of()
                    .mapColor(MapColor.SAND)
                    .forceSolidOn()
                    .noOcclusion()
                    .randomTicks()
                    .sound(SoundType.GLASS)
                    .strength(3F)
                    .lightLevel((BlockState state) -> 15));
    public static final Holder.Reference<Block> LARGE_GLOWSTONE_BUD = ModRegistry.REGISTRY.registerBlock(
            "large_nether_glowstone_bud",
            (BlockBehaviour.Properties properties) -> new GlowstoneClusterBlock(5, 3, properties),
            () -> BlockBehaviour.Properties.ofFullCopy(GLOWSTONE_CLUSTER.value())
                    .sound(SoundType.GLASS)
                    .lightLevel((BlockState state) -> 5));
    public static final Holder.Reference<Block> MEDIUM_GLOWSTONE_BUD = ModRegistry.REGISTRY.registerBlock(
            "medium_nether_glowstone_bud",
            (BlockBehaviour.Properties properties) -> new GlowstoneClusterBlock(4, 3, properties),
            () -> BlockBehaviour.Properties.ofFullCopy(GLOWSTONE_CLUSTER.value())
                    .sound(SoundType.GLASS)
                    .lightLevel((BlockState state) -> 3));
    public static final Holder.Reference<Block> SMALL_GLOWSTONE_BUD = ModRegistry.REGISTRY.registerBlock(
            "small_nether_glowstone_bud",
            (BlockBehaviour.Properties properties) -> new GlowstoneClusterBlock(3, 4, properties),
            () -> BlockBehaviour.Properties.ofFullCopy(GLOWSTONE_CLUSTER.value())
                    .sound(SoundType.GLASS)
                    .lightLevel((BlockState state) -> 2));

    public static final Holder.Reference<Block> BUDDING_ANCIENT_DEBRIS = ModRegistry.REGISTRY.registerBlock(
            "budding_nether_ancient_debris",
            BuddingAncientDebrisBlock::new,
            () -> BlockBehaviour.Properties.of()
                    .mapColor(MapColor.NETHER)
                    .randomTicks()
                    .strength(10F)
                    .sound(SoundType.ANCIENT_DEBRIS)
                    .requiresCorrectToolForDrops()
                    .lightLevel((BlockState state) -> 10));
    public static final Holder.Reference<Block> BUDDING_BASALT_ANCIENT_DEBRIS = ModRegistry.REGISTRY.registerBlock(
            "budding_basalt_ancient_debris",
            BuddingAncientDebrisBlock::new,
            () -> BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_BLACK)
                    .randomTicks()
                    .strength(10F)
                    .sound(SoundType.ANCIENT_DEBRIS)
                    .requiresCorrectToolForDrops()
                    .lightLevel((BlockState state) -> 10));
    public static final Holder.Reference<Block> BUDDING_BLACKSTONE_ANCIENT_DEBRIS = ModRegistry.REGISTRY.registerBlock(
            "budding_blackstone_ancient_debris",
            BuddingAncientDebrisBlock::new,
            () -> BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_BLACK)
                    .randomTicks()
                    .strength(10F)
                    .sound(SoundType.ANCIENT_DEBRIS)
                    .requiresCorrectToolForDrops()
                    .lightLevel((BlockState state) -> 10));
    public static final Holder.Reference<Block> ANCIENT_DEBRIS_CLUSTER_BLOCK = ModRegistry.REGISTRY.registerBlock(
            "nether_ancient_debris_cluster_block",
            Block::new,
            () -> BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BROWN).strength(4f).sound(SoundType.STONE));


    public static final Holder.Reference<Block> ANCIENT_DEBRIS_CLUSTER = ModRegistry.REGISTRY.registerBlock(
            "nether_ancient_debris_cluster",
            (BlockBehaviour.Properties properties) -> new WrappistClusterBlock(7, 3, properties),
            () -> BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_BROWN)
                    .forceSolidOn()
                    .noOcclusion()
                    .randomTicks()
                    .sound(SoundType.ANCIENT_DEBRIS)
                    .strength(10F)
                    .lightLevel((BlockState state) -> 8));
    public static final Holder.Reference<Block> LARGE_ANCIENT_DEBRIS_BUD = ModRegistry.REGISTRY.registerBlock(
            "large_nether_ancient_debris_bud",
            (BlockBehaviour.Properties properties) -> new AncientDebrisClusterBlock(5, 3, properties),
            () -> BlockBehaviour.Properties.ofFullCopy(ANCIENT_DEBRIS_CLUSTER.value())
                    .sound(SoundType.ANCIENT_DEBRIS)
                    .lightLevel((BlockState state) -> 5));
    public static final Holder.Reference<Block> MEDIUM_ANCIENT_DEBRIS_BUD = ModRegistry.REGISTRY.registerBlock(
            "medium_nether_ancient_debris_bud",
            (BlockBehaviour.Properties properties) -> new AncientDebrisClusterBlock(4, 3, properties),
            () -> BlockBehaviour.Properties.ofFullCopy(ANCIENT_DEBRIS_CLUSTER.value())
                    .sound(SoundType.ANCIENT_DEBRIS)
                    .lightLevel((BlockState state) -> 3));
    public static final Holder.Reference<Block> SMALL_ANCIENT_DEBRIS_BUD = ModRegistry.REGISTRY.registerBlock(
            "small_nether_ancient_debris_bud",
            (BlockBehaviour.Properties properties) -> new AncientDebrisClusterBlock(3, 4, properties),
            () -> BlockBehaviour.Properties.ofFullCopy(ANCIENT_DEBRIS_CLUSTER.value())
                    .sound(SoundType.ANCIENT_DEBRIS)
                    .lightLevel((BlockState state) -> 2));

    public static final Holder.Reference<Block> SMOOTH_END_STONE = ModRegistry.REGISTRY.registerBlock("smooth_end_stone",
            Block::new,
            () -> BlockBehaviour.Properties.of().mapColor(MapColor.SAND).strength(4f).sound(SoundType.BASALT));
    public static final Holder.Reference<Block> SMOOTH_END_STONE_STAIRS = ModRegistry.REGISTRY.registerBlock(
            "smooth_end_stone_stairs",
            (BlockBehaviour.Properties properties) -> new StairBlock(SMOOTH_END_STONE.value().defaultBlockState(),
                    properties),
            () -> BlockBehaviour.Properties.ofFullCopy(SMOOTH_END_STONE.value()));
    public static final Holder.Reference<Block> SMOOTH_END_STONE_SLAB = ModRegistry.REGISTRY.registerBlock(
            "smooth_end_stone_slab",
            SlabBlock::new,
            () -> BlockBehaviour.Properties.of().mapColor(MapColor.SAND).strength(4f).sound(SoundType.BASALT));
    public static final Holder.Reference<Block> SMOOTH_END_STONE_WALL = ModRegistry.REGISTRY.registerBlock(
            "smooth_end_stone_wall",
            WallBlock::new,
            () -> BlockBehaviour.Properties.ofFullCopy(SMOOTH_END_STONE.value()));
    public static final Holder.Reference<Block> GALCITE = ModRegistry.REGISTRY.registerBlock("galcite",
            Block::new,
            () -> BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_BLACK)
                    .strength(5f, 1200)
                    .sound(SoundType.CALCITE));
    public static final Holder.Reference<Block> GALCITE_STAIRS = ModRegistry.REGISTRY.registerBlock("galcite_stairs",
            (BlockBehaviour.Properties properties) -> new StairBlock(GALCITE.value().defaultBlockState(), properties),
            () -> BlockBehaviour.Properties.ofFullCopy(GALCITE.value()));
    public static final Holder.Reference<Block> GALCITE_SLAB = ModRegistry.REGISTRY.registerBlock("galcite_slab",
            SlabBlock::new,
            () -> BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLACK).strength(4f).sound(SoundType.CALCITE));
    public static final Holder.Reference<Block> GALCITE_WALL = ModRegistry.REGISTRY.registerBlock("galcite_wall",
            WallBlock::new,
            () -> BlockBehaviour.Properties.ofFullCopy(GALCITE.value()));
    public static final Holder.Reference<Block> WRAPPIST_BLOCK = ModRegistry.REGISTRY.registerBlock("wrappist_block",
            Block::new,
            () -> BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_LIGHT_BLUE)
                    .strength(5f)
                    .sound(SoundType.AMETHYST));

    public static final Holder.Reference<Block> BUDDING_WRAPPIST = ModRegistry.REGISTRY.registerBlock("budding_wrappist",
            BuddingWrappistBlock::new,
            () -> BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_LIGHT_BLUE)
                    .randomTicks()
                    .strength(5F)
                    .sound(SoundType.AMETHYST)
                    .requiresCorrectToolForDrops());
    public static final Holder.Reference<Block> WRAPPIST_CLUSTER = ModRegistry.REGISTRY.registerBlock("wrappist_cluster",
            (BlockBehaviour.Properties properties) -> new WrappistClusterBlock(7, 3, properties),
            () -> BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_LIGHT_BLUE)
                    .forceSolidOn()
                    .noOcclusion()
                    .randomTicks()
                    .sound(SoundType.AMETHYST_CLUSTER)
                    .strength(3F)
                    .lightLevel((BlockState state) -> 8));
    public static final Holder.Reference<Block> LARGE_WRAPPIST_BUD = ModRegistry.REGISTRY.registerBlock(
            "large_wrappist_bud",
            (BlockBehaviour.Properties properties) -> new WrappistClusterBlock(5, 3, properties),
            () -> BlockBehaviour.Properties.ofFullCopy(WRAPPIST_CLUSTER.value())
                    .sound(SoundType.MEDIUM_AMETHYST_BUD)
                    .lightLevel((BlockState state) -> 6));
    public static final Holder.Reference<Block> MEDIUM_WRAPPIST_BUD = ModRegistry.REGISTRY.registerBlock(
            "medium_wrappist_bud",
            (BlockBehaviour.Properties properties) -> new WrappistClusterBlock(4, 3, properties),
            () -> BlockBehaviour.Properties.ofFullCopy(WRAPPIST_CLUSTER.value())
                    .sound(SoundType.LARGE_AMETHYST_BUD)
                    .lightLevel((BlockState state) -> 3));
    public static final Holder.Reference<Block> SMALL_WRAPPIST_BUD = ModRegistry.REGISTRY.registerBlock(
            "small_wrappist_bud",
            (BlockBehaviour.Properties properties) -> new WrappistClusterBlock(3, 4, properties),
            () -> BlockBehaviour.Properties.ofFullCopy(WRAPPIST_CLUSTER.value())
                    .sound(SoundType.SMALL_AMETHYST_BUD)
                    .lightLevel((BlockState state) -> 2));

    public static final Holder.Reference<Block> ECHO_CRYSTAL_BLOCK = ModRegistry.REGISTRY.registerBlock(
            "echo_crystal_block",
            Block::new,
            () -> BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_BLACK)
                    .strength(5f)
                    .sound(SoundType.SCULK_CATALYST));
    public static final Holder.Reference<Block> BUDDING_ECHO = ModRegistry.REGISTRY.registerBlock("budding_echo",
            BuddingEchoBlock::new,
            () -> BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_BLACK)
                    .randomTicks()
                    .strength(5F)
                    .sound(SoundType.SCULK)
                    .requiresCorrectToolForDrops());

    public static final Holder.Reference<Block> ECHO_CRYSTAL = ModRegistry.REGISTRY.registerBlock("echo_crystal",
            (BlockBehaviour.Properties properties) -> new EchoCrystalBlock(7, 3, properties),
            () -> BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_BLACK)
                    .forceSolidOn()
                    .noOcclusion()
                    .randomTicks()
                    .sound(SoundType.SCULK_CATALYST)
                    .strength(4F)
                    .lightLevel((BlockState state) -> 3));
    public static final Holder.Reference<Block> LARGE_ECHO_BUD = ModRegistry.REGISTRY.registerBlock("large_echo_bud",
            (BlockBehaviour.Properties properties) -> new EchoCrystalBlock(5, 3, properties),
            () -> BlockBehaviour.Properties.ofFullCopy(ECHO_CRYSTAL.value())
                    .sound(SoundType.SCULK_CATALYST)
                    .lightLevel((BlockState state) -> 2));
    public static final Holder.Reference<Block> MEDIUM_ECHO_BUD = ModRegistry.REGISTRY.registerBlock("medium_echo_bud",
            (BlockBehaviour.Properties properties) -> new EchoCrystalBlock(4, 3, properties),
            () -> BlockBehaviour.Properties.ofFullCopy(ECHO_CRYSTAL.value())
                    .sound(SoundType.SCULK_CATALYST)
                    .lightLevel((BlockState state) -> 1));
    public static final Holder.Reference<Block> SMALL_ECHO_BUD = ModRegistry.REGISTRY.registerBlock("small_echo_bud",
            (BlockBehaviour.Properties properties) -> new EchoCrystalBlock(3, 4, properties),
            () -> BlockBehaviour.Properties.ofFullCopy(ECHO_CRYSTAL.value()).sound(SoundType.SCULK_CATALYST));

    public static final Holder.Reference<Block> WRAPPIST_PEDESTAL = ModRegistry.REGISTRY.registerBlock(
            "wrappist_pedestal",
            WrappistPedestalBlock::new,
            () -> BlockBehaviour.Properties.ofFullCopy(WRAPPIST_BLOCK.value())
                    .explosionResistance(100.0F)
                    .randomTicks()
                    .noOcclusion()
                    .lightLevel((BlockState state) -> 8));

    public static final Holder.Reference<Block> WRAPPIST_GLASS = ModRegistry.REGISTRY.registerBlock("wrappist_glass",
            TransparentBlock::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.GLASS)
                    .explosionResistance(100F)
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
