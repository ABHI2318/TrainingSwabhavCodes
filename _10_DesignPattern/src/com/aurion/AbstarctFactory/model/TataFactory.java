package com.aurion.AbstarctFactory.model;

public class TataFactory implements ICarFactory{

	@Override
	public ICar make() {
		ICar car=new tata();
		return car;
	}
	
	

}