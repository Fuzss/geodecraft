package fuzs.geodecraft.common.init;

import fuzs.geodecraft.common.Geodecraft;
import fuzs.puzzleslib.api.init.v3.tags.TagFactory;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.block.Block;

public class TagRegistry {
    static final TagFactory TAGS = TagFactory.make(Geodecraft.MOD_ID);

    public static class Biomes {
        //Geodes
        public static final TagKey<Biome> HAS_PRISMARINE_GEODE = biomeTag("has_prismarine_geode");
        public static final TagKey<Biome> HAS_LAPIS_LAZULI_GEODE = biomeTag("has_lapis_lazuli_geode");
        public static final TagKey<Biome> HAS_REDSTONE_GEODE = biomeTag("has_redstone_geode");
        public static final TagKey<Biome> HAS_EMERALD_GEODE = biomeTag("has_emerald_geode");
        public static final TagKey<Biome> HAS_DIAMOND_GEODE = biomeTag("has_diamond_geode");
        public static final TagKey<Biome> HAS_ECHO_GEODE = biomeTag("has_echo_geode");
        public static final TagKey<Biome> HAS_NETHER_QUARTZ_GEODE = biomeTag("has_nether_quartz_geode");
        public static final TagKey<Biome> HAS_NETHER_GLOWSTONE_GEODE = biomeTag("has_nether_glowstone_geode");
        public static final TagKey<Biome> HAS_BASALT_QUARTZ_GEODE = biomeTag("has_basalt_quartz_geode");
        public static final TagKey<Biome> HAS_BASALT_GLOWSTONE_GEODE = biomeTag("has_basalt_glowstone_geode");

        public static final TagKey<Biome> HAS_BLACKSTONE_GLOWSTONE_GEODE = biomeTag("has_blackstone_glowstone_geode");

        public static final TagKey<Biome> HAS_BLACKSTONE_QUARTZ_GEODE = biomeTag("has_blackstone_quartz_geode");

        public static final TagKey<Biome> HAS_BASALT_GOLD_NUGGET_GEODE = biomeTag("has_basalt_gold_nugget_geode");

        public static final TagKey<Biome> HAS_BLACKSTONE_GOLD_NUGGET_GEODE = biomeTag("has_blackstone_gold_nugget_geode");
        public static final TagKey<Biome> HAS_WRAPPIST_GEODE = biomeTag("has_wrappist_geode");
        public static final TagKey<Biome> HAS_NETHER_GOLD_NUGGET_GEODE = biomeTag("has_nether_gold_nugget_geode");
        public static final TagKey<Biome> HAS_NETHER_ANCIENT_DEBRIS_GEODE = biomeTag("has_nether_ancient_debris_geode");

        public static final TagKey<Biome> HAS_BASALT_ANCIENT_DEBRIS_GEODE = biomeTag("has_basalt_ancient_debris_geode");
        public static final TagKey<Biome> HAS_BLACKSTONE_ANCIENT_DEBRIS_GEODE = biomeTag(
                "has_blackstone_ancient_debris_geode");
        public static final TagKey<Biome> HAS_CELESTITE_GEODE = biomeTag("has_celestite_geode");

        public static final TagKey<Biome> HAS_PINK_TOPAZ_GEODE = biomeTag("has_pink_topaz_geode");

        //Crystals
        public static final TagKey<Biome> HAS_ECHO_CRYSTAL = biomeTag("has_echo_crystal");
        public static final TagKey<Biome> HAS_QUARTZ_CRYSTAL = biomeTag("has_quartz_crystal");
        public static final TagKey<Biome> HAS_GLOWSTONE_CRYSTAL = biomeTag("has_glowstone_crystal");
        public static final TagKey<Biome> HAS_WRAPPIST_CRYSTAL = biomeTag("has_warppist_crystal");

        public static final TagKey<Biome> HAS_PRISMARINE_CRYSTAL = biomeTag("has_prismarine_crystal");

        private static TagKey<Biome> biomeTag(String name) {
            return TAGS.registerBiomeTag(name);
        }
    }

    public static class Blocks {
        public static final TagKey<Block> WRAPPIST_PEDESTAL_CANNOT_PLACE_ON = blockTag(
                "wrappist_pedestal_cannot_place_on");

        public static final TagKey<Block> NETHER_QUARTZ_CRYSTAL_SPIKE_MAY_PLACE_ON = blockTag(
                "nether_quartz_crystal_spike_may_place_on");
        public static final TagKey<Block> GLOWSTONE_CRYSTAL_SPIKE_MAY_PLACE_ON = blockTag(
                "glowstone_crystal_spike_may_place_on");
        public static final TagKey<Block> ECHO_CRYSTAL_SPIKE_MAY_PLACE_ON = blockTag("echo_crystal_spike_may_place_on");
        public static final TagKey<Block> WRAPPIST_CRYSTAL_SPIKE_MAY_PLACE_ON = blockTag(
                "wrappist_crystal_spike_may_place_on");
        public static final TagKey<Block> PRISMARINE_CRYSTAL_SPIKE_MAY_PLACE_ON = blockTag(
                "prismarine_crystal_spike_may_place_on");

        /**
         * @see net.minecraft.tags.BlockTags#FEATURES_CANNOT_REPLACE
         */
        public static final TagKey<Block> GEODES_CANNOT_REPLACE = blockTag("geodes_cannot_replace");
        /**
         * @see net.minecraft.tags.BlockTags#GEODE_INVALID_BLOCKS
         */
        public static final TagKey<Block> SUBMERGED_GEODE_INVALID_BLOCKS = blockTag("submerged_geode_invalid_blocks");

        private static TagKey<Block> blockTag(String name) {
            return TAGS.registerBlockTag(name);
        }
    }
}
