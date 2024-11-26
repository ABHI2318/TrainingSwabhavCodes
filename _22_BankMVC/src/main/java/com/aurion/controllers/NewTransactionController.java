package com.aurion.controllers;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.aurion.service.DBConnection;

@WebServlet("/NewTransactionController")
public class NewTransactionController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession(false);

        
        if (session == null || session.getAttribute("customerId") == null) {
            response.sendRedirect("customerLogin.jsp");
            return;
        }

        int customerId = (int) session.getAttribute("customerId");
        String transactionType = request.getParameter("transactionType");
        double amount = Double.parseDouble(request.getParameter("amount"));
        String toAccount = request.getParameter("toAccountNumber");

        try (Connection conn = DBConnection.getConnection()) {
           
            int customerAccount = getCustomerAccount(conn, customerId);
            if (customerAccount == -1) {
                request.setAttribute("errorMessage", "No account found for the logged-in customer.");
                request.getRequestDispatcher("newTransaction.jsp").forward(request, response);
                return;
            }

      
            if ("Credit".equalsIgnoreCase(transactionType)) {
                updateBalance(conn, customerAccount, amount);
                recordTransaction(conn, "Credit", amount, customerAccount, customerAccount);
            } else if ("Debit".equalsIgnoreCase(transactionType)) {
                if (validateBalance(conn, customerAccount, amount)) {
                    updateBalance(conn, customerAccount, -amount);
                    recordTransaction(conn, "Debit", amount, customerAccount, customerAccount);
                } else {
                    request.setAttribute("errorMessage", "Insufficient balance for debit transaction.");
                    request.getRequestDispatcher("newTransaction.jsp").forward(request, response);
                    return;
                }
            } else if ("Transfer".equalsIgnoreCase(transactionType)) {
                int toAccountNumber = Integer.parseInt(toAccount);
                if (validateBalance(conn, customerAccount, amount)) {
                    updateBalance(conn, customerAccount, -amount);
                    updateBalance(conn, toAccountNumber, amount);
                    recordTransaction(conn, "Transfer", amount, customerAccount, toAccountNumber);
                } else {
                    request.setAttribute("errorMessage", "Insufficient balance for transfer.");
                    request.getRequestDispatcher("newTransaction.jsp").forward(request, response);
                    return;
                }
            }

            request.setAttribute("successMessage", "Transaction successful.");
            request.getRequestDispatcher("newTransaction.jsp").forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
            request.setAttribute("errorMessage", "Transaction failed: " + e.getMessage());
            request.getRequestDispatcher("newTransaction.jsp").forward(request, response);
        }
    }

    private int getCustomerAccount(Connection conn, int customerId) throws Exception {
        String query = "SELECT accountNumber FROM Account WHERE customerId = ?";
        try (PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, customerId);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return rs.getInt("accountNumber");
            }
        }
        return -1;
    }

    private boolean validateBalance(Connection conn, int accountNumber, double amount) throws Exception {
        String query = "SELECT accountBalance FROM Account WHERE accountNumber = ?";
        try (PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, accountNumber);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return rs.getDouble("accountBalance") >= amount;
            }
        }
        return false;
    }

    private void updateBalance(Connection conn, int accountNumber, double amount) throws Exception {
        String query = "UPDATE Account SET accountBalance = accountBalance + ? WHERE accountNumber = ?";
        try (PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setDouble(1, amount);
            stmt.setInt(2, accountNumber);
            stmt.executeUpdate();
        }
    }

    private void recordTransaction(Connection conn, String type, double amount, int senderAccount, int receiverAccount) throws Exception {
        String query = "INSERT INTO Transaction (transactionDate, transactionType, amount, senderAccountNumber, receiverAccountNumber) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setTimestamp(1, new Timestamp(System.currentTimeMillis()));
            stmt.setString(2, type);
            stmt.setDouble(3, amount);
            stmt.setInt(4, senderAccount);
            stmt.setInt(5, receiverAccount);
            stmt.executeUpdate();
        }
    }
}
