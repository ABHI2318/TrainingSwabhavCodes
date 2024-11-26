package com.aurion.controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.aurion.entity.Transaction;
import com.aurion.service.TransactionService;

@WebServlet("/ViewPassbookController")
public class ViewPassbookController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession(false);

        // Validate session
        if (session == null || session.getAttribute("customerId") == null) {
            response.sendRedirect("customerLogin.jsp");
            return;
        }

        // Retrieve customer ID from the session
        int customerId = (int) session.getAttribute("customerId");
        System.out.println("Customer ID from session: " + customerId); // Debug log

        // Fetch transactions for the customer
        TransactionService transactionService = new TransactionService();
        List<Transaction> transactions = transactionService.getTransactionsByCustomerId(customerId);
         System.out.println(transactions);
        if (transactions.isEmpty()) {
            System.out.println("No transactions found for customerId: " + customerId); // Debug log
        } else {
            System.out.println("Transactions found: " + transactions.size()); // Debug log
        }

        // Set transactions as a request attribute and forward to JSP
        request.setAttribute("transactions", transactions);
        request.getRequestDispatcher("viewPassbook.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
