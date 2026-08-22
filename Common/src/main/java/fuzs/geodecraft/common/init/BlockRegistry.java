package fuzs.geodecraft.common.init;

import fuzs.geodecraft.common.world.level.block.*;
import net.minecraft.core.Holder;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;

public class BlockRegistry {

    // Pink Topaz

    public static final Holder.Reference<Block> PINK_TOPAZ_CLUSTER = ModRegistry.REGISTRIES.registerBlock(
            "pink_topaz_cluster",
            (BlockBehaviour.Properties properties) -> new AmethystClusterBlock(DropExperienceClusterBlock.CLUSTER_HEIGHT,
                    DropExperienceClusterBlock.CLUSTER_OFFSET,
                    properties),
            () -> clusterProperties(MapColor.COLOR_PINK));
    public static final Holder.Reference<Block> LARGE_PINK_TOPAZ_BUD = ModRegistry.REGISTRIES.registerBlock(
            "large_pink_topaz_bud",
            (BlockBehaviour.Properties properties) -> new AmethystClusterBlock(DropExperienceClusterBlock.LARGE_CLUSTER_HEIGHT,
                    DropExperienceClusterBlock.LARGE_CLUSTER_OFFSET,
                    properties),
            () -> largeBudProperties(MapColor.COLOR_PINK));
    public static final Holder.Reference<Block> MEDIUM_PINK_TOPAZ_BUD = ModRegistry.REGISTRIES.registerBlock(
            "medium_pink_topaz_bud",
            (BlockBehaviour.Properties properties) -> new AmethystClusterBlock(DropExperienceClusterBlock.MEDIUM_CLUSTER_HEIGHT,
                    DropExperienceClusterBlock.MEDIUM_CLUSTER_OFFSET,
                    properties),
            () -> mediumBudProperties(MapColor.COLOR_PINK));
    public static final Holder.Reference<Block> SMALL_PINK_TOPAZ_BUD = ModRegistry.REGISTRIES.registerBlock(
            "small_pink_topaz_bud",
            (BlockBehaviour.Properties properties) -> new AmethystClusterBlock(DropExperienceClusterBlock.SMALL_CLUSTER_HEIGHT,
                    DropExperienceClusterBlock.SMALL_CLUSTER_OFFSET,
                    properties),
            () -> smallBudProperties(MapColor.COLOR_PINK));
    public static final Holder.Reference<Block> BUDDING_PINK_TOPAZ = ModRegistry.REGISTRIES.registerBlock(
            "budding_pink_topaz",
            BuddingGrantEffectBlock::pinkTopaz,
            () -> buddingProperties(MapColor.COLOR_PINK));
    public static final Holder.Reference<Block> PINK_TOPAZ_BLOCK = ModRegistry.REGISTRIES.registerBlock(
            "pink_topaz_block",
            Block::new,
            () -> clusterBlockProperties(MapColor.COLOR_PINK));

    // Celestite

    public static final Holder.Reference<Block> CELESTITE_CLUSTER = ModRegistry.REGISTRIES.registerBlock(
            "celestite_cluster",
            (BlockBehaviour.Properties properties) -> new AmethystClusterBlock(DropExperienceClusterBlock.CLUSTER_HEIGHT,
                    DropExperienceClusterBlock.CLUSTER_OFFSET,
                    properties),
            () -> clusterProperties(MapColor.COLOR_CYAN));
    public static final Holder.Reference<Block> LARGE_CELESTITE_BUD = ModRegistry.REGISTRIES.registerBlock(
            "large_celestite_bud",
            (BlockBehaviour.Properties properties) -> new AmethystClusterBlock(DropExperienceClusterBlock.LARGE_CLUSTER_HEIGHT,
                    DropExperienceClusterBlock.LARGE_CLUSTER_OFFSET,
                    properties),
            () -> largeBudProperties(MapColor.COLOR_CYAN));
    public static final Holder.Reference<Block> MEDIUM_CELESTITE_BUD = ModRegistry.REGISTRIES.registerBlock(
            "medium_celestite_bud",
            (BlockBehaviour.Properties properties) -> new AmethystClusterBlock(DropExperienceClusterBlock.MEDIUM_CLUSTER_HEIGHT,
                    DropExperienceClusterBlock.MEDIUM_CLUSTER_OFFSET,
                    properties),
            () -> mediumBudProperties(MapColor.COLOR_CYAN));
    public static final Holder.Reference<Block> SMALL_CELESTITE_BUD = ModRegistry.REGISTRIES.registerBlock(
            "small_celestite_bud",
            (BlockBehaviour.Properties properties) -> new AmethystClusterBlock(DropExperienceClusterBlock.SMALL_CLUSTER_HEIGHT,
                    DropExperienceClusterBlock.SMALL_CLUSTER_OFFSET,
                    properties),
            () -> smallBudProperties(MapColor.COLOR_CYAN));
    public static final Holder.Reference<Block> BUDDING_CELESTITE = ModRegistry.REGISTRIES.registerBlock(
            "budding_celestite",
            BuddingGrantEffectBlock::celestite,
            () -> buddingProperties(MapColor.COLOR_CYAN));
    public static final Holder.Reference<Block> CELESTITE_BLOCK = ModRegistry.REGISTRIES.registerBlock("celestite_block",
            Block::new,
            () -> clusterBlockProperties(MapColor.COLOR_CYAN));

