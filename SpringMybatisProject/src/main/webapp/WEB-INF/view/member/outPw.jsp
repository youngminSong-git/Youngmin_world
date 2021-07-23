<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="<%=request.getContextPath() %>/css/common.css" />
<script>
	function outConfim(){
		if(confirm("정말 탈퇴하시겠습니까?")){
			document.frm.submit();
		} else{
			return false;
		}
	}
</script>
</head>
<body>
	<form action="memOutOk" method="post" onsubmit="return outConfim()">
		<label for="pw">
			비밀번호 : <input type="password" name="memPw" id="pw"/>
			<span>${pwFail}</span>
			<input type="submit" value="탈퇴" />
		</label>
	</form>
</body>
</html>