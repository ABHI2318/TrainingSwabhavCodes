package com.aurion.controllers;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.aurion.entities.Account;
import com.aurion.entities.Customer;
import com.aurion.service.AccountService;
import com.aurion.service.Database;


@WebServlet("/ViewCustomersController")
public class ViewCustomersController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher dispatcher = null;
		Database database = new Database();
		database.connect();
		List<Customer> customers = null;;
		try {
			customers = database.getCustomersWithAccounts();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		request.setAttribute("customers", customers);
		request.getRequestDispatcher("viewCustomer.jsp").forward(request, response);
		database.close();
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