    // Wrappist

    public static final Holder.Reference<Block> WRAPPIST_CLUSTER = ModRegistry.REGISTRIES.registerBlock(
            "wrappist_cluster",
            (BlockBehaviour.Properties properties) -> new AmethystClusterBlock(DropExperienceClusterBlock.CLUSTER_HEIGHT,
                    DropExperienceClusterBlock.CLUSTER_OFFSET,
                    properties),
            () -> clusterProperties(MapColor.COLOR_LIGHT_BLUE));
    public static final Holder.Reference<Block> LARGE_WRAPPIST_BUD = ModRegistry.REGISTRIES.registerBlock(
            "large_wrappist_bud",
            (BlockBehaviour.Properties properties) -> new AmethystClusterBlock(DropExperienceClusterBlock.LARGE_CLUSTER_HEIGHT,
                    DropExperienceClusterBlock.LARGE_CLUSTER_OFFSET,
                    properties),
            () -> largeBudProperties(MapColor.COLOR_LIGHT_BLUE));
    public static final Holder.Reference<Block> MEDIUM_WRAPPIST_BUD = ModRegistry.REGISTRIES.registerBlock(
            "medium_wrappist_bud",
            (BlockBehaviour.Properties properties) -> new AmethystClusterBlock(DropExperienceClusterBlock.MEDIUM_CLUSTER_HEIGHT,
                    DropExperienceClusterBlock.MEDIUM_CLUSTER_OFFSET,
                    properties),
            () -> mediumBudProperties(MapColor.COLOR_LIGHT_BLUE));
    public static final Holder.Reference<Block> SMALL_WRAPPIST_BUD = ModRegistry.REGISTRIES.registerBlock(
            "small_wrappist_bud",
            (BlockBehaviour.Properties properties) -> new AmethystClusterBlock(DropExperienceClusterBlock.SMALL_CLUSTER_HEIGHT,
                    DropExperienceClusterBlock.SMALL_CLUSTER_OFFSET,
                    properties),
            () -> smallBudProperties(MapColor.COLOR_LIGHT_BLUE));
    public static final Holder.Reference<Block> BUDDING_WRAPPIST = ModRegistry.REGISTRIES.registerBlock(
            "budding_wrappist",
            BuddingGrantEffectBlock::wrappist,
            () -> buddingProperties(MapColor.COLOR_LIGHT_BLUE));
    public static final Holder.Reference<Block> WRAPPIST_BLOCK = ModRegistry.REGISTRIES.registerBlock("wrappist_block",
            Block::new,
            () -> clusterBlockProperties(MapColor.COLOR_LIGHT_BLUE));

    // Prismarine

    public static final Holder.Reference<Block> PRISMARINE_CRYSTAL = ModRegistry.REGISTRIES.registerBlock(
            "prismarine_crystal",
            (BlockBehaviour.Properties properties) -> new AmethystClusterBlock(DropExperienceClusterBlock.CLUSTER_HEIGHT,
                    DropExperienceClusterBlock.CLUSTER_OFFSET,
                    properties),
            () -> clusterProperties(MapColor.COLOR_CYAN));
    public static final Holder.Reference<Block> LARGE_PRISMARINE_BUD = ModRegistry.REGISTRIES.registerBlock(
            "large_prismarine_bud",
            (BlockBehaviour.Properties properties) -> new AmethystClusterBlock(DropExperienceClusterBlock.LARGE_CLUSTER_HEIGHT,
                    DropExperienceClusterBlock.LARGE_CLUSTER_OFFSET,
                    properties),
            () -> largeBudProperties(MapColor.COLOR_CYAN));
    public static final Holder.Reference<Block> MEDIUM_PRISMARINE_BUD = ModRegistry.REGISTRIES.registerBlock(
            "medium_prismarine_bud",
            (BlockBehaviour.Properties properties) -> new AmethystClusterBlock(DropExperienceClusterBlock.MEDIUM_CLUSTER_HEIGHT,
                    DropExperienceClusterBlock.MEDIUM_CLUSTER_OFFSET,
                    properties),
            () -> mediumBudProperties(MapColor.COLOR_CYAN));
    public static final Holder.Reference<Block> SMALL_PRISMARINE_BUD = ModRegistry.REGISTRIES.registerBlock(
            "small_prismarine_bud",
            (BlockBehaviour.Properties properties) -> new AmethystClusterBlock(DropExperienceClusterBlock.SMALL_CLUSTER_HEIGHT,
                    DropExperienceClusterBlock.SMALL_CLUSTER_OFFSET,
                    properties),
            () -> smallBudProperties(MapColor.COLOR_CYAN));
    public static final Holder.Reference<Block> BUDDING_PRISMARINE = ModRegistry.REGISTRIES.registerBlock(
            "budding_prismarine",
            BuddingBlock::prismarine,
            BlockRegistry::buddingPrismarineProperties);
    public static final Holder.Reference<Block> PRISMARINE_CRYSTAL_BLOCK = ModRegistry.REGISTRIES.registerBlock(
            "prismarine_crystal_block",
            Block::new,
            () -> clusterBlockProperties(MapColor.COLOR_CYAN));

