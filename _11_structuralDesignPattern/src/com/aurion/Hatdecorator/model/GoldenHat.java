package com.aurion.Hatdecorator.model;

public class GoldenHat extends HatDecorator {

    public GoldenHat(IHat hat) {
        this.hat = hat; 
    }

    @Override
    public String getName() {
        return hat.getName() + " with golden name";
    }

    @Override
    public int getPrice() {
        return hat.getPrice() + 500; 
    }

    @Override
    public String getDescription() {
        return hat.getDescription() + " Enhanced with a golden touch.";
    }
}
