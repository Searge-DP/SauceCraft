package com.snowpaw.saucecraft.item;

import java.util.List;

import com.snowpaw.saucecraft.SauceCraft;
import com.snowpaw.saucecraft.common.SauceTabs;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

public class SauceItemFood extends ItemFood {
	
	public String itemName;
	public String[] subNames;
	public IIcon[] icons;
	public boolean[] hiddenMeta;

	public SauceItemFood(String itemName, int heal, float mod, boolean isFavFood, String... subNames) {
		super(heal, mod, isFavFood);
		this.itemName = itemName;
		this.subNames = subNames;
		GameRegistry.registerItem(this, itemName);
		this.setHasSubtypes(subNames != null && subNames.length > 0);
		this.icons = new IIcon[this.subNames != null ? this.subNames.length : 1];
		this.hiddenMeta = new boolean[icons.length];
		this.setCreativeTab(SauceTabs.tabSauceCraft);
		this.setUnlocalizedName(SauceCraft.MODID + "." + itemName);
	}
	
	public String[] getSubNames(){
		return subNames;
	}
	
	public SauceItemFood setMetaHidden(int... array){
		for(int i : array)
			if(i>=0 && i<hiddenMeta.length)
				this.hiddenMeta[i] = true;
		return this;
	}
	
	public SauceItemFood setMetaUnhidden(int... array){
		for(int i : array)
			if(i>=0 && i<hiddenMeta.length)
				this.hiddenMeta[i] = false;
		return this;
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister ir){
		if(getSubNames()!=null)
			for(int i=0;i<icons.length;i++)
				this.icons[i] = ir.registerIcon(SauceCraft.MODID + ":" + itemName + "_" + getSubNames()[i]);
		else
			this.icons[0] = ir.registerIcon(SauceCraft.MODID + ":" + itemName);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public IIcon getIconFromDamage(int meta){
		if(getSubNames()!=null)
			if(meta>=0 && meta<icons.length)
				return this.icons[meta];
		return icons[0];
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void getSubItems(Item item, CreativeTabs tab, List list){
		if(getSubNames()!=null)
		{
			for(int i=0;i<getSubNames().length;i++)
				if((i>=0&&i<hiddenMeta.length)?!hiddenMeta[i]:true)
					list.add(new ItemStack(this,1,i));
		}
		else
			list.add(new ItemStack(this));

	}
	
	@Override
	public String getUnlocalizedName(ItemStack stack){
		if(getSubNames()!=null)
		{
			String subName = stack.getItemDamage()<getSubNames().length?getSubNames()[stack.getItemDamage()]:"";
			return this.getUnlocalizedName() + "." + subName;
		}
		return this.getUnlocalizedName();
	}

}