    // Echo

    public static final Holder.Reference<Block> ECHO_CRYSTAL = ModRegistry.REGISTRIES.registerBlock("echo_crystal",
            (BlockBehaviour.Properties properties) -> DropExperienceClusterBlock.cluster(UniformInt.of(3, 7),
                    properties),
            () -> clusterProperties(MapColor.COLOR_BLACK));
    public static final Holder.Reference<Block> LARGE_ECHO_BUD = ModRegistry.REGISTRIES.registerBlock("large_echo_bud",
            (BlockBehaviour.Properties properties) -> DropExperienceClusterBlock.large(UniformInt.of(2, 6), properties),
            () -> largeBudProperties(MapColor.COLOR_BLACK));
    public static final Holder.Reference<Block> MEDIUM_ECHO_BUD = ModRegistry.REGISTRIES.registerBlock("medium_echo_bud",
            (BlockBehaviour.Properties properties) -> DropExperienceClusterBlock.medium(UniformInt.of(1, 5),
                    properties),
            () -> mediumBudProperties(MapColor.COLOR_BLACK));
    public static final Holder.Reference<Block> SMALL_ECHO_BUD = ModRegistry.REGISTRIES.registerBlock("small_echo_bud",
            (BlockBehaviour.Properties properties) -> DropExperienceClusterBlock.small(UniformInt.of(0, 4), properties),
            () -> smallBudProperties(MapColor.COLOR_BLACK));
    public static final Holder.Reference<Block> BUDDING_ECHO = ModRegistry.REGISTRIES.registerBlock("budding_echo",
            BuddingEchoCrystalBlock::echoCrystal,
            BlockRegistry::buddingSculkProperties);
    public static final Holder.Reference<Block> ECHO_CRYSTAL_BLOCK = ModRegistry.REGISTRIES.registerBlock(
            "echo_crystal_block",
            Block::new,
            () -> clusterBlockProperties(MapColor.COLOR_BLACK).sound(SoundType.SCULK_CATALYST));

    // Redstone

    public static final Holder.Reference<Block> REDSTONE_CRYSTAL = ModRegistry.REGISTRIES.registerBlock(
            "redstone_crystal",
            (BlockBehaviour.Properties properties) -> new RedstoneOreClusterBlock(RedstoneOreClusterBlock.CLUSTER_HEIGHT,
                    RedstoneOreClusterBlock.CLUSTER_OFFSET,
                    UniformInt.of(1, 5),
                    properties),
            () -> clusterProperties(MapColor.COLOR_RED).randomTicks());
    public static final Holder.Reference<Block> LARGE_REDSTONE_BUD = ModRegistry.REGISTRIES.registerBlock(
            "large_redstone_bud",
            (BlockBehaviour.Properties properties) -> new RedstoneOreClusterBlock(RedstoneOreClusterBlock.LARGE_CLUSTER_HEIGHT,
                    RedstoneOreClusterBlock.LARGE_CLUSTER_OFFSET,
                    UniformInt.of(0, 4),
                    properties),
            () -> largeBudProperties(MapColor.COLOR_RED).randomTicks());
    public static final Holder.Reference<Block> MEDIUM_REDSTONE_BUD = ModRegistry.REGISTRIES.registerBlock(
            "medium_redstone_bud",
            (BlockBehaviour.Properties properties) -> new RedstoneOreClusterBlock(RedstoneOreClusterBlock.MEDIUM_CLUSTER_HEIGHT,
                    RedstoneOreClusterBlock.MEDIUM_CLUSTER_OFFSET,
                    UniformInt.of(0, 3),
                    properties),
            () -> mediumBudProperties(MapColor.COLOR_RED).randomTicks());
    public static final Holder.Reference<Block> SMALL_REDSTONE_BUD = ModRegistry.REGISTRIES.registerBlock(
            "small_redstone_bud",
            (BlockBehaviour.Properties properties) -> new RedstoneOreClusterBlock(RedstoneOreClusterBlock.SMALL_CLUSTER_HEIGHT,
                    RedstoneOreClusterBlock.SMALL_CLUSTER_OFFSET,
                    UniformInt.of(0, 2),
                    properties),
            () -> smallBudProperties(MapColor.COLOR_RED).randomTicks());
    public static final Holder.Reference<Block> BUDDING_REDSTONE = ModRegistry.REGISTRIES.registerBlock(
            "budding_redstone",
            BuddingDropExperienceBlock::redstone,
            BlockRegistry::buddingStoneProperties);
    public static final Holder.Reference<Block> BUDDING_DEEPSLATE_REDSTONE = ModRegistry.REGISTRIES.registerBlock(
            "budding_deepslate_redstone",
            BuddingDropExperienceBlock::redstone,
            BlockRegistry::buddingDeepslateProperties);
    public static final Holder.Reference<Block> BUDDING_SCULK_REDSTONE = ModRegistry.REGISTRIES.registerBlock(
            "budding_sculk_redstone",
            BuddingDropExperienceBlock::redstone,
            BlockRegistry::buddingSculkProperties);
    public static final Holder.Reference<Block> REDSTONE_CRYSTAL_BLOCK = ModRegistry.REGISTRIES.registerBlock(
            "redstone_crystal_block",
            Block::new,
            () -> clusterBlockProperties(MapColor.COLOR_RED));

