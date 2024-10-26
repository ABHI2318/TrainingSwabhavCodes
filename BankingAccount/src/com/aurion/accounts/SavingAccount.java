package com.aurion.accounts;

public class SavingAccount extends BankAccount { 
	 
	 private double interestRate; 
	 
	 public SavingAccount(String name, int accountNumber, double balance, double interestRate) { 
	  super(name, accountNumber, balance, interestRate); 
	  this.interestRate = interestRate; 
	 } 
	  
	 @Override 
	 public void deposit(double amount) { 
	  setBalance(getBalance() + amount); 
	 }  
	 @Override 
	 public void withdrawal(double amount) { 
	  if(amount<= getBalance()) { 
	   setBalance(getBalance() - amount); 
	  } 
	 } 
	}