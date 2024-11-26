package com.aurion.servlert;



import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
    private static final long serialVersionUID = 1L;
    Connection connection;
    PreparedStatement prepared;
    ResultSet resultset;

    public void init() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/logindetails", "root", "1234");
            System.out.println("Database connection established successfully."); 
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.err.println("MySQL JDBC Driver not found!");
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println("Failed to connect to the database!"); 
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        try {
            if (connection == null) {
                writer.print("<h2>DB connection is not etablish</h2>");
                return; 
            }

            prepared = connection.prepareStatement("select * from logindetails where username=? and password=?");
            prepared.setString(1, username);
            prepared.setString(2, password);

            resultset = prepared.executeQuery();

            if (resultset.next()) {
                writer.print("<h2>Login Successful! " + username + ".</h2>");
            } else {
                writer.print("<h2>Invalid Username or Password!</h2>");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } 
        }
    

    public void destroy() {
        try {
            if (connection != null) connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
