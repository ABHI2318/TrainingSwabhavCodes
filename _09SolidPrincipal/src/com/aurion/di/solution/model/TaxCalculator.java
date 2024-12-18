package com.aurion.di.solution.model;

public class TaxCalculator extends DBlogger {
	private int amount;
	private int rate;
	private IDBlogger blogger;

	public TaxCalculator(int amount,int rate,IDBlogger blogger) {
		super();
		this.amount = amount;
		this.rate = rate;
		this.blogger = blogger;
	}

	

	@Override
	public String toString() {
		return "TaxCalculator [amount=" + amount + ", rate=" + rate + ", blogger=" + blogger + "]";
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

	public IDBlogger getBlogger() {
		return blogger;
	}

	public void setBlogger(IDBlogger blogger) {
		this.blogger = blogger;
	}

	public void taxcalculate() {
		int tax = 0;
		try {
			tax = amount / rate;
			System.out.println("tax is " + tax);
		} catch (Exception e) {
			blogger.blogger(e.getMessage());
		}
	}
}