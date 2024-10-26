package com.aurionpro.commandline;

public class Compound_intersest {

	public static void main(String[] args) {
		// Write a program to calculate the compound interest given principal, rate of interest, and time.
		int principal=Integer.parseInt(args[0]);
		int roi=Integer.parseInt(args[1]);
		int time=Integer.parseInt(args[2]);
	
		// Formula: Amount = P(1 + R/100)^t
        double amount = principal * Math.pow((1 + roi / 100), time);
        
        // Compound Interest = Amount - Principal
        double compoundInterest = amount - principal;
        
        // Output the results
        System.out.println("Amount after " + time + " years: " + amount);
        System.out.println("Compound Interest: " + compoundInterest);
		
		

	}

}
