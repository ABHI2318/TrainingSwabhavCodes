package com.aurion.strategy.model;

public class Creditcard implements IPaymentStrategy {
	private String cardnumber;

	public Creditcard(String cardnumber) {
		super();
		this.cardnumber = cardnumber;
	}

	@Override
	public void pay(int amount) {
		System.out.println("paid "+amount+" using creditcard");
		
	}

}
