package com.aurion.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.aurion.entities.Customer;

@WebServlet("/ProfileChangesServlet")
public class ProfileChangesServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		HttpSession session = request.getSession(false);
		
		if (session == null || session.getAttribute("name") == null) {

            response.sendRedirect("login.html");
            return;
        }

        Customer customer = (Customer)session.getAttribute("customer");
       
        String field = request.getParameter("field");
        String newValue = request.getParameter("newValue");
        if(field.equals("firstName")) {
        	
        }
		if(field.equals("lastName")) {
		        	
		}
		if(field.equals("password")) {
			
		}
        request.setAttribute("customer", customer);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
