package com.aurion.accounts;

import com.aurion.exception.MinAmountException;

public abstract class BankAccount { 
	 private String name; 
	 private int accountNumber; 
	 private double balance; 
	
	  
	 public BankAccount(String name, int accountNumber, double balance, double amount) {
		super();
		this.name = name;
		this.accountNumber = accountNumber;
		this.balance = balance;
	
		
	}
	public String getName() { 
	  return name; 
	 } 
	 public void setName(String name) { 
	  this.name = name; 
	 } 
	 public int getAccountNumber() { 
	  return accountNumber; 
	 } 
	 public void setAccountNumber(int accountNumber) { 
	  this.accountNumber = accountNumber; 
	 } 
	 public double getBalance() { 
	  return balance; 
	 } 
	 public void setBalance(double balance) { 
	  this.balance = balance; 
	 } 
	  
	  
	
	  
	 public abstract void deposit(double amount); 
	  
	 public abstract void withdrawal(double amount); 
	   
	}
