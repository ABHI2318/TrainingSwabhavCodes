package com.aurion.proxy.model;

public class DatabaseExecuterImpl implements IDatabaseExecuter {

	@Override
	public void executeDataBase(String query) {
		System.out.println("going to execute query "+query);
		
	}

}
