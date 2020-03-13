<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec" %>
<%@ taglib prefix="c"   uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- form action 값은 context path 값에 따라 앞부분 경로가 달라질 수 있음. -->
	<form action="/login" method="POST">
	<sec:csrfInput />
		<table>
			<tr>
				<td>아이디 : </td>
				<!-- name 값 : login_id 사용가능 -->
				<td><input type="text" name="devyu_username"/></td>
			</tr>
			<tr>
				<td>비밀번호 : </td>
				<!-- name 값 : login_password 사용가능 -->
				<td><input type="password" name="devyu_password"/></td>
			<tr>
				<td colspan="2">
					<input type="submit" name="submit" value="로그인">
				</td>
			</tr>
		</table>
	</form>
	
	<!-- 
	스프링 시큐리티는 예외가 발생할 경우 해당 예외에 대한 객체를 만들고
	이를 세션 객체에 저장을 하게 되는데 이때 세션 객체의 이름
	[SPRING_SECURITY_LAST_EXCEPTION] 
	 -->
	<c:if test="${not empty param.error}">
		<p>아이디 또는 비밀번호가 일치하지 않습니다.</p>
		<P>${sessionScope["SPRING_SECURITY_LAST_EXCEPTION"].message }
	</c:if>
	
</body>
</html>