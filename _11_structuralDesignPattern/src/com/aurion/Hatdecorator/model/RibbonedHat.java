package com.aurion.Hatdecorator.model;

public class RibbonedHat extends HatDecorator {

    public RibbonedHat(IHat hat) {
        this.hat = hat;
    }

    @Override
	public String toString() {
		return "RibbonedHat [getName()=" + getName() + ", getPrice()=" + getPrice() + ", getDescription()="
				+ getDescription() + "]";
	}

	@Override
    public String getName() {
        return hat.getName() + " with ribbon";
    }

    @Override
    public int getPrice() {
        return hat.getPrice() + 400; 
    }

    @Override
    public String getDescription() {
        return hat.getDescription() + " Decorated with a ribbon.";
    }
}
