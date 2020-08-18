package com.multiversequeen.moonlit.items;

import com.multiversequeen.moonlit.CustomTiers;
import com.multiversequeen.moonlit.Moonlit;
import com.multiversequeen.moonlit.fluids.CustomFluids;
import net.minecraft.item.BucketItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.item.SwordItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.rmi.registry.Registry;

public class CustomItems {
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, Moonlit.MOD_ID);

    public static final RegistryObject<Item> REMEDIUM_LAVA_BUCKET = register("remedium_lava_bucket", new BucketItem(() -> CustomFluids.REMEDIUM_LAVA.get(), new Item.Properties().containerItem(Items.BUCKET).maxStackSize(1).group(Moonlit.TAB)));

    public static final RegistryObject<Item> MOONLIT_SCALE_0 = register("scale_0", new ItemBase());
    public static final RegistryObject<Item> MOONLIT_SCALE_1 = register("scale_1", new ItemBase());
    public static final RegistryObject<Item> MOONLIT_SCALE_2 = register("scale_2", new ItemBase());
    public static final RegistryObject<Item> MOONLIT_SCALE_3 = register("scale_3", new ItemBase());
    public static final RegistryObject<Item> MOONLIT_SCALE_4 = register("scale_4", new ItemBase());
    public static final RegistryObject<Item> MOONLIT_SCALE_5 = register("scale_5", new ItemBase());

    public static final RegistryObject<Item> MOONLIT_SCALE_SWORD_0 = register("scale_sword_0", new MoonlitScaleSwordItem(CustomTiers.SCALE_TOOL_0));
    public static final RegistryObject<Item> MOONLIT_SCALE_SWORD_1 = register("scale_sword_1", new MoonlitScaleSwordItem(CustomTiers.SCALE_TOOL_1));
    public static final RegistryObject<Item> MOONLIT_SCALE_SWORD_2 = register("scale_sword_2", new MoonlitScaleSwordItem(CustomTiers.SCALE_TOOL_2));
    public static final RegistryObject<Item> MOONLIT_SCALE_SWORD_3 = register("scale_sword_3", new MoonlitScaleSwordItem(CustomTiers.SCALE_TOOL_3));
    public static final RegistryObject<Item> MOONLIT_SCALE_SWORD_4 = register("scale_sword_4", new MoonlitScaleSwordItem(CustomTiers.SCALE_TOOL_4));
    public static final RegistryObject<Item> MOONLIT_SCALE_SWORD_5 = register("scale_sword_5", new MoonlitScaleSwordItem(CustomTiers.SCALE_TOOL_5));

    private static RegistryObject<Item> register(String key, Item item)
    {
        return ITEMS.register(key, () -> item);
    }
}
