package fuzs.geodecraft.common.data.loot;

import fuzs.geodecraft.common.init.BlockRegistry;
import fuzs.geodecraft.common.init.ItemRegistry;
import fuzs.puzzleslib.common.api.data.v3.loot.AbstractBlockLootSubProvider;
import net.minecraft.advancements.predicates.ItemPredicate;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.loot.LootTableSubProvider;
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
import net.minecraft.world.level.storage.loot.providers.number.ints.ContextIntProviders;

import java.util.function.Consumer;

public class ModBlockLootProvider extends AbstractBlockLootSubProvider {

    public ModBlockLootProvider(LootTableSubProvider.Context context) {
        super(context);
    }

    @Override
    public void generate() {
        this.dropSelf(BlockRegistry.PEDESTAL.value());
        this.dropSelf(BlockRegistry.WRAPPIST_GLASS.value());
        this.dropSelf(BlockRegistry.CELESTITE_GLASS.value());
        this.dropSelf(BlockRegistry.PINK_TOPAZ_GLASS.value());

        this.dropSelf(BlockRegistry.ANCIENT_DEBRIS_CRYSTAL_BLOCK.value());
        this.dropSelf(BlockRegistry.DIAMOND_CRYSTAL_BLOCK.value());
        this.dropSelf(BlockRegistry.EMERALD_CRYSTAL_BLOCK.value());
        this.dropSelf(BlockRegistry.LAPIS_LAZULI_CRYSTAL_BLOCK.value());
        this.dropSelf(BlockRegistry.REDSTONE_CRYSTAL_BLOCK.value());
        this.dropSelf(BlockRegistry.CELESTITE_BLOCK.value());
        this.dropSelf(BlockRegistry.PINK_TOPAZ_BLOCK.value());
        this.dropSelf(BlockRegistry.WRAPPIST_BLOCK.value());
        this.dropSelf(BlockRegistry.NETHER_QUARTZ_CRYSTAL_BLOCK.value());
        this.dropSelf(BlockRegistry.NETHER_GOLD_CRYSTAL_BLOCK.value());
        this.dropSelf(BlockRegistry.GLOWSTONE_CRYSTAL_BLOCK.value());
        this.dropSelf(BlockRegistry.PRISMARINE_CRYSTAL_BLOCK.value());
        this.dropSelf(BlockRegistry.ECHO_CRYSTAL_BLOCK.value());

        this.add(BlockRegistry.SMOOTH_END_STONE.value(),
                (Block block) -> this.createSingleItemTableWithSilkTouch(block, Blocks.END_STONE));
        this.dropSelf(BlockRegistry.SMOOTH_END_STONE_STAIRS.value());
        this.add(BlockRegistry.SMOOTH_END_STONE_SLAB.value(), this::createSlabItemTable);

        this.add(BlockRegistry.ECHO_CRYSTAL.value(), (Block block) -> {
            return this.createClusterDrops(block, Items.ECHO_SHARD, 4, 2);
        });
        this.add(BlockRegistry.NETHER_GOLD_CRYSTAL.value(), (Block block) -> {
            return this.createClusterDrops(block, Items.GOLD_NUGGET, 4, 2);
        });
        this.add(BlockRegistry.NETHER_QUARTZ_CRYSTAL.value(), (Block block) -> {
            return this.createClusterDrops(block, Items.QUARTZ, 4, 3);
        });
        this.add(BlockRegistry.WRAPPIST_CLUSTER.value(), (Block block) -> {
            return this.createClusterDrops(block, ItemRegistry.WRAPPIST_SHARD.value(), 2, 1);
        });
        this.add(BlockRegistry.GLOWSTONE_CRYSTAL.value(), (Block block) -> {
            return this.createClusterDrops(block, Items.GLOWSTONE_DUST, 3, 2);
        });
        this.add(BlockRegistry.LAPIS_LAZULI_CRYSTAL.value(), (Block block) -> {
            return this.createClusterDrops(block, Items.LAPIS_LAZULI, 3, 1);
        });
        this.add(BlockRegistry.REDSTONE_CRYSTAL.value(), (Block block) -> {
            return this.createClusterDrops(block, Items.REDSTONE, 6, 3);
        });
        this.add(BlockRegistry.EMERALD_CRYSTAL.value(), (Block block) -> {
            return this.createClusterDrops(block, Items.EMERALD, 1, 1);
        });
        this.add(BlockRegistry.DIAMOND_CRYSTAL.value(), (Block block) -> {
            return this.createClusterDrops(block, Items.DIAMOND, 2, 1);
        });
        this.add(BlockRegistry.ANCIENT_DEBRIS_CRYSTAL.value(), (Block block) -> {
            return this.createClusterDrops(block, Items.NETHERITE_SCRAP, 2, 1);
        });
        this.add(BlockRegistry.PRISMARINE_CRYSTAL.value(), (Block block) -> {
            return this.createClusterDrops(block, Items.PRISMARINE_SHARD, 4, 1);
        });
        this.add(BlockRegistry.CELESTITE_CLUSTER.value(), (Block block) -> {
            return this.createClusterDrops(block, ItemRegistry.CELESTITE_SHARD.value(), 4, 2);
        });
        this.add(BlockRegistry.PINK_TOPAZ_CLUSTER.value(), (Block block) -> {
            return this.createClusterDrops(block, ItemRegistry.PINK_TOPAZ_SHARD.value(), 4, 2);
        });

        this.dropWhenSilkTouch(BlockRegistry.LARGE_NETHER_QUARTZ_BUD.value());
        this.dropWhenSilkTouch(BlockRegistry.LARGE_ECHO_BUD.value());
        this.dropWhenSilkTouch(BlockRegistry.LARGE_GLOWSTONE_BUD.value());
        this.dropWhenSilkTouch(BlockRegistry.LARGE_WRAPPIST_BUD.value());
        this.dropWhenSilkTouch(BlockRegistry.LARGE_NETHER_GOLD_BUD.value());
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
        this.dropWhenSilkTouch(BlockRegistry.MEDIUM_NETHER_GOLD_BUD.value());
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
        this.dropWhenSilkTouch(BlockRegistry.SMALL_NETHER_GOLD_BUD.value());
        this.dropWhenSilkTouch(BlockRegistry.SMALL_LAPIS_LAZULI_BUD.value());
        this.dropWhenSilkTouch(BlockRegistry.SMALL_REDSTONE_BUD.value());
        this.dropWhenSilkTouch(BlockRegistry.SMALL_EMERALD_BUD.value());
        this.dropWhenSilkTouch(BlockRegistry.SMALL_DIAMOND_BUD.value());
        this.dropWhenSilkTouch(BlockRegistry.SMALL_ANCIENT_DEBRIS_BUD.value());
        this.dropWhenSilkTouch(BlockRegistry.SMALL_PRISMARINE_BUD.value());
        this.dropWhenSilkTouch(BlockRegistry.SMALL_CELESTITE_BUD.value());
        this.dropWhenSilkTouch(BlockRegistry.SMALL_PINK_TOPAZ_BUD.value());

        this.addBuddingBlocks(this::dropNothing);
    }

