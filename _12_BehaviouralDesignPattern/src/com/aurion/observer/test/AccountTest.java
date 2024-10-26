package com.aurion.observer.test;

import java.util.Scanner;

import com.aurion.observer.model.Account;
import com.aurion.observer.model.EmailNotifier;
import com.aurion.observer.model.INotifier;
import com.aurion.observer.model.SmsNotifier;
import com.aurion.observer.model.WhatsappNotifier;

public class AccountTest {

	public static void main(String[] args) {

		Account account = new Account(101, "abhishek", 233);

		INotifier Whatsapp = new WhatsappNotifier();
		account.addNotifier(Whatsapp);
		INotifier sms = new SmsNotifier();
		account.addNotifier(sms);
//	 	INotifier Email=new EmailNotifier();
//		account.addNotifier(Email);
		account.credit(44);
		account.display();
		account.debit(300);
		account.display();

//		Account account2 = new Account(101, "tausif", 32000);
//		INotifier email = new EmailNotifier();
//		account2.addNotifier(email);
//		account2.credit(34);
//		account2.display();
//			account2.display();

//		Scanner scanner = new Scanner(System.in);
//		boolean operating = true;
//		while (operating) {
//			System.out.println("enter the choice 1.Email notifier 2.credit 3.debit 4.exit");
//			int choice = scanner.nextInt();
//			switch (choice) {
//			case 1:
//				boolean choose = true;
//				while (choose) {
//					System.out.println("select option to get notification");
//					System.out.println("1.Email 2.Sms 3.Whatsapp 4.Exit");
//					int chooose = scanner.nextInt();
//					switch (chooose) {
//					case 1:
//						INotifier email1 = new EmailNotifier();
//						account.addNotifier(email1);
//						break;
//
//					case 2:
//						INotifier sms2 = new SmsNotifier();
//						account.addNotifier(sms2);
//						break;
//
//					case 3:
//						INotifier Whatsapp1 = new WhatsappNotifier();
//						account.addNotifier(Whatsapp1);
//						break;
//
//					case 4:
//						choose = false;
//					default:
//						System.out.println("enter valid choice");
//
//					}
//				}
//				
//			case 2:
//				if(account.g)
//			}
//		}

	}

}
