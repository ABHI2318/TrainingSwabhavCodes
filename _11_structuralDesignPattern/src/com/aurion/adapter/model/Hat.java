package com.aurion.adapter.model;

public class Hat {
	private String shortname;
	private String longname;
	private double baseprice;
	private double tax;
	public Hat(String shortname, String longname, double baseprice, double tax) {
		super();
		this.shortname = shortname;
		this.longname = longname;
		this.baseprice = baseprice;
		this.tax = tax;
	}
	
	public String getShortname() {
		return shortname;
	}
	public void setShortname(String shortname) {
		this.shortname = shortname;
	}
	public String getLongname() {
		return longname;
	}
	public void setLongname(String longname) {
		this.longname = longname;
	}
	public double getBaseprice() {
		return baseprice;
	}
	public void setBaseprice(double baseprice) {
		this.baseprice = baseprice;
	}
	public double getTax() {
		return tax;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}

}
