package com.aurion.state.model;

public class OrderContext {
	
	private IOrderState orderstate;
	
	public OrderContext() {
		orderstate=new NewOrderState();
		}

	

	public void setOrderstate(IOrderState orderstate) {
		this.orderstate = orderstate;
	}



	public void next() {
		orderstate.next(this);
	}



	public void previous() {
		orderstate.previous(this);
	}



	public void printstatus() {
		orderstate.printstatus();
	}
	


}
