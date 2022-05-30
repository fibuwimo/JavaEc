<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="model.User" %>
    <%
    User registerUser=(User) session.getAttribute("registerUser");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ユーザー登録</title>
<link rel="stylesheet" href="/sessionex/css/main.css">
</head>
<body>
<div id=container>
<h1 style=font-size:10px>お問い合わせフォーム</h1>
<p>以下の内容でよろしいですか？</p>
<table style=width:300px;>
<tr><th>お名前</th><td><%=registerUser.getName()%></td></tr>
<tr><th>メールアドレス</th><td><%=registerUser.getMail()%></td></tr>
<tr><th>お問い合わせ内容</th><td><%=registerUser.getMess()%></td></tr>
</table>
<div id=bottan>
<a href="/sessionex/RegisterUser" class=bottan1>戻る</a>
<a href="/sessionex/RegisterUser?action=done" class=bottan1>送信</a>
</div>
</div>
</body>
</html>