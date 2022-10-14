package net.anodizex.specialore.item.custom;

import net.anodizex.specialore.particle.ModParticles;
import net.minecraft.item.HoeItem;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.item.ToolMaterial;
import net.minecraft.util.math.BlockPos;

public class ModHoeItem extends HoeItem {
    public ModHoeItem(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }
}
