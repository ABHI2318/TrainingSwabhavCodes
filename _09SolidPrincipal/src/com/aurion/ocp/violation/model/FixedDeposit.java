package com.aurion.ocp.violation.model;

public class FixedDeposit {
	private int accountNumber;
	private String name;
	private double principalAmount;
	public double interestRate;
	private int duration;
	private FestivalOffer offer;
	public FixedDeposit(int accountNumber, String name, double principalAmount, int duration, String offer) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		this.principalAmount = principalAmount;
		this.duration = duration;
		this.offer = FestivalOffer.valueOf(offer);
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
	public FestivalOffer getOffer() {
		return offer;
	}
	public double getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	public FixedDeposit(int accountNumber, String name, double principalAmount, double interestRate, int duration,
			FestivalOffer offer) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		this.principalAmount = principalAmount;
		this.interestRate = interestRate;
		this.duration = duration;
		this.offer = offer;
	}
	public void setOffer(FestivalOffer offer) {
		this.offer = offer;
	}
	
	public double calculateInterest() {
		String festival=getOffer().name();
		double interest=0;
		switch(festival) {
		case "Diwali":
			setInterestRate(8);
		interest=( getPrincipalAmount()*getDuration()*getInterestRate()/100);
		break;
		case "Holi":
			setInterestRate(8.5);
		interest= getPrincipalAmount()*getDuration()*getInterestRate()/100;
		break;
		case "Christmas":
			setInterestRate(7.5);
		interest= getPrincipalAmount()*getDuration()*getInterestRate()/100;
		break;
		case "NewYear":
			setInterestRate(7);
		interest= getPrincipalAmount()*getDuration()*getInterestRate()/100;
		break;
		
		}
		return interest;
	}
	@Override
	public String toString() {
		return "FixedDeposit [accountNumber=" + accountNumber + ", name=" + name + ", principalAmount="
				+ principalAmount + ", interestRate=" + interestRate + ", duration=" + duration + ", offer=" + offer
				+ ", calculateInterest()=" + calculateInterest() + "]";
	}
	

}
