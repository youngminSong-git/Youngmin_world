<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="<%=request.getContextPath() %>/css/common.css" />
<script src="../js/jquery-2.2.24.min.js"></script>
<script>
	/* 유효성 */
	$(function(){
		$("#btn").click(function(){
			if($("#memPw").val() == ""){
				alert("현재 비밀번호를 입력하세요.");
				$("#memPw").focus();
				return false;
			}
			if($("#newPw").val() == ""){
				alret("변경할 비밀번호를 입력하세요.");
				$("#newPw").focus();
				return false;
			}
			if($("#newPwCon").val() == ""){
				alert("변경할 비밀번호 확인을 입력하세요.");
				$("#newPwCon").focus();
				return false;
			} else {
				if($("#newPw").val() != $("#newPwCon").val()){
					alert("비밀번호 확인의 값이 다릅니다.");
					$("#newPw").val();
					return false;
					$("#newPw").val("");
					$("#newPwCon").val("");
					$("#newPw").focus();
				}
			}
			$("#frm").submit();
		});
	});
</script>
</head>
<body>
<form action="ChangePw" method="post" name="frm" onclick="return pwChk();">
	<label for="memPw">
		현재 비밀번호 : <input type="password" name="memPw" id="memPw"/> <br />
	</label>
	<label for="newPw">
		변경할 비밀번호 : <input type="password" name="newPw" id="newPw"/> <br />
	</label>
	<label for="newPwCk">
		변경할 비밀번호 확인 : <input type="password" name="new_PwCon" id="newPwCk"/>
	</label>
	<input type="submit" value="비밀번호 변경" id="btn" />
</form> 
</body>
</html>