package com.aurion.test;

import java.util.Scanner;

import com.aurion.model.Bonds;
import com.aurion.model.MutualFunds;
import com.aurion.model.Stocks;

public class InvestmentApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		 System.out.println("Select Portfolio Type (1: Stocks, 2: Bonds, 3: Mutual Funds): ");
	        int choice = scanner.nextInt();
	        
	        double investmentAmount;
	        double marketCondition;
	        switch (choice) {
	            case 1:
	            	Stocks  stocks = new Stocks();
	            	 System.out.println("Enter Investment Amount: ");
	                  investmentAmount = scanner.nextDouble();

	                 System.out.println("Enter Market Condition (as a percentage): ");
	                 marketCondition = scanner.nextDouble() / 100;
	                
	                stocks.calculateReturns(investmentAmount, marketCondition);
	                break;
	                
	            case 2:
	            	Bonds  bonds = new Bonds();
	            	System.out.println("Enter Investment Amount: ");
	                 investmentAmount = scanner.nextDouble();

	                System.out.println("Enter Market Condition (as a percentage): ");
	                marketCondition = scanner.nextDouble() / 100;
	                bonds.calculateReturns(investmentAmount, marketCondition);
	                break;
	                
	                
	            case 3:
	            	MutualFunds  funds = new MutualFunds();
	            	System.out.println("Enter Investment Amount: ");
	                investmentAmount = scanner.nextDouble();

	                System.out.println("Enter Market Condition (as a percentage): ");
	                marketCondition = scanner.nextDouble() / 100;
	                funds.calculateReturns(investmentAmount, marketCondition);
	                break;
	                
	            default:
	                System.out.print("Invalid Portfolio Type Selected");
	        }

	}

}

