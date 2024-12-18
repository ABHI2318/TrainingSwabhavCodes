package com.aurion.decorator.model;

public class WheelAlignment extends CarServiceDecorator{
	 ICarService carservice;

	public WheelAlignment(ICarService carservice) {
		
		this.carservice = carservice;
	}

	@Override
	public double getCost() {
		
		return carservice.getCost()+1500;
	}

}
