package com.aurion.srp.violation.model;

public class Invoice {
	private int id;
	private String name;
	private double amount;
	private double taxPercentage;
	private double taxamount;
	public double getTaxamount() {
		return taxamount;
	}
	public void setTaxamount(double taxamount) {
		this.taxamount = taxamount;
	}
	public Invoice(int id, String name, double amount, double taxPercentage) {
		super();
		this.id = id;
		this.name = name;
		this.amount = amount;
		this.taxPercentage = taxPercentage;
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public double getTaxPercentage() {
		return taxPercentage;
	}
	public void setTaxPercantage(double taxPercentage) {
		this.taxPercentage = taxPercentage;
	}
	
	public void calculateTax() {
		setTaxamount(getAmount()*(getTaxPercentage()/100));
	}
	@Override
	public String toString() {
		return "Invoice [id=" + id + ", name=" + name + ", amount=" + amount + ", taxPercentage=" + taxPercentage
				+ ", taxamount=" + taxamount + "]";
	}

}
