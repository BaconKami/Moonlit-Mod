package com.multiversequeen.moonlit.items;

import com.multiversequeen.moonlit.Moonlit;
import net.minecraft.item.*;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;

import java.util.function.Supplier;

public class MoonlitScaleSwordItem extends SwordItem {
    public MoonlitScaleSwordItem(IItemTier variant) {
        super(variant, 3, -2.4F, Moonlit.BASIC_PROPERTIES);
    }
}
