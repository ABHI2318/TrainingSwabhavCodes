package com.aurion.test;

import com.aurion.model.DBconnection;

public class SingletonTest {

	public static void main(String[] args) {
	DBconnection connection1=DBconnection.getConnection();
	System.out.println(connection1.hashCode());
	DBconnection connection2=connection1;
	System.out.println(connection2.hashCode());
	DBconnection connection3=DBconnection.getConnection();
	System.out.println(connection3.hashCode());
 	}

}
