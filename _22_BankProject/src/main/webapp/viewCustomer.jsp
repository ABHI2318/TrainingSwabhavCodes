<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>View Customers</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">
    <div class="container my-5">
        <h2 class="text-center text-warning">View Customers</h2>
        <hr>

        <table class="table table-bordered shadow-sm">
            <thead class="table-warning">
                <tr>
                    <th>Customer ID</th>
                    <th>First Name</th>
                    <th>Last Name</th>
                    <th>Email</th>
                    <th>Accounts</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="customer" items="${customers}">
                    <tr>
                        <td>${customer.getCustomerId()}</td>
                        <td>${customer.getFirstName()}</td>
                        <td>${customer.getLastName()}</td>
                        <td>${customer.getEmail()}</td>
                        <td>
                            <table class="table table-sm">
                                <thead class="table-secondary">
                                    <tr>
                                        <th>Account Number</th>
                                        <th>Balance</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <c:forEach var="account" items="${customer.getAccounts()}">
                                        <tr>
                                            <td>${account.getAccountNumber()}</td>
                                            <td>${account.getBalance()}</td>
                                        </tr>
                                    </c:forEach>
                                </tbody>
                            </table>
                        </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
