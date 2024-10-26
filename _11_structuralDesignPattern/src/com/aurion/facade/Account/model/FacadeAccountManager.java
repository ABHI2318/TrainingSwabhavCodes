package com.aurion.facade.Account.model;

public class FacadeAccountManager {
  public void getSavingAccount() {
	  IAccountFactory savingaccount=new CreateSavingAccount();
	  IAccount account=savingaccount.makeaccount();
	  account.credit(34);
	  account.debit(23);
  }
  
  public void getCurrentAccount() {
	  IAccountFactory currentAccount=new CreateCurrentAccount();
	  IAccount account=currentAccount.makeaccount();
	  account.credit(230);
	  account.debit(230);
  }
}