    public void addBuddingBlocks(Consumer<Block> dropBlock) {
        dropBlock.accept(BlockRegistry.BUDDING_BASALT_NETHER_QUARTZ.value());
        dropBlock.accept(BlockRegistry.BUDDING_BLACKSTONE_NETHER_QUARTZ.value());
        dropBlock.accept(BlockRegistry.BUDDING_BLACKSTONE_GLOWSTONE.value());
        dropBlock.accept(BlockRegistry.BUDDING_ECHO.value());
        dropBlock.accept(BlockRegistry.BUDDING_BASALT_GLOWSTONE.value());
        dropBlock.accept(BlockRegistry.BUDDING_GLOWSTONE.value());
        dropBlock.accept(BlockRegistry.BUDDING_NETHER_QUARTZ.value());
        dropBlock.accept(BlockRegistry.BUDDING_WRAPPIST.value());
        dropBlock.accept(BlockRegistry.BUDDING_NETHER_GOLD.value());
        dropBlock.accept(BlockRegistry.BUDDING_BASALT_NETHER_GOLD.value());
        dropBlock.accept(BlockRegistry.BUDDING_BLACKSTONE_NETHER_GOLD.value());
        dropBlock.accept(BlockRegistry.BUDDING_LAPIS_LAZULI.value());
        dropBlock.accept(BlockRegistry.BUDDING_REDSTONE.value());
        dropBlock.accept(BlockRegistry.BUDDING_EMERALD.value());
        dropBlock.accept(BlockRegistry.BUDDING_DIAMOND.value());
        dropBlock.accept(BlockRegistry.BUDDING_DEEPSLATE_LAPIS_LAZULI.value());
        dropBlock.accept(BlockRegistry.BUDDING_DEEPSLATE_REDSTONE.value());
        dropBlock.accept(BlockRegistry.BUDDING_DEEPSLATE_EMERALD.value());
        dropBlock.accept(BlockRegistry.BUDDING_DEEPSLATE_DIAMOND.value());
        dropBlock.accept(BlockRegistry.BUDDING_SCULK_LAPIS_LAZULI.value());
        dropBlock.accept(BlockRegistry.BUDDING_SCULK_REDSTONE.value());
        dropBlock.accept(BlockRegistry.BUDDING_SCULK_EMERALD.value());
        dropBlock.accept(BlockRegistry.BUDDING_SCULK_DIAMOND.value());
        dropBlock.accept(BlockRegistry.BUDDING_ANCIENT_DEBRIS.value());
        dropBlock.accept(BlockRegistry.BUDDING_BASALT_ANCIENT_DEBRIS.value());
        dropBlock.accept(BlockRegistry.BUDDING_BLACKSTONE_ANCIENT_DEBRIS.value());
        dropBlock.accept(BlockRegistry.BUDDING_PRISMARINE.value());
        dropBlock.accept(BlockRegistry.BUDDING_CELESTITE.value());
        dropBlock.accept(BlockRegistry.BUDDING_PINK_TOPAZ.value());
    }

