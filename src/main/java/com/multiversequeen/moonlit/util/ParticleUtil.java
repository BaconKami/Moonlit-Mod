package com.multiversequeen.moonlit.util;

import com.multiversequeen.moonlit.Moonlit;
import com.multiversequeen.moonlit.particles.CustomParticleTypes;
import com.multiversequeen.moonlit.particles.RemediumLavaSmoke;
import net.minecraft.client.Minecraft;
import net.minecraftforge.client.event.ParticleFactoryRegisterEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Moonlit.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ParticleUtil
{
    @SubscribeEvent(priority = EventPriority.LOWEST)
    public static void registerParticles(ParticleFactoryRegisterEvent event)
    {
        Minecraft.getInstance().particles.registerFactory(CustomParticleTypes.REMEDIUM_LAVA_SMOKE.get(), RemediumLavaSmoke.Factory::new);
    }
}
