package com.aurion.AbstarctFactory.model;

public class MarutiFactory implements ICarFactory{

	@Override
	public ICar make() {
	ICar	car=new marauti();
		return car;
	}

}
