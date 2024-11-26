<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>View Transactions</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">
    <nav class="navbar navbar-dark bg-warning shadow-sm">
        <div class="container-fluid">
            <a class="navbar-brand" href="adminHomePage.jsp">View Transactions</a>
        </div>
    </nav>

    <div class="container mt-5">
        <div class="row justify-content-center">
            <div class="col-lg-8">
                <div class="card shadow-sm border-0">
                    <div class="card-body">
                        <h3 class="card-title text-center text-warning mb-4">Transactions List</h3>
                        <table class="table table-striped table-bordered text-center">
                            <thead class="bg-warning text-dark">
                                <tr>
                                    <th>Sender Acc No.</th>
                                    <th>Receiver Acc No.</th>
                                    <th>Type Of Transaction</th>
                                    <th>Amount</th>
                                    <th>Date</th>
                                </tr>
                            </thead>
                            <tbody>
                                <c:forEach var="transaction" items="${transactions}">
                                    <tr>
                                        <td>${transaction.getSenderAccountNumber()}</td>
                                        <td>${transaction.getReceiverAccountNumber()}</td>
                                        <td>${transaction.getTransactionType()}</td>
                                        <td>${transaction.getAmount()}</td>
                                        <td>${transaction.getDate()}</td>
                                    </tr>
                                </c:forEach>
                            </tbody>
                        </table>
                        <c:if test="${empty transactions}">
                            <div class="text-center text-danger mt-3">
                                No Transactions found.
                            </div>
                        </c:if>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>