package io.github.daschnerj.PluginCore.specialEffects;

import org.bukkit.block.Dispenser;
import org.bukkit.inventory.ItemStack;

public class DispenserFX {
	
	/**
	 * A neat function that helps you to create a custom "craft" of an item. How you call it and testing is up to you.
	 * 
	 * @param dispenser - Dispenser to remove items from.
	 * @param slot1 - What to remove from slot 1. Can be null only if its corresponding delete boolean is false.
	 * @param slot2 - What to remove from slot 2. Can be null only if its corresponding delete boolean is false.
	 * @param slot3 - What to remove from slot 3. Can be null only if its corresponding delete boolean is false.
	 * @param slot4 - What to remove from slot 4. Can be null only if its corresponding delete boolean is false.
	 * @param slot5 - What to remove from slot 5. Can be null only if its corresponding delete boolean is false.
	 * @param slot6 - What to remove from slot 6. Can be null only if its corresponding delete boolean is false.
	 * @param slot7 - What to remove from slot 7. Can be null only if its corresponding delete boolean is false.
	 * @param slot8 - What to remove from slot 8. Can be null only if its corresponding delete boolean is false.
	 * @param slot9 - What to remove from slot 9. Can be null only if its corresponding delete boolean is false.
	 * @param delete1 - Whether or not to remove an item from slot 1.
	 * @param delete2 - Whether or not to remove an item from slot 2.
	 * @param delete3 - Whether or not to remove an item from slot 3.
	 * @param delete4 - Whether or not to remove an item from slot 4.
	 * @param delete5 - Whether or not to remove an item from slot 5.
	 * @param delete6 - Whether or not to remove an item from slot 6.
	 * @param delete7 - Whether or not to remove an item from slot 7.
	 * @param delete8 - Whether or not to remove an item from slot 8.
	 * @param delete9 - Whether or not to remove an item from slot 9.
	 */
	
	public static void removeDispenserItems(Dispenser dispenser, ItemStack slot1, ItemStack slot2, ItemStack slot3, ItemStack slot4, ItemStack slot5, ItemStack slot6, ItemStack slot7, ItemStack slot8, ItemStack slot9, Boolean delete1, Boolean delete2, Boolean delete3, Boolean delete4, Boolean delete5, Boolean delete6, Boolean delete7, Boolean delete8, Boolean delete9){
		
		if(delete1 == true){
		if(slot1.getAmount() > 1) {
			
			slot1.setAmount(slot1.getAmount() - 1);
			
		}
		else{
											
			dispenser.getInventory().removeItem(slot1);
			
		}
		}
		
		if(delete2 == true){
		if(slot2.getAmount() > 1) {
			
			slot2.setAmount(slot2.getAmount() - 1);
			
		}
		else{
			
			dispenser.getInventory().removeItem(slot2);
			
		}
		}
		
		if(delete3 == true){
		if(slot3.getAmount() > 1) {
			
			slot3.setAmount(slot3.getAmount() - 1);
			
		}
		else{
			
			dispenser.getInventory().removeItem(slot3);
			
		}
		}
		
		if(delete4 == true){
		if(slot4.getAmount() > 1) {
			
			slot4.setAmount(slot4.getAmount() - 1);
			
		}
		else{
			
			dispenser.getInventory().removeItem(slot4);
			
		}
		}
		
		if(delete5 == true){
		if(slot5.getAmount() > 1) {
			
			slot5.setAmount(slot5.getAmount() - 1);
			
		}
		else{
			
			dispenser.getInventory().removeItem(slot5);
			
		}
		}
		
		if(delete6 == true){
		if(slot6.getAmount() > 1) {
			
			slot6.setAmount(slot6.getAmount() - 1);
			
		}
		else{
			
			dispenser.getInventory().removeItem(slot6);
			
		}
		}
		
		if(delete7 == true){
		if(slot7.getAmount() > 1) {
			
			slot7.setAmount(slot7.getAmount() - 1);
			
		}
		else{
			
			dispenser.getInventory().removeItem(slot7);
			
		}
		}
		
		if(delete8 == true){
		if(slot8.getAmount() > 1) {
			
			slot8.setAmount(slot8.getAmount() - 1);
			
		}
		else{
			
			dispenser.getInventory().removeItem(slot8);
			
		}
		}
		
		if(delete9 == true){
		if(slot9.getAmount() > 1) {
			
			slot9.setAmount(slot9.getAmount() - 1);
			
		}
		else{
			
			dispenser.getInventory().removeItem(slot9);
			
		}
		}
		
	}

}
