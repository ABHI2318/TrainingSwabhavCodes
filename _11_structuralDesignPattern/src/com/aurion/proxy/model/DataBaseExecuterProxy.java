package com.aurion.proxy.model;

public class DataBaseExecuterProxy implements IDatabaseExecuter {

	boolean ifadmin;
	DatabaseExecuterImpl dbexecuter;

	public DataBaseExecuterProxy(String name, String password) {
		if (name == "Admin" && password == "Admin@123") {
			ifadmin = true;
		}
		dbexecuter = new DatabaseExecuterImpl();
	}

	@Override
	public void executeDataBase(String query) {
		if (ifadmin) {
			dbexecuter.executeDataBase(query);
		} else {
			if (query.equals("Delete")) {
				System.out.println("Delete not allowed for non-admin");
			}
		}
	}

}
