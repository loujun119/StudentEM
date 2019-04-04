<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html >
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="./css/delete.css" rel="stylesheet" type="text/css">
<script type="text/javascript" src="./js/jquery-3.3.1.js"></script>
<script type="text/javascript" src="./js/delete.js"></script>
</head>
<body>
	<div align="center">
		<h1>学生信息一览</h1>
		<br>
		<hr>
		<br>
	</div>
	<div id="box">
		<div id="box1">
			<table border="3">
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

		<div id="box2">
			<h3>学生の情報を削除</h3>
			<form id="delStudent" action="delete" method="post">
				<input id="delID" type="text" name="id" placeholder="学生のIDを入力してください" />
				<input id="delsub" type="submit" />
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