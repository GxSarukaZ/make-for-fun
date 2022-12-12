package net.anodizex.specialore.entity.entities.client;

import net.anodizex.specialore.SpecialOreMod;
import net.anodizex.specialore.entity.entities.TarantulaElectricBlueEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class TarantulaElectricBlueModel extends AnimatedGeoModel<TarantulaElectricBlueEntity> {
    @Override
    public Identifier getModelResource(TarantulaElectricBlueEntity object) {
        return new Identifier(SpecialOreMod.MOD_ID, "geo/tarantula_electric_blue.geo.json");
    }

    @Override
    public Identifier getTextureResource(TarantulaElectricBlueEntity object) {
        return new Identifier(SpecialOreMod.MOD_ID, "textures/entity/electric_blue.png");
    }

    @Override
    public Identifier getAnimationResource(TarantulaElectricBlueEntity animatable) {
        return new Identifier(SpecialOreMod.MOD_ID, "animations/tarantula_electric_blue.animation.json");
    }
}
