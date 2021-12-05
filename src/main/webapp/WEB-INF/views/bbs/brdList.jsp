<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
		<table id="mtable">
			<tr>
				<th>No.</th>
				<th>Title</th>
				<th>Writer</th>
			</tr>
			<tr>
				<c:forEach items="${brdList}" var="vo" varStatus="status">
					<tr>
						<th>${status.count + pageVO.perPageNum * (pageVO.page-1)}</th>
						<th><a class="mlink" href=brdDetail?vno=${vo.no}>${vo.title}</a></th>
						<th>${vo.name}</th>
					</tr>
				</c:forEach>
			</tr>
			<tr>
				<th><c:if test="${pageVO.prev}">
						<a href="brdList?page=${pageVO.startPage-1}">[이전]</a>
					</c:if> <c:forEach begin="${pageVO.startPage}" end="${pageVO.endPage}"
						var="idx">
						<a href="brdList?page=${idx}">${idx}</a>
					</c:forEach> <c:if test="${pageVO.next}">
						<a href="brdList?page=${pageVO.endPage+1}">[Next]</a>
					</c:if></th>
			</tr>
		</table>
	</section>
</body>
</html>