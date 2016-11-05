package io.github.daschnerj.PluginCore.functions;

import java.util.HashMap;

import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Enchant 
{
	public Enchant()
	{
		
	}
	
	private static Utility u = new Utility();
	
	public ItemStack applyConfigEnchants(ItemStack i, String enchants)
	{    
		
		String[] enchantsList = enchants.split(",");
		HashMap<String, String> levels = u.splitIntoHashMap(enchantsList, "|");
		applyByName(i, levels);
		
		return i;
		
	}
	
	public ItemStack applyByName(ItemStack i, HashMap<String, String> enchants)
	{
		
		ItemMeta m = i.getItemMeta();
		
		for(String k : enchants.keySet())
		{
			
			int level = Integer.getInteger(enchants.get(k));
			Enchantment e = Enchantment.getByName(k);
			
			if(e != null)
			{
				m.addEnchant(e, level, true);
			}
			
		}
		
		i.setItemMeta(m);
	
		return i;
		 
	}
	
	public ItemStack applyByEnchants(ItemStack i, HashMap<Enchantment, String> enchants)
	{
		
		ItemMeta m = i.getItemMeta();
		
		for(Enchantment k : enchants.keySet())
		{
			
			int level = Integer.getInteger(enchants.get(k));
			
			if(k != null)
			{
				m.addEnchant(k, level, true);
			}
			
		}
		
		i.setItemMeta(m);
	
		return i;
		
	}

}
