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
	<form action="usrModSave" method="post">
		<table id="itable">
			<tr>
				<th>ID :</th>
				<th><input type="hidden" name="id" value=${oneData.id} />${oneData.id}</th>
			</tr>
			<tr>
				<th>New pw :</th>
				<th><input type="text" name="pw" placeholder=${oneData.pw} /></th>
			</tr>
			<tr>
				<th>New NAME :</th>
				<th><input type="text" name="name" placeholder=${oneData.name} /></th>
			</tr>
			<tr>
				<th colspan="2"><input onclick="alert('수정되었습니다')" type="submit" value="Save" id="btn" /></th>
			</tr>
		</table>
	</form>
	</section>
</body>
</html>