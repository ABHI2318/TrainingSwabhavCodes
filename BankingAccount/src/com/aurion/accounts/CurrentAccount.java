package com.aurion.accounts;

public class CurrentAccount extends BankAccount { 
	 private double interestRate; 
	 private int overdraftAmount = 25000; 
	  
	 public CurrentAccount(String name, int accountNumber, double balance, double interestRate) { 
	  super(name, accountNumber, balance, interestRate); 
	  this.interestRate = interestRate; 
	 } 
	  
	 @Override 
	 public void deposit(double amount) { 
	  setBalance(getBalance() + amount);  
	 }  
	 @Override 
	 public void withdrawal(double amount) { 
	  if(getBalance() + overdraftAmount - amount >= 0) { 
	   setBalance(getBalance() - amount); 
	  } 
	 } 
	}