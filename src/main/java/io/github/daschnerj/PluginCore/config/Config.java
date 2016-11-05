package io.github.daschnerj.PluginCore.config;

import java.util.List;
import java.util.Map;

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
	
	/**
	 * @param configPath the configuration path to get a string from.
	 * @return Returns the stored string at the specified path.
	 */
	public String getString(String configPath)
	{
		return p.getConfig().getString(configPath);	
	}
	/**
	 * @param configPath the configuration path to get an integer from.
	 * @return Returns the stored integer at the specified path.
	 */
	public Integer getInteger(String configPath)
	{
		return p.getConfig().getInt(configPath);	
	}
	/**
	 * @param configPath the configuration path to get a double from.
	 * @return Returns the stored double at the specified path.
	 */
	public Double getDouble(String configPath)
	{
		return p.getConfig().getDouble(configPath);	
	}
	/**
	 * @param configPath the configuration path to get a boolean from.
	 * @return Returns the stored boolean at the specified path.
	 */
	public Boolean getBoolean(String configPath)
	{
		return p.getConfig().getBoolean(configPath);	
	}
	/**
	 * @param configPath the configuration path to get a string list from.
	 * @return Returns the stored string list at the specified path.
	 */
	public List<String> getStringList(String configPath)
	{
		return p.getConfig().getStringList(configPath);	
	}
	/**
	 * @param configPath the configuration path to get an integer list from.
	 * @return Returns the stored integer list at the specified path.
	 */
	public List<Integer> getIntegerList(String configPath)
	{
		return p.getConfig().getIntegerList(configPath);	
	}
	/**
	 * @param configPath the configuration path to get a double list from.
	 * @return Returns the stored double list at the specified path.
	 */
	public List<Double> getDoubleList(String configPath)
	{
		return p.getConfig().getDoubleList(configPath);	
	}
	/**
	 * @param configPath the configuration path to get a location list from.
	 * @return Returns the stored location list at the specified path.
	 */
	public List<Location> getLocationList(String configPath)
	{
		List<String> locations = this.getStringList(configPath);
		List<Location> convertedLocations = co.convertStringListToLocationList(locations);
		
		return convertedLocations;	
	}
	/**
	 * @param configPath the configuration path to get a boolean list from.
	 * @return Returns the stored boolean list at the specified path.
	 */
	public List<Boolean> getBooleanList(String configPath)
	{
		return p.getConfig().getBooleanList(configPath);	
	}
	/**
	 * @param configPath the configuration path to get a byte list from.
	 * @return Returns the stored byte list at the specified path.
	 */
	public List<Byte> getByteList(String configPath)
	{
		return p.getConfig().getByteList(configPath);	
	}
	/**
	 * @param configPath the configuration path to get a character list from.
	 * @return Returns the stored character list at the specified path.
	 */
	public List<Character> getCharacterList(String configPath)
	{
		return p.getConfig().getCharacterList(configPath);	
	}
	/**
	 * @param configPath the configuration path to get a float list from.
	 * @return Returns the stored float list at the specified path.
	 */
	public List<Float> getFloatList(String configPath)
	{
		return p.getConfig().getFloatList(configPath);	
	}
	/**
	 * @param configPath the configuration path to get a long list from.
	 * @return Returns the stored long list at the specified path.
	 */
	public List<Long> getLongList(String configPath)
	{
		return p.getConfig().getLongList(configPath);	
	}
	/**
	 * @param configPath the configuration path to get a map list from.
	 * @return Returns the stored map list at the specified path.
	 */
	public List<Map<?, ?>> getMapList(String configPath)
	{
		return p.getConfig().getMapList(configPath);	
	}
	/**
	 * @param configPath the configuration path to get a short list from.
	 * @return Returns the stored short list at the specified path.
	 */
	public List<Short> getShortList(String configPath)
	{
		return p.getConfig().getShortList(configPath);	
	}
	/**
	 * @param configPath the configuration path to write the object to.
	 * @param list the list to write to configuration.
	 */
	public void writeList(String configPath, List<?> list)
	{
		p.getConfig().set(configPath, list);
	}
	
	/**
	 * Loads configuration, copies defaults, and saves the configuration.
	 */
	public void loadConfiguration()
	{
		p.getConfig().options().copyDefaults(true);
		p.saveConfig();   
	}
	/**
	 * Reloads the configuration.
	 */
	public void reloadConfiguration()
	{
		p.reloadConfig();
	}
	
	/**
	 * @param path the configuration path to write the default to.
	 * @param type the list to write as a default to the configuration. 
	 */
	public void defaultList(String path, List<?> type)
	{
		p.getConfig().addDefault(path, type);
		p.getConfig().options().copyDefaults(true);
		p.saveConfig();
	}
	/**
	 * @param path the configuration path to write the default to.
	 * @param type the location list to write as a default to the configuration. 
	 */
	public void defaultLocationList(String path, List<Location> type)
	{
		List<String> convertedLocations = co.convertLocationListToStringList(type);
		p.getConfig().addDefault(path, convertedLocations);
		p.getConfig().options().copyDefaults(true);
		p.saveConfig();
	}
	/**
	 * @param path the configuration path to write the default to.
	 * @param type the string to write as a default to the configuration. 
	 */
	public void defaultString(String path, String type)
	{
		p.getConfig().addDefault(path, type);
		p.getConfig().options().copyDefaults(true);
		p.saveConfig();
	}
	/**
	 * @param path the configuration path to write the default to.
	 * @param type the integer to write as a default to the configuration. 
	 */
	public void defaultInteger(String path, Integer type)
	{
		p.getConfig().addDefault(path, type);
		p.getConfig().options().copyDefaults(true);
		p.saveConfig();
	}
	/**
	 * @param path the configuration path to write the default to.
	 * @param type the double to write as a default to the configuration. 
	 */
	public void defaultDouble(String path, Double type)
	{
		p.getConfig().addDefault(path, type);
		p.getConfig().options().copyDefaults(true);
		p.saveConfig();
	}
	/**
	 * @param path the configuration path to write the default to.
	 * @param type the float to write as a default to the configuration. 
	 */
	public void defaultFloat(String path, Float type)
	{
		p.getConfig().addDefault(path, type);
		p.getConfig().options().copyDefaults(true);
		p.saveConfig();
	}
	/**
	 * @param path the configuration path to write the default to.
	 * @param type the short to write as a default to the configuration. 
	 */
	public void defaultShort(String path, Short type)
	{
		p.getConfig().addDefault(path, type);
		p.getConfig().options().copyDefaults(true);
		p.saveConfig();
	}
	/**
	 * @param path the configuration path to write the default to.
	 * @param type the long to write as a default to the configuration. 
	 */
	public void defaultLong(String path, Long type)
	{
		p.getConfig().addDefault(path, type);
		p.getConfig().options().copyDefaults(true);
		p.saveConfig();
	}
	/**
	 * @param path the configuration path to write the default to.
	 * @param type the byte to write as a default to the configuration. 
	 */
	public void defaultByte(String path, Byte type)
	{
		p.getConfig().addDefault(path, type);
		p.getConfig().options().copyDefaults(true);
		p.saveConfig();
	}
	/**
	 * @param path the configuration path to write the default to.
	 * @param type the character to write as a default to the configuration. 
	 */
	public void defaultCharacter(String path, Character type)
	{
		p.getConfig().addDefault(path, type);
		p.getConfig().options().copyDefaults(true);
		p.saveConfig();
	}
	/**
	 * @param path the configuration path to write the default to.
	 * @param type the boolean to write as a default to the configuration. 
	 */
	public void defaultBoolean(String path, Boolean type)
	{
		p.getConfig().addDefault(path, type);
		p.getConfig().options().copyDefaults(true);
		p.saveConfig();
	}
	/**
	 * @param path the configuration path to write the default to.
	 * @param type the map to write as a default to the configuration. 
	 */
	public void defaultMap(String path, Map<?,?> type)
	{
		p.getConfig().addDefault(path, type);
		p.getConfig().options().copyDefaults(true);
		p.saveConfig();
	}
	/**
	 * @param path the configuration path to write the default to.
	 * @param type the location list to write to the configuration. 
	 */
	public void setLocationList(String path, List<Location> type)
	{
		List<String> convertedLocations = co.convertLocationListToStringList(type);
		p.getConfig().set(path, convertedLocations);
		p.saveConfig();
	}
	/**
	 * @param path the configuration path to write the default to.
	 * @param type the item stack list to write to the configuration. 
	 */
	public void setItemStackList(String path, List<ItemStack> type)
	{
		List<String> convertedItems = co.convertItemStackListToStringList(type);
		p.getConfig().set(path, convertedItems);
		p.saveConfig();
	}
	/**
	 * @param path the configuration path to write the default to.
	 * @param type the string to write to the configuration. 
	 */
	public void setString(String path, String type)
	{
		p.getConfig().set(path, type);
	}
	/**
	 * @param path the configuration path to write the default to.
	 * @param type the integer to write to the configuration. 
	 */
	public void setInteger(String path, Integer type)
	{
		p.getConfig().set(path, type);
	}
	/**
	 * @param path the configuration path to write the default to.
	 * @param type the double to write to the configuration. 
	 */
	public void setDouble(String path, Double type)
	{
		p.getConfig().set(path, type);
	}
	/**
	 * @param path the configuration path to write the default to.
	 * @param type the float to write to the configuration. 
	 */
	public void setFloat(String path, Float type)
	{
		p.getConfig().set(path, type);
	}
	/**
	 * @param path the configuration path to write the default to.
	 * @param type the short to write to the configuration. 
	 */
	public void setShort(String path, Short type)
	{
		p.getConfig().set(path, type);
	}
	/**
	 * @param path the configuration path to write the default to.
	 * @param type the long to write to the configuration. 
	 */
	public void setLong(String path, Long type)
	{
		p.getConfig().set(path, type);
	}
	/**
	 * @param path the configuration path to write the default to.
	 * @param type the byte to write to the configuration. 
	 */
	public void setByte(String path, Byte type)
	{
		p.getConfig().set(path, type);
	}
	/**
	 * @param path the configuration path to write the default to.
	 * @param type the character to write to the configuration. 
	 */
	public void setCharacter(String path, Character type)
	{
		p.getConfig().set(path, type);
	}
	/**
	 * @param path the configuration path to write the default to.
	 * @param type the boolean to write to the configuration. 
	 */
	public void setBoolean(String path, Boolean type)
	{
		p.getConfig().set(path, type);
	}
	/**
	 * @param path the configuration path to write the default to.
	 * @param type the map to write to the configuration. 
	 */
	public void setMap(String path, Map<?,?> type)
	{
		p.getConfig().set(path, type);
	}

}
