package com.aurion.observer.model;

public class SmsNotifier implements INotifier {

	@Override
	public void getNotification(Account account, double amount, String message) {
		System.out.println("notification from sms ");
		System.out.println(message+amount);
		System.out.println("your total balance is "+account.getBalance()+"notification from sms");
		
	}

}
