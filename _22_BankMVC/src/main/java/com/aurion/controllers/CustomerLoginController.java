package com.aurion.controllers;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.aurion.service.DBConnection;



@WebServlet("/CustomerLoginController")
public class CustomerLoginController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        String query = "SELECT customerId, firstName, lastName FROM Customer WHERE email = ? AND password = ?";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, email);
            stmt.setString(2, password);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
              
                HttpSession session = request.getSession();
                session.setAttribute("customerId", rs.getInt("customerId"));
                session.setAttribute("customerName", rs.getString("firstName") + " " + rs.getString("lastName"));

             
                response.sendRedirect("customerHome.jsp");
            } else {
                
                request.setAttribute("errorMessage", "Invalid Customer Credentials");
                request.getRequestDispatcher("customerLogin.jsp").forward(request, response);
            }
        } catch (Exception e) {
            e.printStackTrace();
            request.setAttribute("errorMessage", "An error occurred during login. Please try again.");
            request.getRequestDispatcher("customerLogin.jsp").forward(request, response);
        }
    }
}

