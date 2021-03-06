<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="<%=request.getContextPath() %>/css/common.css" />
<style>
	table{border:1px solid #000;}
	caption{display:none;}
</style>
</head>
<body>
상품리스트 페이지입니다.<br />
<table>
	<caption>상품리스트</caption>
	<thead>
		<tr>
			<th>상품번호</th>
			<th>카테고리</th>
			<th>상품명</th>
			<th>가격</th>
		    <th>배송비</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${lists}" var="dto">
			<tr>
				<td>
					<a href="prodDetail?prodNum=${dto.prodNum}">${dto.prodNum}</a>
				</td>
			    <td>${dto.ctgr }</td>
				<td>${dto.prodName }</td>
				<td>가격</td>
			    <td>${dto.prodDelFee}</td>
			</tr>
		</c:forEach>
	</tbody>
</table>
<a href="goodsRegist" >상품등록</a>
</body>
</html>