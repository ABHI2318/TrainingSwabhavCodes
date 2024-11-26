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



@WebServlet("/AdminLoginController")
public class AdminLoginController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String adminId = request.getParameter("adminId");
        String password = request.getParameter("password");

  
        if (isValidAdmin(adminId, password)) {
           
            HttpSession session = request.getSession();
            session.setAttribute("adminId", adminId);
            response.sendRedirect("adminHome.jsp");
        } else {
          
            request.setAttribute("errorMessage", "Invalid Admin Credentials");
            request.getRequestDispatcher("adminLogin.jsp").forward(request, response);
        }
    }

  
    private boolean isValidAdmin(String adminId, String password) {
        String query = "SELECT adminId FROM Admin WHERE adminId = ? AND adminPassword = ?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, adminId);
            stmt.setString(2, password);
            ResultSet rs = stmt.executeQuery();
            return rs.next(); 
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
