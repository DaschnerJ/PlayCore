package io.github.daschnerj.PluginCore.functions;

import java.util.HashMap;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;

public class Utility 
{
	public HashMap<String, String> splitIntoHashMap(String[] s, String split)
	{
		
		HashMap<String, String> h = new HashMap<String, String>();
		
		for( String string : s)
		{
			String[] splitString = string.split(split);
			h.put(splitString[0], splitString[1]);
		}
		
		return h;
	}
	
	public Location createLocation(Integer x, Integer y, Integer z, String w)
	{
		World world = Bukkit.getWorld(w);
		
		Double lX = Double.valueOf(x);
		Double lY = Double.valueOf(y);
		Double lZ = Double.valueOf(z);
		
		Location location = new Location(world, lY, lZ, lX);
		
		return location;
	}

}
