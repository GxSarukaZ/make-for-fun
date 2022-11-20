package net.anodizex.specialore.enchantment;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.damage.DamageSource;

public class WitheritedEnchantment extends Enchantment {

    public WitheritedEnchantment(Rarity weight, EnchantmentTarget type, EquipmentSlot... slotTypes) {
        super(weight, type, slotTypes);
    }

    @Override
    public int getMinPower(int level) {return super.getMinPower(level);}


    @Override
    public int getMaxPower(int level) {return super.getMaxPower(level);}

    @Override
    public int getMaxLevel() {return 1;}

    @Override
    public int getProtectionAmount(int level, DamageSource source) {return level;}
}
