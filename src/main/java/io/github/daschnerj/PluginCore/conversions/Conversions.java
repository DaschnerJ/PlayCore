package io.github.daschnerj.PluginCore.conversions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import io.github.daschnerj.PluginCore.PlayCore;
import io.github.daschnerj.PluginCore.functions.Enchant;
import io.github.daschnerj.PluginCore.functions.Name;
import io.github.daschnerj.PluginCore.functions.Utility;

public class Conversions 
{
	
	private static Utility u = new Utility();
	private static Enchant e = new Enchant();
	private static Name n = new Name();
	
	/**
	 * 
	 * @param s is a line from configuration in the format of Material:material;Amount:int;Enchant:ENCHANTTYPE|int,ENCHANTTYPE2|int,ENCHANTTYPE3|int;Name:String;Lore:String|n|String2|n|String3
	 * @return Returns a completed ItemStack with the attributes specified in String s.
	 */
	public ItemStack createItemFromConfigLine(String s)
	{
		String splitColon[] = s.split(";");
		HashMap<String, String> attributes = u.splitIntoHashMap(splitColon, ":");
		
		ItemStack item = applyTypes(attributes);
		
		return item;	
	}
	
	public List<ItemStack> createItemListFromConfigList(String path)
	{
		List<ItemStack> itemList = new ArrayList<ItemStack>();
		List<String> itemStringList = PlayCore.cf.getStringList(path);
		for(String s : itemStringList)
		{
			itemList.add(createItemFromConfigLine(s));
		}
		return itemList;
	}
	
	/**
	 * 
	 * @param hash is a HashMap of the attributes that need to be applied to the ItemStack.
	 * @return Returns an ItemStack with the attributes from the HashMap.
	 */
	public ItemStack applyTypes(HashMap<String, String> hash)
	{
		
		ItemStack i = null;
		
		for(String k : hash.keySet())
		{
			
			if(k.equalsIgnoreCase("material"))
			{
				Material m = Material.getMaterial(hash.get(k));
				i.setType(m);
			}
			else if(k.equalsIgnoreCase("amount"))
			{
				int amount = Integer.valueOf(hash.get(k));
				i.setAmount(amount);
			}
			else if(k.equalsIgnoreCase("enchant"))
			{
				i = e.applyConfigEnchants(i, hash.get(k));
			}
			else if(k.equalsIgnoreCase("name"))
			{
				i = n.setName(i, hash.get(k));
			}
			else if(k.equalsIgnoreCase("lore"))
			{
				String[] lore = hash.get(k).split("|n|");
				i = n.setLore(i, lore);
			}
			else
			{
				
			}
			
		}
		
		return i;
		
	}
	
	

}
