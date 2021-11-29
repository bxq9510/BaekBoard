<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href='${pageContext.request.contextPath}/resources/css/brd.css' rel='stylesheet' type='text/css'>
<script> 
// 	document.getElementById('title').value = ${oneData.title};
// 	$("#memo").val(${oneData.memo});
// 	document.getElementById('title').value = ${oneData.title};
</script>
</head>
<body>
	<header>
		<!--     메인 -->
		<a href="brdForm" id="main">BaekBoard</a>
	</header>
	<nav id="tMenu">
		<ul>
			<li><a class="mlink" href="#">ABOUT</a></li><li> | </li>
			<li><a class="mlink" href="brdList">All MEMO</a></li><li> | </li>
			<li><a class="mlink" href="brdInput">New MEMO</a></li><li> | </li>
			<li><a class="mlink" href="https://popcat.click/" target="_blank">POPCAT</a></li>
		</ul>
	</nav>
	<section id="content">
	<form action="brdModSave" method="post">
		<table id="itable">
			<tr>
				<th>Title :</th>
				<th><input type="text" name="title" id="title" value=${oneData.title} /></th>
				<th>Writer :</th>
				<th><a name="name">${oneData.name}</a></th>
			</tr>
			<tr>
				<th colspan="4">Memo</th>
			</tr>
			<tr>
				<th colspan="4"><textarea name="memo" id="memo" cols="30" rows="10">${oneData.memo}</textarea></th>
				<input type="hidden" name="no" value=${oneData.no} />
			</tr>
			<tr>
				<th colspan="4"><input onclick="alert('수정되었습니다')" type="submit" value="Save" id="btn" /></th>
			</tr>
		</table>
	</form>
	</section>
</body>
</html>