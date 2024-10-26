package com.aurion.decorator.model;

public class OilChange extends CarServiceDecorator{
  ICarService carservice;
  
	public OilChange(ICarService carservice) {
	
	this.carservice = carservice;
}
	@Override
	public double getCost() {
		
		return carservice.getCost()+500;
	}

}
