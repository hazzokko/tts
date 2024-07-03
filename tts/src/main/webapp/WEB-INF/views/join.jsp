<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="kr.co.mediazen.tts.model.Department" %>
<%@ page import="kr.co.mediazen.tts.model.Role" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Join Page</title>
</head>
<body>
	<h1>회원 가입</h1>
	<form action="/api/v1/auth/join" method="POST">
		<input type="text" name="id" placeholder="Id"/><br/>
		<input type="password" name="password" placeholder="Password"/><br/>
		<input type="text" name="username" placeholder="Username"/><br/>
		<input type="text" name="department" placeholder="Department"/><br/>
		<input type="text" name="phone" placeholder="Phone"/><br/>
		<input type="text" name="role" placeholder="Role"/><br/>
		<button type="submit">회원가입</button>
	</form>
</body>
</html>