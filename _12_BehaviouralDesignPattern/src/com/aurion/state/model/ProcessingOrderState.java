package com.aurion.state.model;

public class ProcessingOrderState implements IOrderState {

	@Override
	public void next(OrderContext ordercontext) {
		ordercontext.setOrderstate(new ConfirmedOrderState());
		
	}

	@Override
	public void previous(OrderContext ordercontext) {
	ordercontext.setOrderstate(new NewOrderState());
		
	}

	@Override
	public void printstatus() {
	System.out.println("order is currently being processed ");
		
	}

}
