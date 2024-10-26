package com.aurion.state.test;

import com.aurion.state.model.IOrderState;
import com.aurion.state.model.OrderContext;

public class OrderApp {
	public static void main(String[] args) {
		
		
		OrderContext order=new OrderContext();
		order.printstatus();
		order.next();
	
		order.printstatus();
		order.next();
		order.printstatus();
		order.previous();
		order.printstatus();
		}

}
