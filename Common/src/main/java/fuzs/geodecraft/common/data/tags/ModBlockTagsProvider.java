package fuzs.geodecraft.common.data.tags;

import fuzs.geodecraft.common.init.BlockRegistry;
import fuzs.geodecraft.common.init.TagRegistry;
import fuzs.puzzleslib.api.data.v2.core.DataProviderContext;
import fuzs.puzzleslib.api.data.v2.tags.AbstractTagProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

public class ModBlockTagsProvider extends AbstractTagProvider<Block> {

    public ModBlockTagsProvider(DataProviderContext context) {
        super(Registries.BLOCK, context);
    }

    @Override
    public void addTags(HolderLookup.Provider context) {
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(BlockRegistry.PEDESTAL,
                        BlockRegistry.WRAPPIST_GLASS,
                        BlockRegistry.CELESTITE_GLASS,
                        BlockRegistry.PINK_TOPAZ_GLASS,

                        BlockRegistry.SMOOTH_END_STONE,
                        BlockRegistry.SMOOTH_END_STONE_SLAB,
                        BlockRegistry.SMOOTH_END_STONE_STAIRS,

                        BlockRegistry.BUDDING_CELESTITE,
                        BlockRegistry.CELESTITE_BLOCK,
                        BlockRegistry.CELESTITE_CLUSTER,
                        BlockRegistry.LARGE_CELESTITE_BUD,
                        BlockRegistry.MEDIUM_CELESTITE_BUD,
                        BlockRegistry.SMALL_CELESTITE_BUD,

                        BlockRegistry.BUDDING_PINK_TOPAZ,
                        BlockRegistry.PINK_TOPAZ_BLOCK,
                        BlockRegistry.PINK_TOPAZ_CLUSTER,
                        BlockRegistry.LARGE_PINK_TOPAZ_BUD,
                        BlockRegistry.MEDIUM_PINK_TOPAZ_BUD,
                        BlockRegistry.SMALL_PINK_TOPAZ_BUD,

                        BlockRegistry.BUDDING_WRAPPIST,
                        BlockRegistry.WRAPPIST_BLOCK,
                        BlockRegistry.WRAPPIST_CLUSTER,
                        BlockRegistry.LARGE_WRAPPIST_BUD,
                        BlockRegistry.MEDIUM_WRAPPIST_BUD,
                        BlockRegistry.SMALL_WRAPPIST_BUD,

                        BlockRegistry.BUDDING_PRISMARINE,
                        BlockRegistry.PRISMARINE_CRYSTAL_BLOCK,
                        BlockRegistry.PRISMARINE_CRYSTAL,
                        BlockRegistry.LARGE_PRISMARINE_BUD,
                        BlockRegistry.MEDIUM_PRISMARINE_BUD,
                        BlockRegistry.SMALL_PRISMARINE_BUD,

                        BlockRegistry.BUDDING_ECHO,
                        BlockRegistry.ECHO_CRYSTAL_BLOCK,
                        BlockRegistry.ECHO_CRYSTAL,
                        BlockRegistry.LARGE_ECHO_BUD,
                        BlockRegistry.MEDIUM_ECHO_BUD,
                        BlockRegistry.SMALL_ECHO_BUD,

                        BlockRegistry.BUDDING_LAPIS_LAZULI,
                        BlockRegistry.BUDDING_DEEPSLATE_LAPIS_LAZULI,
                        BlockRegistry.BUDDING_SCULK_LAPIS_LAZULI,
                        BlockRegistry.LAPIS_LAZULI_CRYSTAL_BLOCK,
                        BlockRegistry.LAPIS_LAZULI_CRYSTAL,
                        BlockRegistry.LARGE_LAPIS_LAZULI_BUD,
                        BlockRegistry.MEDIUM_LAPIS_LAZULI_BUD,
                        BlockRegistry.SMALL_LAPIS_LAZULI_BUD,

                        BlockRegistry.BUDDING_REDSTONE,
                        BlockRegistry.BUDDING_DEEPSLATE_REDSTONE,
                        BlockRegistry.BUDDING_SCULK_REDSTONE,
                        BlockRegistry.REDSTONE_CRYSTAL_BLOCK,
                        BlockRegistry.REDSTONE_CRYSTAL,
                        BlockRegistry.LARGE_REDSTONE_BUD,
                        BlockRegistry.MEDIUM_REDSTONE_BUD,
                        BlockRegistry.SMALL_REDSTONE_BUD,

                        BlockRegistry.BUDDING_EMERALD,
                        BlockRegistry.BUDDING_DEEPSLATE_EMERALD,
                        BlockRegistry.BUDDING_SCULK_EMERALD,
                        BlockRegistry.EMERALD_CRYSTAL_BLOCK,
                        BlockRegistry.EMERALD_CRYSTAL,
                        BlockRegistry.LARGE_EMERALD_BUD,
                        BlockRegistry.MEDIUM_EMERALD_BUD,
                        BlockRegistry.SMALL_EMERALD_BUD,

                        BlockRegistry.BUDDING_DIAMOND,
                        BlockRegistry.BUDDING_DEEPSLATE_DIAMOND,
                        BlockRegistry.BUDDING_SCULK_DIAMOND,
                        BlockRegistry.DIAMOND_CRYSTAL_BLOCK,
                        BlockRegistry.DIAMOND_CRYSTAL,
                        BlockRegistry.LARGE_DIAMOND_BUD,
                        BlockRegistry.MEDIUM_DIAMOND_BUD,
                        BlockRegistry.SMALL_DIAMOND_BUD,

                        BlockRegistry.BUDDING_GLOWSTONE,
                        BlockRegistry.BUDDING_BASALT_GLOWSTONE,
                        BlockRegistry.BUDDING_BLACKSTONE_GLOWSTONE,
                        BlockRegistry.GLOWSTONE_CRYSTAL_BLOCK,
                        BlockRegistry.GLOWSTONE_CRYSTAL,
                        BlockRegistry.LARGE_GLOWSTONE_BUD,
                        BlockRegistry.MEDIUM_GLOWSTONE_BUD,
                        BlockRegistry.SMALL_GLOWSTONE_BUD,

                        BlockRegistry.BUDDING_NETHER_QUARTZ,
                        BlockRegistry.BUDDING_BASALT_NETHER_QUARTZ,
                        BlockRegistry.BUDDING_BLACKSTONE_NETHER_QUARTZ,
                        BlockRegistry.NETHER_QUARTZ_CRYSTAL_BLOCK,
                        BlockRegistry.NETHER_QUARTZ_CRYSTAL,
                        BlockRegistry.LARGE_NETHER_QUARTZ_BUD,
                        BlockRegistry.MEDIUM_NETHER_QUARTZ_BUD,
                        BlockRegistry.SMALL_NETHER_QUARTZ_BUD,

                        BlockRegistry.BUDDING_NETHER_GOLD,
                        BlockRegistry.BUDDING_BASALT_NETHER_GOLD,
                        BlockRegistry.BUDDING_BLACKSTONE_NETHER_GOLD,
                        BlockRegistry.NETHER_GOLD_CRYSTAL_BLOCK,
                        BlockRegistry.NETHER_GOLD_CRYSTAL,
                        BlockRegistry.LARGE_NETHER_GOLD_BUD,
                        BlockRegistry.MEDIUM_NETHER_GOLD_BUD,
                        BlockRegistry.SMALL_NETHER_GOLD_BUD,

                        BlockRegistry.BUDDING_ANCIENT_DEBRIS,
                        BlockRegistry.BUDDING_BASALT_ANCIENT_DEBRIS,
                        BlockRegistry.BUDDING_BLACKSTONE_ANCIENT_DEBRIS,
                        BlockRegistry.ANCIENT_DEBRIS_CRYSTAL_BLOCK,
                        BlockRegistry.ANCIENT_DEBRIS_CRYSTAL,
                        BlockRegistry.LARGE_ANCIENT_DEBRIS_BUD,
                        BlockRegistry.MEDIUM_ANCIENT_DEBRIS_BUD,
                        BlockRegistry.SMALL_ANCIENT_DEBRIS_BUD);

        this.tag(BlockTags.NEEDS_STONE_TOOL)
                .add(BlockRegistry.BUDDING_LAPIS_LAZULI,
                        BlockRegistry.BUDDING_DEEPSLATE_LAPIS_LAZULI,
                        BlockRegistry.BUDDING_SCULK_LAPIS_LAZULI);

        this.tag(BlockTags.NEEDS_IRON_TOOL)
                .add(BlockRegistry.BUDDING_REDSTONE,
                        BlockRegistry.BUDDING_EMERALD,
                        BlockRegistry.BUDDING_DIAMOND,
                        BlockRegistry.BUDDING_DEEPSLATE_REDSTONE,
                        BlockRegistry.BUDDING_DEEPSLATE_EMERALD,
                        BlockRegistry.BUDDING_DEEPSLATE_DIAMOND,
                        BlockRegistry.BUDDING_SCULK_REDSTONE,
                        BlockRegistry.BUDDING_SCULK_EMERALD,
                        BlockRegistry.BUDDING_SCULK_DIAMOND,
                        BlockRegistry.BUDDING_ECHO);

        this.tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(BlockRegistry.BUDDING_ANCIENT_DEBRIS,
                        BlockRegistry.BUDDING_BASALT_ANCIENT_DEBRIS,
                        BlockRegistry.BUDDING_BLACKSTONE_ANCIENT_DEBRIS);

        this.tag(BlockTags.CRYSTAL_SOUND_BLOCKS)
                .add(BlockRegistry.PINK_TOPAZ_BLOCK,
                        BlockRegistry.BUDDING_PINK_TOPAZ,
                        BlockRegistry.CELESTITE_BLOCK,
                        BlockRegistry.BUDDING_CELESTITE,
                        BlockRegistry.WRAPPIST_BLOCK,
                        BlockRegistry.BUDDING_WRAPPIST,
                        BlockRegistry.PRISMARINE_CRYSTAL_BLOCK,
                        BlockRegistry.ECHO_CRYSTAL_BLOCK,
                        BlockRegistry.LAPIS_LAZULI_CRYSTAL_BLOCK,
                        BlockRegistry.REDSTONE_CRYSTAL_BLOCK,
                        BlockRegistry.EMERALD_CRYSTAL_BLOCK,
                        BlockRegistry.DIAMOND_CRYSTAL_BLOCK,
                        BlockRegistry.GLOWSTONE_CRYSTAL_BLOCK,
                        BlockRegistry.NETHER_QUARTZ_CRYSTAL_BLOCK,
                        BlockRegistry.NETHER_GOLD_CRYSTAL_BLOCK,
                        BlockRegistry.ANCIENT_DEBRIS_CRYSTAL_BLOCK);

        this.tag(BlockTags.STAIRS).add(BlockRegistry.SMOOTH_END_STONE_STAIRS);
        this.tag(BlockTags.SLABS).add(BlockRegistry.SMOOTH_END_STONE_SLAB);

        this.tag(TagRegistry.Blocks.NETHER_QUARTZ_CRYSTAL_SPIKE_MAY_PLACE_ON).addTag(BlockTags.BASE_STONE_NETHER);
        this.tag(TagRegistry.Blocks.GLOWSTONE_CRYSTAL_SPIKE_MAY_PLACE_ON).addTag(BlockTags.BASE_STONE_NETHER);
        this.tag(TagRegistry.Blocks.ECHO_CRYSTAL_SPIKE_MAY_PLACE_ON).add(Blocks.SCULK, Blocks.STONE, Blocks.DEEPSLATE);
        this.tag(TagRegistry.Blocks.PRISMARINE_CRYSTAL_SPIKE_MAY_PLACE_ON)
                .add(Blocks.SAND, Blocks.STONE, Blocks.GRAVEL, Blocks.CLAY, Blocks.SANDSTONE);
        this.tag(TagRegistry.Blocks.WRAPPIST_CRYSTAL_SPIKE_MAY_PLACE_ON).add(Blocks.END_STONE);
    }
}
