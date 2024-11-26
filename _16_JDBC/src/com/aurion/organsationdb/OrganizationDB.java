package com.aurion.organsationdb;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;


public class OrganizationDB {
	private Connection connection;
	private PreparedStatement statement;
	public void connect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/organisationdb", "root", "1234");
            System.out.println("Connected to the database.");
        } catch (ClassNotFoundException e) {
            System.out.println("JDBC Driver not found.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Failed to connect to the database.");
            e.printStackTrace();
        }
    }
	
	public void selectQuery(String query) {
        ResultSet result = null;
        try {
            statement = connection.prepareStatement(query);
            result = statement.executeQuery();

            ResultSetMetaData metaData = result.getMetaData();
            int columnCount = metaData.getColumnCount();


            for (int i = 1; i <= columnCount; i++) {
                System.out.print(metaData.getColumnName(i) + "\t");
            }
            System.out.println();


            while (result.next()) {
                for (int i = 1; i <= columnCount; i++) {
                    System.out.print(result.getString(i) + "\t");
                }
                System.out.println();
            }
        } catch (SQLException e) {
            System.out.println("An error occurred while executing the query.");
            e.printStackTrace();
        }
    }
	
	public void close() {
        try {
            if (connection != null) {
                connection.close();
                System.out.println("Database connection closed.");
            }
        } catch (SQLException e) {
            System.out.println("Error closing the connection.");
            e.printStackTrace();
        }
    }

}