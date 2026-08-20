package net.yeoxuhang.geode_plus.config;

public class ServerConfig {

    public static class WorldGeneration {
        public static boolean shouldGenerateEchoGeodes = true;
        public static boolean shouldGenerateDiamondGeodes = true;
        public static boolean shouldGenerateEmeraldGeodes = true;
        public static boolean shouldGenerateLapisGeodes = true;
        public static boolean shouldGenerateRedstoneGeodes = true;

        public static boolean shouldGenerateCelestiteGeodes = true;
        public static boolean shouldGeneratePinkTopazGeodes = true;
        public static boolean shouldGeneratePrismarineGeodes = true;

        public static boolean shouldGenerateNetherDebrisGeodes = false;
        public static boolean shouldGenerateNetherGlowstoneGeodes = true;
        public static boolean shouldGenerateNetherGoldNuggetGeodes = true;
        public static boolean shouldGenerateNetherQuartzGeodes = true;

        public static boolean shouldGenerateWrappistGeodes = true;
        //Large Crystal
        public static boolean shouldGenerateEchoCrystal = true;
        public static boolean shouldGeneratePrismarineCrystal = true;

        public static boolean shouldGenerateQuartzCrystal = true;
        public static boolean shouldGenerateGlowstoneCrystal = true;

        public static boolean shouldGenerateWrappistCrystal = true;

    }

    public static class Blocks {
        public static boolean allowSilkTouch = false;
    }
}
