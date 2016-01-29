package com.snowpaw.saucecraft;

import com.snowpaw.nooblib.mod.IForgeMod;
import com.snowpaw.nooblib.mod.ModLogger;
import com.snowpaw.saucecraft.common.SauceBlocks;
import com.snowpaw.saucecraft.common.SauceItems;
import com.snowpaw.saucecraft.handler.SauceCrafting;
import com.snowpaw.saucecraft.proxy.CommonProxy;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod
(modid = SauceCraft.MODID, version = SauceCraft.VERSION, name = SauceCraft.NAME)
public class SauceCraft implements IForgeMod {
	
	public static final String MODID = "saucecraft";
	public static final String VERSION = "0.0.1";
	public static final String NAME = "SauceCraft";
	public static final String CSIDE = "com.snowpaw.saucecraft.proxy.ClientProxy";
	public static final String SSIDE = "com.snowpaw.saucecraft.proxy.ServerProxy";
	
	@Instance
	(value = "saucecraft")
	public static SauceCraft instance;
	
	@SidedProxy
	(clientSide = SauceCraft.CSIDE, serverSide = SauceCraft.SSIDE)
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		proxy.preInit();
		SauceItems.preInit();
		SauceBlocks.preInit();
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		proxy.init();
		proxy.registerRenderers();
		new ModLogger(SauceCraft.NAME);
		ModLogger.info("SauceCraft initialized !");
		SauceCrafting.init();
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		proxy.postInit();
	}

}
