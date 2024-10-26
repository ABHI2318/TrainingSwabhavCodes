package com.aurionpro.treasure;

import java.util.Scanner;

public class MeterCharges {

    public static void main(String[] args) {
        // Scanner to read input from user
        Scanner scanner = new Scanner(System.in);

       
        System.out.println("Read the number of units consumed: ");
        int units = scanner.nextInt();

        // Initial meter charge
        int meterCharge = 75;
        int charge;

        // Calculate the charge based on the number of units consumed
        if (units <= 100) {
            charge = units * 5;
        } else if (units <= 250) {
            charge = units * 10;
        } else {
            charge = units * 20;
        }

        // Calculate the total water bill
        int totalWaterBill = charge + meterCharge;

        // Print the total water bill
        System.out.println("Total Water Bill: " + totalWaterBill);
    }
}
