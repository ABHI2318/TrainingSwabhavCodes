package com.aurion.state.model;

public class ConfirmedOrderState implements IOrderState{

	@Override
	public void next(OrderContext ordercontext) {
	System.out.println("order is being confirmed");	
	}

	@Override
	public void previous(OrderContext ordercontext) {
	ordercontext.setOrderstate(new ProcessingOrderState());
		
	}

	@Override
	public void printstatus() {
		System.out.println("order is shipped");
	}

}
