package io.github.daschnerj.PluginCore.conversions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
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
	/**
	 * @param path The path to get the stored item stack list from.
	 * @return Returns a converted Item Stack List from configuration file.
	 */
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
	 * Converts a Location List To String List.
	 * @param l is the location list to be converted.
	 * @return Returns a converted String List.
	 */
	public List<String> convertLocationListToStringList(List<Location> l)
	{
		List<String> stringLocationList = new ArrayList<String>();
		for(Location loc : l)
		{
			stringLocationList.add(loc.toString());
		}
		return stringLocationList;
	}
	
	
	/**
	 * Converts a String List To Location List.
	 * @param s is the string list to be converted.
	 * @return Returns a converted Location List.
	 */
	public List<Location> convertStringListToLocationList(List<String> s)
	{
		List<Location> locationList = new ArrayList<Location>();
		for(String str : s)
		{
			locationList.add(u.locationFromString(str));
		}

		return locationList;
	}
	/**
	 * Converts an Item Stack to a formatted String.
	 * Format: Material:material;Amount:int;Enchant:ENCHANTTYPE|int,ENCHANTTYPE2|int,ENCHANTTYPE3|int;Name:String;Lore:String|n|String2|n|String3
	 * @param item the item stack to be converted.
	 * @return Returns a converted and formated string.
	 */
	public String convertItemStackToString(ItemStack item)
	{
		//Material:material;Amount:int;Enchant:ENCHANTTYPE|int,ENCHANTTYPE2|int,ENCHANTTYPE3|int;Name:String;Lore:String|n|String2|n|String3
		String itemConverted = "";
		itemConverted = itemConverted + "Material:" + item.getType().toString();
		itemConverted = itemConverted + ";Amount:" + item.getAmount();
		String enchants = ";Enchant:";
		
		if(item.getItemMeta().hasEnchants())
		{
			Map<Enchantment, Integer> e = item.getEnchantments();
			for(Enchantment enchant : e.keySet())
			{
				if(enchants.equals(";Enchant:"))
				{
				
				}
				else
				{
					enchants = enchants + ",";
				}
				enchants = enchants + enchant.getName() + "|" + e.get(enchant);
			}
			itemConverted = itemConverted + enchants;
		}
		if(item.getItemMeta().hasDisplayName())
		{
			itemConverted = itemConverted + ";Name:" + item.getItemMeta().getDisplayName();
		}
		if(item.getItemMeta().hasLore())
		{
			String loreSet = ";Lore:";
			List<String> lore = item.getItemMeta().getLore();
			for(String s : lore)
			{
				if(enchants.equals(";Lore:"))
				{
				
				}
				else
				{
					loreSet = loreSet + "|n|";
				}
				loreSet = loreSet + s;
			}
		}
		
		return itemConverted;
		
	}
	/**
	 * Converts an Item Stack List to a String List.
	 * @param items the item stack list to be converted to a string list.
	 * @return Returns a converted and formatted string list.
	 */
	public List<String> convertItemStackListToStringList(List<ItemStack> items)
	{
		List<String> itemList = new ArrayList<String>();
		for(ItemStack i : items)
		{
			itemList.add(convertItemStackToString(i));
		}
		return itemList;
	}
	
	/**
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
