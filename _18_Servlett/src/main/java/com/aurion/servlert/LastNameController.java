package com.aurion.servlert;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/LastNameController")
public class LastNameController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 response.setContentType("text/html");
	     PrintWriter writer = response.getWriter();
	     String lastname=request.getParameter("lastname");
	     Cookie cookies[]=request.getCookies();
	     String firstname=cookies[0].getValue();
	     
	     writer.print("<h1>GoodMorning"+firstname+"   " +"</h1>");
	     writer.print("<h1>Goodnight"+lastname+"   " +"</h1>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
