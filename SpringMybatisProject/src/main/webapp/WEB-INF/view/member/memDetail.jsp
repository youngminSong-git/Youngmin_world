<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
<body>
	나의 상세 정보<br />
	아이디 : ${dto.memId } <br />
	이름 : ${dto.memName } <br />
	생년월일 : ${dto.memBirth } <br />
	성별 : ${dto.memGender } <br />
	우편번호 : ${dto.postNumber } <br />
	주소 : ${dto.memAddress } <br />
	상세주소 : ${dto.detailAdd } <br />
	연락처 : ${dto.memPhone } <br />
	이메일 : ${dto.memEmail } <br />
	계좌번호 : ${dto.memAccount }  <br />
	수신여부 : <c:if test="${dto.memEmailCk == 'Y' }" > 
				이메일 수신 함
			</c:if> 
			<c:if test="${dto.memEmailCk == 'N'}" > 
				이메일 수신 안함
			</c:if>
			<br />
<a href="memSujung">수정</a>
</body>
</html>