package com.aurion.proxy.test;

import com.aurion.proxy.model.DataBaseExecuterProxy;
import com.aurion.proxy.model.IDatabaseExecuter;

public class proxymodel {

	public static void main(String[] args) {
		IDatabaseExecuter  admin=new DataBaseExecuterProxy("Admin","Admin@123" );
		admin.executeDataBase("Delete");
		
		IDatabaseExecuter nonadmin=new DataBaseExecuterProxy("Admin", "Admin123");
		nonadmin.executeDataBase("Delete");
	}

}