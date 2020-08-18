package com.multiversequeen.moonlit.fluids;

import com.multiversequeen.moonlit.Moonlit;
import net.minecraft.fluid.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class CustomFluids {
    public static final DeferredRegister<Fluid> FLUIDS = new DeferredRegister<>(ForgeRegistries.FLUIDS, Moonlit.MOD_ID);

    public static RegistryObject<FlowingFluid> FLOWING_REMEDIUM_LAVA = register("flowing_remedium_lava", new RemediumLavaFluid.Flowing());
    public static RegistryObject<FlowingFluid> REMEDIUM_LAVA = register("remedium_lava", new RemediumLavaFluid.Source());

    private static RegistryObject<FlowingFluid> register(String key, FlowingFluid flowingFluid) {
        return FLUIDS.register(key, () -> flowingFluid);
    }
}
