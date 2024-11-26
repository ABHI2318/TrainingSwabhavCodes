<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.Date" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%--scriplet tage --%>

<%@include file = "DemoFile.jsp"%>
 <% 
 Date date=new Date();
int a=20;
%>
<%--comments --%>
<%! int  b=10; %>
<%= date %>
<b><%= b %></b>

</body>
</html>