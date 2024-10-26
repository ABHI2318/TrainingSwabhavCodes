package com.aurion.decorator.test;

import com.aurion.decorator.model.CarInspectionService;
import com.aurion.decorator.model.ICarService;
import com.aurion.decorator.model.OilChange;
import com.aurion.decorator.model.WheelAlignment;

public class CarTest {

	public static void main(String[] args) {
	ICarService baseservice=new CarInspectionService();
		System.out.println("base service cost is "+baseservice.getCost());
		
	ICarService oilchange=new OilChange(baseservice);
	System.out.println("oil change cost is "+oilchange.getCost());
	
	
	ICarService whellalign=new WheelAlignment(baseservice);
	System.out.println("wheel cart cost is "+whellalign.getCost());
	
  System.out.println("total cost is "+(baseservice.getCost()+oilchange.getCost()+whellalign.getCost()));
	}

}
