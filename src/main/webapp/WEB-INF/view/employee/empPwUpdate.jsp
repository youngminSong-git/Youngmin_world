<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form:form action="empPwUpdateOk" method="post" modelAttribute="EmployeeCommand">
		<table>
			<caption></caption>
			<colgroup>
				<col />
				<col />
			</colgroup>
			<tbody>
				<tr>
					<th>현재 비밀번호 : </th>
					<td>
						<input type="text" name="oldPw"/>
						<form:errors path="oldPw" />
					</td>
				</tr>
				<tr>
					<th>변경할 비밀번호 : </th>
					<td>
						<input type="text" name="empPw" />
						<form:errors path="empPw"/>	
					</td>
				</tr>
				<tr>
					<th>비밀번호 확인 : </th>
					<td>
						<input type="text" name="empPwCon" />
						<form:errors path="empPwCon"/>	
					</td>
				</tr>
				<tr>
					<td><input type="submit" value="비밀번호 변경"/></td>
				</tr>
			</tbody>
		</table>
	</form:form>
</body>
</html>