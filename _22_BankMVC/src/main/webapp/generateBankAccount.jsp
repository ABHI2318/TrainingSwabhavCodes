<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Generate Bank Account</title>
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <div class="container mt-5">
        <h2 class="text-center">Generate Bank Account</h2>
        <form action="GenerateBankAccount" method="post" class="mt-4">
            <div class="form-group">
                <label for="initialBalance">Initial Balance</label>
                <input type="number" step="0.01" class="form-control" id="initialBalance" name="initialBalance" required>
            </div>
            <button type="submit" class="btn btn-primary btn-block">Generate Account</button>
        </form>
        <% if (request.getAttribute("successMessage") != null) { %>
            <div class="alert alert-success mt-3">
                <%= request.getAttribute("successMessage") %>
            </div>
        <% } %>
        <% if (request.getAttribute("errorMessage") != null) { %>
            <div class="alert alert-danger mt-3">
                <%= request.getAttribute("errorMessage") %>
            </div>
        <% } %>
        <div class="text-center mt-3">
            <a href="customerHome.jsp" class="btn btn-secondary">Back to Home</a>
        </div>
    </div>
</body>
</html>
