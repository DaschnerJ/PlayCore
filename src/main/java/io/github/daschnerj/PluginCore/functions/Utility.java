package io.github.daschnerj.PluginCore.functions;

import java.util.HashMap;

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

}
