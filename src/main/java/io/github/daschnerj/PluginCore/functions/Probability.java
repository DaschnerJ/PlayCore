package io.github.daschnerj.PluginCore.functions;

import java.util.Random;

public class Probability 
{
	
	Random r = new Random();
	
	public int pickBetweenBounds(int min, int max)
	{
		
		int randomNum = r.nextInt( ( max - min ) ) + min;
		
		return randomNum;
		
	}
	
	

}
