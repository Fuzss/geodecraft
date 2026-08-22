package fuzs.geodecraft.common.init;

import fuzs.geodecraft.common.Geodecraft;
import fuzs.puzzleslib.api.init.v3.registry.RegistryManager;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.level.storage.loot.BuiltInLootTables;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.NestedLootTable;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;

import java.util.HashMap;
import java.util.Map;

public class ModRegistry {
    private static final Map<ResourceLocation, ResourceKey<LootTable>> ADDITIONAL_LOOT_TABLES = new HashMap<>();
    public static final RegistrySetBuilder REGISTRIES_BUILDER = new RegistrySetBuilder().add(Registries.CONFIGURED_FEATURE,
                    ConfiguredFeatureRegistry::bootstrap)
            .add(Registries.PLACED_FEATURE, PlacedFeatureRegistry::bootstrap)
            .add(Registries.TRIM_MATERIAL, TrimMaterialRegistry::bootstrapMaterials)
            .add(Registries.TRIM_PATTERN, TrimPatternRegistry::bootstrapPatterns);
    static final RegistryManager REGISTRIES = RegistryManager.from(Geodecraft.MOD_ID);
    public static final Holder.Reference<CreativeModeTab> CREATIVE_MODE_TAB = REGISTRIES.registerCreativeModeTab(
            ItemRegistry.WRAPPIST_SHARD);
    public static final ResourceKey<LootTable> SIMPLE_DUNGEON_LOOT_TABLE = registerAdditionalLootTable(BuiltInLootTables.SIMPLE_DUNGEON);

    public static void bootstrap() {
        BlockRegistry.bootstrap();
        ItemRegistry.bootstrap();
        BlockEntityRegistry.bootstrap();
        PotionRegistry.bootstrap();
        FeatureRegistry.bootstrap();
    }

    private static ResourceKey<LootTable> registerAdditionalLootTable(ResourceKey<LootTable> key) {
        ResourceKey<LootTable> updatedKey = ModRegistry.REGISTRIES.makeResourceKey(Registries.LOOT_TABLE,
                "inject/" + key.location().getPath());
        ADDITIONAL_LOOT_TABLES.put(key.location(), updatedKey);
        return updatedKey;
    }

    public static void onLootTableLoad(ResourceLocation id, LootTable.Builder lootTable, HolderLookup.Provider context) {
        if (ADDITIONAL_LOOT_TABLES.containsKey(id)) {
            lootTable.withPool(LootPool.lootPool()
                    .setRolls(ConstantValue.exactly(1.0F))
                    .add(NestedLootTable.lootTableReference(ADDITIONAL_LOOT_TABLES.get(id))));
        }
    }
}
