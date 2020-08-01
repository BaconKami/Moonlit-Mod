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
public class CustomParticleTypes
{
    public static final DeferredRegister<ParticleType<?>> PARTICLE_TYPES = new DeferredRegister<>(ForgeRegistries.PARTICLE_TYPES, Moonlit.MOD_ID);

    public static final RegistryObject<BasicParticleType> REMEDIUM_LAVA_SMOKE = register("remedium_lava_smoke", false);
    public static final RegistryObject<BasicParticleType> DRIPPING_REMEDIUM_LAVA = register("dripping_remedium_lava", false);
    public static final RegistryObject<BasicParticleType> FALLING_REMEDIUM_LAVA = register("falling_remedium_lava", false);
    public static final RegistryObject<BasicParticleType> LANDING_REMEDIUM_LAVA = register("landing_remedium_lava", false);

    private static RegistryObject<BasicParticleType> register(String key, boolean alwaysShow)
    {
        return PARTICLE_TYPES.register(key, () -> new BasicParticleType(false));
    }
}
