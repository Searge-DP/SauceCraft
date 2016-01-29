package com.snowpaw.saucecraft.handler;

import com.snowpaw.saucecraft.common.SauceBlocks;
import com.snowpaw.saucecraft.common.SauceItems;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class SauceCrafting {
	
	public static void init(){
		GameRegistry reg = null;
		reg.addShapelessRecipe(new ItemStack(SauceItems.saucePork, 1, 0), new Object[]{Items.porkchop, new ItemStack(SauceItems.sauceBottle, 1, 0)});
		reg.addShapelessRecipe(new ItemStack(SauceItems.saucePork, 1, 1), new Object[]{Items.porkchop, new ItemStack(SauceItems.sauceBottle, 1, 1)});
		reg.addShapelessRecipe(new ItemStack(SauceItems.saucePork, 1, 2), new Object[]{Items.porkchop, new ItemStack(SauceItems.sauceBottle, 1, 2)});
		reg.addShapelessRecipe(new ItemStack(SauceItems.sauceBeef, 1, 0), new Object[]{Items.cooked_beef, new ItemStack(SauceItems.sauceBottle, 1, 0)});
		reg.addShapelessRecipe(new ItemStack(SauceItems.sauceBeef, 1, 1), new Object[]{Items.cooked_beef, new ItemStack(SauceItems.sauceBottle, 1, 1)});
		reg.addShapelessRecipe(new ItemStack(SauceItems.sauceBeef, 1, 2), new Object[]{Items.cooked_beef, new ItemStack(SauceItems.sauceBottle, 1, 2)});
		reg.addShapelessRecipe(new ItemStack(SauceItems.sauceBottle, 1, 0), new Object[]{Items.glass_bottle, Items.apple, Items.sugar});
		reg.addShapelessRecipe(new ItemStack(SauceItems.sauceBottle, 1, 1), new Object[]{Items.glass_bottle, Items.apple, Items.carrot, Items.milk_bucket});
		reg.addShapelessRecipe(new ItemStack(SauceItems.sauceBottle, 1, 2), new Object[]{Items.glass_bottle, new ItemStack(SauceItems.sauceBottle, 1, 1), Items.ghast_tear, Items.blaze_powder});
		reg.addRecipe(new ItemStack(SauceBlocks.sauceTrophy, 1), new Object[]{"XC", "VY", 'X', new ItemStack(SauceItems.sauceBottle, 1, 0), 'C', new ItemStack(SauceItems.sauceBottle, 1, 1), 'V', new ItemStack(SauceItems.sauceBottle, 1, 2), 'Y', Items.gold_ingot});
	}

}
