package fuzs.geodecraft.common.data.loot;

import fuzs.geodecraft.common.init.ItemRegistry;
import fuzs.geodecraft.common.init.LootRegistry;
import fuzs.geodecraft.common.init.TagRegistry;
import fuzs.puzzleslib.common.api.data.v3.loot.AbstractLootSubProvider;
import net.minecraft.advancements.predicates.LocationPredicate;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.loot.LootTableSubProvider;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.predicates.LocationCheck;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.minecraft.world.level.storage.loot.providers.number.ints.ContextIntProviders;

public class ModChestLootProvider extends AbstractLootSubProvider {

    public ModChestLootProvider(LootTableSubProvider.Context context) {
        super(context);
    }

    @Override
    public void generate() {
        this.output.accept(LootRegistry.SIMPLE_DUNGEON_LOOT_TABLE,
                LootTable.lootTable()
                        .withPool(LootPool.lootPool()
                                .setRolls(ContextIntProviders.exactly(1))
                                .when(LootItemRandomChanceCondition.randomChance(0.15F))
                                .add(LootItem.lootTableItem(ItemRegistry.CELESTE_ARMOR_TRIM_SMITHING_TEMPLATE.value())
                                        .when(LocationCheck.checkLocation(LocationPredicate.Builder.location()
                                                .setBiomes(this.output.lookup(Registries.BIOME)
                                                        .getOrThrow(TagRegistry.Biomes.HAS_CELESTITE_GEODE)))))
                                .add(LootItem.lootTableItem(ItemRegistry.HEART_ARMOR_TRIM_SMITHING_TEMPLATE.value())
                                        .when(LocationCheck.checkLocation(LocationPredicate.Builder.location()
                                                .setBiomes(this.output.lookup(Registries.BIOME)
                                                        .getOrThrow(TagRegistry.Biomes.HAS_PINK_TOPAZ_GEODE)))))
                                .add(LootItem.lootTableItem(ItemRegistry.WRAP_ARMOR_TRIM_SMITHING_TEMPLATE.value())
                                        .when(LocationCheck.checkLocation(LocationPredicate.Builder.location()
                                                .setBiomes(this.output.lookup(Registries.BIOME)
                                                        .getOrThrow(TagRegistry.Biomes.HAS_WRAPPIST_GEODE)))))));
    }
}
