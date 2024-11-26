package com.aurion.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionContext;

import com.aurion.entities.Account;
import com.aurion.entities.Admin;
import com.aurion.entities.Customer;
import com.aurion.entities.Transaction;
import com.aurion.service.AdminService;
import com.aurion.service.Database;

@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String role = request.getParameter("role");
	
		
		RequestDispatcher dispatcher = null;
		Database database = new Database();
		database.connect();
		boolean validity = false;
		if(role.equals("Admin Login")) {
			role = "admins";
			validity = database.checkLogin(username, password, role);
			String name = database.getAdminName(username);
			if (validity) {
				AdminService adminService = new AdminService();
				Admin admin = adminService.createAdmin(name, username, password);
				List<Account> accounts = database.getAllAccounts();
				List<Transaction> transactions = database.getAllTransactions();
				request.setAttribute("admin", admin);
				request.setAttribute("transactions", transactions);
				request.setAttribute("accounts", accounts);
				HttpSession session = request.getSession();
				session.setAttribute("name", name);
				request.getRequestDispatcher("adminHomePage.jsp").forward(request, response);
			} else {
			    writer.print("<h3>Invalid Credentials! Please try again.</h3>");
			    writer.print("<a href='login.html'>Back to Login</a>");
			}
		}
		
		if(role.equals("Customer Login")){
			role = "customers";
			validity = database.checkLogin(username, password, role);
			if (validity) {
				Customer customer = database.getCustomer(username);
				String email = customer.getEmail();
				List<Account> accounts = database.getAccountsOfCustomer(email);
				customer.setAccounts(accounts);
				HttpSession session = request.getSession();
				session.setAttribute("customer", customer);
				request.getRequestDispatcher("CustomerHomeController").forward(request, response);
			} else {
			    writer.print("<h3>Invalid Credentials! Please try again.</h3>");
			    writer.print("<a href='login.html'>Back to Login</a>");
			}
		}
		
		
		
		
		database.close();
		writer.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
