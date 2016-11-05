package io.github.daschnerj.PluginCore.functions;

import java.util.Arrays;
import java.util.List;

import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Name 
{
	
	public Name()
	{
		
	}
	
	public ItemStack setName(ItemStack i, String name)
	{
		ItemMeta m = i.getItemMeta();
		m.setDisplayName(name);
		i.setItemMeta(m);
		return i;
	}
	
	public ItemStack setLore(ItemStack i, String[] lore)
	{
		
		ItemMeta m = i.getItemMeta();
		
		m.setLore(Arrays.asList(lore));
		i.setItemMeta(m);
		
		return i;
		
	}
	
	public ItemStack setLore(ItemStack i, List<String> lore)
	{
		
		ItemMeta m = i.getItemMeta();
		
		m.setLore(lore);
		i.setItemMeta(m);
		
		return i;
	}

}
