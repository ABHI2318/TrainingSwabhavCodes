<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Admin Dashboard</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
            background-color: #fff7e6;
        }
        .navbar {
            background-color: #ff9800;
        }
        .navbar-brand {
            color: #fff !important;
        }
        .nav-link {
            color: #ff9800 !important;
        }
        .nav-link:hover {
            color: #fff !important;
            background-color: #ff9800;
        }
        .card {
            border: none;
            background-color: #fff;
            border-radius: 8px;
        }
        .card-title, .card-text {
            color: #ff9800;
        }
    </style>
</head>
<body>
    <nav class="navbar navbar-expand-lg">
        <div class="container-fluid">
            <a class="navbar-brand" href="adminHomePage.jsp">Admin Dashboard</a>
        </div>
    </nav>

    <div class="py-3 shadow-sm">
        <div class="container">
            <ul class="nav justify-content-center">
                <li class="nav-item">
                    <a class="nav-link btn btn-outline-light mx-2" href="addNewCustomer.jsp">Add New Customer</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link btn btn-outline-light mx-2" href="NewAccountPageController">Add Bank Account</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link btn btn-outline-light mx-2" href="ViewCustomersController">View Customers</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link btn btn-outline-light mx-2" href="ViewTransactionsController">View Transactions</a>
                </li>
            </ul>
        </div>
    </div>

    <div class="container mt-5">
        <div class="row justify-content-center">
            <div class="col-md-6">
                <div class="card shadow-sm">
                    <div class="card-body text-center">
                        <h5 class="card-title">Hello <c:out value="${admin.getName()}"/>!</h5>
                        <h4 class="card-text">Welcome to Admin Dashboard</h4>
                        <p class="card-text">Welcome to the Banking Transaction World</p>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
