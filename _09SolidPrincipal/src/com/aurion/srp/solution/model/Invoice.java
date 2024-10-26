package com.aurion.srp.solution.model;

public class Invoice {
	private int id;
	private String name;
	private double amount;
	private double taxPercentage;
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
	public void setTaxPercentage(double taxPercentage) {
		this.taxPercentage = taxPercentage;
	}
	public Invoice(int id, String name, double amount, double taxPercentage) {
		super();
		this.id = id;
		this.name = name;
		this.amount = amount;
		this.taxPercentage = taxPercentage;
	}

}
