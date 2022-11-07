<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%
    request.setCharacterEncoding("UTF-8");
%>

<html>
<head>
<meta charset="utf-8"/>
<title>Home</title>
</head>
<body>
	<h1>Hello world!</h1>
	<table>
		<tr>
			<form action="saveMbrshpPoint" method="post">
				<td><input name="partnerId" type="text"></td>
				<td><input name="mbrshpBrcdId" type="text"></td>
		</tr>
		<tr>
			<input type="submit" value="입력">
		</tr>
		</form>
	</table>
</body>
</html>