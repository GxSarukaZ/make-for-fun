package net.anodizex.specialore.item;

import net.minecraft.item.ItemConvertible;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.util.Lazy;

import java.util.function.Supplier;

public enum ModToolMaterial implements ToolMaterial {
    TIMASCUS(2, 2031, 12.0F, 3.0F, 22, () -> {return Ingredient.ofItems(new ItemConvertible[]{ModItems.TIMASCUS_INGOT});}),

    DRAGON(2, 2031, 12.0F, 3.0F, 22, () -> {return Ingredient.ofItems(new ItemConvertible[]{ModItems.TIMASCUS_INGOT});}),

    BEATIT(2, 2031, 12.0F, 3.0F, 22, () -> {return Ingredient.ofItems(new ItemConvertible[]{ModItems.TIMASCUS_INGOT});}),

    SCULK(2, 2031, 12.0F, 3.0F, 22, () -> {return Ingredient.ofItems(new ItemConvertible[]{ModItems.TIMASCUS_INGOT});});


    private final int miningLevel;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Lazy<Ingredient> repairIngredient;

    ModToolMaterial(int miningLevel, int itemDurability, float miningSpeed, float attackDamage, int enchantability, Supplier repairIngredient) {
        this.miningLevel = miningLevel;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = new Lazy(repairIngredient);
    }

    public int getDurability() {
        return this.itemDurability;
    }

    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    public float getAttackDamage() {
        return this.attackDamage;
    }

    public int getMiningLevel() {
        return this.miningLevel;
    }

    public int getEnchantability() {
        return this.enchantability;
    }

    public Ingredient getRepairIngredient() {
        return (Ingredient)this.repairIngredient.get();
    }
}
