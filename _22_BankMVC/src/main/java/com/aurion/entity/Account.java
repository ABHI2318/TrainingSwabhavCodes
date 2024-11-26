package com.aurion.entity;

import java.util.ArrayList;
import java.util.List;

public class Account {
	private int accountNumber;
	private double accountbalance;
	private List<Transaction> transactions=new ArrayList<>();
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
	public double getAccountbalance() {
		return accountbalance;
	}
	public void setAccountbalance(double accountbalance) {
		this.accountbalance = accountbalance;
	}
	public List<Transaction> getTransactions() {
		return transactions;
	}
	public void setTransactions(List<Transaction> transactions) {
		this.transactions = transactions;
	}
	
}
