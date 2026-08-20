package fuzs.geodecraft.common.data.tags;

import fuzs.puzzleslib.api.data.v2.core.DataProviderContext;
import fuzs.puzzleslib.api.data.v2.tags.AbstractTagProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Item;
import net.yeoxuhang.geode_plus.server.registry.ItemRegistry;

public class GeodePlusItemTagProvider extends AbstractTagProvider<Item> {

    public GeodePlusItemTagProvider(DataProviderContext context) {
        super(Registries.ITEM, context);
    }

    @Override
    public void addTags(HolderLookup.Provider context) {
        this.tag("c:glass_blocks/colorless")
                .add(ItemRegistry.WRAPPIST_GLASS, ItemRegistry.CELESTITE_GLASS, ItemRegistry.PINK_TOPAZ_GLASS);
        this.tag(ItemTags.TRIM_MATERIALS)
                .add(ItemRegistry.WRAPPIST_SHARD, ItemRegistry.CELESTITE_SHARD, ItemRegistry.PINK_TOPAZ);
        this.tag(ItemTags.TRIM_TEMPLATES)
                .add(ItemRegistry.WRAP_ARMOR_TRIM_SMITHING_TEMPLATE,
                        ItemRegistry.CELESTE_ARMOR_TRIM_SMITHING_TEMPLATE,
                        ItemRegistry.HEART_ARMOR_TRIM_SMITHING_TEMPLATE);
    }
}
