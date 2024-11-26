package com.aurion.exceptions;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.aurion.service.DBConnection;

public class customerListTest {
	 public static void main(String[] args) {
	        String query = "SELECT customerId, firstName, lastName, email FROM Customer";
	        try (Connection conn = DBConnection.getConnection();
	             PreparedStatement stmt = conn.prepareStatement(query);
	             ResultSet rs = stmt.executeQuery()) {
	            
	            while (rs.next()) {
	                System.out.println("Customer: " + rs.getInt("customerId") + ", " 
	                                    + rs.getString("firstName") + " " 
	                                    + rs.getString("lastName") + ", " 
	                                    + rs.getString("email"));
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
}
