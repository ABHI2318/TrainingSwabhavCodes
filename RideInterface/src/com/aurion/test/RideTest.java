package com.aurion.test;

import com.aurion.model.LuxuryRide;
import com.aurion.model.PremiumRide;
import com.aurion.model.RideModel;
import com.aurion.model.EconomyRide;

public class RideTest {
    public static void main(String[] args) {
        
        EconomyRide economyRide = new EconomyRide(10, 5);  
        RideModel rideApp = new RideModel(economyRide);
        System.out.println("Economy Fare: " + rideApp.calculateFare(15, 1.5));  
        
       
        PremiumRide premiumRide = new PremiumRide(20, 10);  
        rideApp = new RideModel(premiumRide);
        System.out.println("Premium Fare: " + rideApp.calculateFare(15, 2)); 
        
        
        LuxuryRide luxuryRide = new LuxuryRide(30, 15);  
        rideApp = new RideModel(luxuryRide);
        System.out.println("Luxury Fare: " + rideApp.calculateFare(15, 2.5));  
    }
}
