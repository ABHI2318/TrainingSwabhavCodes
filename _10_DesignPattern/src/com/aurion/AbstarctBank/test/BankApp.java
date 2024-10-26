package com.aurion.AbstarctBank.test;
import com.aurion.AbstractBank.model.CreateCurrentAccount;
import com.aurion.AbstractBank.model.CreateSavingAccount;
import com.aurion.AbstractBank.model.IAccountFactory;
import com.aurion.AbstractBank.model.IAccount;


public class BankApp {

	public static void main(String[] args) {
		IAccountFactory account=new CreateSavingAccount ();
		IAccount saving=account.makeaccount();
    System.out.println(saving);
    
    IAccountFactory currentaccount=new CreateCurrentAccount ();
	IAccount curent=currentaccount.makeaccount();
	curent.credit(34);
	saving.credit(345);
System.out.println(curent);
	}

}
