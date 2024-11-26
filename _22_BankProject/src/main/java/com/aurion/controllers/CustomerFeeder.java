package com.aurion.controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.aurion.entities.Customer;
import com.aurion.entities.RandomNumberGenerator;
import com.aurion.service.CustomerService;
import com.aurion.service.Database;

@WebServlet("/CustomerFeeder")
public class CustomerFeeder extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		// TODO Auto-generated method stub
		RequestDispatcher dispatcher = null;
		String firstname = request.getParameter("firstName");
		String lastname = request.getParameter("lastName");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		int customerId = RandomNumberGenerator.generateNumber();		
		
		Database database = new Database();
		database.connect();
		database.putCustomerData(customerId, firstname, lastname, email, password);

		List<Customer> customers = database.getAllCustomers();
		request.setAttribute("customers", customers);;
		
		request.getRequestDispatcher("adminHomePage.jsp").forward(request, response);
		database.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
