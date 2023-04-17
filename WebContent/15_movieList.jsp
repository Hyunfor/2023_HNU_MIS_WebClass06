<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>영화 목록</title>
</head>
<body>
	<%
		// 추후 Controllor에서 설정할 값
		String[] movieList = { "타이타닉", "시네마천국", "혹성탈출", "킹콩", "스타워즈" };
		pageContext.setAttribute("movieList", movieList);
	%>

	<table border="1">
		<tr>
			<th>index</th>
			<th>count</th>
			<th>영화제목</th>
		</tr>
		<c:forEach var="movie" items="${movieList }" varStatus="status">
			<tr>
				<td>${status.index }</td>
				<td>${status.count }</td>
				<td>${movie }</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>