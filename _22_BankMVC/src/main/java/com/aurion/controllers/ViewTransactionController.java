package com.aurion.controllers;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.aurion.entity.Customer;
import com.aurion.entity.Transaction;
import com.aurion.service.DBConnection;

@WebServlet("/ViewTransactionController")
public class ViewTransactionController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	     String query = "select * from transaction";

	        try (Connection conn = DBConnection.getConnection();
	             PreparedStatement stmt = conn.prepareStatement(query)) {
	             List<Transaction> transactions=new ArrayList<>();
	        	  ResultSet rs = stmt.executeQuery() ;
	                  
	                  while (rs.next()) {
	                   Transaction transaction = new Transaction (
	                          rs.getInt("transactionId"),
	                          rs.getDate("transactiondate"),
	                          rs.getString("transactionType"),
	                          rs.getDouble("amount"),
	                          rs.getInt("senderAccountNumber"),
	                          rs.getInt("receiverAccountNumber")
	                      );
	                     transactions.add(transaction);
	                  }
	                  
	                  request.setAttribute("transactions", transactions);
	                  request.getRequestDispatcher("viewTransaction.jsp").forward(request, response);

	       
	        } catch (Exception e) {
	            e.printStackTrace();
	            request.setAttribute("errorMessage", "Error occurred while adding account: " + e.getMessage());
	          
	        }
		
		
		

		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
