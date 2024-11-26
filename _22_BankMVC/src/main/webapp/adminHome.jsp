<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
    session = request.getSession(false);
    if (session == null || session.getAttribute("adminId") == null) {
        response.sendRedirect("adminLogin.jsp");
        return;
    }
%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Admin Home</title>
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <div class="container mt-5">
        <h2 class="text-center">Welcome, Admin!</h2>
        <div class="list-group mt-4">
            <a href="AddCustomer.jsp" class="list-group-item list-group-item-action">Add Customer</a>
            <a href="AddAccount.jsp" class="list-group-item list-group-item-action">Add Account</a>
            <a href="ViewCustomerController" class="list-group-item list-group-item-action">View Customers</a>
            <a href="ViewTransactionController" class="list-group-item list-group-item-action">View Transactions</a>
        </div>
        <div class="text-center mt-4">
            <a href="LogoutController" class="btn btn-danger">Logout</a>
        </div>
    </div>
</body>
</html>
