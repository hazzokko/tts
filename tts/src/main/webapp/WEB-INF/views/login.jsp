<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<!-- // 기본 meta -->
	
	<!-- stylesheet : @import 시키지 않는게 성능상 좋습니다. -->
	<link rel="stylesheet" href="<c:url value='/resources/css/vendor/normalize.css' />">
	<link rel="stylesheet" href="<c:url value='/resources/css/vendor/jquery.mCustomScrollbar.css' />">
	<link rel="stylesheet" href="<c:url value='/resources/css/style.css' />">
	<!-- // stylesheet -->
	
	<script src="<c:url value='/resources/js/vendor/jquery-3.5.1.min.js' />"></script>
	<script src="<c:url value='/resources/js/vendor/jquery.mCustomScrollbar.js' />"></script>
	<script src="<c:url value='/resources/js/common.js' />"></script>
	<script src="<c:url value='/resources/js/login.js' />"></script>
	
	<title>Login Page</title>
</head>
<body>
	<div class="login_wrap">
		<article class="login_box">
			<h1 class="login_title">
				<i class="icon_login_logo"></i><br/>Text To Speech
			</h1>

			<section class="login_form">
				<h1 class="login_form__title">로그인</h1>
				<form action="/login" method="POST">
					<input type="text" name="username" class="login_form_txt w100p" placeholder="사원번호" />
					<input type="password" name="password" class="login_form_txt w100p" placeholder="비밀번호" />
					<button type="submit" class="btn_login">로그인</button>
				</form>
			</section>
			
			<p class="login_sub_txt">비밀번호 초기화는 관리자에게 문의하세요.</p>
		</article>
	</div>
</body>
</html>