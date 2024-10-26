package com.aurion.model;

import com.aurion.Exceptions.MinimumAmountException;
import com.aurion.Exceptions.NegativeAmountException;

public class SavingAccount extends BankAccount {
	 public double interestrate;
     public static int savingAccountNo;
     
    
     
     public SavingAccount(String name,int accountNumber,double balance,double interestrate) {
    	 super(name, accountNumber, balance);
    	 this.interestrate = interestrate;
    	 savingAccountNo++;
    	 
     }

	@Override
	public void deposit(double amount) {
		if(amount < 0 )
			throw new NegativeAmountException();
		setBalance(getBalance()+amount);
//		System.out.println("balance deposited is " + getBalance());
		
	}

	@Override
	public void withdraw(double amount) {
		if(getBalance() > 500)
			throw new MinimumAmountException();
		setBalance(getBalance()-amount);
	//	System.out.println("amount withdrawn is: " + getBalance());
	}
	public void  displaySavingAccountCount(){
		System.out.println("No of saving Account: "+savingAccountNo);
		System.out.println("No of total Account: "+getTotalAccountNo());
	}
}
