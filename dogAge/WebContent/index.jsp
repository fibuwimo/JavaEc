<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>イッヌ</title>
</head>
<body>
<form action="/dogAge/Result" method="Post">
<div style=margin-bottom:10px;>
犬の名前:
<input type="text" name="name"><br>
</div>
<div style=:margin-bottom:10px;>
犬の年齢:
<input min=0 max=30 style=width:30px; type="number" name="age"><br>
</div>
<input style=width:200px;height:150px;margin-top:10px; type="submit" value="送信">
</form>
</body>
</html>