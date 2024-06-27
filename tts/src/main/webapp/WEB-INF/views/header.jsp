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
	
	<title>Main Page</title>

	<style>
    .sidebar {
        float: left;
        width: 15%; /* 원하는 너비로 조정 */
        min-width: 250px;
        background-color: #f0f0f0;
        box-sizing: border-box; /* padding, border 포함하여 너비 조정 */
    }
    .layout-content {
        margin-left: 25%; /* 사이드바 너비 + 여백 만큼 메인 콘텐츠를 밀어줌 */
        box-sizing: border-box;
    }
</style>

</head>
<body>
	<header class="layout_header">
	<a href="" class="">
		<h1 class="layout_header__logo">
			<img src="/resources/images/common/logo_main.svg" class="_logo" alt="">
		</h1>
	</a>
	
	<section class="header_info_group">
		<span class="header_info_txt">관리자</span>
		<span class="header_info_txt"><b>홍길동(admin)</b>님</span>
		<a href="#none" class="btn_header_info_modify">정보수정</a>
		<span class="_bar"></span>
		<button type="button" class="header_info_logout" title="로그아웃">
			<i class="icon_logout"></i>
		</button>
	</section>
</header>