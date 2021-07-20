<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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
<body class="empRegist">
<div id="wrap">
	<div id="wrap_inner">
		<%@ include file="/WEB-INF/view/include/header.jsp" %>
		<div id="container">
			<div class="content">
				<div class="inner">
					<h2 class="tit">직원등록</h2>
					<div class="table_wrap">
						<form:form action="empJoin" method="post" name="frm" modelAttribute="employeeCommand">
							<table>
								<caption>사원테이블</caption>
								<colgroup>
									<col style="width:50%;" />
									<col style="width:auto;"/>		
								</colgroup>
								<tbody>
									<tr>
										<th>사원번호</th>
										<td>                               				
											<form:input path="employeeId" /> <!-- 에러가 생겨도 input에 값이 저장되기 위해 -->
											<!-- <input type="text" name="jobId" value="${jobId}"> -->
											<form:errors path="employeeId" />
										</td>
									</tr>
									<tr>
										<th>사원아이디</th>
										<td>
											<form:input path="empUserId" />
											<form:errors path="empUserId" />
										</td>
									</tr>
									<tr>
										<th>비밀번호</th>
										<td>
											<form:password path="empPw" />
											<form:errors path="empPw" />
										</td>
									</tr>
									<tr>
										<th>비밀번호 확인</th>
										<td>
											<form:password path="empPwCon" />
											<form:errors path="empPwCon" />
										</td>
									</tr>
									<tr>
										<th>이름</th>
										<td>
											<form:input path="empName" />
											<form:errors path="empName" />
										</td>
									</tr>
									<tr>
										<th>입사일</th>
										<td>
											<input type="date" name="hireDate" />
											<form:errors path="hireDate" />
										</td>
									</tr>
									<tr>
										<th>직무</th>
										<td>
											<form:input path="jobId" />
											<form:errors path="jobId" />
										</td>
									</tr>
									<tr>
										<th>연락처</th>
										<td>
											<form:input path="phNumber" />
											<form:errors path="phNumber" />
										</td>
									</tr>
									<tr>
										<th>사무실번호</th>
										<td>
											<form:input path="officeNumber" />
											<form:errors path="officeNumber" />
										</td>
									</tr>
									<tr>
										<th>이메일</th>
										<td>
											<form:input path="email" />
											<form:errors path="email" />
										</td>
									</tr>
									<tr>
										<th>사무실 주소</th>
										<td>
											<form:input path="empAddress" />
											<form:errors path="empAddress" />
										</td>
									</tr>
									<tr class="last">
										<td colspan="2">
											<input type="submit" value="등록" />
										</td>
									</tr>
								</tbody>
							</table>
						</form:form>
					</div>
				</div>
			</div>
		</div>
		<%@ include file="/WEB-INF/view/include/footer.jsp" %>
	</div>
</div>
</body>
</html>