package net.anodizex.specialore.entity.entities.client.miko;

import net.anodizex.specialore.entity.entities.KisaneMikoEntity;
import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.entity.model.AbstractZombieModel;
import net.minecraft.entity.mob.ZombieEntity;

public class KisaneMikoModel <T extends KisaneMikoEntity> extends AbstractZombieModel<T> {
    public KisaneMikoModel(ModelPart modelPart) {
        super(modelPart);
    }

    public boolean isAttacking(T kisanemikoEntity) {
        return kisanemikoEntity.isAttacking();
    }
}
