<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
<style>

.main {
	zoom: 2;
}

.top {
	height: 250px;
	width: 300px;
	margin: auto; 
	/* 자동 중앙 정렬 */
 	/* background-color: red;  */
	text-align: center;
	order-radius: 2em;
	padding: 5px 5px;
	border:3px solid rgb(94, 94, 94);;
}

.button {
	color: rgb(94, 94, 94);
	text-align: center;
	width: 80px;
	height: 30px;
	border-radius: 5px;
	background-color: white;
	border: 3px double rgb(94, 94, 94);
	margin-top: 10px;
}

</style>
<meta charset="UTF-8">
<title>LOGIN PAGE</title>
</head>
<body style="overflow: auto; padding-top: 300px;">
	<div class="main">
	<form action="loginList" method="post">
	<div class="top">
		<span width='1000' height='100'><h2>
				<img src="resources/ghost.jpg" width="50" height="50">Login!
			</h2></span> 
		
		<input type="text" name="idField" placeholder="ID"> <br>
		<input type="text" name="pwField" placeholder="PASSWORD"> <br>
		<button id="login_process" class="button">LOGIN</button>
	</form>
	</div>
	</div>
	<script src="http://ajax.aspnetcdn.com/ajax/jQuery/jquery-3.3.1.min.js"></script>
	<script>
		$(document).ready(
				/* jQuery 시작, DOM 객체 로드된 후 */
				function() {
					$("#login_process").click(
							/* login_process의 id를 가지는 
							// button 태그를 클릭하면 함수 실행 */
							function() {
								var json = {
									// json이라는 객체 생성
									idField : $("#idField").val(),
									// idField라는 id를 가지는 태그의
									// 밸류값을 가져옴
									pwField : $("#pwField").val()
								// pwField라는 id를 가지는 태그의
								// 밸류값을 가져옴
								};

								// json 객체를 포이치문으로 돌린다
								for ( var str in json) {
									if (json[str].length == 0) {
										// idField나 pwField 길이가 0이면
										// 아래를 출력한다
										alert("PLEASE INPUT "
												+ $("#" + str).attr(
														"placeholder"));
										// str은 json에 변수명을 가지고 
										// #아이디에서 속성 placeholder를 찾는다
										$("#" + str).focus();
										// 포커스를 올려준다
										return;
									}

								}
							});
				});
	</script>
</body>
</html>