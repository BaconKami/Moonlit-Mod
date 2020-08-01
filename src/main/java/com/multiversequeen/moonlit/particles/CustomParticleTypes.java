package com.multiversequeen.moonlit.particles;

import com.multiversequeen.moonlit.Moonlit;
import net.minecraft.particles.BasicParticleType;
import net.minecraft.particles.ParticleType;
import net.minecraft.particles.ParticleTypes;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

//@net.minecraftforge.registries.ObjectHolder("moonlit")
public class CustomParticleTypes extends ParticleTypes
{
    public static final DeferredRegister<ParticleType<?>> PARTICLE_TYPES = new DeferredRegister<>(ForgeRegistries.PARTICLE_TYPES, Moonlit.MOD_ID);

    public static RegistryObject<BasicParticleType> REMEDIUM_LAVA_SMOKE = register("remedium_lava_smoke", false);

    private static RegistryObject<BasicParticleType> register(String key, boolean alwaysShow)
    {
        return PARTICLE_TYPES.register(key, () -> new BasicParticleType(false));
    }
}
