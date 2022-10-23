package net.anodizex.specialore;

import net.anodizex.specialore.block.ModBlocks;
import net.anodizex.specialore.particle.ModParticles;
import net.anodizex.specialore.particle.custom.SculkShurikenParticle;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.minecraft.client.render.RenderLayer;

public class SpecialOreClientMod implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), ModBlocks.ZELIUS_EGG);
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), ModBlocks.SCULK_COMPACT_EYE);

        ParticleFactoryRegistry.getInstance().register(ModParticles.SCULK_SHURIKEN_PARTICLE, SculkShurikenParticle.Factory::new);
    }
}
