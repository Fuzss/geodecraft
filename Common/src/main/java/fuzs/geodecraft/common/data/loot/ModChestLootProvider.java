package fuzs.geodecraft.common.data.loot;

import fuzs.geodecraft.common.init.ItemRegistry;
import fuzs.geodecraft.common.init.ModRegistry;
import fuzs.geodecraft.common.init.TagRegistry;
import fuzs.puzzleslib.api.data.v2.AbstractLootProvider;
import fuzs.puzzleslib.api.data.v2.core.DataProviderContext;
import net.minecraft.advancements.critereon.LocationPredicate;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.minecraft.world.level.storage.loot.predicates.LocationCheck;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;

public class ModChestLootProvider extends AbstractLootProvider.Simple {

    public ModChestLootProvider(DataProviderContext context) {
        super(LootContextParamSets.CHEST, context);
    }

    @Override
    public void addLootTables() {
        HolderLookup.Provider context = this.registries();
        this.add(ModRegistry.SIMPLE_DUNGEON_LOOT_TABLE,
                LootTable.lootTable()
                        .withPool(LootPool.lootPool()
                                .setRolls(ConstantValue.exactly(1.0F))
                                .when(LootItemRandomChanceCondition.randomChance(0.15F))
                                .add(LootItem.lootTableItem(ItemRegistry.CELESTE_ARMOR_TRIM_SMITHING_TEMPLATE.value())
                                        .when(LocationCheck.checkLocation(LocationPredicate.Builder.location()
                                                .setBiomes(context.lookupOrThrow(Registries.BIOME)
                                                        .getOrThrow(TagRegistry.Biomes.HAS_CELESTITE_GEODE)))))
                                .add(LootItem.lootTableItem(ItemRegistry.HEART_ARMOR_TRIM_SMITHING_TEMPLATE.value())
                                        .when(LocationCheck.checkLocation(LocationPredicate.Builder.location()
                                                .setBiomes(context.lookupOrThrow(Registries.BIOME)
                                                        .getOrThrow(TagRegistry.Biomes.HAS_PINK_TOPAZ_GEODE)))))
                                .add(LootItem.lootTableItem(ItemRegistry.WRAP_ARMOR_TRIM_SMITHING_TEMPLATE.value())
                                        .when(LocationCheck.checkLocation(LocationPredicate.Builder.location()
                                                .setBiomes(context.lookupOrThrow(Registries.BIOME)
                                                        .getOrThrow(TagRegistry.Biomes.HAS_WRAPPIST_GEODE)))))));
    }
}
