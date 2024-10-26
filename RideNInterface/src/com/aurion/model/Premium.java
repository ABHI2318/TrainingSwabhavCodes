package com.aurion.model;

public class Premium extends Ride{
	public Premium(int distance) {
		super(distance);
		
	}



	private int surgePrice = 100;
	
	
	
	@Override
	public int calculatefare() {
		if( getDistance()> 0 ) {
			setPrice(surgePrice+(getDistance()*10));
			System.out.println("Your price for the ride is: "+getPrice());
			return 0;
		}
		System.out.println("Please enter valid distance!!");
		return 0;
		
	}
}
