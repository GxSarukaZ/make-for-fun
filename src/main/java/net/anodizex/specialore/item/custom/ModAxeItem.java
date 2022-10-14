package net.anodizex.specialore.item.custom;

import net.anodizex.specialore.particle.ModParticles;
import net.minecraft.item.AxeItem;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.item.ToolMaterial;
import net.minecraft.util.math.BlockPos;

public class ModAxeItem extends AxeItem {
    public ModAxeItem(ToolMaterial material, float attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }
}
