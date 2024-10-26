package com.aurion.facade.Account.model;

public class SavingAccount implements IAccount {
     private int id;
     private String name;
     private double amount;
	
	

	@Override
	public String toString() {
		return "SavingAccount [id=" + id + ", name=" + name + "]";
	}

	public SavingAccount(int id, String name,double amount) {
		super();
		this.id = id;
		this.name = name;
		this.amount=amount;
	}

	@Override
	public void credit(double amount) {
		System.out.println("the money credit in saving account is "+amount);
		
	}

	@Override
	public void debit(double amount) {
		System.out.println("the money debit in saving account is "+amount);
		
	}

}
