<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html >
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="./css/update.css" rel="stylesheet" type="text/css" />
<title>Insert title here</title>
<script type="text/javascript" src="./js/jquery-3.3.1.js"></script>
<script type="text/javascript" src="./js/update.js"></script>
<script src="https://ajaxzip3.github.io/ajaxzip3.js"></script>
</head>
<body>
	<div id="titel" align="center">
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
			<h3>学生更新</h3>
			<form id="upStudent" action="update" method="post">
				<input id="upid" type="text" name="id" placeholder="学生のIDを入力してください" />
				<br> <input id="upname" type="text" name="name"
					placeholder="名前を入力してください" /> <br> <input id="upbir"
					type="text" name="birthday" placeholder="生年月日を入力してください" /> <br>
				<input id="upage" type="text" name="age" placeholder="年齢を入力してください" />
				<br> <input id="upscore" type="text" name="score"
					placeholder="成績を入力してください" /> <br> <input id="upclassid"
					type="text" name="classid" placeholder="クラスを入力してください" /> <br>
				<input id="upSub" type="submit" />
			</form>
		</div>

		<div id="box3">

			<h3>学生の住所を追加する</h3>
			<form id="upaddress" action="addaddress" method="post">
				<input id="StuId" type="text" placeholder="学生のID" size="10"
					name="id" /> &nbsp;&nbsp;-&nbsp;&nbsp; <input id="PostalCode"
					type="text" placeholder="学生の郵便番号" name="zip11" size="20"
					maxlength="8"
					onKeyUp="AjaxZip3.zip2addr(this,'','addr11','addr11');"> <br>
				<input id="Address" type="text" placeholder="都道府県と以降の住所"
					name="addr11" size="60"> <br> <input id="addSub"
					type="submit" />
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