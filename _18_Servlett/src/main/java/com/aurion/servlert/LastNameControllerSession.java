package com.aurion.servlert;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/LastNameControllerSession")
public class LastNameControllerSession extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        
     
        String lastname = request.getParameter("lastname");

     
        HttpSession session = request.getSession();
        String firstname = (String) session.getAttribute("firstname");

       
        if (firstname == null) {
            writer.print("<h1>Error: Session expired or first name not found.</h1>");
            return;
        }

        writer.print("<h1>Good Morning " + firstname + "</h1>");
        writer.print("<h1>Good Night " + lastname + "</h1>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
