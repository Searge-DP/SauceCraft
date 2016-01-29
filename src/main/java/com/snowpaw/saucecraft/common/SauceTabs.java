package com.snowpaw.saucecraft.common;

import com.snowpaw.saucecraft.item.SauceItem;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class SauceTabs {
	
	public static CreativeTabs tabSauceCraft = new CreativeTabs("tabSauceCraft"){
		@Override
		@SideOnly(Side.CLIENT)
		public Item getTabIconItem() {
			return SauceItems.sauceBottle;
		}
		
	};

}
