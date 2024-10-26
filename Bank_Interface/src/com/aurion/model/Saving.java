package com.aurion.model;

public class Saving extends BankAccount {
	
	private double amount;
	public Saving(String name, int accountno, double balance) {
		super(name,accountno,balance);
	
	}



	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
	

	@Override
	public void deposit(int amount) {
		setAmount(amount);
		setBalance(getBalance()+getAmount());
		System.out.println("your balance is "+getBalance());
		
	}

	@Override
	public void withdraw(int amount) {
		setAmount(amount);
		setBalance(getBalance()-getAmount());
		System.out.println("your balance is "+getBalance());
		
	}
	

}
