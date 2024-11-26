package com.aurion.controllers;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.aurion.entities.Account;
import com.aurion.entities.Customer;
import com.aurion.entities.RandomNumberGenerator;
import com.aurion.entities.Transaction;
import com.aurion.service.AccountService;
import com.aurion.service.CustomerService;
import com.aurion.service.Database;
import com.aurion.service.TransactionService;

@WebServlet("/ProcessTransaction")
public class ProcessTransaction extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session =request.getSession(false);
		Database database = new Database();
		database.connect();
		
		Customer customer = (Customer)session.getAttribute("customer");	
		
		int accountNumber = Integer.parseInt(request.getParameter("accountNumber"));
		int receiverAccount = 0;
		if(request.getParameter("receiverAccount").isEmpty()) {
			receiverAccount = accountNumber;
		}else {
			receiverAccount = Integer.parseInt(request.getParameter("receiverAccount"));
		}
		double amount = Double.parseDouble(request.getParameter("amount"));
		int transaction_id = RandomNumberGenerator.generateNumber();
		Date date = new Date(System.currentTimeMillis());		
		
		CustomerService customerService = new CustomerService();
		Account account = customerService.getAccount(customer, accountNumber);
		
		Account receivingAccount = database.getAccountFromAccNo(receiverAccount);
		
		AccountService accountService = new AccountService();	
	
		String transactionType = request.getParameter("transactionType");
		double updatedBalance = 0;
		if(transactionType.equals("Credit")) {
			updatedBalance = accountService.credit(account, amount);
			database.updateAccountBalance(accountNumber, updatedBalance);
		}
		if(transactionType.equals("Debit")) {
			updatedBalance = accountService.debit(account, amount);
			database.updateAccountBalance(accountNumber, updatedBalance);
		}
		if(transactionType.equals("Transfer")) {
			double updatedBalanceOfSender = accountService.debit(account, amount);
			double updatedBalanceOfReceiver = accountService.credit(receivingAccount, amount);
			database.updateAccountBalance(accountNumber, updatedBalanceOfSender);
			database.updateAccountBalance(receiverAccount, updatedBalanceOfReceiver);
		}
		
		for(Account customerAccount: customer.getAccounts()) {
			if(customerAccount.getAccountNumber() == accountNumber) {
				customerAccount.setBalance(updatedBalance);
			}
		}
		
		database.putTransactionData(transaction_id, date, transactionType, amount, accountNumber, receiverAccount, accountNumber);
		
		request.setAttribute("customer", customer);
        
        request.getRequestDispatcher("customerHomePage.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
