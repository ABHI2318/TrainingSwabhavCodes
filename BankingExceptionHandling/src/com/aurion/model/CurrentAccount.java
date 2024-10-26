package com.aurion.model;

import com.aurion.Exceptions.NegativeAmountException;
import com.aurion.Exceptions.OverdraftLimitExceedException;

public class CurrentAccount extends BankAccount{

	private static int CurrentAccountNo; 
	private double overdraft;
	

	
	public CurrentAccount(String name , int accountNo, double balance,double overdraft ){
		super(name,accountNo,balance);
		this.overdraft = overdraft;
		CurrentAccountNo++;
		
	}
	@Override
	public void deposit(double amount) {
		if(amount < 0 )
			throw new NegativeAmountException();
		setBalance(getBalance()+amount);
		System.out.println("you amount is :" );
		
	}

	@Override
	public void withdraw(double amount) {
		
		if(getBalance()+overdraft - amount >=0) {
			setBalance(getBalance()-amount);
			System.out.println("the balance amount is: " +getBalance());
		}
		throw new OverdraftLimitExceedException();
	}
	public void  displayCuurentAccountCount(){
		System.out.println("No of current Account: "+CurrentAccountNo);
		System.out.println("No of total Account: "+getTotalAccountNo());
	}
	
	
}
