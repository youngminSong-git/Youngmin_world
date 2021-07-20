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
	<form action="pwChangeOk" name="frm" method="post">
		<label for="pw">
			비밀번호 : <input type="password" name="memPw" id="pw" />
			<span>${pwFail1}</span>
			<input type="submit" value="확인" />
		</label>
	</form>
</body>
</html>