package fuzs.geodecraft.common.init;

import fuzs.geodecraft.common.Geodecraft;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.storage.loot.BuiltInLootTables;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.NestedLootTable;
import net.minecraft.world.level.storage.loot.providers.number.ints.ContextIntProviders;

import java.util.HashMap;
import java.util.Map;

public class LootRegistry {
    private static final Map<Identifier, ResourceKey<LootTable>> LOOT_TABLE_ADDITIONS = new HashMap<>();
    public static final ResourceKey<LootTable> SIMPLE_DUNGEON_LOOT_TABLE = register(BuiltInLootTables.SIMPLE_DUNGEON);

    private static ResourceKey<LootTable> register(ResourceKey<LootTable> key) {
        String updatedPath = "inject/" + key.identifier().getPath();
        ResourceKey<LootTable> updatedKey = register(updatedPath);
        LOOT_TABLE_ADDITIONS.put(key.identifier(), updatedKey);
        return updatedKey;
    }

    private static ResourceKey<LootTable> register(String name) {
        return ResourceKey.create(Registries.LOOT_TABLE, Geodecraft.id(name));
    }

    public static void onLootTableLoad(Identifier id, LootTable.Builder lootTable, HolderGetter.Provider context) {
        if (LOOT_TABLE_ADDITIONS.containsKey(id)) {
            lootTable.withPool(LootPool.lootPool()
                    .setRolls(ContextIntProviders.exactly(1))
                    .add(NestedLootTable.lootTableReference(context.getOrThrow(LOOT_TABLE_ADDITIONS.get(id)))));
        }
    }
}
