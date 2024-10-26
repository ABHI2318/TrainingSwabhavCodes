package com.aurion.model;

public class RideModel {
    private Iride rideType;

    
    public RideModel(Iride rideType) {
        this.rideType = rideType;
    }

    
    public double calculateFare(double distance, double surgePrice) {
        return rideType.calculateFare(distance, surgePrice);
    }
}
