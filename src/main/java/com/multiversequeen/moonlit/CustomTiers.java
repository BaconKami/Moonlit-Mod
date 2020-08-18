package com.multiversequeen.moonlit;

import com.multiversequeen.moonlit.items.CustomItems;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.Ingredient;
import net.minecraftforge.fml.RegistryObject;

public class CustomTiers {
    static public IItemTier SCALE_TOOL_0 = createItemScaleItemTier(CustomItems.MOONLIT_SCALE_0);
    static public IItemTier SCALE_TOOL_1 = createItemScaleItemTier(CustomItems.MOONLIT_SCALE_1);
    static public IItemTier SCALE_TOOL_2 = createItemScaleItemTier(CustomItems.MOONLIT_SCALE_2);
    static public IItemTier SCALE_TOOL_3 = createItemScaleItemTier(CustomItems.MOONLIT_SCALE_3);
    static public IItemTier SCALE_TOOL_4 = createItemScaleItemTier(CustomItems.MOONLIT_SCALE_4);
    static public IItemTier SCALE_TOOL_5 = createItemScaleItemTier(CustomItems.MOONLIT_SCALE_5);

    private static IItemTier createItemScaleItemTier(RegistryObject<Item> item) {
        return new IItemTier() {
            @Override
            public int getMaxUses() {
                return 4035;
            }

            @Override
            public float getEfficiency() {
                return 10.0F;
            }

            @Override
            public float getAttackDamage() {
                return 6.0F;
            }

            @Override
            public int getHarvestLevel() {
                return 5;
            }

            @Override
            public int getEnchantability() {
                return 30;
            }

            @Override
            public Ingredient getRepairMaterial() {
                return Ingredient.fromItems(item.get());
            }
        };
    }
}
