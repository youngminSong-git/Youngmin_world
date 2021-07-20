<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%
	pageContext.setAttribute("cn", "\n");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a href="prodModify?prodNum=${goodsCommand.prodNum}">수정</a>
	<table>
		<tbody>
			<tr>
				<th>카테고리 : </th>
				<td>
					<c:if test="${goodsCommand.ctgr=='wear'}">의류</c:if>
					<c:if test="${goodsCommand.ctgr=='cosmetic'}">화장품</c:if>
					<c:if test="${goodsCommand.ctgr=='food'}">음식</c:if>
					<c:if test="${goodsCommand.ctgr=='car'}">자동차용품</c:if>
				</td>
			</tr>
			<tr>
				<th>상품번호 : </th>
				<td>${goodsCommand.prodNum}</td>
			</tr>
			<tr>
				<th>상품명  : </th>
				<td>${goodsCommand.prodName}</td>
			</tr>
			<tr>
				<th>상품 가격 : </th>
				<td>
					<fmt:formatNumber value="${goodsCommand.prodPrice}"  type="currency" />
				</td>
			</tr>
			<tr>
				<th>규격 : </th>
				<td>${goodsCommand.prodCapacity}</td>
			</tr>
			<tr>
				<th>공급 업체 : </th>
				<td>${goodsCommand.prodSupplyer}</td>
			</tr>
			<tr>
				<th>배송비 : </th>
				<td>${goodsCommand.prodDelFee}</td>
			</tr>
			<tr>
				<th>추천 여부 : </th>
				<td>
					<c:if test="${goodsCommand.recommend == 'Y'}">추천</c:if>
					<c:if test="${goodsCommand.recommend == 'N'}">비추천</c:if>
				</td>
			</tr>
			<tr>
				<th>상세정보 : </th>
				<td>
					${fn:replace(goodsCommand.prodDetail, cn, "<br />") }
					<c:forTokens items="${goodsCommand.prodImage}" delims="," var="prodImage">
						<img src="../goods/upload/${prodImage}" />
					</c:forTokens>
				</td>
			</tr>
		</tbody>
	</table>
</body>
</html>