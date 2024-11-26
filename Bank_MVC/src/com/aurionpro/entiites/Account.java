package com.aurionpro.entiites;

import java.util.ArrayList;
import java.util.List;

public class Account 
{
	private int accountNumber;
	private double accountBalance;
	private List<Transaction> transactions = new ArrayList<Transaction>();
	
	public Account(int accountNumber) {
		super();
		this.accountNumber = accountNumber;
		
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	public List<Transaction> getTransaction() {
		return transactions;
	}
	public void setTransaction(Transaction transaction) {
		transactions.add(transaction);
	}
	
	

}
