package io.github.daschnerj.PluginCore.functions;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Dispenser;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class Dispensers {
	
	/**
	 * Creates a Dispenser at the given location.
	 * 
	 * @param Location - Location to create a Dispenser.
	 * @return The Dispenser created. Once created, it cannot be guaranteed that it will remain a dispenser in the future.
	 */
	
	public Dispenser createDispenser(Location Location)
	{
		
		Location.getBlock().setType(Material.DISPENSER);
		
		Dispenser dispenser = (Dispenser) Location.getBlock().getState();
		
		return dispenser;
		
	}
	
	/**
	 * Gets the Dispenser at the given location.
	 * 
	 * @param Location - The location to look for a Dispenser.
	 * @return The Dispenser, if found. Otherwise, null. Once gotten, it cannot be guaranteed that it will remain a dispenser in the future.
	 */
	
	public Dispenser getDispenser(Location Location)
	{
				
		if(Location.getBlock().getType().equals(Material.DISPENSER))
		{
			
			Dispenser dispenser = (Dispenser) Location.getBlock().getState();
			
			return dispenser;
			
		}
		else
		{
			
			return null;
			
		}
		
	}
	
	/**
	 * Adds an item to a Dispenser.
	 * 
	 * @param Dispenser - Dispenser to add to.
	 * @param Itemstack - ItemStack to add to the dispenser.
	 */
	
	public void addItem(Dispenser Dispenser, ItemStack Itemstack)
	{
		
		if(Itemstack != null)
		{
			
			Inventory dispenserInv = Dispenser.getInventory();
			
			dispenserInv.addItem(Itemstack);
			
		}
		
	}
	
	/**
	 * Removes an item to a Dispenser.
	 * 
	 * @param Dispenser - Dispenser to add to.
	 * @param Itemstack - ItemStack to add to the dispenser.
	 */
	
	public void removeItem(Dispenser Dispenser, ItemStack Itemstack)
	{
				
		if(Itemstack != null)
		{
			
			Inventory dispenserInv = Dispenser.getInventory();
			
			dispenserInv.removeItem(Itemstack);
			
		}
		
	}
	
	/**
	 * Gets the direction of the Dispenser given.
	 * 
	 * @param Dispenser - The Dispenser to get the direction of.
	 * @return The direction, or if not found correctly then defaults to 0.
	 */
	
	@SuppressWarnings("deprecation")
	public byte getDirection(Dispenser Dispenser) {
		
		byte direction = 0;
		
		if(Dispenser.getBlock().getData() >= 0 && Dispenser.getBlock().getData() <= 5) {
			
			direction = Dispenser.getBlock().getData();
			
		}
		
		if(Dispenser.getBlock().getData() >= 8 && Dispenser.getBlock().getData() <= 13) {
			
			direction = (byte) (Dispenser.getBlock().getData() - 8);
			
		}
		
		return direction;
		
	}
	
	/**
	 * Set the direction of the Dispenser given.
	 * 
	 * @param Direction - Direction to set the dispenser to. 0 - Negative Y, 1 - Positive Y, 2 - Negative Z, 3 - Positive Z, 4 - Negative X, 5 - Positive X.
	 * @param Dispenser - The Dispenser to set the direction of.
	 */
	
	@SuppressWarnings("deprecation")
	public void setDirection(byte Direction, Dispenser Dispenser) {
		
		if(Direction >= 0 && Direction <= 5) {
			
			Dispenser.getBlock().setData(Direction);
			
		}
				
	}

}
