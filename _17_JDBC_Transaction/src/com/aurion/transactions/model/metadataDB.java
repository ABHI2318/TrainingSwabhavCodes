package com.aurion.transactions.model;

import java.sql.*;

public class metadataDB {
    private Connection connection = null;

   
    public void connect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/transaction", "root", "1234");
            System.out.println("Connection successful");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

   
    public void displayDatabaseMetadata() {
        try {
            if (connection == null) {
                System.out.println("Connection is not established");
                return;
            }
            DatabaseMetaData databaseMetaData = connection.getMetaData();
            System.out.println("Database Product Name: " + databaseMetaData.getDatabaseProductName());
            System.out.println("Database Product Version: " + databaseMetaData.getDatabaseProductVersion());
            System.out.println("Driver Name: " + databaseMetaData.getDriverName());
            System.out.println("Driver Version: " + databaseMetaData.getDriverVersion());

            // Retrieve and display table information
            ResultSet tables = databaseMetaData.getTables(null, null, "%", new String[]{"TABLE"});
            System.out.println("\nTables in the Database:");
            while (tables.next()) {
                System.out.println("Table Name: " + tables.getString("TABLE_NAME"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    
    public void displayTableMetadata(String tableName) {
        try {
            if (connection == null) {
                System.out.println("Connection is not established");
                return;
            }
            String sqlQuery = "SELECT * FROM " + tableName;
            PreparedStatement statement = connection.prepareStatement(sqlQuery);
            ResultSet resultSet = statement.executeQuery();

            ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
            int columnCount = resultSetMetaData.getColumnCount();
            System.out.println("\nColumns in the Table " + tableName + ":");
            for (int i = 1; i <= columnCount; i++) {
                System.out.println("Column Name: " + resultSetMetaData.getColumnName(i));
                System.out.println("Column Type: " + resultSetMetaData.getColumnTypeName(i));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}