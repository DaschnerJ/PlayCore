package io.github.daschnerj.PluginCore.functions;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.Chest;
import org.bukkit.inventory.Inventory;

public class Chests 
{
	
	public void spawnChest(Location loc)
	{
		Block b = loc.getBlock();
		loc.getBlock().setType(Material.CHEST);
		Chest chest = (Chest)b.getState();
		Inventory inv = chest.getInventory();
		
		addItems(inv);
		
	}
	
	public void addItems(Inventory inv)
	{
		
	}

}
