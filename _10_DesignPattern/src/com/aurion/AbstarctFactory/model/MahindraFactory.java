package com.aurion.AbstarctFactory.model;

public class MahindraFactory implements ICarFactory{

	@Override
	public ICar make() {
		ICar car =new mahindra();
				return car;
	}
	

}
