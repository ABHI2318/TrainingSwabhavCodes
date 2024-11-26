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

import com.aurion.service.AccountService;
import com.aurion.service.DBConnection;

@WebServlet("/GenerateBankAccount")
public class GenerateBankAccountController extends HttpServlet {
    private static final long serialVersionUID = 1L;
    
    // Directly use the concrete service class
    private final AccountService accountService = new AccountService();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession(false);

        if (session == null || session.getAttribute("customerId") == null) {
            response.sendRedirect("customerLogin.jsp");
            return;
        }

        int customerId = (int) session.getAttribute("customerId");
        double initialBalance = Double.parseDouble(request.getParameter("initialBalance"));

        try (Connection conn = DBConnection.getConnection()) {
            String insertQuery = "INSERT INTO Account (customerId, accountBalance) VALUES (?,?, ?)";
            try (PreparedStatement stmt = conn.prepareStatement(insertQuery)) {
                stmt.setInt(1, customerId);
                stmt.setDouble(2, initialBalance);
                stmt.executeUpdate();

                request.setAttribute("successMessage", "Bank account created successfully.");
                request.getRequestDispatcher("generateBankAccount.jsp").forward(request, response);
            }
        } catch (Exception e) {
            e.printStackTrace();
            request.setAttribute("errorMessage", "Failed to create bank account: " + e.getMessage());
            request.getRequestDispatcher("generateBankAccount.jsp").forward(request, response);
        }
    }
}
