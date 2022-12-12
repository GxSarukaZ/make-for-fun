package net.anodizex.specialore.entity.entities.client;

import net.anodizex.specialore.SpecialOreMod;
import net.anodizex.specialore.entity.entities.TarantulaElectricBlueEntity;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class TarantulaElectricBlueRenderer extends GeoEntityRenderer<TarantulaElectricBlueEntity> {
    public TarantulaElectricBlueRenderer(EntityRendererFactory.Context renderManager) {
        super(renderManager, new TarantulaElectricBlueModel());
        this.shadowRadius = 0.5F;
    }

    @Override
    public Identifier getTextureResource(TarantulaElectricBlueEntity animatable) {
        return new Identifier(SpecialOreMod.MOD_ID, "textures/entity/electric_blue.png");
    }

    @Override
    public RenderLayer getRenderType(TarantulaElectricBlueEntity animatable, float partialTick, MatrixStack poseStack, @Nullable VertexConsumerProvider bufferSource, @Nullable VertexConsumer buffer, int packedLight, Identifier texture) {

        poseStack.scale( 0.8f, 0.8f, 0.8f);

        return super.getRenderType(animatable, partialTick, poseStack, bufferSource, buffer, packedLight, texture);
    }
}
