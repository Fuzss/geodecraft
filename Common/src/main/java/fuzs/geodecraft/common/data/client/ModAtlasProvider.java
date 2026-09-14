package fuzs.geodecraft.common.data.client;

import fuzs.geodecraft.common.Geodecraft;
import fuzs.geodecraft.common.client.renderer.blockentity.PedestalRenderer;
import fuzs.geodecraft.common.init.TrimPatternRegistry;
import fuzs.puzzleslib.common.api.client.data.v2.AbstractAtlasProvider;
import fuzs.puzzleslib.common.api.data.v2.core.DataProviderContext;
import net.minecraft.data.AtlasIds;

public class ModAtlasProvider extends AbstractAtlasProvider {

    public ModAtlasProvider(DataProviderContext context) {
        super(context);
    }

    @Override
    public void addAtlases() {
        this.addMaterial(PedestalRenderer.MATERIAL);
        this.add(AtlasIds.ARMOR_TRIMS,
                armorTrimPermutations().addPattern(TrimPatternRegistry.CELESTE)
                        .addPattern(TrimPatternRegistry.HEART)
                        .addPattern(TrimPatternRegistry.WRAP)
                        .addPermutation(Geodecraft.id("celestite"))
                        .addPermutation(Geodecraft.id("pink_topaz"))
                        .addPermutation(Geodecraft.id("wrappist"))
                        .build());
        this.add(AtlasIds.ARMOR_TRIMS,
                armorTrimPatterns().addPattern(TrimPatternRegistry.CELESTE)
                        .addPattern(TrimPatternRegistry.HEART)
                        .addPattern(TrimPatternRegistry.WRAP)
                        .build());
    }
}
