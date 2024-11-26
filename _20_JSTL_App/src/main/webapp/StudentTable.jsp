<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table>
<tr><th> RollNumber </th>
    <th>Name </th>
    <th>Percentage</th>
</tr>
<c:forEach items="${students }" var="student">
<tr>
<td> <c:out value="${student.getRollnumber()}"></c:out></td>
<td> <c:out value="${student.getName()}"></c:out></td>
<td> <c:out value="${student.getPercentage()}"></c:out></td>
</tr>
</c:forEach>
</table>
</body>
</html>