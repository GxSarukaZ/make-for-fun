package net.anodizex.specialore.entity.entities.client.miko;

import net.anodizex.specialore.entity.entities.KisaneMikoEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.ZombieBaseEntityRenderer;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.client.render.entity.model.EntityModelLayers;
import net.minecraft.client.render.entity.model.ZombieEntityModel;
import net.minecraft.entity.mob.ZombieEntity;

public class KisaneMikoRenderer extends KisaneMikoBaseEntityRenderer<KisaneMikoEntity, KisaneMikoModel<KisaneMikoEntity>> {
    public KisaneMikoRenderer(EntityRendererFactory.Context context) {
        this(context, EntityModelLayers.ZOMBIE, EntityModelLayers.ZOMBIE_INNER_ARMOR, EntityModelLayers.ZOMBIE_OUTER_ARMOR);
    }

    public KisaneMikoRenderer(EntityRendererFactory.Context ctx, EntityModelLayer layer, EntityModelLayer legsArmorLayer, EntityModelLayer bodyArmorLayer) {
        super(ctx, new KisaneMikoModel<>(ctx.getPart(layer)), new KisaneMikoModel<>(ctx.getPart(legsArmorLayer)), new KisaneMikoModel<>(ctx.getPart(bodyArmorLayer)));
    }
}
