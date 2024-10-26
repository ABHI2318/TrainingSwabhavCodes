package com.aurion.model.Factory.model;

public class CarFactory {
	private static ICar car;
	public static ICar makeCar(CarType type) {
		
		if(type==CarType.maruti)
			car=new marauti();
		if(type==CarType.mahindra)
			car=new mahindra();
		if(type==CarType.tata)
			car=new tata();
		return car;
		
	}

}
