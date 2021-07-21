<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	사원번호 ${employeeCommand.employeeId} <div></div>
	아이디 ${employeeCommand.empUserId} <div></div>
	이름 : ${employeeCommand.empName} <div></div>
	입사일 ${employeeCommand.hireDate} <div></div>
	직무 : ${employeeCommand.jobId} <div></div>
	연락처 ${employeeCommand.phNumber} <div></div>
	사무실번호 ${employeeCommand.officeNumber} <div></div>
	이메일 : ${employeeCommand.email} <div></div>
	주소 : ${employeeCommand.empAddress}
	<a href="empUpdate">수정</a>
</body>
</html>