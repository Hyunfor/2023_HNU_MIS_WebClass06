<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>LoginForm</title>
</head>
<body>
	<form method="post" action="LoginServlet">
		<table>
			<tr>
				<td><label for="userId">아이디 : </label></td>
				<td><input type="text" id="userId" name="userId"></td>
			</tr>
			<tr>
				<td><label for="userPwd">비밀번호 : </label></td>
				<td><input type="password" id="userPwd" name="userPwd"></td>
			</tr>
			<tr>
				<td><label for="admin">관리자</label><input type="radio" id="admin" name="userType" value="1"></td>
				<td><label for="user">사용자</label><input type="radio" id="user" name="userType" value="2"></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="로그인"></td>
			</tr>
		</table>
	</form>
</body>
</html>