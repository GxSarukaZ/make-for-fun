package net.anodizex.specialore.enchantment;

import net.anodizex.specialore.SpecialOreMod;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModEnchantments {

    public static Enchantment THUNDER_STRIKE = register("thunder_strike",
            new ThunderStrikeEnchantment(Enchantment.Rarity.VERY_RARE, EnchantmentTarget.WEAPON, EquipmentSlot.MAINHAND));

    public static Enchantment IMPLOSION = register("implosion",
            new ImplosionEnchantment(Enchantment.Rarity.VERY_RARE, EnchantmentTarget.WEAPON, EquipmentSlot.MAINHAND));

    public static Enchantment ZOMBIE_IMPACT = register("zombie_impact",
            new ZombieImpactEnchantment(Enchantment.Rarity.VERY_RARE, EnchantmentTarget.WEAPON, EquipmentSlot.MAINHAND));

    public static Enchantment WITHER_IMPACT = register("wither_impact",
            new WitherImpactEnchantment(Enchantment.Rarity.VERY_RARE, EnchantmentTarget.WEAPON, EquipmentSlot.MAINHAND));

    public static Enchantment WARDEN_IMPACT = register("warden_impact",
            new WardenImpactEnchantment(Enchantment.Rarity.VERY_RARE, EnchantmentTarget.WEAPON, EquipmentSlot.MAINHAND));

    public static Enchantment YOKAI_IMPACT = register("yokai_impact",
            new YokaiImpactEnchantment(Enchantment.Rarity.VERY_RARE, EnchantmentTarget.WEAPON, EquipmentSlot.MAINHAND));


    private static Enchantment register(String name, Enchantment enchantment) {
        return Registry.register(Registry.ENCHANTMENT, new Identifier(SpecialOreMod.MOD_ID,name), enchantment);
    }

    public static void registerModEnchantments() {
        System.out.println("Registering Enchantments for " + SpecialOreMod.MOD_ID);
    }
}
