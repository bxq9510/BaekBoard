<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
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
			<li><a class="mlink" href="brdList">All MEMO</a></li>
			<li>|</li>
			<li><a class="mlink" href="brdInput">New MEMO</a></li>
			<li>|</li>
			<li><a class="mlink" href="https://popcat.click/"
				target="_blank">POPCAT</a></li>
		</ul>
	</nav>
	<section id="content">
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
					href=brdDelete?vno=${oneData.no}  onclick="alert('삭제되었습니다')">Delete</a></th>
			</tr>
		</table>
	</section>
</body>
</html>