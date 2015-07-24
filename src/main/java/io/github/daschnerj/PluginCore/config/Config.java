package io.github.daschnerj.PluginCore.config;

import java.util.List;
import java.util.Map;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.inventory.ItemStack;

import io.github.daschnerj.PluginCore.PlayCore;
import io.github.daschnerj.PluginCore.conversions.Conversions;

public class Config
{
	
	PlayCore p;
	
	Conversions co = new Conversions();
	
	public Config(PlayCore i)
	{
		p = i;
	}
	
	public String getString(String configPath)
	{
		return p.getConfig().getString(configPath);	
	}
	
	public Integer getInteger(String configPath)
	{
		return p.getConfig().getInt(configPath);	
	}
	
	public Double getDouble(String configPath)
	{
		return p.getConfig().getDouble(configPath);	
	}
	
	public Boolean getBoolean(String configPath)
	{
		return p.getConfig().getBoolean(configPath);	
	}
	
	public List<String> getStringList(String configPath)
	{
		return p.getConfig().getStringList(configPath);	
	}
	
	public List<Integer> getIntegerList(String configPath)
	{
		return p.getConfig().getIntegerList(configPath);	
	}
	
	public List<Double> getDoubleList(String configPath)
	{
		return p.getConfig().getDoubleList(configPath);	
	}
	
	public List<Location> getLocationList(String configPath)
	{
		List<String> locations = this.getStringList(configPath);
		List<Location> convertedLocations = co.convertStringListToLocationList(locations);
		
		return convertedLocations;	
	}
	
	public List<Boolean> getBooleanList(String configPath)
	{
		return p.getConfig().getBooleanList(configPath);	
	}
	
	public List<Byte> getByteList(String configPath)
	{
		return p.getConfig().getByteList(configPath);	
	}
	
	public List<Character> getCharacterList(String configPath)
	{
		return p.getConfig().getCharacterList(configPath);	
	}
	
	public List<Float> getFloatList(String configPath)
	{
		return p.getConfig().getFloatList(configPath);	
	}
	
	public List<Long> getLongList(String configPath)
	{
		return p.getConfig().getLongList(configPath);	
	}
	
	public List<Map<?, ?>> getMapList(String configPath)
	{
		return p.getConfig().getMapList(configPath);	
	}
	
	public List<Short> getShortList(String configPath)
	{
		return p.getConfig().getShortList(configPath);	
	}
	
	public void writeList(String configPath, List<?> list)
	{
		p.getConfig().set(configPath, list);
	}
	
	public void loadConfiguration()
	{
		p.getConfig().options().copyDefaults(true);
		p.saveConfig();   
	}
	
	public void reloadConfiguration()
	{
		p.reloadConfig();
	}
	
	public void defaultList(String path, List<?> type)
	{
		p.getConfig().addDefault(path, type);
		p.getConfig().options().copyDefaults(true);
		p.saveConfig();
	}
	
	public void defaultLocationList(String path, List<Location> type)
	{
		List<String> convertedLocations = co.convertLocationListToStringList(type);
		p.getConfig().addDefault(path, convertedLocations);
		p.getConfig().options().copyDefaults(true);
		p.saveConfig();
	}
	
	public void defaultString(String path, String type)
	{
		p.getConfig().addDefault(path, type);
		p.getConfig().options().copyDefaults(true);
		p.saveConfig();
	}
	
	public void defaultInteger(String path, Integer type)
	{
		p.getConfig().addDefault(path, type);
		p.getConfig().options().copyDefaults(true);
		p.saveConfig();
	}
	
	public void defaultDouble(String path, Double type)
	{
		p.getConfig().addDefault(path, type);
		p.getConfig().options().copyDefaults(true);
		p.saveConfig();
	}
	
	public void defaultFloat(String path, Float type)
	{
		p.getConfig().addDefault(path, type);
		p.getConfig().options().copyDefaults(true);
		p.saveConfig();
	}
	
	public void defaultShort(String path, Short type)
	{
		p.getConfig().addDefault(path, type);
		p.getConfig().options().copyDefaults(true);
		p.saveConfig();
	}
	
	public void defaultLong(String path, Long type)
	{
		p.getConfig().addDefault(path, type);
		p.getConfig().options().copyDefaults(true);
		p.saveConfig();
	}
	
	public void defaultByte(String path, Byte type)
	{
		p.getConfig().addDefault(path, type);
		p.getConfig().options().copyDefaults(true);
		p.saveConfig();
	}
	
	public void defaultCharacter(String path, Character type)
	{
		p.getConfig().addDefault(path, type);
		p.getConfig().options().copyDefaults(true);
		p.saveConfig();
	}
	
	public void defaultBoolean(String path, Boolean type)
	{
		p.getConfig().addDefault(path, type);
		p.getConfig().options().copyDefaults(true);
		p.saveConfig();
	}
	
	public void defaultMap(String path, Map<?,?> type)
	{
		p.getConfig().addDefault(path, type);
		p.getConfig().options().copyDefaults(true);
		p.saveConfig();
	}
	
	public void setLocationList(String path, List<Location> type)
	{
		List<String> convertedLocations = co.convertLocationListToStringList(type);
		p.getConfig().set(path, convertedLocations);
		p.saveConfig();
	}
	
	public void setItemStackList(String path, List<ItemStack> type)
	{
		List<String> convertedItems = co.convertItemStackListToStringList(type);
		p.getConfig().set(path, convertedItems);
		p.saveConfig();
	}
	
	public void setString(String path, String type)
	{
		p.getConfig().set(path, type);
	}
	
	public void setInteger(String path, Integer type)
	{
		p.getConfig().set(path, type);
	}
	
	public void setDouble(String path, Double type)
	{
		p.getConfig().set(path, type);
	}
	
	public void setFloat(String path, Float type)
	{
		p.getConfig().set(path, type);
	}
	
	public void setShort(String path, Short type)
	{
		p.getConfig().set(path, type);
	}
	
	public void setLong(String path, Long type)
	{
		p.getConfig().set(path, type);
	}
	
	public void setByte(String path, Byte type)
	{
		p.getConfig().set(path, type);
	}
	
	public void setCharacter(String path, Character type)
	{
		p.getConfig().set(path, type);
	}
	
	public void setBoolean(String path, Boolean type)
	{
		p.getConfig().set(path, type);
	}
	
	public void setMap(String path, Map<?,?> type)
	{
		p.getConfig().set(path, type);
	}

}
