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
	로그인 성공
	<sec:authorize access="isAuthenticated()">
	<%-- <sec:authentication var="principal" property="principal" />
		<div>${principal.username}님 반갑습니다.</div> --%>
		<div>
			<a href="<c:url value="/logout" />"></a>
		</div>
	</sec:authorize>
	<sec:authorize access="hasRole('ROLE_ADMIN')">
		<div>[관리자]시군요?</div>
		<div>당신이 접근할 수 있는 페이지는 admin, user, guest 입니다.</div>
	</sec:authorize>
	<sec:authorize access="hasRole('ROLE_GUEST')">
		<div>[게스트]시군요?</div>
		<div>당신이 접근할 수 있는 페이지는 guest 입니다.</div>
	</sec:authorize>
	<sec:authorize access="hasRole('ROLE_USER')">
		<div>[유저]시군요?</div>
		<div>당신이 접근할 수 있는 페이지는 user 입니다.</div>
	</sec:authorize>
	
	<div>
		<a href="<c:url value="/admin" />">admin page 바로가기</a>
	</div>
	<div>
		<a href="<c:url value="/user" />">user page 바로가기</a>
	</div>
	<div>
		<a href="<c:url value="/guest" />">guest page 바로가기</a>
	</div>
</body>
</html>