    // Emerald

    public static final Holder.Reference<Block> EMERALD_CRYSTAL = ModRegistry.REGISTRIES.registerBlock("emerald_crystal",
            (BlockBehaviour.Properties properties) -> DropExperienceClusterBlock.cluster(UniformInt.of(3, 7),
                    properties),
            () -> clusterProperties(MapColor.EMERALD));
    public static final Holder.Reference<Block> LARGE_EMERALD_BUD = ModRegistry.REGISTRIES.registerBlock(
            "large_emerald_bud",
            (BlockBehaviour.Properties properties) -> DropExperienceClusterBlock.large(UniformInt.of(2, 6), properties),
            () -> largeBudProperties(MapColor.EMERALD));
    public static final Holder.Reference<Block> MEDIUM_EMERALD_BUD = ModRegistry.REGISTRIES.registerBlock(
            "medium_emerald_bud",
            (BlockBehaviour.Properties properties) -> DropExperienceClusterBlock.medium(UniformInt.of(1, 5),
                    properties),
            () -> mediumBudProperties(MapColor.EMERALD));
    public static final Holder.Reference<Block> SMALL_EMERALD_BUD = ModRegistry.REGISTRIES.registerBlock(
            "small_emerald_bud",
            (BlockBehaviour.Properties properties) -> DropExperienceClusterBlock.small(UniformInt.of(0, 4), properties),
            () -> smallBudProperties(MapColor.EMERALD));
    public static final Holder.Reference<Block> BUDDING_EMERALD = ModRegistry.REGISTRIES.registerBlock("budding_emerald",
            BuddingDropExperienceBlock::emerald,
            BlockRegistry::buddingStoneProperties);
    public static final Holder.Reference<Block> BUDDING_DEEPSLATE_EMERALD = ModRegistry.REGISTRIES.registerBlock(
            "budding_deepslate_emerald",
            BuddingDropExperienceBlock::emerald,
            BlockRegistry::buddingDeepslateProperties);
    public static final Holder.Reference<Block> BUDDING_SCULK_EMERALD = ModRegistry.REGISTRIES.registerBlock(
            "budding_sculk_emerald",
            BuddingDropExperienceBlock::emerald,
            BlockRegistry::buddingSculkProperties);
    public static final Holder.Reference<Block> EMERALD_CRYSTAL_BLOCK = ModRegistry.REGISTRIES.registerBlock(
            "emerald_crystal_block",
            Block::new,
            () -> clusterBlockProperties(MapColor.EMERALD));

    // Lapis Lazuli

    public static final Holder.Reference<Block> LAPIS_LAZULI_CRYSTAL = ModRegistry.REGISTRIES.registerBlock(
            "lapis_lazuli_crystal",
            (BlockBehaviour.Properties properties) -> DropExperienceClusterBlock.cluster(UniformInt.of(2, 5),
                    properties),
            () -> clusterProperties(MapColor.COLOR_BLUE));
    public static final Holder.Reference<Block> LARGE_LAPIS_LAZULI_BUD = ModRegistry.REGISTRIES.registerBlock(
            "large_lapis_lazuli_bud",
            (BlockBehaviour.Properties properties) -> DropExperienceClusterBlock.large(UniformInt.of(1, 4), properties),
            () -> largeBudProperties(MapColor.COLOR_BLUE));
    public static final Holder.Reference<Block> MEDIUM_LAPIS_LAZULI_BUD = ModRegistry.REGISTRIES.registerBlock(
            "medium_lapis_lazuli_bud",
            (BlockBehaviour.Properties properties) -> DropExperienceClusterBlock.medium(UniformInt.of(0, 3),
                    properties),
            () -> mediumBudProperties(MapColor.COLOR_BLUE));
    public static final Holder.Reference<Block> SMALL_LAPIS_LAZULI_BUD = ModRegistry.REGISTRIES.registerBlock(
            "small_lapis_lazuli_bud",
            (BlockBehaviour.Properties properties) -> DropExperienceClusterBlock.small(UniformInt.of(0, 2), properties),
            () -> smallBudProperties(MapColor.COLOR_BLUE));
    public static final Holder.Reference<Block> BUDDING_LAPIS_LAZULI = ModRegistry.REGISTRIES.registerBlock(
            "budding_lapis_lazuli",
            BuddingDropExperienceBlock::lapisLazuli,
            BlockRegistry::buddingStoneProperties);
    public static final Holder.Reference<Block> BUDDING_DEEPSLATE_LAPIS_LAZULI = ModRegistry.REGISTRIES.registerBlock(
            "budding_deepslate_lapis_lazuli",
            BuddingDropExperienceBlock::lapisLazuli,
            BlockRegistry::buddingDeepslateProperties);
    public static final Holder.Reference<Block> BUDDING_SCULK_LAPIS_LAZULI = ModRegistry.REGISTRIES.registerBlock(
            "budding_sculk_lapis_lazuli",
            BuddingDropExperienceBlock::lapisLazuli,
            BlockRegistry::buddingSculkProperties);
    public static final Holder.Reference<Block> LAPIS_LAZULI_CRYSTAL_BLOCK = ModRegistry.REGISTRIES.registerBlock(
            "lapis_lazuli_crystal_block",
            Block::new,
            () -> clusterBlockProperties(MapColor.COLOR_BLUE));

