<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="loginList" method="post">
		<input type="text" name="idField" placeholder="ID"> <br>
		<input type="text" name="pwField" placeholder="PASSWORD"> <br>
		<button id="login_process">LOGIN</button>

	</form>
	<script src="http://ajax.aspnetcdn.com/ajax/jQuery/jquery-3.3.1.min.js"></script>
	<script>
		alert('아이디 및 비밀번호를 잘못 입력하셨습니다. 다시입력해주세요');

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