package com.multiversequeen.moonlit.blocks;

import com.multiversequeen.moonlit.Moonlit;
import com.multiversequeen.moonlit.fluids.CustomFluids;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.FlowingFluidBlock;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class CustomBlocks extends Blocks
{
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, Moonlit.MOD_ID);

    public static final RegistryObject<Block> REMEDIUM_LAVA = register("remedium_lava", new FlowingFluidBlock(() -> CustomFluids.REMEDIUM_LAVA.get(),
            Block.Properties.create(Material.LAVA).doesNotBlockMovement().noDrops().lightValue(10).tickRandomly().hardnessAndResistance(100.0F)));


    private static RegistryObject<Block> register(String key, Block block)
    {
        return BLOCKS.register(key, () -> block);
    }
}
