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
import com.aurion.service.Database;

@WebServlet("/NewAccountPageController")
public class NewAccountPageController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = null;
		Database database = new Database();
		database.connect();
		List<Customer> customers = database.getAllCustomers();
		request.setAttribute("customers", customers);
		request.getRequestDispatcher("addNewAccount.jsp").forward(request, response);
		database.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
