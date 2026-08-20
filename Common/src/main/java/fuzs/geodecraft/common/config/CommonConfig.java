package fuzs.geodecraft.common.config;

import fuzs.puzzleslib.api.config.v3.Config;
import fuzs.puzzleslib.api.config.v3.ConfigCore;

public class CommonConfig implements ConfigCore {
    private static final String OVERWORLD_CATEGORY = "overworld";
    private static final String THE_NETHER_CATEGORY = "the_nether";
    private static final String THE_END_CATEGORY = "the_end";
    private static final String GEODES_CATEGORY = "geodes";
    private static final String CRYSTALS_CATEGORY = "crystals";

    @Config(category = {OVERWORLD_CATEGORY, GEODES_CATEGORY},
            description = "Generate echo shard geodes in deep dark biomes throughout the overworld.")
    public boolean echoGeodes = true;
    @Config(category = {OVERWORLD_CATEGORY, GEODES_CATEGORY},
            description = "Generate diamond geodes throughout the overworld.")
    public boolean diamondGeodes = true;
    @Config(category = {OVERWORLD_CATEGORY, GEODES_CATEGORY},
            description = "Generate emerald geodes in mountain biomes throughout the overworld.")
    public boolean emeraldGeodes = true;
    @Config(category = {OVERWORLD_CATEGORY, GEODES_CATEGORY},
            description = "Generate geodes containing lapis lazuli throughout the overworld.")
    public boolean lapisGeodes = true;
    @Config(category = {OVERWORLD_CATEGORY, GEODES_CATEGORY},
            description = "Generate redstone geodes throughout the overworld.")
    public boolean redstoneGeodes = true;
    @Config(category = {OVERWORLD_CATEGORY, GEODES_CATEGORY},
            description = "Generate geodes composed of celestite in swamps and mangrove swamps throughout the overworld.")
    public boolean celestiteGeodes = true;
    @Config(category = {OVERWORLD_CATEGORY, GEODES_CATEGORY},
            description = "Generate geodes composed of pink topaz in cherry grove biomes throughout the overworld.")
    public boolean pinkTopazGeodes = true;
    @Config(category = {OVERWORLD_CATEGORY, GEODES_CATEGORY},
            description = "Generate prismarine geodes in deep ocean biomes throughout the overworld.")
    public boolean prismarineGeodes = true;
    @Config(category = {THE_NETHER_CATEGORY, GEODES_CATEGORY},
            description = "Generate ancient debris geodes throughout the Nether.")
    public boolean ancientDebrisGeodes = false;
    @Config(category = {THE_NETHER_CATEGORY, GEODES_CATEGORY},
            description = "Generate glowstone geodes throughout the Nether.")
    public boolean glowstoneGeodes = true;
    @Config(category = {THE_NETHER_CATEGORY, GEODES_CATEGORY},
            description = "Generate gold geodes throughout the Nether.")
    public boolean goldGeodes = true;
    @Config(category = {THE_NETHER_CATEGORY, GEODES_CATEGORY},
            description = "Generate nether quartz geodes throughout the Nether.")
    public boolean netherQuartzGeodes = true;
    @Config(category = {THE_END_CATEGORY, GEODES_CATEGORY},
            description = "Generate wrappist geodes in the outer islands throughout the End.")
    public boolean wrappistGeodes = true;
    @Config(category = {OVERWORLD_CATEGORY, CRYSTALS_CATEGORY},
            description = "Generate echo shard crystal structures in deep dark biomes throughout the overworld.")
    public boolean echoShardCrystals = true;
    @Config(category = {OVERWORLD_CATEGORY, CRYSTALS_CATEGORY},
            description = "Generate prismarine crystal structures in deep ocean biomes throughout the overworld.")
    public boolean prismarineCrystals = true;
    @Config(category = {THE_NETHER_CATEGORY, CRYSTALS_CATEGORY},
            description = "Generate nether quartz crystal structures throughout the Nether.")
    public boolean netherQuartzCrystals = true;
    @Config(category = {THE_NETHER_CATEGORY, CRYSTALS_CATEGORY},
            description = "Generate glowstone crystal structures throughout the Nether.")
    public boolean glowstoneCrystals = true;
    @Config(category = {THE_END_CATEGORY, CRYSTALS_CATEGORY},
            description = "Generate wrappist crystal structures in the outer islands throughout the End.")
    public boolean wrappistCrystals = true;

    @Deprecated
    public static class Blocks {
        public static boolean allowSilkTouch = false;
    }
}
