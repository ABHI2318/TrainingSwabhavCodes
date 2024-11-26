package com.aurion.controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ContollerServlet")
public class ContollerServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher dispatcher = null;

        String type = request.getParameter("loginType");

        // Check if type is null
        if (type == null) {
            // Handle the case where type is null, e.g., redirect to an error page or show a default message
            response.getWriter().write("Error: loginType parameter is missing.");
            return;
        }

        
        type = type.toLowerCase();
        request.setAttribute("type", type);

        if (type.equals("user")) 
        	dispatcher = request.getRequestDispatcher("/UserDashBoard.jsp");
       if (type.equals("admin")) 
        	dispatcher = request.getRequestDispatcher("/AdminDashBoard.jsp");
        
        dispatcher.forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
