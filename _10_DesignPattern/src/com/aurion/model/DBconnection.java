package com.aurion.model;

public class DBconnection {
//	private static DBconnection connection;
//	//make static varaiable for same instance class so that only one object is created
//	//make the constructor private
//	//and a condition if the variabkle is null then only create new object
//	private DBconnection() {//made private so that driver code cannot access directly
//		
//	}
//	
//	public static DBconnection getConnection() {
//		if(connection==null)
//			connection =new DBconnection();
//		return connection;
//	}
	
    private static DBconnection connection;//making global varaiable 
    
    private DBconnection() {
    	
    }
    public static DBconnection getConnection() {
    	if(connection==null)
    		connection=new DBconnection();
    	return connection;
    }
}
