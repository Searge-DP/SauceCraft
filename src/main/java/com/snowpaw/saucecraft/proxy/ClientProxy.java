package com.snowpaw.saucecraft.proxy;

import com.snowpaw.saucecraft.render.RenderSauceTrophy;
import com.snowpaw.saucecraft.tile.SauceTileTrophy;

import cpw.mods.fml.client.registry.ClientRegistry;

public class ClientProxy extends CommonProxy {
	
	@Override
	public void init() {
		registerRenderers();
	}

	@Override
	public void postInit() {
		
	}

	@Override
	public void preInit() {
		
	}

	@Override
	public void registerRenderers() {
		ClientRegistry.bindTileEntitySpecialRenderer(SauceTileTrophy.class, new RenderSauceTrophy());
	}

}
