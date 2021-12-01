<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
	<table id="mtable">
		<tr>
			<th>NO.</th>
			<th>ID</th>
			<th>PW</th>
			<th>NAME</th>
			<th>DAY</th>
			<th>Edit / Del</th>
		</tr>
		<tr>
			<c:forEach items="${usrList}" var="usr" varStatus="status">
				<tr>
					<th>${status.count}</th>
					<th>${usr.id}</th>
					<th>${usr.pw}</th>
					<th>${usr.name}</th>
					<th>${usr.day}</th>
					<th><a href=usrMod?uid=${usr.id}>Edit</a> / <a href="javascript:checkFlag('${usr.id}')" >Del</a></th>
				</tr>
			</c:forEach>
		</tr>
	</table>
	</section>
</body>
<script>
	function checkFlag(delid){
		if (confirm("삭제하시겠습니까?")==true) {
			alert("삭제되었습니다.");
			// 컨트롤러 이동
			location.herf='usrDelete?uid='+delid;
		}else {
			return; // 호출에 값을 넘기는 것이나, 함수를 종료하는 의미
		}
	}
</script>
</html>