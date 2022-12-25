package net.anodizex.specialore.entity.entities.client.miko;

import net.anodizex.specialore.entity.entities.KisaneMikoEntity;
import net.minecraft.client.render.entity.BipedEntityRenderer;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.feature.ArmorFeatureRenderer;
import net.minecraft.client.render.entity.model.ZombieEntityModel;
import net.minecraft.entity.mob.ZombieEntity;
import net.minecraft.util.Identifier;

public class KisaneMikoBaseEntityRenderer <T extends KisaneMikoEntity, M extends KisaneMikoModel<T>> extends BipedEntityRenderer<T, M> {
    private static final Identifier TEXTURE = new Identifier("specialore","textures/entity/kisane_miko.png");

    protected KisaneMikoBaseEntityRenderer(EntityRendererFactory.Context ctx, M bodyModel, M legsArmorModel, M bodyArmorModel) {
        super(ctx, bodyModel, 0.5F);
        this.addFeature(new ArmorFeatureRenderer(this, legsArmorModel, bodyArmorModel));
    }

    public Identifier getTexture(KisaneMikoEntity kisaneMikoEntity) {
        return TEXTURE;
    }
}
