<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Main Page</title>
</head>
<body>
	<c:if test="${not empty sessionScope.member}">
		<p>${member.userId}님이 ${member.userType == 1 ? "관리자" : "유저"}로 로그인하셨습니다.</p>
		<p>비밀번호: ${member.userPwd}</p>
		<p>권한: ${member.userType}</p>
	</c:if>
</body>
</html>