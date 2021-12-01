<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- 합쳐지고 최소화된 최신 CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
<!-- 부가적인 테마 -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">
<!-- 합쳐지고 최소화된 최신 자바스크립트 -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
<link href='${pageContext.request.contextPath}/resources/css/brd.css'
	rel='stylesheet' type='text/css'>
</head>
<body>
	<header>
		<!--     메인 -->
		<a href="brdForm" id="main">BaekBoard</a>
	</header>
	<nav id="tMenu">
		<ul>
			<li><a class="mlink" href="#">ABOUT</a></li>
			<li>|</li>
			<li><a class="mlink" href="addUsrForm">New MEMBER</a></li>
			<li>|</li>
			<li><a class="mlink" href="usrList">All MEMBER</a></li>
			<li>|</li>
			<li><a class="mlink" href="brdInput">New MEMO</a></li>
			<li>|</li>
			<li><a class="mlink" href="brdList">All MEMO</a></li>
			<li>|</li>
			<li><a class="mlink" href="https://popcat.click/"
				target="_blank">POPCAT</a></li>
		</ul>
	</nav>
	<section id="content">
		<div>
			<table id="mtable">
				<tr>
					<th>Title :</th>
					<th>${oneData.title}</th>
					<th>Writer :</th>
					<th>${oneData.name}</th>
				</tr>
				<tr>
					<th colspan="4">Memo</th>
				</tr>
				<tr>
					<th colspan="4">
						<table id="dtable">
							<tr>
								<th>${oneData.memo}</th>
							</tr>
						</table>
					</th>
				</tr>
				<tr>
					<th colspan="2">${oneData.mdate}</th>
					<th colspan="2">views : ${oneData.views}</th>
				</tr>
				<tr>
					<th colspan="4"><a href=brdMod?vno=${oneData.no}>Edit</a> / <a
						href=brdDelete?vno=${oneData.no} onclick="alert('삭제되었습니다')">Delete</a></th>
				</tr>
			</table>
		</div>
		<div>
			<form action="comSave?vno=${oneData.no}" method="post">
				<table id="mtable">
					<tr>
						<th>Comments</th>
					</tr>
				</table>
				<table id="ctable">
					<c:forEach items="${comList}" var="co">
						<tr>
							<th>${co.name} : ${co.com}</th>
						</tr>
					</c:forEach>
				</table>
				<table id="ctable">
					<tr>
						<th><input type="text" name="name" id="" placeholder="이름" /><input type="text" name="com" id="" placeholder="댓글을 입력하세요" /><input type="hidden" name="no" value=${oneData.no} /><input type="submit" value="입력" /></th>
					</tr>
				</table>
			</form>
		</div>
	</section>
</body>
</html>