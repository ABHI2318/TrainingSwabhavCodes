package com.aurion.AbstractBank.model;

public class CurrentAccount implements IAccount{
	
	private int id;
	private String name;
	private int amount;

	public CurrentAccount(int id, String name, int amount) {
		super();
		this.id = id;
		this.name = name;
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "CurrentAccount [id=" + id + ", name=" + name + ", amount=" + amount + "]";
	}

	public CurrentAccount(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public void credit(double amount) {
	System.out.println("the amount credit in currentaccount us "+amount);
		
	}

	@Override
	public void debit(double amount) {
		System.out.println("the amount debit in currentaccount is "+amount);
		
	}

}
