package io.github.daschnerj.PluginCore.config;

import java.util.List;
import java.util.Map;

import org.bukkit.Location;

import io.github.daschnerj.PluginCore.PlayCore;

public class Config extends PlayCore 
{
	
	PlayCore p;
	
	public Config(PlayCore i)
	{
		p = i;
	}
	
	public void loadNewConfig()
	{
	     p.getConfig().options().copyDefaults(true);
	     p.saveConfig();
	}
	
	public String getString(String configPath)
	{
		return getConfig().getString(configPath);	
	}
	
	public Integer getInteger(String configPath)
	{
		return getConfig().getInt(configPath);	
	}
	
	public Double getDouble(String configPath)
	{
		return getConfig().getDouble(configPath);	
	}
	
	public Boolean getBoolean(String configPath)
	{
		return getConfig().getBoolean(configPath);	
	}
	
	public List<String> getStringList(String configPath)
	{
		return getConfig().getStringList(configPath);	
	}
	
	public List<Integer> getIntegerList(String configPath)
	{
		return getConfig().getIntegerList(configPath);	
	}
	
	public List<Double> getDoubleList(String configPath)
	{
		return getConfig().getDoubleList(configPath);	
	}
	
	public List<Location> getLocationList(String configPath)
	{
		List<String> locations = this.getStringList(configPath);
		List<Location> convertedLocations = co.convertStringListToLocationList(locations);
		
		return convertedLocations;	
	}
	
	public List<Boolean> getBooleanList(String configPath)
	{
		return getConfig().getBooleanList(configPath);	
	}
	
	public List<Byte> getByteList(String configPath)
	{
		return getConfig().getByteList(configPath);	
	}
	
	public List<Character> getCharacterList(String configPath)
	{
		return getConfig().getCharacterList(configPath);	
	}
	
	public List<Float> getFloatList(String configPath)
	{
		return getConfig().getFloatList(configPath);	
	}
	
	public List<Long> getLongList(String configPath)
	{
		return getConfig().getLongList(configPath);	
	}
	
	public List<Map<?, ?>> getMapList(String configPath)
	{
		return getConfig().getMapList(configPath);	
	}
	
	public List<Short> getShortList(String configPath)
	{
		return getConfig().getShortList(configPath);	
	}
	
	public void writeList(String configPath, List<?> list)
	{
		getConfig().set(configPath, list);
	}
	
	public void loadConfiguration()
	{
	     getConfig().options().copyDefaults(true);
	     saveConfig();   
	}
	
	public void reloadConfiguration()
	{
		reloadConfig();
	}
	
	public void defaultList(String path, List<?> type)
	{
		if(!getConfig().contains(path))
		{
			getConfig().addDefault(path, type);
			getConfig().options().copyDefaults(true);
		}
		saveConfig();
	}
	
	public void defaultLocationList(String path, List<Location> type)
	{
		List<String> convertedLocations = co.convertLocationListToStringList(type);
		if(!getConfig().contains(path))
		{
			getConfig().addDefault(path, convertedLocations);
			getConfig().options().copyDefaults(true);
		}
		saveConfig();
	}
	
	public void defaultString(String path, String type)
	{
		if(!getConfig().contains(path))
		{
			getConfig().addDefault(path, type);
			getConfig().options().copyDefaults(true);
		}
		saveConfig();
	}
	
	public void defaultInteger(String path, Integer type)
	{
		if(!getConfig().contains(path))
		{
			getConfig().addDefault(path, type);
			getConfig().options().copyDefaults(true);
		}
		saveConfig();
	}
	
	public void defaultDouble(String path, Double type)
	{
		if(!getConfig().contains(path))
		{
			getConfig().addDefault(path, type);
			getConfig().options().copyDefaults(true);
		}
		saveConfig();
	}
	
	public void defaultFloat(String path, Float type)
	{
		if(!getConfig().contains(path))
		{
			getConfig().addDefault(path, type);
			getConfig().options().copyDefaults(true);
		}
		saveConfig();
	}
	
	public void defaultShort(String path, Short type)
	{
		if(!getConfig().contains(path))
		{
			getConfig().addDefault(path, type);
			getConfig().options().copyDefaults(true);
		}
		saveConfig();
	}
	
	public void defaultLong(String path, Long type)
	{
		if(!getConfig().contains(path))
		{
			getConfig().addDefault(path, type);
			getConfig().options().copyDefaults(true);
		}
		saveConfig();
	}
	
	public void defaultByte(String path, Byte type)
	{
		if(!getConfig().contains(path))
		{
			getConfig().addDefault(path, type);
			getConfig().options().copyDefaults(true);
		}
		saveConfig();
	}
	
	public void defaultCharacter(String path, Character type)
	{
		if(!getConfig().contains(path))
		{
			getConfig().addDefault(path, type);
			getConfig().options().copyDefaults(true);
		}
		saveConfig();
	}
	
	public void defaultBoolean(String path, Boolean type)
	{
		if(!getConfig().contains(path))
		{
			getConfig().addDefault(path, type);
			getConfig().options().copyDefaults(true);
		}
		saveConfig();
	}
	
	public void defaultMap(String path, Map<?,?> type)
	{
		if(!getConfig().contains(path))
		{
			getConfig().addDefault(path, type);
			getConfig().options().copyDefaults(true);
		}
		saveConfig();
	}
	
	public void setLocationList(String path, List<Location> type)
	{
		List<String> convertedLocations = co.convertLocationListToStringList(type);
		getConfig().set(path, convertedLocations);
		saveConfig();
	}
	
	public void setString(String path, String type)
	{
		getConfig().set(path, type);
	}
	
	public void setInteger(String path, Integer type)
	{
		getConfig().set(path, type);
	}
	
	public void setDouble(String path, Double type)
	{
		getConfig().set(path, type);
	}
	
	public void setFloat(String path, Float type)
	{
		getConfig().set(path, type);
	}
	
	public void setShort(String path, Short type)
	{
		getConfig().set(path, type);
	}
	
	public void setLong(String path, Long type)
	{
		getConfig().set(path, type);
	}
	
	public void setByte(String path, Byte type)
	{
		getConfig().set(path, type);
	}
	
	public void setCharacter(String path, Character type)
	{
		getConfig().set(path, type);
	}
	
	public void setBoolean(String path, Boolean type)
	{
		getConfig().set(path, type);
	}
	
	public void setMap(String path, Map<?,?> type)
	{
		getConfig().set(path, type);
	}

}
