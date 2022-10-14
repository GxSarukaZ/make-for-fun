package net.anodizex.specialore.effect;

import net.anodizex.specialore.SpecialOreMod;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModEffects {
    public static StatusEffect FROSTBITE;

    public static StatusEffect registerStatusEffect(String name) {
        return Registry.register(Registry.STATUS_EFFECT, new Identifier(SpecialOreMod.MOD_ID, name),
                new FrostbiteEffect(StatusEffectCategory.HARMFUL, 3124687));
    }

    public static void registerEffects() {
        FROSTBITE = registerStatusEffect("frostbite");
    }
}
