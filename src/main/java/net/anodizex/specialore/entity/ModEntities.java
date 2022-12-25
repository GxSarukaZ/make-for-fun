package net.anodizex.specialore.entity;

import net.anodizex.specialore.SpecialOreMod;
import net.anodizex.specialore.entity.entities.KisaneMikoEntity;
import net.anodizex.specialore.entity.entities.TarantulaElectricBlueEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModEntities {
    public static final EntityType<TarantulaElectricBlueEntity> TARANTULA_ELECTRIC_BLUE = Registry.register(
            Registry.ENTITY_TYPE, new Identifier(SpecialOreMod.MOD_ID, "tarantula_electric_blue"),
            FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, TarantulaElectricBlueEntity::new)
                    .dimensions(EntityDimensions.fixed(0.4f, 1.5f)).build());

    public static final EntityType<KisaneMikoEntity> KISANE_MIKO = Registry.register(
            Registry.ENTITY_TYPE, new Identifier(SpecialOreMod.MOD_ID, "kisane_miko"),
            FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, KisaneMikoEntity::new)
                    .dimensions(EntityDimensions.fixed(0.4f,1.5f)).build());

}
