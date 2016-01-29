package com.snowpaw.saucecraft.common;

import com.snowpaw.saucecraft.block.SauceTrophy;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class SauceBlocks {
	
	public static Block sauceTrophy;
	
	public static void preInit(){
		sauceTrophy = new SauceTrophy("sauceTrophy", Material.iron);
	}

}
