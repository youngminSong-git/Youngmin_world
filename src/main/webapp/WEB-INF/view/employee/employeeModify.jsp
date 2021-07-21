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
<body class="empModify">
<div id="wrap">
	<div class="wrap_inner">
		<%@ include file="/WEB-INF/view/include/header.jsp" %>
		<div id="container">
			<div class="container_inner">
				<div class="content">
					<div class="inner">
						<h2 class="tit">정보 수정</h2>
						<form action="empModifyOk" method="post" name="frm">
							<input type="hidden" name="employeeId" value="${emp.employeeId}"/> <!-- value값 사원번호 넘어오게 하는 태그-->
							<table>
								<tbody>
									<tr>
										<th>사원번호</th>
										<td> ${emp.employeeId}</td>
									</tr>
									<tr>
										<th>사원아이디</th>
										<td>${emp.empUserId}</td>
									</tr>
									<tr>
										<th>이름</th>
										<td>${emp.empName}</td>
									</tr>
									<tr>
										<th>입사일</th>
										<td>
											<fmt:formatDate value="${emp.hireDate}" type="date" pattern="yyyy-MM-dd" />
										</td>
									</tr>
									<tr>
										<th>직무</th>
										<td>
											<input type="text" name="jobId" value="${emp.jobId}"/>
										</td>
									</tr>
									<tr>
										<th>연락처</th>
										<td>
											<input type="text" name="phNumber" placeholder="010-1234-1234" value="${emp.phNumber }"/>
										</td>
									</tr>
									<tr>
										<th>사무실번호</th>
										<td>
											<input type="text" name="officeNumber" placeholder="02-1234-1234" value="${emp.officeNumber }"/>
										</td>
									</tr>
									<tr>
										<th>이메일</th>
										<td>
											<input type="text" name="email" value="${emp.email }"/>
										</td>
									</tr>
									<tr>
										<th>사무실 주소</th>
										<td>
											<input type="text" name="empAddress" value="${emp.empAddress }"/>
										</td>
									</tr>
									<tr>
										<th colspan="2">
											<input type="submit" value="직원정보 수정" />
											<input type="button" value="직원 삭제" onclick="javascript:location.href='empDelete?empId=${emp.employeeId}'"/>
										</td>
									</tr>
								</tbody>
							</table>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>
</body>
</html>