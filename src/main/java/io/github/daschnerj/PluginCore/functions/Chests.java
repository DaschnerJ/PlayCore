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
	
	public Chests()
	{
		
	}
	
	/**
	 * Spawns a chest at the selected location.
	 * @param loc Location to spawn the chest.
	 */
	public void spawnChest(Location loc)
	{
		loc.getBlock().setType(Material.CHEST);
	}
	
	/**
	 * Spawns a trapped chest at the selected location.
	 * @param loc Location to spawn the trapped chest.
	 */
	public void spawnTrappedChest(Location loc)
	{
		loc.getBlock().setType(Material.TRAPPED_CHEST);
	}
	
	/**
	 * Gets the chest at the selected location.
	 * @param loc The location to get a chest.
	 * @return Returns a the chest or trapped chest at the location or returns null if there is no chest.
	 */
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
	
	/**
	 * Adds a list of Item Stacks to the selected chest.
	 * @param chest that the items are to be added to.
	 * @param items that are to be added to the chest.
	 */
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
	/**
	 * Adds a single item stack to a chest.
	 * @param chest that the item is added to.
	 * @param item that is added to the chest.
	 */
	public void addItem(Chest chest, ItemStack item)
	{
		if(item != null)
		{
			Inventory inv = chest.getInventory();
			inv.addItem(item);
		}
	}
	/**
	 * Randomly selects a random amount of items to fill a chest with from an Item Stack List.
	 * @param possibleItems is a list of item stacks to possibly fill a chest with.
	 * @return Returns an item stack list to fill a chest with.
	 */
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
