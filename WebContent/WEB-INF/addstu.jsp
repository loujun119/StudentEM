<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html >
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="css/addstu.css" rel="stylesheet" type="text/css">
<script type="text/javascript" src="./js/jquery-3.3.1.js"></script>
<script type="text/javascript" src="./js/addstu.js"></script>


<% %>
</head>
<body>
	<div id="titel">
		<h1 align="center">学生信息一览</h1>
		<br>
		<hr>
		<br>
	</div>

	<div id="box">
		<div id="table">
			<table border="3" align="center">
				<tr>
					<th>順番</th>
					<th>名前</th>
					<th>生年月日</th>
					<th>年齢</th>
					<th>成績</th>
					<th>クラスナンバー</th>
					<th>住所</th>
				</tr>
				<c:forEach items="${studentList}" var="student">
					<tr>
						<th>${student.id}</th>
						<th>${student.name}</th>
						<th>${student.birthday}</th>
						<th>${student.age}</th>
						<th>${student.score}</th>
						<th>${student.classId}</th>
						<th>${student.address}</th>
					</tr>
				</c:forEach>
			</table>
		</div>

		<div id="add" align="center">
			<h3>学生情報を追加</h3>
			<form id="addStudent" action="addStudent" method="post">

				<input id="addname" type="text" name="name" placeholder="名前" /> <br>
				<div id="checkname"></div>
				<br> <input id="addbirthday" type="text" name="birthday"
					placeholder="生年月日" /> <br> <input id="addage" type="text"
					name="age" placeholder="年齢" /> <br> <input id="addscore"
					type="text" name="score" placeholder="成績" /> <br> <input
					id="addclassid" type="text" name="classid" placeholder="クラスナンバー" />
				<br> <input id="bot" type="submit" />
			</form>
		</div>
	</div>

	<div id="foot" align="center">
		<br> <br>
		<hr>
		<a href="goToHomePage">ホームページへ帰る</a> <br> <br>
	</div>

</body>
</html>