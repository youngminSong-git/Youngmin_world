<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
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
</head>
<body class="empInfo emInfo">
	<div id="wrap">
		<div class="wrap_inner">
			<%@ include file="/WEB-INF/view/include/header.jsp" %>
			<div id="container">
				<div class="container_inner">
					<div class="content">
						<div class="inner">
							<h2 class="tit">직원 정보</h2>
							<div class="table_wrap">
								<table>
									<caption>정보 수정 테이블</caption>
									<colgroup>
										<col style="width:50%;"/>
										<col style="width:50%;"/>
									</colgroup>
									<tbody>
										<tr>
											<th>사원번호</th>
											<td>${emp.employeeId}</td>
										</tr>
										<tr>
											<th>아이디</th>
											<td>${emp.empUserId}</td>
										</tr>
										<tr>
											<th>이름</th>
											<td>${emp.empName}</td>
										</tr>
										<tr>
											<th>입사일</th>
											<td><fmt:formatDate value="${emp.hireDate}" type="date" pattern="yyyy-MM-dd"/></td>
										</tr>
										<tr>
											<th>직무</th>
											<td>${emp.jobId}</td>
										</tr>
										<tr>
											<th>연락처</th>
											<td>${emp.phNumber}</td>
										</tr>
										<tr>
											<th>사무실번호</th>
											<td>${emp.officeNumber}</td>
										</tr>
										<tr>
											<th>이메일</th>
											<td>${emp.email}</td>
										</tr>
										<tr>
											<th>주소</th>
											<td>${emp.empAddress}</td>
										</tr>
									</tbody>
								</table>
							</div>
							<div class="btn_wrap">
								<a href="empModify?empId=${emp.employeeId}">수정</a> | 
								<a href="empList" >리스트로 가기</a>
							</div>  
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>