package com.snowpaw.saucecraft.item;

import java.util.List;

import com.snowpaw.nooblib.item.NItemBase;
import com.snowpaw.saucecraft.SauceCraft;
import com.snowpaw.saucecraft.common.SauceBlocks;
import com.snowpaw.saucecraft.common.SauceItems;
import com.snowpaw.saucecraft.common.SauceTabs;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class SauceItem extends NItemBase {

	public SauceItem(String itemName, int stackSize, String... subNames) {
		super(itemName, stackSize, subNames);
		this.setCreativeTab(SauceTabs.tabSauceCraft);
		this.setUnlocalizedName(SauceCraft.MODID + "." + itemName);
		this.setContainerItem(Items.glass_bottle);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean par1){
		if(this.getDamage(stack) == 2){
			list.add(EnumChatFormatting.GOLD + "Rune's secret recipe...");
		}
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

}
