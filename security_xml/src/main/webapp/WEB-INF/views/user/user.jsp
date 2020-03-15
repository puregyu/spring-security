<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/security/tags"
	prefix="sec"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	user page
	<div>
		<a href="<c:url value="/admin" />">admin page 바로가기</a>
	</div>
	<div>
		<a href="<c:url value="/user" />">user page 바로가기</a>
	</div>
	<div>
		<a href="<c:url value="/guest" />">guest page 바로가기</a>
	</div>
	<form action="/logout" method="post">
		<input type="submit" value="로그아웃">
	</form>
</body>
</html>