package fuzs.geodecraft.common.data.client;

import fuzs.geodecraft.common.Geodecraft;
import fuzs.puzzleslib.api.client.data.v2.AbstractLanguageProvider;
import fuzs.puzzleslib.api.data.v2.core.DataProviderContext;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.yeoxuhang.geode_plus.server.registry.ModRegistry;

public class GeodePlusLangProvider extends AbstractLanguageProvider {

    public GeodePlusLangProvider(DataProviderContext context) {
        super(context);
    }

    @Override
    public void addTranslations(TranslationBuilder builder) {
        builder.addCreativeModeTab(ModRegistry.CREATIVE_MODE_TAB, Geodecraft.MOD_NAME);
        builder.add("trim_pattern.geode_plus.wrap", "Wrap Armor Trim");
        builder.add("trim_pattern.geode_plus.celeste", "Celeste Armor Trim");
        builder.add("trim_pattern.geode_plus.heart", "Heart Armor Trim");
        builder.add("trim_material.geode_plus.wrappist", "Wrappist Material");
        builder.add("trim_material.geode_plus.celestite", "Celestite Material");
        builder.add("trim_material.geode_plus.pink_topaz", "Pink Topaz Material");
        builder.add("wrappist_pedestal.geode_plus.not_enought_xp", "§l§cRequired 30 Levels");
    }

    @Override
    protected boolean mustHaveTranslationKey(Holder.Reference<?> holder, String translationKey) {
        return !holder.key().isFor(Registries.BLOCK) && !holder.key().isFor(Registries.ITEM);
    }
}
