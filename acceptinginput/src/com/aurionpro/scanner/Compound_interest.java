package com.aurionpro.scanner;

import java.util.Scanner;

public class Compound_interest {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the prinecipal amount: ");
		int principal=scanner.nextInt();
		System.out.println("Enter the ROI amount: ");
		float roi=scanner.nextFloat();
		System.out.println("Enter the yeras amount: ");
		int time=scanner.nextInt();
		  double amount = principal * Math.pow((1 + roi / 100), time);
	        
	        // Compound Interest = Amount - Principal
	        double compoundInterest = amount - principal;
	        
	        // Output the results
	        System.out.println("Amount after " + time + " years: " + amount);
	        System.out.println("Compound Interest: " + compoundInterest);
			
		

	}

}
