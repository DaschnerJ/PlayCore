package io.github.daschnerj.PluginCore.functions;

import java.util.List;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.Chest;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class Chests 
{
	
	public void spawnChest(Location loc)
	{
		loc.getBlock().setType(Material.CHEST);
	}
	
	public void spawnTrappedChest(Location loc)
	{
		loc.getBlock().setType(Material.TRAPPED_CHEST);
	}
	
	public Chest getChest(Location loc)
	{
		Chest chest = null;
		
		Block b = loc.getBlock();
		
		if(b.getType() == Material.CHEST || b.getType() == Material.TRAPPED_CHEST)
		{
			chest = (Chest)b.getState();
		}	
		
		return chest;
	}
	
	public void addItems(Chest chest, List<ItemStack> items)
	{
		Inventory inv = chest.getInventory();
		
		for(int i = 0; i < items.size() && i < 27; i++)
		{
			inv.addItem(items.get(i));
		}
	}
	
	public void addItem(Chest chest, ItemStack item)
	{
		Inventory inv = chest.getInventory();
		inv.addItem(item);
	}

}
