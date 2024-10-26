package com.aurion.model;

public class Bonds implements  IReturns{
	@Override
    public void calculateReturns(double investmentAmount, double marketCondition) {
      
		System.out.println("Your returns on investement is: "+( investmentAmount * (1 + marketCondition * 0.05)));
}

	
	}

