<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Add Account</title>
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <div class="container mt-5">
        <h2 class="text-center">Add Bank Account</h2>
        <form action="AddAccountController" method="post" class="mt-4">
            <div class="form-group">
                <label for="customerId">Customer ID</label>
                <input type="number" class="form-control" id="customerId" name="customerId" required>
            </div>
            <div class="form-group">
                <label for="initialBalance">Initial Balance</label>
                <input type="number" step="0.01" class="form-control" id="initialBalance" name="initialBalance" required>
            </div>
            <button type="submit" class="btn btn-primary btn-block">Add Account</button>
        </form>
        <div class="text-center mt-3">
            <a href="adminHome.jsp" class="btn btn-secondary">Back to Admin Home</a>
        </div>
    </div>
</body>
</html>
