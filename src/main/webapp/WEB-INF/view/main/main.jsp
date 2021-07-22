<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
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
<body class="main">
<div id="skipNavi">
	<a href="#header">헤더 바로가기</a>
	<a href="#container">컨텐츠 바로가기</a>
</div>
<div id="wrap">
	<div class="wrap_inner">
		<%@ include file="/WEB-INF/view/include/header.jsp" %>
		<div id="container">
			<div class="container_inner">
				<div class="login">
					<div class="inner">
					<!-- 로그인 안된 경우  -->
						<c:if test="${empty authInfo}">
							<div class="main_table_wrap">
								<h2 class="login_tit">로그인해주세요.</h2>
								<form:form action="login" method="post" name="frm" class="form" modelAttribute="loginCommand">
									<table>
										<caption>로그인 테이블</caption>
										<thead>
											<tr>
												<td colspan="3">아이디저장/자동로그인</td>
											</tr>
										</thead>
										<tbody>
											<tr>
												<th>
													<label for="userId">아이디</label>
												</th>
												<td>
													<form:input path="userId" id="userId" />
													<form:errors path="userId" />
												</td>
												<td>
													<input type="image" src="image/img1.jpg" style="width:100px;" alt="login" />
												</td>
											</tr>
											<tr>
												<th>
													<label for="userPw">비밀번호</label>
												</th>
												<td>
													<form:password path="userPw" />
													<form:errors path="userPw" />
												</td>
											</tr>
											<tr>
												<td>
													<a href="search/idFind">아이디</a>/
													<a href="search/findPassword" >비밀번호 찾기</a> | 
													<a href="register/agree">회원 가입</a>
												</td>
											</tr>
										</tbody>
									</table>
								</form:form>
							</div>
						</c:if>
						<!-- //로그인 안된 경우  -->
						<!-- 로그인 된 경우 -->
						<c:if test="${!empty authInfo}">
							<!-- 일반 사용자단  -->
							<c:if test="${authInfo.grade == 1}">
								<ul>
									<li>
										<a href="edit/myPage">마이페이지</a>
									</li>
									<li>
										<a href="cart/goodsCartList">장바구니</a>
									</li>
									<li>
										<a href="cart/OrderProcessList">구매확인</a>
									</li>
								</ul>
								<table class="table2">
									<tbody>
										<tr>
											<c:forEach items="${lists}" var="dto" varStatus="cnt">
												<td>
													<a href="prod/goodsView?prodNum=${dto.prodNum}">
														<c:if test="${dto.prodImage != null}">
															<img src="goods/upload/${dto.prodImage.split(',')[0]}" alt="상품이미지" style="width:200px; height:200px;" />
														</c:if>
													</a>
													<br />
													<c:if test="${dto.prodImage==null}">
													
													</c:if>
													${dto.prodName} <br />
													<fmt:formatNumber value="${dto.prodPrice}" type="currency" />
												</td>
												<c:if test="${cnt.count % 3 == 0}">
										</tr>
										<tr>
												</c:if>
											</c:forEach>
											<colgroup>
												<col style="width:33.3%" />
												<col style="width:33.3%" />
												<col style="width:33.3%"/>
											</colgroup>
										</tr>
									</tbody>
								</table>
							</c:if>
							<!-- //일반 사용자단  -->
							<!-- 관리자단 -->
							<c:if test="${authInfo.grade != 1}">
								<div class="emp1">
									<div class="inner">
										<div class="emp_list">
											<!-- 관리자페이지  -->
											<h2 class="emp_tit">
												관리자페이지입니다.	
											</h2>
											<ul class="list_wrap">
												<li><a href="employee/myPage">마이페이지 바로가기</a></li>
												<li><a href="member/memList">회원리스트 바로가기</a></li>
												<li><a href="emp/empList">직원리스트 바로가기</a></li>
												<li><a href="goods/goodsList">상품리스트</a></li>
												<li><a href="admin/noticeList">공지사항</a></li>
												<li><a href="lib/libBoard">자료실</a></li>
											</ul>
										</div>
									</div>
								</div>
							</c:if>
							<div class="out">
								<a href="login/logOut">로그아웃</a>
							</div>
							<!-- //관리자단  -->
						</c:if>
						<!-- //로그인 된 경우 -->
					</div>
				</div>
			</div>
		</div>
	</div>
</div>
</body>
</html>