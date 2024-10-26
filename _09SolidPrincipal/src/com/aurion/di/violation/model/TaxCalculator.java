package com.aurion.di.violation.model;

public class TaxCalculator {
	private DBLocker logger;

	public TaxCalculator(DBLocker logger) {
		super();
		this.logger = logger;
	}

	public int calculateTax(int amount, int rate) {
		int tax = 0;

		try {
			tax = amount / rate;
			System.out.println("tax is " + tax);
		} catch (ArithmeticException exception) {
			logger.log("divide by zero");

		}
		return tax;
	}

	@Override
	public String toString() {
		return "TaxCalculator with logger: " + logger ;
	}

}
