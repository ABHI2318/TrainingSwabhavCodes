<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>New Transaction</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
            background-color: #fffbf0;
            font-family: Arial, sans-serif;
        }
        .container {
            margin-top: 50px;
        }
        .btn-primary {
            background-color: #ff6f00;
            border-color: #ff6f00;
        }
        .btn-primary:hover {
            background-color: #e65c00;
            border-color: #e65c00;
        }
        .btn-secondary {
            background-color: #ff9e40;
            border-color: #ff9e40;
        }
        .btn-secondary:hover {
            background-color: #e68a2e;
            border-color: #e68a2e;
        }
        .form-label {
            color: #ff6f00;
        }
        .form-select, .form-control {
            border-color: #ff9e40;
        }
        .form-select:focus, .form-control:focus {
            border-color: #ff6f00;
            box-shadow: 0 0 5px rgba(255, 111, 0, 0.5);
        }
        #receiverAccountDiv {
            background-color: #ffecd1;
            border: 1px solid #ff9e40;
        }
    </style>
</head>
<body>
    <div class="container">
        <h2 class="text-center mb-4" style="color: #ff6f00;">New Transaction</h2>
        <form method="POST" action="ProcessTransaction">
            <div class="mb-3">
                <label for="accountNumber" class="form-label">Select Account</label>
                <select class="form-select" id="accountNumber" name="accountNumber" required>
                    <option value="" disabled selected>Choose Account...</option>
                    <c:forEach var="account" items="${customer.getAccounts()}">
                        <option value="${account.getAccountNumber()}">${account.getAccountNumber()}</option>
                    </c:forEach>
                </select>
            </div>
            <div class="mb-3">
                <label for="transactionType" class="form-label">Type of Transaction</label>
                <select class="form-select" id="transactionType" name="transactionType" required>
                    <option value="" disabled selected>Choose Transaction Type...</option>
                    <option value="Credit">Credit</option>
                    <option value="Debit">Debit</option>
                    <option value="Transfer">Transfer</option>
                </select>
            </div>
            <div class="mb-3" id="receiverAccountDiv" style="display: none;">
                <label for="receiverAccount" class="form-label">Receiver Account (For Transfer Only)</label>
                <input type="text" class="form-control" id="receiverAccount" name="receiverAccount" placeholder="Enter Receiver's Account Number">
            </div>
            <div class="mb-3">
                <label for="amount" class="form-label">Amount</label>
                <input type="number" class="form-control" id="amount" name="amount" min="1" required>
            </div>
            <div class="d-flex justify-content-between">
                <button type="submit" class="btn btn-primary">Submit</button>
                <button type="reset" class="btn btn-secondary">Cancel</button>
            </div>
        </form>
    </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
    <script>
        const transactionType = document.getElementById("transactionType");
        const receiverAccountDiv = document.getElementById("receiverAccountDiv");
        transactionType.addEventListener("change", function () {
            if (transactionType.value === "Transfer") {
                receiverAccountDiv.style.display = "block";
            } else {
                receiverAccountDiv.style.display = "none";
            }
        });
    </script>
</body>
</html>
