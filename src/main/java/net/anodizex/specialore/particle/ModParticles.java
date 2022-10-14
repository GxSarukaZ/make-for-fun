package net.anodizex.specialore.particle;

import net.anodizex.specialore.SpecialOreMod;
import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.minecraft.particle.DefaultParticleType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModParticles {
    public static final DefaultParticleType SCULK_SHURIKEN_PARTICLE = FabricParticleTypes.simple();

    public static void registerParticles() {
        Registry.register(Registry.PARTICLE_TYPE,new Identifier(SpecialOreMod.MOD_ID, "sculk_shuriken_particle"),
                SCULK_SHURIKEN_PARTICLE);
    }
}
