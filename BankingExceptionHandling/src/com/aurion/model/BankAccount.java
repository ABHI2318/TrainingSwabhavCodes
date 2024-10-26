package com.aurion.model;

import com.aurion.Exceptions.NegativeAmountException;

public abstract class BankAccount {
	
	static private int totalAccountNo; 
	private String name;
	private int accountNo;
	private double balance;
	
	public BankAccount(String name , int accountNo, double balance  ){
		this.name = name;
		this.accountNo =accountNo;
		if(balance < 0 ) {
			throw new NegativeAmountException();
		}
		this.balance = balance;
		totalAccountNo++;
		
	}

	public static int getTotalAccountNo() {
		return totalAccountNo;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	 public abstract void deposit(double amount);
	    
	 public abstract void withdraw(double amount);

}
