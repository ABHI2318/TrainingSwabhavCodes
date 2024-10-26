package com.aurion.Hatdecorator.model;

public class StandardHat implements IHat{

	@Override
	public String getName() {
		
		return "virat";
	}

	@Override
	public int getPrice() {
		
		return 899;
	}

	@Override
	public String getDescription() {
		
		return "standared hat i sbest";
	}

	@Override
	public String toString() {
		return "StandardHat [getName()=" + getName() + ", getPrice()=" + getPrice() + ", getDescription()="
				+ getDescription() + "]";
	}


}
