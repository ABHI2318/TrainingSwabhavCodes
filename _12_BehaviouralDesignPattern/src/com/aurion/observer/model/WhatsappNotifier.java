package com.aurion.observer.model;

public class WhatsappNotifier implements INotifier {

	@Override
	public void getNotification(Account account, double amount, String message) {
		System.out.println(message+amount);
		System.out.println("your total balance is  "+account.getBalance()+"notifcation from whatsapp ");
		
		
	}

}
