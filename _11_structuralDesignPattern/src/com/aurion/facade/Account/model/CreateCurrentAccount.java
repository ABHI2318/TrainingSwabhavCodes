package com.aurion.facade.Account.model;

public class CreateCurrentAccount  implements IAccountFactory{

	@Override
	public IAccount makeaccount() {
		IAccount account=new CurrentAccount(23,"tausif",456);
		return account;
		
	}

}
