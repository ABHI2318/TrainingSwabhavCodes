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

@WebServlet("/PassbookServlet")
public class PassbookServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession(false);

        if (session == null || session.getAttribute("customerId") == null) {
            response.sendRedirect("customerLogin.jsp");
            return;
        }

        int customerId = (int) session.getAttribute("customerId");
        TransactionService transactionService = new TransactionService();
        List<Transaction> transactions = transactionService.getTransactionsByCustomerId(customerId);

        request.setAttribute("transactions", transactions);
        request.getRequestDispatcher("viewPassbook.jsp").forward(request, response);
    }
}
