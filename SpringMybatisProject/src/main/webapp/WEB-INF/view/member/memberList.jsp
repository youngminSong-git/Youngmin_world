<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- css  -->
<link rel="stylesheet" href="<%=request.getContextPath() %>/resources/asset/css/common.css" />
<link rel="stylesheet" href="<%=request.getContextPath() %>/resources/asset/css/main.css" />
<link rel="stylesheet" href="<%=request.getContextPath() %>/resources/asset/css/sub.css" />
<title>Insert title here</title>
<!-- js -->
<script src="<%=request.getContextPath() %>/resources/asset/js/jquery-2.2.24.min.js"></script>
<script src="<%=request.getContextPath() %>/resources/asset/js/main.js"></script>
<style>
	caption{display:none;}
</style>
</head>
<body class="memList">
	<div id="wrap">
		<div class="wrap_inner">
			<%@ include file="/WEB-INF/view/include/header.jsp" %>
			<div id="container">
				<div class="container">
					<div class="container_inner">
						<div class="content">
							<h2 class="tit">등록된 회원 리스트입니다.</h2>
							<div class="table_wrap">
								<div class="inner">
									<table>
										<caption>회원리스트</caption>
										<colgroup>
											<col style="width:20%" />
											<col style="width:20%" />
											<col style="width:20%" />
											<col style="width:20%" />
											<col style="width:20%" />	
										</colgroup>
										<thead>
											<tr>
												<th>아이디</th>
												<th>이름</th>
												<th>연락처</th>
												<th>이메일</th>
												<th>주소</th>
											</tr>
										</thead>
										<tbody>
											<c:forEach items="${lists}" var="dto">
											<tr>
												<th>
													<a href="memInfo?memId=${dto.memId}">${dto.memId}</a>
												</th>
												<td>${dto.memName}</td>
												<td>${dto.memPhone}</td>
												<td>${dto.memEmail}</td>
												<td>${dto.memAddress} ${dto.detailAdd}</td>
											</tr>
											</c:forEach>
											<tr>
												<td colspan="5">
													<div class="page">
														<div class="left" style="float:left;">
															<c:if test="${page <= 1}">[이전]</c:if>
															<c:if test="${page > 1}">
																<a href="memList?page=${page - 1}">[이전]</a>
															</c:if>
														</div>
														<div>
															<c:forEach begin="${startPage }" end="${endPage }" var="i" step="1" >
																<a href="memList?page=${i }">[${i }]</a> &nbsp;
															</c:forEach>
														</div>
														<div class="right" style="float:right;">
															<c:if test="${page >= maxPage }">[다음]</c:if>
															<c:if test="${page < maxPage }">
																<a href="${pageUrl }?page=${page + 1 }">[다음]</a>
															</c:if>
														</div>
													</div>
												</td>
											</tr>
										</tbody>
									</table>
									<div class="btn_wrap">
										<a href="memRegist">회원등록 바로가기</a>
										<a href="/SpringMybatisProject/main">메인으로 가기</a>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>