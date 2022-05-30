<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="model.*"%>
    <%
    User user= (User) session.getAttribute("registerUser");
    String mail=user==null?"":user.getMail();
    String name=user==null?"":user.getName();
    String mess=user==null?"":user.getMess();
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>お問い合わせフォーム</title>
<link rel="stylesheet" href="/sessionex/css/main.css">
</head>
<body>
<div id=container>
<h1 style=font-size:10px;>お問い合わせフォーム</h1>
<form action="/sessionex/RegisterUser" method="post">
<table style=width:300px;>
<tr><th>お名前</th>
<td><input type="text" name="name"value="<%=name%>"></td></tr>
<tr><th>メールアドレス</th>
<td><input type="text" name="mail" value="<%=mail%>"></td></tr>
<tr><th>お問い合わせ内容</th>
<td><textarea style=width:164px; name="mess" ><%=mess%></textarea></td></tr>
</table>
<div id=bottan>
<input type="submit" value="確認" class=bottan1>
</div>
</form>
</div>
</body>
</html>