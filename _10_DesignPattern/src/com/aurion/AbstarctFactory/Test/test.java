package com.aurion.AbstarctFactory.Test;

import com.aurion.AbstarctFactory.model.ICar;
import com.aurion.AbstarctFactory.model.ICarFactory;
import com.aurion.AbstarctFactory.model.MahindraFactory;

public class test {

	public static void main(String[] args) {
		ICarFactory factory=new MahindraFactory();
		ICar car=factory.make();
		System.out.println(car);
		
	}

}
