<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title><tiles:insertAttribute name="title" /></title>

	<style>
	    #sidebar-left {
	        float: left;
	        width: 15%; /* 원하는 너비로 조정 */
	        min-width: 250px;
	        background-color: #f0f0f0;
	        box-sizing: border-box; /* padding, border 포함하여 너비 조정 */
	    }
	</style>
</head>
<body>
	<div id="container">
		<tiles:insertAttribute name="header" />
		<div id="sidebar-left"> <!-- id명 변경 불가 -->
			<tiles:insertAttribute name="side" />
		</div>
		<tiles:insertAttribute name="body" />
		<c:if test="${ empty(post-form) }">
			<div id="footer">
				<tiles:insertAttribute name="footer" />
			</div>
		</c:if>
	</div>
</body>
</html>