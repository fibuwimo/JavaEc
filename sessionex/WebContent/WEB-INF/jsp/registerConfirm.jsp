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
<link rel="stylesheet" type="text/css" href="http://yui.yahooapis.com/3.18.1/build/cssreset/cssreset-min.css">
<link rel="stylesheet" href="/sessionex/css/main.css">
</head>
<body>
<div id=container>
<h1>お問い合わせフォーム</h1>
<p>以下の内容でよろしいですか？</p>
<table>
<tr><th>お名前</th><td><%=registerUser.getName()%></td></tr>
<tr><th>メールアドレス</th><td><%=registerUser.getMail()%></td></tr>
<tr><th>お問い合わせ内容</th><td><%=registerUser.getMess()%></td></tr>
</table>
<div class=btBox>
<a href="/sessionex/RegisterUser">戻る</a>
<a href="/sessionex/RegisterUser?action=done">送信</a>
</div>
</div>
</body>
</html>