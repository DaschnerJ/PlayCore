package io.github.daschnerj.PluginCore;
import org.bukkit.plugin.java.JavaPlugin;

public class PlayCore extends JavaPlugin 
{
	@Override
	public void onEnable() 
	{
		getLogger().info("PlayCore has been enabled!");
	}
 
	@Override
	public void onDisable() 
	{
		getLogger().info("PlayCore has been disabled!");
	}
}
