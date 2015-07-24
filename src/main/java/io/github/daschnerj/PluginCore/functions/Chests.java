package io.github.daschnerj.PluginCore.functions;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.Chest;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class Chests 
{
	
	Probability p = new Probability();
	
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
		if(items != null)
		{
			Inventory inv = chest.getInventory();
		
			for(int i = 0; i < items.size() && i < 27; i++)
			{
				inv.addItem(items.get(i));
			}
		}
	}
	
	public void addItem(Chest chest, ItemStack item)
	{
		if(item != null)
		{
			Inventory inv = chest.getInventory();
			inv.addItem(item);
		}
	}
	
	public List<ItemStack> pickItemsForChestFromList(List<ItemStack> possibleItems)
	{
		List<ItemStack> itemsToAdd = new ArrayList<ItemStack>();
		
		int maxAmountOfItems = p.pickBetweenBounds(1, 26);
		for(int i = 0; i < maxAmountOfItems; i++)
		{
			if(possibleItems.get(0) != null)
			{
				itemsToAdd.add(possibleItems.get(p.pickBetweenBounds(0, possibleItems.size())));
			}
		}
		
		return itemsToAdd;
	}
	

}
