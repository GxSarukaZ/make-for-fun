package net.anodizex.specialore;

import net.anodizex.specialore.block.ModBlocks;
import net.anodizex.specialore.entity.ModEntities;
import net.anodizex.specialore.entity.entities.client.TarantulaElectricBlueRenderer;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.RenderLayer;

public class SpecialOreClientMod implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), ModBlocks.ICE_AMETHYST_CLUSTER);

        EntityRendererRegistry.register(ModEntities.TARANTULA_ELECTRIC_BLUE, TarantulaElectricBlueRenderer::new);
    }
}
