package net.yeoxuhang.geode_plus;

import fuzs.puzzleslib.api.data.v2.AbstractLootProvider;
import fuzs.puzzleslib.api.data.v2.core.DataProviderContext;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.predicates.MatchTool;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.yeoxuhang.geode_plus.server.registry.BlockRegistry;
import net.yeoxuhang.geode_plus.server.registry.ItemRegistry;

public class GeodePlusBlockLootTableProvider extends AbstractLootProvider.Blocks {

    public GeodePlusBlockLootTableProvider(DataProviderContext context) {
        super(context);
    }

    @Override
    public void addLootTables() {
        HolderLookup.Provider context = this.registries();
        HolderLookup.RegistryLookup<Enchantment> enchantments = context.lookupOrThrow(Registries.ENCHANTMENT);
        this.dropSelf(BlockRegistry.ANCIENT_DEBRIS_CLUSTER_BLOCK.value());
        this.dropSelf(BlockRegistry.DIAMOND_CRYSTAL_BLOCK.value());
        this.dropSelf(BlockRegistry.EMERALD_CLUSTER_BLOCK.value());
        this.dropSelf(BlockRegistry.LAPIS_CLUSTER_BLOCK.value());
        this.dropSelf(BlockRegistry.REDSTONE_CRYSTAL_BLOCK.value());
        this.dropSelf(BlockRegistry.CELESTITE_BLOCK.value());
        this.dropSelf(BlockRegistry.PINK_TOPAZ_BLOCK.value());
        this.dropSelf(BlockRegistry.GALCITE.value());
        this.dropSelf(BlockRegistry.WRAPPIST_BLOCK.value());
        this.dropSelf(BlockRegistry.WRAPPIST_PEDESTAL.value());
        this.dropSelf(BlockRegistry.QUARTZ_CRYSTAL_BLOCK.value());
        this.dropSelf(BlockRegistry.GOLD_NUGGET_CLUSTER_BLOCK.value());
        this.dropSelf(BlockRegistry.GLOWSTONE_CLUSTER_BLOCK.value());
        this.dropSelf(BlockRegistry.PRISMARINE_CLUSTER_BLOCK.value());
        this.dropSelf(BlockRegistry.ECHO_CRYSTAL_BLOCK.value());
        this.add(BlockRegistry.SMOOTH_END_STONE.value(),
                (arg) -> this.createSingleItemTableWithSilkTouch(arg, Blocks.END_STONE));
        this.dropSelf(BlockRegistry.SMOOTH_END_STONE_STAIRS.value());
        this.dropSelf(BlockRegistry.SMOOTH_END_STONE_WALL.value());
        this.dropSelf(BlockRegistry.GALCITE_STAIRS.value());
        this.dropSelf(BlockRegistry.GALCITE_WALL.value());
        this.add(BlockRegistry.ECHO_CRYSTAL.value(),
                (arg) -> this.createSilkTouchDispatchTable(arg,
                        LootItem.lootTableItem(Items.ECHO_SHARD)
                                .apply(SetItemCountFunction.setCount(ConstantValue.exactly(4.0F)))
                                .apply(ApplyBonusCount.addOreBonusCount(enchantments.getOrThrow(Enchantments.FORTUNE)))
                                .when(MatchTool.toolMatches(net.minecraft.advancements.critereon.ItemPredicate.Builder.item()
                                        .of(ItemTags.CLUSTER_MAX_HARVESTABLES)))
                                .otherwise(this.applyExplosionDecay(arg,
                                        LootItem.lootTableItem(Items.ECHO_SHARD)
                                                .apply(SetItemCountFunction.setCount(ConstantValue.exactly(2.0F)))))));
        this.add(BlockRegistry.GOLD_NUGGET_CLUSTER.value(),
                (arg) -> this.createSilkTouchDispatchTable(arg,
                        LootItem.lootTableItem(Items.GOLD_NUGGET)
                                .apply(SetItemCountFunction.setCount(ConstantValue.exactly(4.0F)))
                                .apply(ApplyBonusCount.addOreBonusCount(enchantments.getOrThrow(Enchantments.FORTUNE)))
                                .when(MatchTool.toolMatches(net.minecraft.advancements.critereon.ItemPredicate.Builder.item()
                                        .of(ItemTags.CLUSTER_MAX_HARVESTABLES)))
                                .otherwise(this.applyExplosionDecay(arg,
                                        LootItem.lootTableItem(Items.GOLD_NUGGET)
                                                .apply(SetItemCountFunction.setCount(ConstantValue.exactly(2.0F)))))));
        this.add(BlockRegistry.QUARTZ_CRYSTAL.value(),
                (arg) -> this.createSilkTouchDispatchTable(arg,
                        LootItem.lootTableItem(Items.QUARTZ)
                                .apply(SetItemCountFunction.setCount(ConstantValue.exactly(4.0F)))
                                .apply(ApplyBonusCount.addOreBonusCount(enchantments.getOrThrow(Enchantments.FORTUNE)))
                                .when(MatchTool.toolMatches(net.minecraft.advancements.critereon.ItemPredicate.Builder.item()
                                        .of(ItemTags.CLUSTER_MAX_HARVESTABLES)))
                                .otherwise(this.applyExplosionDecay(arg,
                                        LootItem.lootTableItem(Items.QUARTZ)
                                                .apply(SetItemCountFunction.setCount(ConstantValue.exactly(3.0F)))))));
        this.add(BlockRegistry.WRAPPIST_CLUSTER.value(),
                (arg) -> this.createSilkTouchDispatchTable(arg,
                        LootItem.lootTableItem(ItemRegistry.WRAPPIST_SHARD.value())
                                .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1.0F)))
                                .when(MatchTool.toolMatches(net.minecraft.advancements.critereon.ItemPredicate.Builder.item()
                                        .of(ItemTags.CLUSTER_MAX_HARVESTABLES)))
                                .otherwise(this.applyExplosionDecay(arg,
                                        LootItem.lootTableItem(ItemRegistry.WRAPPIST_SHARD.value())
                                                .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1.0F)))))));
        this.add(BlockRegistry.GLOWSTONE_CLUSTER.value(),
                (arg) -> this.createSilkTouchDispatchTable(arg,
                        LootItem.lootTableItem(Items.GLOWSTONE_DUST)
                                .apply(SetItemCountFunction.setCount(ConstantValue.exactly(3F)))
                                .apply(ApplyBonusCount.addOreBonusCount(enchantments.getOrThrow(Enchantments.FORTUNE)))
                                .when(MatchTool.toolMatches(net.minecraft.advancements.critereon.ItemPredicate.Builder.item()
                                        .of(ItemTags.CLUSTER_MAX_HARVESTABLES)))
                                .otherwise(this.applyExplosionDecay(arg,
                                        LootItem.lootTableItem(Items.GLOWSTONE_DUST)
                                                .apply(SetItemCountFunction.setCount(ConstantValue.exactly(2.0F)))))));
        this.add(BlockRegistry.LAPIS_CLUSTER.value(),
                (arg) -> this.createSilkTouchDispatchTable(arg,
                        LootItem.lootTableItem(Items.LAPIS_LAZULI)
                                .apply(SetItemCountFunction.setCount(ConstantValue.exactly(3F)))
                                .apply(ApplyBonusCount.addOreBonusCount(enchantments.getOrThrow(Enchantments.FORTUNE)))
                                .when(MatchTool.toolMatches(net.minecraft.advancements.critereon.ItemPredicate.Builder.item()
                                        .of(ItemTags.CLUSTER_MAX_HARVESTABLES)))
                                .otherwise(this.applyExplosionDecay(arg,
                                        LootItem.lootTableItem(Items.LAPIS_LAZULI)
                                                .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1.0F)))))));
        this.add(BlockRegistry.REDSTONE_CRYSTAL.value(),
                (arg) -> this.createSilkTouchDispatchTable(arg,
                        LootItem.lootTableItem(Items.REDSTONE)
                                .apply(SetItemCountFunction.setCount(ConstantValue.exactly(6F)))
                                .apply(ApplyBonusCount.addOreBonusCount(enchantments.getOrThrow(Enchantments.FORTUNE)))
                                .when(MatchTool.toolMatches(net.minecraft.advancements.critereon.ItemPredicate.Builder.item()
                                        .of(ItemTags.CLUSTER_MAX_HARVESTABLES)))
                                .otherwise(this.applyExplosionDecay(arg,
                                        LootItem.lootTableItem(Items.REDSTONE)
                                                .apply(SetItemCountFunction.setCount(ConstantValue.exactly(3.0F)))))));
        this.add(BlockRegistry.EMERALD_CLUSTER.value(),
                (arg) -> this.createSilkTouchDispatchTable(arg,
                        LootItem.lootTableItem(Items.EMERALD)
                                .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1F)))
                                .apply(ApplyBonusCount.addOreBonusCount(enchantments.getOrThrow(Enchantments.FORTUNE)))
                                .when(MatchTool.toolMatches(net.minecraft.advancements.critereon.ItemPredicate.Builder.item()
                                        .of(ItemTags.CLUSTER_MAX_HARVESTABLES)))
                                .otherwise(this.applyExplosionDecay(arg,
                                        LootItem.lootTableItem(Items.EMERALD)
                                                .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1.0F)))))));
        this.add(BlockRegistry.DIAMOND_CRYSTAL.value(),
                (arg) -> this.createSilkTouchDispatchTable(arg,
                        LootItem.lootTableItem(Items.DIAMOND)
                                .apply(SetItemCountFunction.setCount(ConstantValue.exactly(2F)))
                                .apply(ApplyBonusCount.addOreBonusCount(enchantments.getOrThrow(Enchantments.FORTUNE)))
                                .when(MatchTool.toolMatches(net.minecraft.advancements.critereon.ItemPredicate.Builder.item()
                                        .of(ItemTags.CLUSTER_MAX_HARVESTABLES)))
                                .otherwise(this.applyExplosionDecay(arg,
                                        LootItem.lootTableItem(Items.DIAMOND)
                                                .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1.0F)))))));

        this.add(BlockRegistry.ANCIENT_DEBRIS_CLUSTER.value(),
                (arg) -> this.createSilkTouchDispatchTable(arg,
                        LootItem.lootTableItem(Items.NETHERITE_SCRAP)
                                .apply(SetItemCountFunction.setCount(ConstantValue.exactly(2F)))
                                .apply(ApplyBonusCount.addOreBonusCount(enchantments.getOrThrow(Enchantments.FORTUNE)))
                                .when(MatchTool.toolMatches(net.minecraft.advancements.critereon.ItemPredicate.Builder.item()
                                        .of(ItemTags.CLUSTER_MAX_HARVESTABLES)))
                                .otherwise(this.applyExplosionDecay(arg,
                                        LootItem.lootTableItem(Items.NETHERITE_SCRAP)
                                                .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1.0F)))))));
        this.add(BlockRegistry.PRISMARINE_CLUSTER.value(),
                (arg) -> this.createSilkTouchDispatchTable(arg,
                        LootItem.lootTableItem(Items.PRISMARINE_SHARD)
                                .apply(SetItemCountFunction.setCount(ConstantValue.exactly(4F)))
                                .apply(ApplyBonusCount.addOreBonusCount(enchantments.getOrThrow(Enchantments.FORTUNE)))
                                .when(MatchTool.toolMatches(net.minecraft.advancements.critereon.ItemPredicate.Builder.item()
                                        .of(ItemTags.CLUSTER_MAX_HARVESTABLES)))
                                .otherwise(this.applyExplosionDecay(arg,
                                        LootItem.lootTableItem(Items.PRISMARINE_SHARD)
                                                .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1.0F)))))));
        this.add(BlockRegistry.CELESTITE_CLUSTER.value(),
                (arg) -> this.createSilkTouchDispatchTable(arg,
                        LootItem.lootTableItem(ItemRegistry.CELESTITE_SHARD.value())
                                .apply(SetItemCountFunction.setCount(ConstantValue.exactly(4.0F)))
                                .apply(ApplyBonusCount.addOreBonusCount(enchantments.getOrThrow(Enchantments.FORTUNE)))
                                .when(MatchTool.toolMatches(net.minecraft.advancements.critereon.ItemPredicate.Builder.item()
                                        .of(ItemTags.CLUSTER_MAX_HARVESTABLES)))
                                .otherwise(this.applyExplosionDecay(arg,
                                        LootItem.lootTableItem(ItemRegistry.CELESTITE_SHARD.value())
                                                .apply(SetItemCountFunction.setCount(ConstantValue.exactly(2.0F)))))));
        this.add(BlockRegistry.PINK_TOPAZ_CRYSTAL.value(),
                (arg) -> this.createSilkTouchDispatchTable(arg,
                        LootItem.lootTableItem(ItemRegistry.PINK_TOPAZ.value())
                                .apply(SetItemCountFunction.setCount(ConstantValue.exactly(4.0F)))
                                .apply(ApplyBonusCount.addOreBonusCount(enchantments.getOrThrow(Enchantments.FORTUNE)))
                                .when(MatchTool.toolMatches(net.minecraft.advancements.critereon.ItemPredicate.Builder.item()
                                        .of(ItemTags.CLUSTER_MAX_HARVESTABLES)))
                                .otherwise(this.applyExplosionDecay(arg,
                                        LootItem.lootTableItem(ItemRegistry.PINK_TOPAZ.value())
                                                .apply(SetItemCountFunction.setCount(ConstantValue.exactly(2.0F)))))));


        this.dropWhenSilkTouch(BlockRegistry.LARGE_QUARTZ_BUD.value());
        this.dropWhenSilkTouch(BlockRegistry.LARGE_ECHO_BUD.value());
        this.dropWhenSilkTouch(BlockRegistry.LARGE_GLOWSTONE_BUD.value());
        this.dropWhenSilkTouch(BlockRegistry.LARGE_WRAPPIST_BUD.value());
        this.dropWhenSilkTouch(BlockRegistry.LARGE_GOLD_NUGGET_BUD.value());
        this.dropWhenSilkTouch(BlockRegistry.LARGE_LAPIS_BUD.value());
        this.dropWhenSilkTouch(BlockRegistry.LARGE_REDSTONE_BUD.value());
        this.dropWhenSilkTouch(BlockRegistry.LARGE_EMERALD_BUD.value());
        this.dropWhenSilkTouch(BlockRegistry.LARGE_DIAMOND_BUD.value());
        this.dropWhenSilkTouch(BlockRegistry.LARGE_ANCIENT_DEBRIS_BUD.value());
        this.dropWhenSilkTouch(BlockRegistry.LARGE_PRISMARINE_BUD.value());
        this.dropWhenSilkTouch(BlockRegistry.LARGE_CELESTITE_BUD.value());
        this.dropWhenSilkTouch(BlockRegistry.LARGE_PINK_TOPAZ_BUD.value());

        this.dropWhenSilkTouch(BlockRegistry.MEDIUM_QUARTZ_BUD.value());
        this.dropWhenSilkTouch(BlockRegistry.MEDIUM_ECHO_BUD.value());
        this.dropWhenSilkTouch(BlockRegistry.MEDIUM_GLOWSTONE_BUD.value());
        this.dropWhenSilkTouch(BlockRegistry.MEDIUM_WRAPPIST_BUD.value());
        this.dropWhenSilkTouch(BlockRegistry.MEDIUM_GOLD_NUGGET_BUD.value());
        this.dropWhenSilkTouch(BlockRegistry.MEDIUM_LAPIS_BUD.value());
        this.dropWhenSilkTouch(BlockRegistry.MEDIUM_REDSTONE_BUD.value());
        this.dropWhenSilkTouch(BlockRegistry.MEDIUM_EMERALD_BUD.value());
        this.dropWhenSilkTouch(BlockRegistry.MEDIUM_DIAMOND_BUD.value());
        this.dropWhenSilkTouch(BlockRegistry.MEDIUM_ANCIENT_DEBRIS_BUD.value());
        this.dropWhenSilkTouch(BlockRegistry.MEDIUM_PRISMARINE_BUD.value());
        this.dropWhenSilkTouch(BlockRegistry.MEDIUM_CELESTITE_BUD.value());
        this.dropWhenSilkTouch(BlockRegistry.MEDIUM_PINK_TOPAZ_BUD.value());

        this.dropWhenSilkTouch(BlockRegistry.SMALL_QUARTZ_BUD.value());
        this.dropWhenSilkTouch(BlockRegistry.SMALL_ECHO_BUD.value());
        this.dropWhenSilkTouch(BlockRegistry.SMALL_GLOWSTONE_BUD.value());
        this.dropWhenSilkTouch(BlockRegistry.SMALL_WRAPPIST_BUD.value());
        this.dropWhenSilkTouch(BlockRegistry.SMALL_GOLD_NUGGET_BUD.value());
        this.dropWhenSilkTouch(BlockRegistry.SMALL_LAPIS_BUD.value());
        this.dropWhenSilkTouch(BlockRegistry.SMALL_REDSTONE_BUD.value());
        this.dropWhenSilkTouch(BlockRegistry.SMALL_EMERALD_BUD.value());
        this.dropWhenSilkTouch(BlockRegistry.SMALL_DIAMOND_BUD.value());
        this.dropWhenSilkTouch(BlockRegistry.SMALL_ANCIENT_DEBRIS_BUD.value());
        this.dropWhenSilkTouch(BlockRegistry.SMALL_PRISMARINE_BUD.value());
        this.dropWhenSilkTouch(BlockRegistry.SMALL_CELESTITE_BUD.value());
        this.dropWhenSilkTouch(BlockRegistry.SMALL_PINK_TOPAZ_BUD.value());

        this.add(BlockRegistry.BUDDING_BASALT_QUARTZ.value(), noDrop());
        this.add(BlockRegistry.BUDDING_BLACKSTONE_QUARTZ.value(), noDrop());
        this.add(BlockRegistry.BUDDING_BLACKSTONE_GLOWSTONE.value(), noDrop());
        this.add(BlockRegistry.BUDDING_ECHO.value(), noDrop());
        this.add(BlockRegistry.BUDDING_BASALT_GLOWSTONE.value(), noDrop());
        this.add(BlockRegistry.BUDDING_GLOWSTONE.value(), noDrop());
        this.add(BlockRegistry.BUDDING_NETHER_QUARTZ.value(), noDrop());
        this.add(BlockRegistry.BUDDING_WRAPPIST.value(), noDrop());
        this.add(BlockRegistry.BUDDING_GOLD_NUGGET.value(), noDrop());
        this.add(BlockRegistry.BUDDING_BASALT_GOLD_NUGGET.value(), noDrop());
        this.add(BlockRegistry.BUDDING_BLACKSTONE_GOLD_NUGGET.value(), noDrop());
        this.add(BlockRegistry.BUDDING_LAPIS.value(), noDrop());
        this.add(BlockRegistry.BUDDING_REDSTONE.value(), noDrop());
        this.add(BlockRegistry.BUDDING_EMERALD.value(), noDrop());
        this.add(BlockRegistry.BUDDING_DIAMOND.value(), noDrop());
        this.add(BlockRegistry.BUDDING_DEEPSLATE_LAPIS.value(), noDrop());
        this.add(BlockRegistry.BUDDING_DEEPSLATE_REDSTONE.value(), noDrop());
        this.add(BlockRegistry.BUDDING_DEEPSLATE_EMERALD.value(), noDrop());
        this.add(BlockRegistry.BUDDING_DEEPSLATE_DIAMOND.value(), noDrop());
        this.add(BlockRegistry.BUDDING_SCULK_LAPIS.value(), noDrop());
        this.add(BlockRegistry.BUDDING_SCULK_REDSTONE.value(), noDrop());
        this.add(BlockRegistry.BUDDING_SCULK_EMERALD.value(), noDrop());
        this.add(BlockRegistry.BUDDING_SCULK_DIAMOND.value(), noDrop());
        this.add(BlockRegistry.BUDDING_ANCIENT_DEBRIS.value(), noDrop());
        this.add(BlockRegistry.BUDDING_BASALT_ANCIENT_DEBRIS.value(), noDrop());
        this.add(BlockRegistry.BUDDING_BLACKSTONE_ANCIENT_DEBRIS.value(), noDrop());
        this.add(BlockRegistry.BUDDING_PRISMARINE.value(), noDrop());
        this.add(BlockRegistry.BUDDING_CELESTITE.value(), noDrop());
        this.add(BlockRegistry.BUDDING_PINK_TOPAZ.value(), noDrop());
        this.registerSlab(BlockRegistry.SMOOTH_END_STONE_SLAB.value());
        this.registerSlab(BlockRegistry.GALCITE_SLAB.value());

        this.dropWhenSilkTouch(BlockRegistry.WRAPPIST_GLASS.value());
        this.dropWhenSilkTouch(BlockRegistry.CELESTITE_GLASS.value());
        this.dropWhenSilkTouch(BlockRegistry.PINK_TOPAZ_GLASS.value());
    }

    private void registerSlab(Block b) {
        this.add(b, this.createSlabItemTable(b));
    }
}