    // Diamond

    public static final Holder.Reference<Block> DIAMOND_CRYSTAL = ModRegistry.REGISTRIES.registerBlock("diamond_crystal",
            (BlockBehaviour.Properties properties) -> DropExperienceClusterBlock.cluster(UniformInt.of(3, 7),
                    properties),
            () -> clusterProperties(MapColor.DIAMOND));
    public static final Holder.Reference<Block> LARGE_DIAMOND_BUD = ModRegistry.REGISTRIES.registerBlock(
            "large_diamond_bud",
            (BlockBehaviour.Properties properties) -> DropExperienceClusterBlock.large(UniformInt.of(2, 6), properties),
            () -> largeBudProperties(MapColor.DIAMOND));
    public static final Holder.Reference<Block> MEDIUM_DIAMOND_BUD = ModRegistry.REGISTRIES.registerBlock(
            "medium_diamond_bud",
            (BlockBehaviour.Properties properties) -> DropExperienceClusterBlock.medium(UniformInt.of(1, 5),
                    properties),
            () -> mediumBudProperties(MapColor.DIAMOND));
    public static final Holder.Reference<Block> SMALL_DIAMOND_BUD = ModRegistry.REGISTRIES.registerBlock(
            "small_diamond_bud",
            (BlockBehaviour.Properties properties) -> DropExperienceClusterBlock.small(UniformInt.of(0, 4), properties),
            () -> smallBudProperties(MapColor.DIAMOND));
    public static final Holder.Reference<Block> BUDDING_DIAMOND = ModRegistry.REGISTRIES.registerBlock("budding_diamond",
            BuddingDropExperienceBlock::diamond,
            BlockRegistry::buddingStoneProperties);
    public static final Holder.Reference<Block> BUDDING_DEEPSLATE_DIAMOND = ModRegistry.REGISTRIES.registerBlock(
            "budding_deepslate_diamond",
            BuddingDropExperienceBlock::diamond,
            BlockRegistry::buddingDeepslateProperties);
    public static final Holder.Reference<Block> BUDDING_SCULK_DIAMOND = ModRegistry.REGISTRIES.registerBlock(
            "budding_sculk_diamond",
            BuddingDropExperienceBlock::diamond,
            BlockRegistry::buddingSculkProperties);
    public static final Holder.Reference<Block> DIAMOND_CRYSTAL_BLOCK = ModRegistry.REGISTRIES.registerBlock(
            "diamond_crystal_block",
            Block::new,
            () -> clusterBlockProperties(MapColor.DIAMOND));

    // Glowstone

    public static final Holder.Reference<Block> GLOWSTONE_CRYSTAL = ModRegistry.REGISTRIES.registerBlock(
            "glowstone_crystal",
            (BlockBehaviour.Properties properties) -> new AmethystClusterBlock(DropExperienceClusterBlock.CLUSTER_HEIGHT,
                    DropExperienceClusterBlock.CLUSTER_OFFSET,
                    properties),
            () -> clusterProperties(MapColor.SAND).lightLevel((BlockState state) -> 15));
    public static final Holder.Reference<Block> LARGE_GLOWSTONE_BUD = ModRegistry.REGISTRIES.registerBlock(
            "large_glowstone_bud",
            (BlockBehaviour.Properties properties) -> new AmethystClusterBlock(DropExperienceClusterBlock.LARGE_CLUSTER_HEIGHT,
                    DropExperienceClusterBlock.LARGE_CLUSTER_OFFSET,
                    properties),
            () -> largeBudProperties(MapColor.SAND).lightLevel((BlockState state) -> 14));
    public static final Holder.Reference<Block> MEDIUM_GLOWSTONE_BUD = ModRegistry.REGISTRIES.registerBlock(
            "medium_glowstone_bud",
            (BlockBehaviour.Properties properties) -> new AmethystClusterBlock(DropExperienceClusterBlock.MEDIUM_CLUSTER_HEIGHT,
                    DropExperienceClusterBlock.MEDIUM_CLUSTER_OFFSET,
                    properties),
            () -> mediumBudProperties(MapColor.SAND).lightLevel((BlockState state) -> 12));
    public static final Holder.Reference<Block> SMALL_GLOWSTONE_BUD = ModRegistry.REGISTRIES.registerBlock(
            "small_glowstone_bud",
            (BlockBehaviour.Properties properties) -> new AmethystClusterBlock(DropExperienceClusterBlock.SMALL_CLUSTER_HEIGHT,
                    DropExperienceClusterBlock.SMALL_CLUSTER_OFFSET,
                    properties),
            () -> smallBudProperties(MapColor.SAND).lightLevel((BlockState state) -> 11));
    public static final Holder.Reference<Block> BUDDING_GLOWSTONE = ModRegistry.REGISTRIES.registerBlock(
            "budding_glowstone",
            BuddingBlock::glowstone,
            BlockRegistry::buddingNetherProperties);
    public static final Holder.Reference<Block> BUDDING_BASALT_GLOWSTONE = ModRegistry.REGISTRIES.registerBlock(
            "budding_basalt_glowstone",
            BuddingBlock::glowstone,
            BlockRegistry::buddingBasaltProperties);
    public static final Holder.Reference<Block> BUDDING_BLACKSTONE_GLOWSTONE = ModRegistry.REGISTRIES.registerBlock(
            "budding_blackstone_glowstone",
            BuddingBlock::glowstone,
            BlockRegistry::buddingBlackstoneProperties);
    public static final Holder.Reference<Block> GLOWSTONE_CRYSTAL_BLOCK = ModRegistry.REGISTRIES.registerBlock(
            "glowstone_crystal_block",
            Block::new,
            () -> clusterBlockProperties(MapColor.SAND).lightLevel((BlockState state) -> 15));

