package com.aurion.strategy.model;

public class Paypal implements IPaymentStrategy{
	private String uniquepaypalnumber;

	public Paypal(String uniquepaypalnumber) {
		super();
		this.uniquepaypalnumber = uniquepaypalnumber;
	}

	@Override
	public void pay(int amount) {
		System.out.println("paid "+amount +" using paypal");
		
	}

}
