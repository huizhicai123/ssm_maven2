<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="login.do" method="POST">
		<input type="text" name="acc_no" placeholder="请输入账号" ><br>
		<input type="password" name="acc_password" placeholder="请输入密码"><br>
		<input type="submit" value="登录"> ${msg}
		
	</form>
</body>
</html>