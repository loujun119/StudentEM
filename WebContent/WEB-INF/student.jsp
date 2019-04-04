<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="css/student.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="./js/jquery-3.3.1.js"></script>
<script type="text/javascript" src="./js/student.js"></script>
<base
	href="${pageContext.request.scheme}://${pageContext.request.serverName}:${pageContext.request.serverPort}${pageContext.request.contextPath}/">
<title>学生管理システム</title>
<style type="text/css"></style>
</head>
<body>
	<div id="titel">
		<h1 align="center">学生信息一览</h1>
		<br>
		<hr>
		<br>
	</div>
	<div id="tablebox">
		<table id="table" border="3" align="center">
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

	<div id="page">

		<div id="page1">
			<span id="span1">共${totalPages}页,</span> <span id="span2">当前第${nowPageNum}页;</span>
		</div>

		<div id="page2">
			<form id="firstPage" action="goToStuPage" method="post">
				<input id="firstButton" type="submit" value="首頁" />
			</form>
		</div>

		<div id="page3">
			<form id="toPrefPage" action="getPrefPage" method="post">
				<input id="toPref" type="hidden" value="${nowPageNum}"
					name="prefpage" /> <input id="toLast" type="hidden"
					value="${totalPages}" name="lastPage" /> <input id="prefButton"
					type="submit" value="前に" />
			</form>
		</div>

		<div id="page4">
			<form id="toNextPage" action="getNextPage" method="post">
				<input id="toNext" type="hidden" value="${nowPageNum}"
					name="nextpage" /> <input id="nextButton" type="submit" value="次に" />
			</form>
		</div>

		<div id="page5">
			<form id="lastPage" action="goToLastPage" method="post">
				<input id="lastButton" type="submit" value="末頁" />
			</form>
		</div>

		<div id="page6">
			<form id="findPage" action="goToFindPage" method="post">
				<span>跳轉到<input id="findPageNO" type="text" name="pageNO"
					size="2" /></span> <input id="findButton" type="submit" value="確認" />
			</form>
		</div>

	</div>

	<button id="butttttt" type="button">tttttt</button>

	<br>
	<br>
	<div id="foot" align="center">
		<br> <br>
		<hr>
		<a href="goToHomePage">ホームページへ帰る</a> <br> <br>
	</div>
	<a href="WebContent\WEB-INF\welcome.jsp">gogogo</a>
</body>
</html>