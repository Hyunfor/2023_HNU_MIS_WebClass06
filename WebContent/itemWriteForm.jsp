<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>정보 입력 폼</title>
</head>
<body>
	<form method="post" action="ItemServlet">
		<h2>정보 입력 폼</h2>
		<table>
			<tr>
				<td><label for="name">상품명 : </label></td>
				<td><input type="text" id="name" name="name"></td>
			</tr>
			<tr>
				<td><label for="price">가격 : </label></td>
				<td><input type="text" id="price" name="price"></td>
			</tr>
			<tr>
				<td><label for="description">설명 : </label></td>
				<td><input type="text" name="description" /> <script type="text/x-template"></script></td>
			</tr>
			<tr>
				<td><label for="user">관리자 : </label></td>
				<td><input type="text" id="user" name="user"></td>
			</tr>
			<tr>
				<th>
					<td id="button" align="center">
						<input type="submit"value="전송">
					 	<input type="reset" value="취소">
					</td>
				</th>
			</tr>
		</table>
	</form>
</body>
</html>