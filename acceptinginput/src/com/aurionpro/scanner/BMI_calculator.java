package com.aurionpro.scanner;

import java.util.Scanner;

public class BMI_calculator {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        // Taking weight in kilograms
        System.out.println("Enter the weight in kilograms: ");
        float weight = scanner.nextFloat();
        
        // Taking height in centimeters
        System.out.println("Enter the height in centimeters: ");
        int heightInCm = scanner.nextInt();
        
     
        double heightInMeters = heightInCm / 100.0;
        
     
        double bmi = weight / (heightInMeters * heightInMeters);
        
       
        System.out.println("The BMI is: " + bmi);
        
        
    }

}
