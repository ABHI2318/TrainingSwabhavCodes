package com.aurion.strategy.model;

public class Paymentcontext {
	private IPaymentStrategy strategy;

	public void setpaymentstrategy(IPaymentStrategy strategy) {
		this.strategy = strategy;
	}

	public void makepayment(int amount) {
		strategy.pay(amount);

	}

}
