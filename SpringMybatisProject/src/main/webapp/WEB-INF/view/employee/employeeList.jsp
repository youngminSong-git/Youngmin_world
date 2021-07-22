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
	caption{display:none;]}
</style>
</head>
<body class="empList">
	<div id="wrap">
		<div class="wrap_inner">
			<%@ include file="/WEB-INF/view/include/header.jsp" %>
			<div id="container">
				<div class="container_inner">
					<div class="content">
						<div class="table_wrap">
							<div class="inner">
								<h2 class="tit">등록된 직원 리스트입니다.</h2>
								<c:if test="${!empty empList}">
								<table class="table">
									<caption>직원 리스트 테이블</caption>
									<colgroup>
										<col style="width:20%"/>
										<col style="width:20%" />
										<col style="width:20%"/>
										<col style="width:20%"/>
										<col style="width:20%"/>
									</colgroup>
									<tbody>
										<thead>
											<tr>
												<th>사원번호</th>
												<th>이름</th>
												<th>직무</th>
												<th>입사일</th>
												<th>사무실번호</th>
											</tr>
										</thead>
										<tbody>
											<c:forEach items="${empList }" var="dto">
												<tr>
													<th>
														<a href="empInfo?empId=${dto.employeeId}">${dto.employeeId}</a>
													</th>
													<td>${dto.empName}</td>
													<td>${dto.jobId}</td>
													<td>
														<fmt:formatDate value="${dto.hireDate}" type="date" pattern="yyyy-MM-dd" />
													</td>
													<td>${dto.officeNumber}</td>
												</tr>
												<tr>
													<td colspan="5">
														<%@ include file="../include/includePage.jsp" %>
													</td>
												</tr>
											</c:forEach>
										</tbody>
									</tbody>
								</table>
								</c:if>
								<c:if test="${empty empList }">
								등록된 직원 없습니다.
								</c:if>
								<div class="btn_wrap">
									<a href="empRegist">직원등록 바로가기</a>
									<a href="/SpringMybatisProject/main">메인으로 가기</a>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
			<%@ include file="/WEB-INF/view/include/footer.jsp" %>
		</div>
	</div>
</body>
</html>