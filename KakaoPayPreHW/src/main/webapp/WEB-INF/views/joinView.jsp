<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<!DOCTYPE html>
<html>
<head>
<style>

.main {
	zoom: 2;
}

.top {
	height: 500px;
	width: 300px;
	margin: auto; 
	/* 자동 중앙 정렬 */
/*  	 background-color: red;   */
	text-align: center;
	order-radius: 2em;
	padding: 5px 5px;
}

table {
margin:auto;
border:3px solid rgb(94, 94, 94);;
}
</style>
<meta charset="UTF-8">
<title>회원가입 페이지</title>
</head>
<body style="overflow: auto; padding-top: 300px;">
	<div class="main">
	<form action="joinList" method="post">
	<div class="top">
	<span width='1000' height='100'><h2>
				<img src="resources/ghost.jpg" width="50" height="50">Join with us!
			</h2></span> 
		<table border="1">
			<tr>
			<tr>
				<td>Name</td>
				<td><input type="text" name="name" id="name" placeholder="name"></td>
			</tr>
			<tr>
				<td>id</td>
				<td><input type="text" name="id" id="id" placeholder="id"></td>
			</tr>
			<tr>
				<td>passwd</td>
				<td><input type="text" name="passwd" id="passwd" placeholder="passwd"></td>
			</tr>
			<tr>
				<td>company</td>
				<td><input type="text" name="company" id="company" placeholder="company"></td>
			</tr>
			<tr>
				<td>department</td>
				<td><input type="text" name="department" id="department" placeholder="department"></td>
			</tr>
			<tr>
				<td colspan=2 style='text-align: right; border: 0px;'>
				<input type="submit" id="submit" value="입력"></td>
			</tr>
		</table>
	</form>
	</div>
	</div>
	<script src="http://ajax.aspnetcdn.com/ajax/jQuery/jquery-3.3.1.min.js"></script>
	<script>
		$(document).ready(
				/* jQuery 시작, DOM 객체 로드된 후 */
				function() {
					$("#submit").click(
							/* submit의 id를 가지는 
							// input 태그를 클릭하면 함수 실행 */
							function() {
								var json = {
										// json이라는 객체 생성
									name : $("#name").val()
									// idField라는 id를 가지는 태그의
									// 밸류값을 가져옴
								};
								
								// json 객체를 포이치문으로 돌린다
								for ( var str in json) {
									if (json[str].length >= 20) {
										// NameField 길이가 20이상이면
										// 아래를 출력한다
										alert("가입 실패! "
												+ $("#" + str).attr(
														"placeholder")
														+ " 20자 미만으로 입력하세요");
										// str은 json에 변수명을 가지고 
										// #아이디에서 속성 placeholder를 찾는다
										$("#" + str).focus();
										// 포커스를 올려준다
										return;
									} 
									else {
										alert("회원 가입 성공!");
										return;
									}

								}
							});
				});
	</script> 
</body>
</html>