    // Nether Gold

    public static final Holder.Reference<Block> NETHER_GOLD_CRYSTAL = ModRegistry.REGISTRIES.registerBlock(
            "nether_gold_crystal",
            (BlockBehaviour.Properties properties) -> DropExperienceClusterBlock.cluster(UniformInt.of(0, 1),
                    properties),
            () -> clusterProperties(MapColor.GOLD));
    public static final Holder.Reference<Block> LARGE_NETHER_GOLD_BUD = ModRegistry.REGISTRIES.registerBlock(
            "large_nether_gold_bud",
            (BlockBehaviour.Properties properties) -> DropExperienceClusterBlock.large(UniformInt.of(0, 1), properties),
            () -> largeBudProperties(MapColor.GOLD));
    public static final Holder.Reference<Block> MEDIUM_NETHER_GOLD_BUD = ModRegistry.REGISTRIES.registerBlock(
            "medium_nether_gold_bud",
            (BlockBehaviour.Properties properties) -> DropExperienceClusterBlock.medium(UniformInt.of(0, 1),
                    properties),
            () -> mediumBudProperties(MapColor.GOLD));
    public static final Holder.Reference<Block> SMALL_NETHER_GOLD_BUD = ModRegistry.REGISTRIES.registerBlock(
            "small_nether_gold_bud",
            (BlockBehaviour.Properties properties) -> DropExperienceClusterBlock.small(UniformInt.of(0, 1), properties),
            () -> smallBudProperties(MapColor.GOLD));
    public static final Holder.Reference<Block> BUDDING_NETHER_GOLD = ModRegistry.REGISTRIES.registerBlock(
            "budding_nether_gold",
            BuddingDropExperienceBlock::goldNugget,
            () -> buddingNetherProperties().sound(SoundType.NETHER_GOLD_ORE));
    public static final Holder.Reference<Block> BUDDING_BASALT_NETHER_GOLD = ModRegistry.REGISTRIES.registerBlock(
            "budding_basalt_nether_gold",
            BuddingDropExperienceBlock::goldNugget,
            () -> buddingBasaltProperties().sound(SoundType.NETHER_GOLD_ORE));
    public static final Holder.Reference<Block> BUDDING_BLACKSTONE_NETHER_GOLD = ModRegistry.REGISTRIES.registerBlock(
            "budding_blackstone_nether_gold",
            BuddingDropExperienceBlock::goldNugget,
            () -> buddingBlackstoneProperties().sound(SoundType.NETHER_GOLD_ORE));
    public static final Holder.Reference<Block> NETHER_GOLD_CRYSTAL_BLOCK = ModRegistry.REGISTRIES.registerBlock(
            "nether_gold_crystal_block",
            Block::new,
            () -> clusterBlockProperties(MapColor.GOLD));

    // Nether Quartz

