package com.aurion.controllers;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.aurion.service.DBConnection;

@WebServlet("/AddAccountController")
public class AddAccountController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      
        HttpSession session = request.getSession(false);
        if (session == null || session.getAttribute("adminId") == null) {
         
            response.sendRedirect("adminLogin.jsp");
            return;
        }

       
        int customerId = Integer.parseInt(request.getParameter("customerId"));
        double initialBalance = Double.parseDouble(request.getParameter("initialBalance"));

       
        String query = "INSERT INTO Account (customerId, accountBalance) VALUES (?, ?)";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
           
            stmt.setInt(1, customerId);
            stmt.setDouble(2, initialBalance);

           
            int rowsAffected = stmt.executeUpdate();

            if (rowsAffected > 0) {
               
                response.sendRedirect("adminHome.jsp"); 
            } else {
                
                request.setAttribute("errorMessage", "Failed to add account.");
                request.getRequestDispatcher("AddAccount.jsp").forward(request, response);
            }
        } catch (Exception e) {
            e.printStackTrace();
            request.setAttribute("errorMessage", "Error occurred while adding account: " + e.getMessage());
            request.getRequestDispatcher("AddAccount.jsp").forward(request, response);
        }
    }
}
