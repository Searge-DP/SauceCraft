package com.snowpaw.saucecraft.common;

import com.snowpaw.saucecraft.item.SauceItem;
import com.snowpaw.saucecraft.item.SauceItemFood;

import net.minecraft.item.Item;

public class SauceItems {
	
	public static Item sauceBottle;
	public static Item saucePork;
	public static Item sauceBeef;
	
	public static void preInit(){
		sauceBottle = new SauceItem("sauceBottle", 16, "ketchup", "bbq", "special");
		saucePork = new SauceItemFood("saucePork", 3, 0.2F, false, "ketchup", "bbq", "special");
		sauceBeef = new SauceItemFood("sauceBeef", 3, 0.2F, false, "ketchup", "bbq", "special");
	}

}
