package com.aurion.model;

public class EconomyRide implements Iride {
    private double baseFare;
    private double perKmRate;

    
    public EconomyRide(double baseFare, double perKmRate) {
        this.baseFare = baseFare;
        this.perKmRate = perKmRate;
    }

    
    public double getBaseFare() {
        return baseFare;
    }

    public double getPerKmRate() {
        return perKmRate;
    }

    
    public void setBaseFare(double baseFare) {
        this.baseFare = baseFare;
    }

    public void setPerKmRate(double perKmRate) {
        this.perKmRate = perKmRate;
    }

  
    @Override
    public double calculateFare(double distance, double surgeprice) {
        return (baseFare + perKmRate * distance) * surgeprice;
    }
}
