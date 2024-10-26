package com.aurion.strategy.test;

import com.aurion.strategy.model.Creditcard;
import com.aurion.strategy.model.Paymentcontext;
import com.aurion.strategy.model.Paypal;

public class Test {

	public static void main(String[] args) {
		Paymentcontext context=new Paymentcontext();
		context.setpaymentstrategy(new Creditcard("28383939339"));
		context.makepayment(34);
		
		context.setpaymentstrategy(new Paypal("abhishek"));
		context.makepayment(343);
		
		

	}

}
