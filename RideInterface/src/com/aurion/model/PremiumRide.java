package com.aurion.model;

public class PremiumRide implements Iride{
	
	 private double baseFare;
	    private double perKmRate;
		public PremiumRide(double baseFare, double perKmRate) {
			super();
			this.baseFare = baseFare;
			this.perKmRate = perKmRate;
		}
		public double getBaseFare() {
			return baseFare;
		}
		public void setBaseFare(double baseFare) {
			this.baseFare = baseFare;
		}
		public double getPerKmRate() {
			return perKmRate;
		}
		public void setPerKmRate(double perKmRate) {
			this.perKmRate = perKmRate;
		}
		
		@Override
	    public double calculateFare(double distance, double surgeprice) {
	        return (baseFare + perKmRate * distance) * surgeprice;
	    }

}
