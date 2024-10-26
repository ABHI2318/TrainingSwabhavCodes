package com.aurion.facade.Account.model;

public class CreateSavingAccount implements IAccountFactory{

	@Override
	public IAccount makeaccount() {
		IAccount account=new SavingAccount(23,"abhisehk", 34);
		return account;
	}

}
