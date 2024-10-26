package com.aurion.ocp.solution.model;

import com.aurion.ocp.violation.model.FestivalOffer;
import com.aurion.ocp.solution.model.*;
public class FixedDeposit {
	private int accountNumber;
	private String name;
	private double principalAmount;
	
	private int duration;
	private IFestivaloffer offer;
	public FixedDeposit(int accountNumber, String name, double principalAmount, int duration, IFestivaloffer offer) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		this.principalAmount = principalAmount;
		this.duration = duration;
		this.offer = offer;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrincipalAmount() {
		return principalAmount;
	}
	public void setPrincipalAmount(double principalAmount) {
		this.principalAmount = principalAmount;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public IFestivaloffer getOffer() {
		return offer;
	}
	

	
	public FixedDeposit(int accountNumber, String name, double principalAmount, double interestRate, int duration,
			IFestivaloffer offer) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		this.principalAmount = principalAmount;
		
		this.duration = duration;
		this.offer = offer;
	}
	public void setOffer(IFestivaloffer offer) {
		this.offer = offer;
	}
	
	
	
	@Override
	public String toString() {
		return "FixedDeposit [accountNumber=" + accountNumber + ", name=" + name + ", principalAmount="
				+ principalAmount + ", interestRate=" +  ", duration=" + duration + ", offer=" + offer
				+ ", calculateInterest()=" + calculateInterest(offer) + "]";
	}
	public double  calculateInterest(IFestivaloffer offer) {
	return  getPrincipalAmount()*getDuration()*offer.getInterestRate()/100;
	
	}

}
