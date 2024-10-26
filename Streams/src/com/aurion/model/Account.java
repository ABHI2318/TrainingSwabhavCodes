package com.aurion.model;

public class Account{
	private int accountno;
	private String name;
	private double balance;
	public Account(int accountno, String name, double balance) {
		super();
		this.accountno = accountno;
		this.name = name;
		this.balance = balance;
	}
	public int getAccountno() {
		return accountno;
	}
	public void setAccountno(int accountno) {
		this.accountno = accountno;
	}
	@Override
	public String toString() {
		return "Account [accountno=" + accountno + ", name=" + name + ", balance=" + balance + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}

}
