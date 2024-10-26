package com.aurionpro.commandline;

public class Bodyindex {

	public static void main(String[] args) {
		// Write a program that calculates the Body Mass Index (BMI) based on user input for weight (in kilograms) and height (in meters).
           
		int weight1=Integer.parseInt(args[0]);
		int height1=Integer.parseInt(args[1]);
		
		double bmi = weight1 / (height1 * height1);
		
		System.out.println("the bmi is "+bmi);
	}

}
