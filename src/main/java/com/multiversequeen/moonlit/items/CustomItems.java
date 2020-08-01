package com.multiversequeen.moonlit.items;

import com.multiversequeen.moonlit.Moonlit;
import com.multiversequeen.moonlit.fluids.CustomFluids;
import net.minecraft.item.BucketItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class CustomItems
{
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, Moonlit.MOD_ID);

    public static final RegistryObject<Item> REMEDIUM_LAVA_BUCKET = register("remedium_lava_bucket",
            new BucketItem(() -> CustomFluids.REMEDIUM_LAVA.get(), new Item.Properties().containerItem(Items.BUCKET).maxStackSize(1).group(Moonlit.TAB)));

    private static RegistryObject<Item> register(String key, Item item)
    {
        return ITEMS.register(key, () -> item);
    }
}
