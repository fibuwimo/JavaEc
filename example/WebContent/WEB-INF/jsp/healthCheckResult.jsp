<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="model.Health"%>
<%
Health health = (Health) request.getAttribute("health");
%>
<%
String path = "cry";
if (health.getBodyType().equals("普通")) {
	path = "laugh";
}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>スッキリ健康診断</title>
<link rel="stylesheet" href="/example/css/main.css">
</head>
<body>
	<h1>スッキリ健康診断の結果</h1>
	<div id="container">
		<div id="boxA">
			<p>
				身長:<%=health.getHeight()%><br> 体重:<%=health.getWeight()%><br>
				BMI:<%=health.getBmi()%><br> 体型:<%=health.getBodyType()%><br>
			</p>
			<a href="/example/HealthCheck">戻る</a>
		</div>
		<div id="boxB">
			<div class="imgBox">
				<img src="/example/images/<%=path%>.png" alt="">
				</div>
			</div>
		</div>
</body>
</html>