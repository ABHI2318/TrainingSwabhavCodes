package com.aurionpro.entiites;

import java.util.Random;

public class RandomNumberGenerator 
{
	
	public static  int generateRandomNumber()
	{
		Random random = new Random();
		return random.nextInt(1000)+10000;
	}

}
