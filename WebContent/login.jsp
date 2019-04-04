<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>よこそ、XXX学校管理システム</h1>
	<br>
	<hr>
	<br>

	<div id="user1">
		<h3>会員登録</h3>
		<form id="touroku" action="gotouserpage" method="post">
			<label> 名 前: </label> <input id="userid" type="text" name="username"
				size="21" /> <br> <label> パスワード: </label> <input id="pass"
				type="password" name="userpass" size="22" /> <br> <input
				id="bt" type="submit" value="確認" />
		</form>
	</div>


	<br>
	<br>
	<div id="user2">
		<h3>新規会員申し込み</h3>
		<!--
	<button id="bott" type="button">
		<font color="blue">新規会員登録</font>
	</button>
	 -->
		<form id="sinki" action="sinkikaiin" method="post">
			<span>名 前: </span> <input id="userid" type="text" name="username"
				size="21" /> <br> <span>パスワード:</span> <input id="pass"
				type="password" name="userpass" size="22" /> <br> <input
				id="bt" type="submit" value="確認" />
		</form>

	</div>


	<div id="user3"></div>




</body>
</html>