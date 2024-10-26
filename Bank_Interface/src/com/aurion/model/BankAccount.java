package com.aurion.model;

public abstract class BankAccount implements ITransactions {
	private String name;
	private int accountno;
	private double balance;
	public BankAccount(String name, int accountno, double balance) {
		super();
		this.name = name;
		this.accountno = accountno;
		this.balance = balance;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAccountno() {
		return accountno;
	}

	public void setAccountno(int accountno) {
		this.accountno = accountno;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
}
