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

@WebServlet("/EditProfileController")
public class EditProfileController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    
        HttpSession session = request.getSession(false);
        if (session == null || session.getAttribute("customerId") == null) {
            response.sendRedirect("customerLogin.jsp");
            return;
        }

    
        int customerId = (int) session.getAttribute("customerId");
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String password = request.getParameter("password");

        
        String existingPassword = getExistingPassword(customerId);

        if (existingPassword == null) {
            request.setAttribute("errorMessage", "Error retrieving customer data.");
            request.getRequestDispatcher("editProfile.jsp").forward(request, response);
            return;
        }

        String updatedPassword = (password == null || password.isEmpty()) ? existingPassword : password;

   
        boolean isUpdated = updateCustomerProfile(customerId, firstName, lastName, updatedPassword);

        if (isUpdated) {
           
            session.setAttribute("customerFirstName", firstName);
            session.setAttribute("customerLastName", lastName);

       
            request.setAttribute("successMessage", "Profile updated successfully!");
        } else {
            
            request.setAttribute("errorMessage", "Profile update failed. Please try again.");
        }

      
        request.getRequestDispatcher("editProfile.jsp").forward(request, response);
    }

  
    private String getExistingPassword(int customerId) {
        String query = "SELECT password FROM Customer WHERE customerId = ?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setInt(1, customerId);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return rs.getString("password");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    private boolean updateCustomerProfile(int customerId, String firstName, String lastName, String password) {
        String query = "UPDATE Customer SET firstName = ?, lastName = ?, password = ? WHERE customerId = ?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, firstName);
            stmt.setString(2, lastName);
            stmt.setString(3, password);
            stmt.setInt(4, customerId);

            int rowsUpdated = stmt.executeUpdate();
            return rowsUpdated > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
