package com.aurion.facade.Account.model;

public class CurrentAccount implements IAccount{
	
	private int id;
	private String name;
	private double amount;

	public CurrentAccount(int id, String name, double amount) {
		super();
		this.id = id;
		this.name = name;
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "CurrentAccount [id=" + id + ", name=" + name + ", amount=" + amount + "]";
	}

	
	@Override
	public void credit(double amount) {
		if(amount>0) {
			this.amount+=amount;
			System.out.println("amount credit is "+amount);
			System.out.println("new balance is "+this.amount);
		}
	}

	@Override
	public void debit(double amount) {
		if(amount>0) {
			this.amount-=amount;
			System.out.println("amount debit is "+amount);
			System.out.println("new balance is "+this.amount);
		}
		
		
	}

}
