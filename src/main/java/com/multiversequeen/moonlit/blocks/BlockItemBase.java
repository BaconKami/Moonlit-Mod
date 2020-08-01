package com.multiversequeen.moonlit.blocks;

import com.multiversequeen.moonlit.Moonlit;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;

public class BlockItemBase extends BlockItem
{

	public BlockItemBase(Block block) {
		super(block, Moonlit.BASIC_PROPERTIES);
	}

}
