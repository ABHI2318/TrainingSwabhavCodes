<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Customer Passbook</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
            background-color: #f8f9fa;
            font-family: Arial, sans-serif;
        }
        .header {
            background-color: #ff6f00;
            color: white;
            padding: 20px 0;
            text-align: center;
            font-size: 1.8rem;
            font-weight: 500;
        }
        .welcome-msg {
            margin: 20px;
            font-size: 1.2rem;
            color: #ff6f00;
        }
        .table-container {
            margin: 20px auto;
            max-width: 90%;
        }
        footer {
            background-color: #ff6f00;
            color: white;
            text-align: center;
            padding: 10px 0;
            position: fixed;
            bottom: 0;
            width: 100%;
            font-size: 0.9rem;
        }
        .table-primary {
            background-color: #ff9e40;
        }
        .table-striped tbody tr:nth-child(odd) {
            background-color: #fff0e6;
        }
    </style>
</head>
<body>
    <div class="header">
        Passbook
    </div>

    <div class="welcome-msg">
        Welcome, <b>${customer.getFirstName()}</b>
    </div>

    <div class="table-container">
        <table class="table table-striped table-bordered">
            <thead class="table-primary">
                <tr>
                    <th>Sender Acc No</th>
                    <th>Receiver Acc No</th>
                    <th>Type of Transaction</th>
                    <th>Amount</th>
                    <th>Date</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="transaction" items="${transactionList}">
                    <tr>
                        <td>${transaction.getSenderAccountNumber()}</td>
                        <td>${transaction.getReceiverAccountNumber()}</td>
                        <td>${transaction.getTransactionType()}</td>
                        <td>${transaction.getAmount()}</td>
                        <td>${transaction.getDate()}</td>
                    </tr>
                </c:forEach>
                <c:if test="${empty transactionList}">
                    <tr>
                        <td colspan="5" class="text-center text-muted">
                            No transactions available.
                        </td>
                    </tr>
                </c:if>
            </tbody>
        </table>
    </div>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
