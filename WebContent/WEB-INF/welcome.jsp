<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html >
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div>
		<h1 align="center">学生管理システム</h1>
		<p align="right">
			<font color="red" size="6">${user}</font> <font color="red" size="6">${session}</font>

		</p>
		<hr>
	</div>
	<br>
	<div>
		<h3>
			<a href="goToStuPage">1.学生信息一览表</a>
		</h3>

		<h3>
			<a href="goToSelPage">2.学生信息查询</a>
		</h3>

		<h3>
			<a href="goToAddPage">3.学生信息增加</a>
		</h3>

		<h3>
			<a href="goToDelPage">4.学生信息删除</a>
		</h3>

		<h3>
			<a href="goToUpdatePage">5.学生信息修改</a>
		</h3>
	</div>

</body>
</html>