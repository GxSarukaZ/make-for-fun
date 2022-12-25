package net.anodizex.specialore;

import net.anodizex.specialore.block.ModBlocks;
import net.anodizex.specialore.entity.ModEntities;
import net.anodizex.specialore.entity.entities.KisaneMikoEntity;
import net.anodizex.specialore.entity.entities.client.TarantulaElectricBlueRenderer;
import net.anodizex.specialore.entity.entities.client.miko.KisaneMikoRenderer;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;

public class SpecialOreClientMod implements ClientModInitializer {
    public static final EntityModelLayer MODEL_TARANTULA_LAYER = new EntityModelLayer(new Identifier("specialore", "tarantula_electric_blue"), "main");
    public static final EntityModelLayer MODEL_MIKO_LAYER = new EntityModelLayer(new Identifier("specialore","kisane_miko"), "main");

    @Override
    public void onInitializeClient() {

        EntityRendererRegistry.register(ModEntities.TARANTULA_ELECTRIC_BLUE, TarantulaElectricBlueRenderer::new);
        EntityRendererRegistry.register(ModEntities.KISANE_MIKO, KisaneMikoRenderer::new);
    }
}
