package com.aurion.controllers;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.aurion.entity.Customer;
import com.aurion.service.DBConnection;

@WebServlet("/ViewCustomerController")
public class ViewCustomerController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    
        HttpSession session = request.getSession(false);
//        if (session == null || session.getAttribute("adminId") == null) {
//            response.sendRedirect("adminLogin.jsp");
//            return;
//        }

     
        String query = "SELECT * FROM Customer";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            ResultSet rs = stmt.executeQuery();

            List<Customer> customers = new ArrayList<>();
            while (rs.next()) {
                Customer customer = new Customer(
                    rs.getInt("customerId"),
                    rs.getString("firstName"),
                    rs.getString("lastName"),
                    rs.getString("email"),
                   rs.getString("password")
                );
                customers.add(customer);
                System.out.println("Customer retrieved: " + customer.getFirstName() + " " + customer.getLastName());
            }

            System.out.println("Total customers retrieved: " + customers.size());

            
         
            request.setAttribute("customers", customers);
            System.out.println(customers);
         
            request.getRequestDispatcher("viewCustomers.jsp").forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
            request.setAttribute("errorMessage", "Error fetching customer data: " + e.getMessage());
            request.getRequestDispatcher("adminHome.jsp").forward(request, response);
        }
    }
}
