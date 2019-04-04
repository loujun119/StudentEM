<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html >
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="css/select.css" rel="stylesheet" type="text/css" />
<title>Insert title here</title>
<script type="text/javascript" src="./js/jquery-3.3.1.js"></script>
<script type="text/javascript" src="./js/select.js"></script>
</head>
<body>
	<div class="titel">
		<h1 align="center">学生信息一览</h1>
		<br>
		<hr>
		<br>
	</div>
	<div class="box">
		<div class="box1">
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
			<br> <a href="downloadstudent">DownLoad</a>
		</div>
		<div>
			<h2>学生一覧をCsv出力</h2>
			<form action="getOutPutToCsv" method="post">
				<input id="downloadSubmit" type="text" placeholder="ファイル名"
					name="name"> <input type="submit" value="Csv出力">
			</form>
		</div>

		<div class="box2" align="center">
			<h3>IDで学生情報を取得</h3>
			<form id="selId" action="queryId" method="post">
				<input id="mesId" type="text" placeholder="学生のIDを入力してください" name="id" />
				<input id="bot" type="submit" class="goto" />
			</form>
			<br>
			<h3>名前で学生情報を取得</h3>
			<form id="selName" action="queryName" method="post">
				<input id="mesname" type="text" placeholder="学生のIDを入力してください"
					name="name" /> <input id="bot1" type="submit" class="goto" />
			</form>

		</div>
		<br> <br>
	</div>




	<div class="box4" align="center">
		<br> <br>
		<hr>
		<a href="goToHomePage">ホームページへ帰る</a> <br> <br>
	</div>





</body>
</html>