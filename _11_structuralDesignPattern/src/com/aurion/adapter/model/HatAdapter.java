package com.aurion.adapter.model;

public  class HatAdapter implements IItem {
	public HatAdapter(Hat hat) {
		super();
		this.hat = hat;
	}

	Hat hat=new Hat("virat", "puma", 36, 2);

	@Override
	public double getPrice() {
		
		return hat.getBaseprice()+hat.getTax();
	}

	@Override
	public String getName() {
		return hat.getLongname()+" "+hat.getShortname();
	}
}
