<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>スッキリ健康診断</title>
<link rel="stylesheet" href="/example/css/main.css">
</head>
<body>
	<h1>スッキリ健康診断</h1>
	<div id="container">
		<div id="boxA">
			<form action="/example/HealthCheck" method="post">
				身長:<input type="number" step=0.1 min=0 max=300 name="height"
					placeholder="例)165.4">(cm)<br> 体重:<input type="number"
					step=0.1 min=0 max=300 name="weight" placeholder="例)56.7">(kg)<br>
				<input type="image"  name="submit" class="button" src="/example/images/smile.png">
			</form>
		</div>
		<div id="boxB">
			<div class="imgBox">
				<img src="/example/images/smile.png" alt="">
				</div>
			</div>
		</div>
</body>
</html>