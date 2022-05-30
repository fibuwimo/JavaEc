<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>九九表</title>
</head>
<body>
<h1 style=text-align:center>九九表</h1>
<table border="1" style=margin:auto>
<% for(int i=1;i<=9;i++) {%>
<tr>
<% for(int j=1;j<=9;j++) {%>
<td width=20px><%=i*j%></td>
<%} %>
</tr>
<%} %>
</table>
</body>
</html>