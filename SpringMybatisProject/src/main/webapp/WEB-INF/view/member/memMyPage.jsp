<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
<body class="memMypage">
	<div id="wrap">
		<div class="wrap_inner">
			<%@ include file="/WEB-INF/view/include/header.jsp" %>
			<div class="container">
				<div class="content">
					<ul>
						<li>
							<a href="memDetail" >회원정보</a> |
						</li>
						<li>
							<a href="memPwChange">비밀번호 변경</a> |
						</li>
						<li>
							<a href="goodsCartList">장바구니</a> |
						</li>
						<li>
							<a href="OrderProcessList">구매확인</a> |
						</li>
						<li>
							<a href="memOut">회원탈퇴</a>	
						</li>
					</ul>  
				</div>
			</div>
		</div>
	</div>
</body>
</html>