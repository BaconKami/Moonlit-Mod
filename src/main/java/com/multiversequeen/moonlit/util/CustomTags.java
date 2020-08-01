package com.multiversequeen.moonlit.util;

import com.multiversequeen.moonlit.Moonlit;
import net.minecraft.fluid.Fluid;
import net.minecraft.tags.FluidTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.Tag;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.Tags;

import javax.annotation.Resource;

public class CustomTags
{
    public static class Fluids
    {
        public static final Tag<Fluid> REMEDIUM_LAVA = tag("remedium_lava");

        public static Tag<Fluid> tag(String name)
        {
            return new FluidTags.Wrapper(new ResourceLocation(Moonlit.MOD_ID, name));
        }
    }
}
