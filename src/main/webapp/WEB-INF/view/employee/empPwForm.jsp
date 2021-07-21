<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	caption{display:none;}
</style>
</head>
<body>
	<form action="empPwUpdate" method="post">
		<table>
			<caption>비밀번호 변경</caption>
			<tbody>
				<tr>
					<th>비밀번호 입력 : </th>
					<td>
						<input type="password" name="empPw" />
						<span>${errPw}</span>
					</td>
				</tr>
				<tr>
					<td>
						<input type="submit" value="비밀번호확인" />
					</td>
				</tr>
			</tbody>
		</table>
	</form>
</body>
</html>