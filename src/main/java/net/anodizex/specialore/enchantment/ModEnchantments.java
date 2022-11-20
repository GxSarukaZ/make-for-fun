package net.anodizex.specialore.enchantment;

import net.anodizex.specialore.SpecialOreMod;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModEnchantments {

    public static Enchantment RENOWNED = register("renowned",
            new RenownedEnchantment(Enchantment.Rarity.VERY_RARE, EnchantmentTarget.ARMOR, EquipmentSlot.MAINHAND));

    public static Enchantment WITHERITED = register("witherited",
            new WitheritedEnchantment(Enchantment.Rarity.VERY_RARE, EnchantmentTarget.ARMOR, EquipmentSlot.MAINHAND));

    public static Enchantment WARESTER = register("warester",
            new WaresterEnchanment(Enchantment.Rarity.VERY_RARE, EnchantmentTarget.ARMOR, EquipmentSlot.MAINHAND));

    private static Enchantment register(String name, Enchantment enchantment) {
        return Registry.register(Registry.ENCHANTMENT, new Identifier(SpecialOreMod.MOD_ID,name), enchantment);
    }

    public static void registerModEnchantments() {
        System.out.println("Registering Enchantments for " + SpecialOreMod.MOD_ID);
    }
}
