<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form:form action="empUpdateOk" method="post" modelAttribute="employeeCommand">
	사원번호 ${dto.employeeId}
	아이디 ${dto.empUserId}
	이름 : ${dto.empName}
	입사일 ${dto.hireDate}
	직무 : ${dto.jobId}
	연락처 <input type="text" name="phNumber" value="${employeeCommand.phNumber}" />
	사무실번호 <form:input path="officeNumber" />
	이메일 : <input type="text" name="email" value="${employeeCommand.email}" />
	주소 : <input type="text" naem="empAddress" value="${employeeCommand.empAddress}" />
	<input type="submit" />
</form:form>
</body>
</html>