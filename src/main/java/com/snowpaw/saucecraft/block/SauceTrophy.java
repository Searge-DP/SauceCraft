package com.snowpaw.saucecraft.block;

import com.snowpaw.saucecraft.SauceCraft;
import com.snowpaw.saucecraft.common.SauceTabs;
import com.snowpaw.saucecraft.tile.SauceTileTrophy;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import net.minecraft.block.BlockFlowerPot;

public class SauceTrophy extends BlockContainer {

	public SauceTrophy(String blockName, Material material) {
		super(material);
		this.setCreativeTab(SauceTabs.tabSauceCraft);
		this.setStepSound(Block.soundTypeMetal);
		this.setHardness(1.0F);
		this.setBlockName(SauceCraft.MODID + "." + blockName);
		GameRegistry.registerBlock(this, blockName);
		setBlockBoundsForItemRender();
		this.setBlockTextureName(SauceCraft.MODID + ":" + blockName);
	}
	
    public void setBlockBoundsForItemRender(){
        float f = 0.75F;
        float f1 = f / 2.0F;
        this.setBlockBounds(0.5F - f1, 0.0F, 0.5F - f1, 0.5F + f1, f, 0.5F + f1);
    }
	
	@Override
	public TileEntity createNewTileEntity(World world, int meta){
		return new SauceTileTrophy();
	}
	
	@Override
	@SideOnly(Side.CLIENT)
    public boolean renderAsNormalBlock(){
		return false;
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public boolean isOpaqueCube(){
		return false;
	}
	
    @Override
    @SideOnly(Side.CLIENT)
    public int getRenderType() {
        return -1;
    }
	
}