    public static final Holder.Reference<Block> NETHER_QUARTZ_CRYSTAL = ModRegistry.REGISTRIES.registerBlock(
            "nether_quartz_crystal",
            (BlockBehaviour.Properties properties) -> DropExperienceClusterBlock.cluster(UniformInt.of(2, 5),
                    properties),
            () -> clusterProperties(MapColor.QUARTZ));
    public static final Holder.Reference<Block> LARGE_NETHER_QUARTZ_BUD = ModRegistry.REGISTRIES.registerBlock(
            "large_nether_quartz_bud",
            (BlockBehaviour.Properties properties) -> DropExperienceClusterBlock.large(UniformInt.of(1, 4), properties),
            () -> largeBudProperties(MapColor.QUARTZ));
    public static final Holder.Reference<Block> MEDIUM_NETHER_QUARTZ_BUD = ModRegistry.REGISTRIES.registerBlock(
            "medium_nether_quartz_bud",
            (BlockBehaviour.Properties properties) -> DropExperienceClusterBlock.medium(UniformInt.of(0, 3),
                    properties),
            () -> mediumBudProperties(MapColor.QUARTZ));
    public static final Holder.Reference<Block> SMALL_NETHER_QUARTZ_BUD = ModRegistry.REGISTRIES.registerBlock(
            "small_nether_quartz_bud",
            (BlockBehaviour.Properties properties) -> DropExperienceClusterBlock.small(UniformInt.of(0, 2), properties),
            () -> smallBudProperties(MapColor.QUARTZ));
    public static final Holder.Reference<Block> BUDDING_NETHER_QUARTZ = ModRegistry.REGISTRIES.registerBlock(
            "budding_nether_quartz",
            BuddingDropExperienceBlock::netherQuartz,
            BlockRegistry::buddingNetherProperties);
    public static final Holder.Reference<Block> BUDDING_BASALT_NETHER_QUARTZ = ModRegistry.REGISTRIES.registerBlock(
            "budding_basalt_nether_quartz",
            BuddingDropExperienceBlock::netherQuartz,
            BlockRegistry::buddingBasaltProperties);
    public static final Holder.Reference<Block> BUDDING_BLACKSTONE_NETHER_QUARTZ = ModRegistry.REGISTRIES.registerBlock(
            "budding_blackstone_nether_quartz",
            BuddingDropExperienceBlock::netherQuartz,
            BlockRegistry::buddingBlackstoneProperties);
    public static final Holder.Reference<Block> NETHER_QUARTZ_CRYSTAL_BLOCK = ModRegistry.REGISTRIES.registerBlock(
            "nether_quartz_crystal_block",
            Block::new,
            () -> clusterBlockProperties(MapColor.QUARTZ));

    // Ancient Debris

    public static final Holder.Reference<Block> ANCIENT_DEBRIS_CRYSTAL = ModRegistry.REGISTRIES.registerBlock(
            "ancient_debris_crystal",
            (BlockBehaviour.Properties properties) -> new AmethystClusterBlock(DropExperienceClusterBlock.CLUSTER_HEIGHT,
                    DropExperienceClusterBlock.CLUSTER_OFFSET,
                    properties),
            () -> clusterProperties(MapColor.COLOR_BROWN));
    public static final Holder.Reference<Block> LARGE_ANCIENT_DEBRIS_BUD = ModRegistry.REGISTRIES.registerBlock(
            "large_ancient_debris_bud",
            (BlockBehaviour.Properties properties) -> new AmethystClusterBlock(DropExperienceClusterBlock.LARGE_CLUSTER_HEIGHT,
                    DropExperienceClusterBlock.LARGE_CLUSTER_OFFSET,
                    properties),
            () -> largeBudProperties(MapColor.COLOR_BROWN));
    public static final Holder.Reference<Block> MEDIUM_ANCIENT_DEBRIS_BUD = ModRegistry.REGISTRIES.registerBlock(
            "medium_ancient_debris_bud",
            (BlockBehaviour.Properties properties) -> new AmethystClusterBlock(DropExperienceClusterBlock.MEDIUM_CLUSTER_HEIGHT,
                    DropExperienceClusterBlock.MEDIUM_CLUSTER_OFFSET,
                    properties),
            () -> mediumBudProperties(MapColor.COLOR_BROWN));
    public static final Holder.Reference<Block> SMALL_ANCIENT_DEBRIS_BUD = ModRegistry.REGISTRIES.registerBlock(
            "small_ancient_debris_bud",
            (BlockBehaviour.Properties properties) -> new AmethystClusterBlock(DropExperienceClusterBlock.SMALL_CLUSTER_HEIGHT,
                    DropExperienceClusterBlock.SMALL_CLUSTER_OFFSET,
                    properties),
            () -> smallBudProperties(MapColor.COLOR_BROWN));
    public static final Holder.Reference<Block> BUDDING_ANCIENT_DEBRIS = ModRegistry.REGISTRIES.registerBlock(
            "budding_ancient_debris",
            BuddingBlock::ancientDebris,
            BlockRegistry::buddingNetherProperties);
    public static final Holder.Reference<Block> BUDDING_BASALT_ANCIENT_DEBRIS = ModRegistry.REGISTRIES.registerBlock(
            "budding_basalt_ancient_debris",
            BuddingBlock::ancientDebris,
            BlockRegistry::buddingBasaltProperties);
    public static final Holder.Reference<Block> BUDDING_BLACKSTONE_ANCIENT_DEBRIS = ModRegistry.REGISTRIES.registerBlock(
            "budding_blackstone_ancient_debris",
            BuddingBlock::ancientDebris,
            BlockRegistry::buddingBlackstoneProperties);
    public static final Holder.Reference<Block> ANCIENT_DEBRIS_CRYSTAL_BLOCK = ModRegistry.REGISTRIES.registerBlock(
            "ancient_debris_crystal_block",
            Block::new,
            () -> clusterBlockProperties(MapColor.COLOR_BROWN));

