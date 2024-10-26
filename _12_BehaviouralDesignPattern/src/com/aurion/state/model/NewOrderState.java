package com.aurion.state.model;

public class NewOrderState implements IOrderState{

	@Override
	public void next(OrderContext ordercontext) {
		ordercontext.setOrderstate(new ProcessingOrderState());
	
	}

	@Override
	public void previous(OrderContext ordercontext) {
		System.out.println("The order is in its initial state.");
		
	}

	@Override
	public void printstatus() {
	System.out.println("order is in new state");
		
	}

}
