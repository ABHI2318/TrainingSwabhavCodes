<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="java.util.List" %>
<%@ page import="com.aurion.entities.Customer" %>
<%@ page import="com.aurion.service.Database" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Add Bank Account</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
    <script>
        function accountMessage(){
            alert("Account has been Created!");
        }
    </script>
    <style>
        body {
            background-color: #fff7e6; /* Light orange background */
        }
        .navbar {
            background-color: #ff9800; /* Orange navbar */
        }
        .navbar a {
            color: white !important;
        }
        .card {
            border-radius: 8px;
            box-shadow: 0 4px 10px rgba(0, 0, 0, 0.1);
        }
        .card-title {
            color: #ff5722; /* Darker orange for title */
        }
        .btn-success {
            background-color: #ff9800; /* Orange button */
            border-color: #ff9800; /* Orange border */
        }
        .btn-success:hover {
            background-color: #e68900; /* Darker orange on hover */
            border-color: #e68900; /* Darker orange on hover */
        }
        .form-label {
            color: #ff5722; /* Dark orange for form labels */
        }
        .form-select, .form-control {
            border-color: #ff9800; /* Orange border for inputs */
        }
        .text-danger {
            color: #d32f2f; /* Red color for error messages */
        }
    </style>
</head>
<body class="bg-light">
    <nav class="navbar navbar-dark bg-primary shadow-sm">
        <div class="container-fluid">
            <a class="navbar-brand" href="adminHomePage.jsp">Add Bank Account</a>
        </div>
    </nav>

    <div class="container mt-5">
        <div class="row justify-content-center">
            <div class="col-lg-6 col-md-8">
                <div class="card shadow-sm border-0">
                    <div class="card-body p-4">
                        <h3 class="card-title text-center mb-4">Bank Account Details</h3>
                        <form>
                            <div class="mb-3">
                                <label for="customerId" class="form-label">Search by Customer ID</label>
                                <%
                                    List<Customer> customers = (List<Customer>) request.getAttribute("customers");
                                %>
                                <select class="form-select" id="customerId" name="customerId" required onchange="this.form.submit()">
                                    <option value="">Select Customer ID</option>
                                    <%
                                        for (Customer customer : customers) {
                                            String customerId = customer.getEmail();
                                    %>
                                        <option value="<%= customerId %>"><%= customerId %></option>
                                    <%
                                        }
                                    %>
                                </select>
                            </div>
                        </form>

                        <%
                            String customerId = request.getParameter("customerId");
                            if (customerId != null && !customerId.isEmpty()) {
                                Database database = new Database();
                                database.connect();
                                Customer customer = database.getCustomer(customerId);
                                if (customer != null) {
                        %>
                                    <div class="mb-3">
                                        <label for="customerDetails" class="form-label">Customer Details</label>
                                        <textarea class="form-control" id="customerDetails" rows="3" readonly>
                                            Customer Id: <%= customer.getCustomerId() %>
                                            First Name: <%= customer.getFirstName() %>
                                            Last Name: <%= customer.getLastName() %>
                                            Email: <%= customer.getEmail() %>
                                        </textarea>
                                    </div>
                        <%
                                } else {
                                    out.println("<p class='text-danger'>Customer not found.</p>");
                                }
                                database.close();
                            }
                        %>

                        <form action="AccountFeeder" method="post">
                            <input type="hidden" name="customerId" value="<%= customerId != null ? customerId : "" %>"/>
                            <div class="d-flex justify-content-center mt-3">
                                <button type="submit" name="generate" class="btn btn-success" onclick="accountMessage()">Generate Account Number</button>
                            </div>
                        </form>

                        <%
                            String action = request.getParameter("generate");
                            if (action != null && action.equals("generate")) {
                                String selectedCustomerId = request.getParameter("customerId");
                                if (selectedCustomerId != null && !selectedCustomerId.isEmpty()) {
                                    // Logic for generating account number
                                    out.println("<p>Account number generated for customer with ID: " + selectedCustomerId + "</p>");
                                } else {
                                    out.println("<p class='text-danger'>Please select a customer.</p>");
                                }
                            }
                        %> 
                    </div>
                </div>
            </div>
        </div>
    </div>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
