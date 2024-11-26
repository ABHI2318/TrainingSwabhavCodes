package com.aurion.transactions.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class transactionDB {
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

    
    public void performTransaction() {
       
        String deposit = "UPDATE new_table SET balance = balance + 500 WHERE Id = 1";
        String withdraw = "UPDATE new_table SET balance = balance - 500 WHERE Id = 2"; 
        try {
           
            connection.setAutoCommit(false);

       
            try (PreparedStatement statement1 = connection.prepareStatement(deposit)) {
                statement1.executeUpdate();
                System.out.println("Deposit successful");
            }

        
            try (PreparedStatement statement2 = connection.prepareStatement(withdraw)) {
                int rowsAffected = statement2.executeUpdate();
                if (rowsAffected == 0) {
                    throw new SQLException("Withdrawal failed: ID does not exist");
                }
                System.out.println("Withdrawal successful");
            }

           
            connection.commit();
            System.out.println("Transaction committed successfully.");

        } catch (SQLException e) {
           
            try {
                connection.rollback();
                System.out.println("Transaction rolled back due to an error: " + e.getMessage());
            } catch (SQLException rollbackException) {
                rollbackException.printStackTrace();
            }
        } finally {
        
            try {
                connection.setAutoCommit(true);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

   
}
