<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href='${pageContext.request.contextPath}/resources/css/brd.css' rel='stylesheet' type='text/css'>
</head>
<body>
	<header>
		<!--     메인 -->
		<a href="brdForm" id="main">BaekBoard</a>
	</header>
	<nav id="tMenu">
		<ul>
			<li><a class="mlink" href="#">ABOUT</a></li><li> | </li>
			<li><a class="mlink" href="addUsrForm">New MEMBER</a></li><li> | </li>
			<li><a class="mlink" href="usrList">All MEMBER</a></li><li> | </li>
			<li><a class="mlink" href="brdInput">New MEMO</a></li><li> | </li>
			<li><a class="mlink" href="brdList">All MEMO</a></li><li> | </li>
			<li><a class="mlink" href="https://popcat.click/" target="_blank">POPCAT</a></li>
		</ul>
	</nav>
	<section id="content">
	<form action="usrSave" method="post">
		<table id="itable">
			<tr>
				<th>ID :</th>
				<th><input type="text" placeholder="아이디를 입력하세요" name="id"
					id="" /></th>
			</tr>
			<tr>
				<th>PW :</th>
				<th><input type="text" placeholder="비밀번호를 입력하세요" name="pw" id="" /></th>
			</tr>
			<tr>
				<th>NAME :</th>
				<th><input type="text" placeholder="이름을 입력하세요" name="name" id="" /></th>
			</tr>
			<tr>
				<th colspan="4"><input onclick="alert('회원 가입 되었습니다')" type="submit" value="Save" id="btn" /></th>
			</tr>
		</table>
	</form>
	</section>
</body>
</html>