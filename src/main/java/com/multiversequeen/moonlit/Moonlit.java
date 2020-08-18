package com.multiversequeen.moonlit;

import com.multiversequeen.moonlit.blocks.CustomBlocks;
import com.multiversequeen.moonlit.fluids.CustomFluids;
import com.multiversequeen.moonlit.items.CustomItems;
import com.multiversequeen.moonlit.particles.CustomParticleTypes;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("moonlit")
public class Moonlit {
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "moonlit";
    public static final Item.Properties BASIC_PROPERTIES = new Item.Properties().group(Moonlit.TAB);

    public Moonlit() {
        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(this::setup);
        modEventBus.addListener(this::doClientStuff);

        CustomItems.ITEMS.register(modEventBus);
        CustomBlocks.BLOCKS.register(modEventBus);
        CustomFluids.FLUIDS.register(modEventBus);
        CustomParticleTypes.PARTICLE_TYPES.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
    }

    private void doClientStuff(final FMLClientSetupEvent event) {
    }
    
    public static final ItemGroup TAB = new ItemGroup("moonlitTab") {
    	@Override
    	public ItemStack createIcon() {
    	    // you'll have to uncomment this line and replacing {item} with whatever items fits more for the mod
            // and then remove the other line
    		//return new ItemStack(RegistryHandler.{item].get());
            return new ItemStack(CustomItems.MOONLIT_SCALE_0.get());
    	}
    }; 
}
