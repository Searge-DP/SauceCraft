package com.snowpaw.saucecraft.render;

import org.lwjgl.opengl.GL11;

import com.snowpaw.saucecraft.SauceCraft;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

public class RenderSauceTrophy extends TileEntitySpecialRenderer {
	
	public static ResourceLocation texture;
	public static SauceModelCow model;
	
	public RenderSauceTrophy(){
		this.texture = new ResourceLocation(SauceCraft.MODID, "textures/blocks/trophy.png");
		this.model = new SauceModelCow();
	}

	@Override
	public void renderTileEntityAt(TileEntity tile, double x, double y, double z, float f) {
		GL11.glPushMatrix();
		GL11.glTranslated(x + 0.5D, y + 0.8D, z + 0.55D);
		GL11.glScaled(0.55D, 0.55D, 0.55D);
		GL11.glRotated(180, 0D, 0D, 1D);
		this.bindTexture(texture);
		model.renderAll();
		GL11.glPopMatrix();
	}

}
