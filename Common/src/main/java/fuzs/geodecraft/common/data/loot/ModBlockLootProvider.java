package fuzs.geodecraft.common.data.loot;

import fuzs.geodecraft.common.init.BlockRegistry;
import fuzs.geodecraft.common.init.ItemRegistry;
import fuzs.puzzleslib.api.data.v2.AbstractLootProvider;
import fuzs.puzzleslib.api.data.v2.core.DataProviderContext;
import fuzs.puzzleslib.api.item.v2.EnchantingHelper;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.predicates.MatchTool;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;

public class ModBlockLootProvider extends AbstractLootProvider.Blocks {

    public ModBlockLootProvider(DataProviderContext context) {
        super(context);
    }

    @Override
    public void addLootTables() {
        HolderLookup.Provider context = this.registries();

        this.dropSelf(BlockRegistry.WRAPPIST_PEDESTAL.value());
        this.dropSelf(BlockRegistry.WRAPPIST_GLASS.value());
        this.dropSelf(BlockRegistry.CELESTITE_GLASS.value());
        this.dropSelf(BlockRegistry.PINK_TOPAZ_GLASS.value());

        this.dropSelf(BlockRegistry.ANCIENT_DEBRIS_CLUSTER_BLOCK.value());
        this.dropSelf(BlockRegistry.DIAMOND_CRYSTAL_BLOCK.value());
        this.dropSelf(BlockRegistry.EMERALD_CLUSTER_BLOCK.value());
        this.dropSelf(BlockRegistry.LAPIS_LAZULI_CLUSTER_BLOCK.value());
        this.dropSelf(BlockRegistry.REDSTONE_CRYSTAL_BLOCK.value());
        this.dropSelf(BlockRegistry.CELESTITE_BLOCK.value());
        this.dropSelf(BlockRegistry.PINK_TOPAZ_BLOCK.value());
        this.dropSelf(BlockRegistry.WRAPPIST_BLOCK.value());
        this.dropSelf(BlockRegistry.NETHER_QUARTZ_CRYSTAL_BLOCK.value());
        this.dropSelf(BlockRegistry.GOLD_NUGGET_CLUSTER_BLOCK.value());
        this.dropSelf(BlockRegistry.GLOWSTONE_CLUSTER_BLOCK.value());
        this.dropSelf(BlockRegistry.PRISMARINE_CLUSTER_BLOCK.value());
        this.dropSelf(BlockRegistry.ECHO_CRYSTAL_BLOCK.value());

        this.add(BlockRegistry.SMOOTH_END_STONE.value(),
                (Block block) -> this.createSingleItemTableWithSilkTouch(block, Blocks.END_STONE));
        this.dropSelf(BlockRegistry.SMOOTH_END_STONE_STAIRS.value());
        this.dropSelf(BlockRegistry.SMOOTH_END_STONE_WALL.value());
        this.add(BlockRegistry.SMOOTH_END_STONE_SLAB.value(), this::createSlabItemTable);

        this.dropSelf(BlockRegistry.GALCITE.value());
        this.dropSelf(BlockRegistry.GALCITE_STAIRS.value());
        this.dropSelf(BlockRegistry.GALCITE_WALL.value());
        this.add(BlockRegistry.GALCITE_SLAB.value(), this::createSlabItemTable);

        this.add(BlockRegistry.ECHO_CRYSTAL.value(), (Block block) -> {
            return this.createClusterDrops(block, Items.ECHO_SHARD, 4.0F, 2.0F, context);
        });
        this.add(BlockRegistry.GOLD_NUGGET_CLUSTER.value(), (Block block) -> {
            return this.createClusterDrops(block, Items.GOLD_NUGGET, 4.0F, 2.0F, context);
        });
        this.add(BlockRegistry.NETHER_QUARTZ_CRYSTAL.value(), (Block block) -> {
            return this.createClusterDrops(block, Items.QUARTZ, 4.0F, 3.0F, context);
        });
        this.add(BlockRegistry.WRAPPIST_CLUSTER.value(), (Block block) -> {
            return this.createClusterDrops(block, ItemRegistry.WRAPPIST_SHARD.value(), 2.0F, 1.0F, context);
        });
        this.add(BlockRegistry.GLOWSTONE_CLUSTER.value(), (Block block) -> {
            return this.createClusterDrops(block, Items.GLOWSTONE_DUST, 3.0F, 2.0F, context);
        });
        this.add(BlockRegistry.LAPIS_LAZULI_CLUSTER.value(), (Block block) -> {
            return this.createClusterDrops(block, Items.LAPIS_LAZULI, 3.0F, 1.0F, context);
        });
        this.add(BlockRegistry.REDSTONE_CRYSTAL.value(), (Block block) -> {
            return this.createClusterDrops(block, Items.REDSTONE, 6.0F, 3.0F, context);
        });
        this.add(BlockRegistry.EMERALD_CLUSTER.value(), (Block block) -> {
            return this.createClusterDrops(block, Items.EMERALD, 1.0F, 1.0F, context);
        });
        this.add(BlockRegistry.DIAMOND_CRYSTAL.value(), (Block block) -> {
            return this.createClusterDrops(block, Items.DIAMOND, 2.0F, 1.0F, context);
        });
        this.add(BlockRegistry.ANCIENT_DEBRIS_CLUSTER.value(), (Block block) -> {
            return this.createClusterDrops(block, Items.NETHERITE_SCRAP, 2.0F, 1.0F, context);
        });
        this.add(BlockRegistry.PRISMARINE_CLUSTER.value(), (Block block) -> {
            return this.createClusterDrops(block, Items.PRISMARINE_SHARD, 4.0F, 1.0F, context);
        });
        this.add(BlockRegistry.CELESTITE_CLUSTER.value(), (Block block) -> {
            return this.createClusterDrops(block, ItemRegistry.CELESTITE_SHARD.value(), 4.0F, 2.0F, context);
        });
        this.add(BlockRegistry.PINK_TOPAZ_CRYSTAL.value(), (Block block) -> {
            return this.createClusterDrops(block, ItemRegistry.PINK_TOPAZ.value(), 4.0F, 2.0F, context);
        });

        this.dropWhenSilkTouch(BlockRegistry.LARGE_NETHER_QUARTZ_BUD.value());
        this.dropWhenSilkTouch(BlockRegistry.LARGE_ECHO_BUD.value());
        this.dropWhenSilkTouch(BlockRegistry.LARGE_GLOWSTONE_BUD.value());
        this.dropWhenSilkTouch(BlockRegistry.LARGE_WRAPPIST_BUD.value());
        this.dropWhenSilkTouch(BlockRegistry.LARGE_GOLD_NUGGET_BUD.value());
        this.dropWhenSilkTouch(BlockRegistry.LARGE_LAPIS_LAZULI_BUD.value());
        this.dropWhenSilkTouch(BlockRegistry.LARGE_REDSTONE_BUD.value());
        this.dropWhenSilkTouch(BlockRegistry.LARGE_EMERALD_BUD.value());
        this.dropWhenSilkTouch(BlockRegistry.LARGE_DIAMOND_BUD.value());
        this.dropWhenSilkTouch(BlockRegistry.LARGE_ANCIENT_DEBRIS_BUD.value());
        this.dropWhenSilkTouch(BlockRegistry.LARGE_PRISMARINE_BUD.value());
        this.dropWhenSilkTouch(BlockRegistry.LARGE_CELESTITE_BUD.value());
        this.dropWhenSilkTouch(BlockRegistry.LARGE_PINK_TOPAZ_BUD.value());

        this.dropWhenSilkTouch(BlockRegistry.MEDIUM_NETHER_QUARTZ_BUD.value());
        this.dropWhenSilkTouch(BlockRegistry.MEDIUM_ECHO_BUD.value());
        this.dropWhenSilkTouch(BlockRegistry.MEDIUM_GLOWSTONE_BUD.value());
        this.dropWhenSilkTouch(BlockRegistry.MEDIUM_WRAPPIST_BUD.value());
        this.dropWhenSilkTouch(BlockRegistry.MEDIUM_GOLD_NUGGET_BUD.value());
        this.dropWhenSilkTouch(BlockRegistry.MEDIUM_LAPIS_LAZULI_BUD.value());
        this.dropWhenSilkTouch(BlockRegistry.MEDIUM_REDSTONE_BUD.value());
        this.dropWhenSilkTouch(BlockRegistry.MEDIUM_EMERALD_BUD.value());
        this.dropWhenSilkTouch(BlockRegistry.MEDIUM_DIAMOND_BUD.value());
        this.dropWhenSilkTouch(BlockRegistry.MEDIUM_ANCIENT_DEBRIS_BUD.value());
        this.dropWhenSilkTouch(BlockRegistry.MEDIUM_PRISMARINE_BUD.value());
        this.dropWhenSilkTouch(BlockRegistry.MEDIUM_CELESTITE_BUD.value());
        this.dropWhenSilkTouch(BlockRegistry.MEDIUM_PINK_TOPAZ_BUD.value());

        this.dropWhenSilkTouch(BlockRegistry.SMALL_NETHER_QUARTZ_BUD.value());
        this.dropWhenSilkTouch(BlockRegistry.SMALL_ECHO_BUD.value());
        this.dropWhenSilkTouch(BlockRegistry.SMALL_GLOWSTONE_BUD.value());
        this.dropWhenSilkTouch(BlockRegistry.SMALL_WRAPPIST_BUD.value());
        this.dropWhenSilkTouch(BlockRegistry.SMALL_GOLD_NUGGET_BUD.value());
        this.dropWhenSilkTouch(BlockRegistry.SMALL_LAPIS_LAZULI_BUD.value());
        this.dropWhenSilkTouch(BlockRegistry.SMALL_REDSTONE_BUD.value());
        this.dropWhenSilkTouch(BlockRegistry.SMALL_EMERALD_BUD.value());
        this.dropWhenSilkTouch(BlockRegistry.SMALL_DIAMOND_BUD.value());
        this.dropWhenSilkTouch(BlockRegistry.SMALL_ANCIENT_DEBRIS_BUD.value());
        this.dropWhenSilkTouch(BlockRegistry.SMALL_PRISMARINE_BUD.value());
        this.dropWhenSilkTouch(BlockRegistry.SMALL_CELESTITE_BUD.value());
        this.dropWhenSilkTouch(BlockRegistry.SMALL_PINK_TOPAZ_BUD.value());

        this.dropNothing(BlockRegistry.BUDDING_BASALT_NETHER_QUARTZ.value());
        this.dropNothing(BlockRegistry.BUDDING_BLACKSTONE_NETHER_QUARTZ.value());
        this.dropNothing(BlockRegistry.BUDDING_BLACKSTONE_GLOWSTONE.value());
        this.dropNothing(BlockRegistry.BUDDING_ECHO.value());
        this.dropNothing(BlockRegistry.BUDDING_BASALT_GLOWSTONE.value());
        this.dropNothing(BlockRegistry.BUDDING_GLOWSTONE.value());
        this.dropNothing(BlockRegistry.BUDDING_NETHER_QUARTZ.value());
        this.dropNothing(BlockRegistry.BUDDING_WRAPPIST.value());
        this.dropNothing(BlockRegistry.BUDDING_GOLD_NUGGET.value());
        this.dropNothing(BlockRegistry.BUDDING_BASALT_GOLD_NUGGET.value());
        this.dropNothing(BlockRegistry.BUDDING_BLACKSTONE_GOLD_NUGGET.value());
        this.dropNothing(BlockRegistry.BUDDING_LAPIS_LAZULI.value());
        this.dropNothing(BlockRegistry.BUDDING_REDSTONE.value());
        this.dropNothing(BlockRegistry.BUDDING_EMERALD.value());
        this.dropNothing(BlockRegistry.BUDDING_DIAMOND.value());
        this.dropNothing(BlockRegistry.BUDDING_DEEPSLATE_LAPIS_LAZULI.value());
        this.dropNothing(BlockRegistry.BUDDING_DEEPSLATE_REDSTONE.value());
        this.dropNothing(BlockRegistry.BUDDING_DEEPSLATE_EMERALD.value());
        this.dropNothing(BlockRegistry.BUDDING_DEEPSLATE_DIAMOND.value());
        this.dropNothing(BlockRegistry.BUDDING_SCULK_LAPIS_LAZULI.value());
        this.dropNothing(BlockRegistry.BUDDING_SCULK_REDSTONE.value());
        this.dropNothing(BlockRegistry.BUDDING_SCULK_EMERALD.value());
        this.dropNothing(BlockRegistry.BUDDING_SCULK_DIAMOND.value());
        this.dropNothing(BlockRegistry.BUDDING_ANCIENT_DEBRIS.value());
        this.dropNothing(BlockRegistry.BUDDING_BASALT_ANCIENT_DEBRIS.value());
        this.dropNothing(BlockRegistry.BUDDING_BLACKSTONE_ANCIENT_DEBRIS.value());
        this.dropNothing(BlockRegistry.BUDDING_PRISMARINE.value());
        this.dropNothing(BlockRegistry.BUDDING_CELESTITE.value());
        this.dropNothing(BlockRegistry.BUDDING_PINK_TOPAZ.value());
    }

    public final LootTable.Builder createClusterDrops(Block block, ItemLike droppedItem, float dropCountWithPickaxe, float dropCountWithoutPickaxe, HolderLookup.Provider context) {
        return this.createSilkTouchDispatchTable(block,
                LootItem.lootTableItem(droppedItem)
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(dropCountWithPickaxe)))
                        .apply(ApplyBonusCount.addOreBonusCount(EnchantingHelper.lookup(context, Enchantments.FORTUNE)))
                        .when(MatchTool.toolMatches(ItemPredicate.Builder.item().of(ItemTags.CLUSTER_MAX_HARVESTABLES)))
                        .otherwise(this.applyExplosionDecay(block,
                                LootItem.lootTableItem(droppedItem)
                                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(
                                                dropCountWithoutPickaxe))))));
    }
}
