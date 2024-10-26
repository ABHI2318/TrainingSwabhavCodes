package com.aurion.Hatdecorator.model;

public class PremiumHat implements IHat{

	@Override
	public String getName() {
		
		return "rahul";
	}

	@Override
	public String toString() {
		return "PremiumHat [getName()=" + getName() + ", getPrice()=" + getPrice() + ", getDescription()="
				+ getDescription() + "]";
	}

	@Override
	public int getPrice() {
		
		return 400;
	}

	@Override
	public String getDescription() {
		
		return "premium hat ";
	}

	

}
