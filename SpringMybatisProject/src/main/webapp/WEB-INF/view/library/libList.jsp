<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ include file="/WEB-INF/view/include/taglib.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	caption{display:none;}
</style>
</head>
<body>
	<table>
		<caption>자료실</caption>
		<thead>
			<tr>
				<th>번호</th>
				<th>제목</th>
				<th>등록일</th>
				<th>조회수</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${list}" var="dto" varStatus="cnt">
				<tr>
					<td>${cnt.count}</td>
					<td>
						<a href="libraryInfo?noticeNo=${dto.noticeNo}">${dto.noticeSub}</a>
					</td>
					<td>${dto.noticeDate}</td>
					<td>${dto.noticeCount}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<a href="libRegist">자료실 등록</a>
</body>
</html>