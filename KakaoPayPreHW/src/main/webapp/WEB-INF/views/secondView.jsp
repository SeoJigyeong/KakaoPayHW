<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>검색 후 화면</title>


<style>
.head_image {
	border-right: 1px solid grey;
	background-color: grey;
	width: 500px;
	text-align: right;
}

.top {
	height: 50px;
	border-right: 1px solid grey;
	background-color: white;
	text-align: center;
	order-radius: 2em;
	border-bottom: 3px solid #F4F4F4;
}

.body {
	height: 1500px;
	width: 1700px;
	/* background-color: blue; */
	margin-left: 100px;
	margin-top: 30px;
}

.left { /* 750 */
	width: 800px;
	height: 500px;
	/* background-color: yellow; */
	float: left;
	margin-top: 30px;
	margin-left: 50px;
	border-right: 3px solid #F4F4F4;
}

.right { /* 630 */
	width: 700px;
	height: 600px;
	/* background-color: green; */
	float: right;
	margin-top: 30px;
	margin-right: 50px;
}

/* 텍스트 박스 남는 공간 350 */
.textBox {
	width: 500px;
	height: 500px;
	border-color: LightGray;
	background-color: rgba(211, 211, 211, 0.2);
	border-radius: 2em;
}

.headBox {
	width: 500px;
	height: 40px;
	border-color: LightGray;
	background-color: rgba(211, 211, 211, 0.2);
	border-radius: 2em;
}
/* .normal {
	width: 200px;
	height: 100px;
	background-color: purple;
	border-radius: 2em;
	margin-top: 500px;
	margin-right: 100px;
	margin-left: 100px;
} */
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
	height: 37px;
	border-radius: 5px;
	background-color: rgb(94, 94, 94);
	outline: 0;
	border: 0;
}

input, textarea:focus {
	outline: none;
}

input, textarea {
	font-family: Georgia, "맑은 고딕", serif;
}
</style>

</head>
<body style="overflow: auto; padding-top: 150px;">
	<form action="inputURL" method="post" escapeXml="false">
		<header
			style="position: fixed; top: 0; height: 100px; background-color: white; width: 100%; border-bottom: 3px rgb(244, 244, 244);">
			<span><h2>
					<img src="resources/ghost.jpg" width="50" height="50">Ghost
					Journal
				</h2></span>
			<div class="top">
				<input type="text" name="url" id="url" placeholder="URL을 입력해주세요"
					class="search-url"> <input type="submit" id="check"
					value="확인" class="search-submit">
			</div>
		</header>
		<table border=1>
			<div class="body">
				<textarea class="headBox"
					style="margin-left: 250px; resize: none; text-align: left; overflow: hidden;"
					name='content'>	${titleArticle}</textarea>
				<textarea class="headBox"
					style="margin-left: 190px; resize: none; text-align: left; overflow: hidden;"
					name='content'>	${newTitle}</textarea>
				<div class="left">
					<textarea class="textBox"
						style="margin-left: 200px; resize: none; text-align: left;"
						name='content'>	${bodyArticle}</textarea>
				</div>
				<div class="right">
					<textarea class="textBox" name='content'
						style="resize: none; text-align: left;">	${newArticle}</textarea>
					<!-- </div>
				<div class="normal"></div>
				<div class="normal"></div>
				<div class="normal"></div>
				<div class="normal"></div> -->
				</div>
		</table>
	</form>
</body>
</html>

<!-- <script src="http://ajax.aspnetcdn.com/ajax/jQuery/jquery-3.3.1.min.js"></script>
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
	</script>  -->