    public final LootTable.Builder createClusterDrops(Block block, ItemLike droppedItem, int dropCountWithPickaxe, int dropCountWithoutPickaxe) {
        return this.createSilkTouchDispatchTable(block,
                LootItem.lootTableItem(droppedItem)
                        .apply(SetItemCountFunction.setCount(ContextIntProviders.exactly(dropCountWithPickaxe)))
                        .apply(ApplyBonusCount.addOreBonusCount(this.output.lookup(Registries.ENCHANTMENT)
                                .getOrThrow(Enchantments.FORTUNE)))
                        .when(MatchTool.toolMatches(ItemPredicate.Builder.item()
                                .of(this.output.lookup(Registries.ITEM), ItemTags.CLUSTER_MAX_HARVESTABLES)))
                        .otherwise(this.applyExplosionDecay(block,
                                LootItem.lootTableItem(droppedItem)
                                        .apply(SetItemCountFunction.setCount(ContextIntProviders.exactly(
                                                dropCountWithoutPickaxe))))));
    }

    public static class SilkTouchBuddingBlocks extends ModBlockLootProvider {

        public SilkTouchBuddingBlocks(LootTableSubProvider.Context context) {
            super(context);
        }

        @Override
        public void generate() {
            super.generate();
            this.addBuddingBlocks(this::dropWhenSilkTouch);
        }

        @Override
        public void addBuddingBlocks(Consumer<Block> dropBlock) {
            dropBlock.accept(Blocks.BUDDING_AMETHYST);
            super.addBuddingBlocks(dropBlock);
        }
    }
}
