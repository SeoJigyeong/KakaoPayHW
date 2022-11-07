<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>첫 화면</title>


<style>
.head_image {
	background-color: grey;
	width: 500px;
	text-align: right;
}

.top {
	height: 50px;
/* 	background-color: red; */
	text-align: center;
	order-radius: 2em;
	border-bottom: 1px rgb(244, 244, 244);
	padding: 5px 5px;
}

.login {
	height: 50px;
	width: 1500px; 
/* 	background-color: yellow; */
	text-align: right;
	order-radius: 2em;
	border-bottom: 1px rgb(244, 244, 244);
	padding: 5px 5px;
}

.main {
	zoom: 2;
}

h2 {
	text-align: center;
}

#url {
	text-align: center;
	width: 300px;
	height: 30px;
	border-radius: 5px; /* 테두리 둥글게 5px 값을 준다 */
	background-color: white;
	/* outline: 3px;
	border: 3px; */
	outline-color: rgb(244, 244, 244);
}

#check {
	color: white;
	text-align: center;
	width: 100px;
	height: 36px;
	border-radius: 5px;
	background-color: rgb(94, 94, 94);
	outline: 0;
	border: 0;
}

.button {
	color: rgb(94, 94, 94);
	text-align: center;
	width: 80px;
	height: 30px;
	border-radius: 5px;
	background-color: white;
	border: 3px double rgb(94, 94, 94);
}

input, textarea:focus {
	outline: none;
} 
</style>

</head>
<body style="overflow: auto; padding-top: 300px;">
	<form method="post" name='fm' action="inputURL">
		<div class="main">
			<span width='1000' height='100'><h2>
					<img src="resources/ghost.jpg" width="50" height="50">Ghost
					Journal
				</h2></span>

			<div class="top">
				<input type="text" id="url" name="url" placeholder="URL을 입력해주세요"
					class="search-url"> <input type="submit" id="check"
					name="check" value="확인" class="search-submit">
			</div>
			<div class="top">
				<input type="submit" value="회원가입"
					onclick="javascript: form.action='tojoin';"> <input
					type="submit" value="로그인"
					onclick="javascript: form.action='tologin';">
			</div>
	</form>
	</div>
</body>

<script>
		alert('로그아웃 되었습니다');
</script>
</html>