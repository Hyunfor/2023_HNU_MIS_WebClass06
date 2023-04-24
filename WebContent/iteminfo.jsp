<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>item Info</title>
</head>
<body>
	<c:if test="${not empty sessionScope.item}">
		<h2>입력 완료된 정보</h2>
		<p>상품명 : ${item.name }</p>
		<p>가격 : ${item.price }</p>
		<p>설명 : ${item.description } </p>
		<p>관리자 : ${item.user }</p>		
	</c:if>
</body>
</html>