    public static final Holder.Reference<Block> CELESTITE_GLASS = ModRegistry.REGISTRIES.registerBlock("celestite_glass",
            TransparentBlock::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.TINTED_GLASS)
                    .mapColor(MapColor.COLOR_CYAN)
                    .lightLevel((BlockState state) -> 15));
    public static final Holder.Reference<Block> PINK_TOPAZ_GLASS = ModRegistry.REGISTRIES.registerBlock(
            "pink_topaz_glass",
            TransparentBlock::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.TINTED_GLASS)
                    .mapColor(MapColor.COLOR_PINK)
                    .lightLevel((BlockState state) -> 15));
    public static final Holder.Reference<Block> WRAPPIST_GLASS = ModRegistry.REGISTRIES.registerBlock("wrappist_glass",
            TransparentBlock::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.TINTED_GLASS)
                    .mapColor(MapColor.COLOR_LIGHT_BLUE)
                    .lightLevel((BlockState state) -> 15));

    public static final Holder.Reference<Block> SMOOTH_END_STONE = ModRegistry.REGISTRIES.registerBlock(
            "smooth_end_stone",
            Block::new,
            () -> BlockBehaviour.Properties.ofLegacyCopy(Blocks.END_STONE));
    public static final Holder.Reference<Block> SMOOTH_END_STONE_STAIRS = ModRegistry.REGISTRIES.registerBlock(
            "smooth_end_stone_stairs",
            (BlockBehaviour.Properties properties) -> new StairBlock(SMOOTH_END_STONE.value().defaultBlockState(),
                    properties),
            () -> BlockBehaviour.Properties.ofLegacyCopy(SMOOTH_END_STONE.value()));
    public static final Holder.Reference<Block> SMOOTH_END_STONE_SLAB = ModRegistry.REGISTRIES.registerBlock(
            "smooth_end_stone_slab",
            SlabBlock::new,
            () -> BlockBehaviour.Properties.ofLegacyCopy(SMOOTH_END_STONE.value()));

    public static final Holder.Reference<Block> PEDESTAL = ModRegistry.REGISTRIES.registerBlock("pedestal",
            PedestalBlock::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE)
                    .lightLevel((BlockState state) -> 7)
                    .noOcclusion());

    public static void bootstrap() {
        // NO-OP
    }

    private static BlockBehaviour.Properties clusterProperties(MapColor mapColor) {
        return BlockBehaviour.Properties.ofFullCopy(Blocks.AMETHYST_CLUSTER).mapColor(mapColor);
    }

    private static BlockBehaviour.Properties largeBudProperties(MapColor mapColor) {
        // Fix vanilla having the sound types switched for large and medium buds.
        return BlockBehaviour.Properties.ofFullCopy(Blocks.LARGE_AMETHYST_BUD)
                .sound(SoundType.LARGE_AMETHYST_BUD)
                .mapColor(mapColor);
    }

    private static BlockBehaviour.Properties mediumBudProperties(MapColor mapColor) {
        // Fix vanilla having the sound types switched for large and medium buds.
        return BlockBehaviour.Properties.ofFullCopy(Blocks.MEDIUM_AMETHYST_BUD)
                .sound(SoundType.MEDIUM_AMETHYST_BUD)
                .mapColor(mapColor);
    }

    private static BlockBehaviour.Properties smallBudProperties(MapColor mapColor) {
        return BlockBehaviour.Properties.ofFullCopy(Blocks.SMALL_AMETHYST_BUD).mapColor(mapColor);
    }

    private static BlockBehaviour.Properties buddingProperties(MapColor mapColor) {
        return BlockBehaviour.Properties.ofFullCopy(Blocks.BUDDING_AMETHYST).mapColor(mapColor);
    }

    private static BlockBehaviour.Properties buddingProperties(Block block) {
        return BlockBehaviour.Properties.ofFullCopy(block).randomTicks().pushReaction(PushReaction.DESTROY);
    }

    private static BlockBehaviour.Properties buddingStoneProperties() {
        return buddingProperties(Blocks.STONE).strength(3.0F, 3.0F);
    }

    private static BlockBehaviour.Properties buddingDeepslateProperties() {
        return buddingProperties(Blocks.DEEPSLATE).strength(4.5F, 3.0F);
    }

    private static BlockBehaviour.Properties buddingSculkProperties() {
        return buddingProperties(Blocks.SCULK).strength(1.5F).requiresCorrectToolForDrops();
    }

    private static BlockBehaviour.Properties buddingPrismarineProperties() {
        return buddingProperties(Blocks.PRISMARINE).strength(3.0F, 3.0F);
    }

    private static BlockBehaviour.Properties buddingNetherProperties() {
        return buddingProperties(Blocks.NETHERRACK).strength(3.0F, 3.0F).sound(SoundType.NETHER_ORE);
    }

    private static BlockBehaviour.Properties buddingBlackstoneProperties() {
        return buddingProperties(Blocks.BLACKSTONE).strength(3.0F, 3.0F);
    }

    private static BlockBehaviour.Properties buddingBasaltProperties() {
        return buddingProperties(Blocks.BASALT).strength(3.0F, 3.0F);
    }

    private static BlockBehaviour.Properties clusterBlockProperties(MapColor mapColor) {
        return BlockBehaviour.Properties.ofFullCopy(Blocks.AMETHYST_BLOCK).mapColor(mapColor);
    }
}
