package fuzs.geodecraft.common.data.client;

import fuzs.geodecraft.common.Geodecraft;
import fuzs.geodecraft.common.client.renderer.blockentity.PedestalRenderer;
import fuzs.geodecraft.common.init.TrimPatternRegistry;
import fuzs.puzzleslib.api.data.v2.core.DataProviderContext;
import net.minecraft.client.renderer.Sheets;
import net.minecraft.client.resources.model.ModelManager;

public class ModAtlasProvider extends AbstractAtlasProvider {

    public ModAtlasProvider(DataProviderContext context) {
        super(context);
    }

    @Override
    public void addAtlases() {
        this.addMaterial(PedestalRenderer.MATERIAL);
        this.add(ModelManager.VANILLA_ATLASES.get(Sheets.ARMOR_TRIMS_SHEET),
                armorTrimPermutations().addPattern(TrimPatternRegistry.CELESTE)
                        .addPattern(TrimPatternRegistry.HEART)
                        .addPattern(TrimPatternRegistry.WRAP)
                        .addPermutation(Geodecraft.id("celestite"))
                        .addPermutation(Geodecraft.id("pink_topaz"))
                        .addPermutation(Geodecraft.id("wrappist"))
                        .build());
        this.add(ModelManager.VANILLA_ATLASES.get(Sheets.ARMOR_TRIMS_SHEET),
                armorTrimPatterns().addPattern(TrimPatternRegistry.CELESTE)
                        .addPattern(TrimPatternRegistry.HEART)
                        .addPattern(TrimPatternRegistry.WRAP)
                        .build());
    }
}
