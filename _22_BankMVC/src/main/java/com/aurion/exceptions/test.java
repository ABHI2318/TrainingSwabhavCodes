package com.aurion.exceptions;

import java.sql.Connection;

import com.aurion.service.DBConnection;

public class test {
	 public static void main(String[] args) {
	        try (Connection conn = DBConnection.getConnection()) {
	            if (conn != null) {
	                System.out.println("Database connection established successfully!");
	            } else {
	                System.out.println("Failed to establish database connection.");
	            }
	        } catch (Exception e) {
	            System.out.println("Error connecting to the database:");
	            e.printStackTrace();
	        }
	    }

}
