<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
    session = request.getSession(false);
    if (session == null || session.getAttribute("customerId") == null) {
        response.sendRedirect("customerLogin.jsp");
        return;
    }
%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Customer Home</title>
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <div class="container mt-5">
        <h2 class="text-center">Welcome, ${sessionScope.customerName}!</h2>
        <div class="list-group mt-4">
            <a href="editProfile.jsp" class="list-group-item list-group-item-action">Edit Profile</a>
            <a href="newTransaction.jsp" class="list-group-item list-group-item-action">Make a Transaction</a>
            <a href="ViewPassbookController" class="list-group-item list-group-item-action">View Passbook</a>
        </div>
        <div class="text-center mt-4">
            <a href="LogoutServlet" class="btn btn-danger">Logout</a>
        </div>
    </div>
</body>
</html>
