<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Admin Login</title>
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <div class="container">
        <div class="row justify-content-center">
            <div class="col-md-6">
                <h2 class="text-center mt-5">Admin Login</h2>
                <form action="AdminLoginController" method="post" class="mt-4">
                    <div class="form-group">
                        <label for="adminId">Admin ID</label>
                        <input type="text" class="form-control" id="adminId" name="adminId" required>
                    </div>
                    <div class="form-group">
                        <label for="password">Password</label>
                        <input type="password" class="form-control" id="password" name="password" required>
                    </div>
                    <button type="submit" class="btn btn-primary btn-block">Login</button>
                </form>
                <% if (request.getAttribute("error") != null) { %>
                    <div class="alert alert-danger mt-3">
                        <%= request.getAttribute("error") %>
                    </div>
                <% } %>
            </div>
        </div>
    </div>
</body>
</html>
