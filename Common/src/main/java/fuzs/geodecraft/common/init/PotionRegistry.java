package fuzs.geodecraft.common.init;

import net.minecraft.core.Holder;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.alchemy.Potion;

public class PotionRegistry {
    public static final Holder.Reference<Potion> HASTE = ModRegistry.REGISTRY.registerPotion("haste",
            (String name) -> new Potion(name, new MobEffectInstance(MobEffects.DIG_SPEED, 3600)));
    public static final Holder.Reference<Potion> LONG_HASTE = ModRegistry.REGISTRY.registerPotion("long_haste",
            () -> new Potion("haste", new MobEffectInstance(MobEffects.DIG_SPEED, 9600)));
    public static final Holder.Reference<Potion> STRONG_HASTE = ModRegistry.REGISTRY.registerPotion("strong_haste",
            () -> new Potion("haste", new MobEffectInstance(MobEffects.DIG_SPEED, 1800, 1)));

    public static void bootstrap() {
        // NO-OP
    }
}
