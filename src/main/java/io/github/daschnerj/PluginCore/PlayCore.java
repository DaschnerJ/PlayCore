package io.github.daschnerj.PluginCore;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import io.github.daschnerj.PluginCore.config.Config;
import io.github.daschnerj.PluginCore.conversions.Conversions;
import io.github.daschnerj.PluginCore.functions.Chests;
import io.github.daschnerj.PluginCore.functions.Enchant;
import io.github.daschnerj.PluginCore.functions.Locations;
import io.github.daschnerj.PluginCore.functions.Name;
import io.github.daschnerj.PluginCore.functions.Probability;
import io.github.daschnerj.PluginCore.functions.Utility;

public class PlayCore extends JavaPlugin 
{
	
	public static FileConfiguration config;
	
	private static PlayCore instance;
	
	public static Chests c = new Chests();
	public static Config cf;
	public static Conversions co = new Conversions();
	public static Enchant e = new Enchant();
	public static Locations l = new Locations();
	public static Name n = new Name();
	public static Probability p = new Probability();
	public static Utility u = new Utility();
	
	@Override
	public void onEnable() 
	{	
		instance = this;
		cf = new Config(instance);
		loadConfiguration();
		getLogger().info("PlayCore has been enabled!");	
	}
 
	@Override
	public void onDisable() 
	{
		
		getLogger().info("PlayCore has been disabled!");
		
	}
	
	public void loadConfiguration()
	{
	     getConfig().options().copyDefaults(true);
	     saveConfig();     
	}
}
