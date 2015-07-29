package io.github.daschnerj.PluginCore.specialEffects;

import java.util.List;

import org.bukkit.block.Dispenser;
import org.bukkit.inventory.ItemStack;

public class DispenserFX {
	
	/**
	 * A neat function that helps you to create a custom "craft" of an item in a dispenser. How you call it and testing is up to you.
	 * 
	 * @param dispenser - Dispenser to remove items from.
	 * @param Delete - List of Items to delete. It must have a size of 9 or function will do nothing. 
	 */
	
	public static void removeDispenserItems(Dispenser dispenser, List<ItemStack> Delete) {
				
		if(Delete.size() == 9) {
			
		ItemStack slot1 = null, slot2 = null, slot3 = null, slot4 = null, slot5 = null, slot6 = null, slot7 = null, slot8 = null, slot9 = null;
			
		if(Delete.get(0) != null) {
			
			slot1 = Delete.get(0);
			
		}
		
		if(Delete.get(1) != null) {
			
			slot2 = Delete.get(1);
			
		}
		
		if(Delete.get(2) != null) {
			
			slot3 = Delete.get(2);
			
		}
		
		if(Delete.get(3) != null) {
			
			slot4 = Delete.get(3);
			
		}
		
		if(Delete.get(4) != null) {
			
			slot5 = Delete.get(4);
			
		}
		
		if(Delete.get(5) != null) {
			
			slot6 = Delete.get(5);
			
		}
		
		if(Delete.get(6) != null) {
			
			slot7 = Delete.get(6);
			
		}
		
		if(Delete.get(7) != null) {
			
			slot8 = Delete.get(7);
			
		}
		
		if(Delete.get(8) != null) {
			
			slot9 = Delete.get(8);
			
		}
		
		if(slot1 != null){
		if(slot1.getAmount() > 1) {
			
			slot1.setAmount(slot1.getAmount() - 1);
			
		}
		else{
											
			dispenser.getInventory().removeItem(slot1);
			
		}
		}
		
		if(slot2 != null){
		if(slot2.getAmount() > 1) {
			
			slot2.setAmount(slot2.getAmount() - 1);
			
		}
		else{
			
			dispenser.getInventory().removeItem(slot2);
			
		}
		}
		
		if(slot3 != null){
		if(slot3.getAmount() > 1) {
			
			slot3.setAmount(slot3.getAmount() - 1);
			
		}
		else{
			
			dispenser.getInventory().removeItem(slot3);
			
		}
		}
		
		if(slot4 != null){
		if(slot4.getAmount() > 1) {
			
			slot4.setAmount(slot4.getAmount() - 1);
			
		}
		else{
			
			dispenser.getInventory().removeItem(slot4);
			
		}
		}
		
		if(slot5 != null){
		if(slot5.getAmount() > 1) {
			
			slot5.setAmount(slot5.getAmount() - 1);
			
		}
		else{
			
			dispenser.getInventory().removeItem(slot5);
			
		}
		}
		
		if(slot6 != null){
		if(slot6.getAmount() > 1) {
			
			slot6.setAmount(slot6.getAmount() - 1);
			
		}
		else{
			
			dispenser.getInventory().removeItem(slot6);
			
		}
		}
		
		if(slot7 != null){
		if(slot7.getAmount() > 1) {
			
			slot7.setAmount(slot7.getAmount() - 1);
			
		}
		else{
			
			dispenser.getInventory().removeItem(slot7);
			
		}
		}
		
		if(slot8 != null){
		if(slot8.getAmount() > 1) {
			
			slot8.setAmount(slot8.getAmount() - 1);
			
		}
		else{
			
			dispenser.getInventory().removeItem(slot8);
			
		}
		}
		
		if(slot9 != null){
		if(slot9.getAmount() > 1) {
			
			slot9.setAmount(slot9.getAmount() - 1);
			
		}
		else{
			
			dispenser.getInventory().removeItem(slot9);
			
		}
		}
		
		}
		
	}

}
