<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- css  -->
<link rel="stylesheet" href="<%=request.getContextPath() %>/resources/asset/css/common.css" />
<link rel="stylesheet" href="<%=request.getContextPath() %>/resources/asset/css/main.css" />
<link rel="stylesheet" href="<%=request.getContextPath() %>/resources/asset/css/swiper-bundle.min.css" />
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
				<div class="login_banner">

					<!-- 로그인 안된 경우  -->
						<c:if test="${empty authInfo}">
							<div class="table_wrap">
								<h2 class="login_tit">로그인해주세요.</h2>
								<form:form action="login" method="post" name="frm" class="form" modelAttribute="loginCommand">
									<table>
										<caption>로그인 테이블</caption>
										<colgroup>
											<col style="width:33%" />
											<col style="width:33%" />
											<col style="width:33%" />
										</colgroup>
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
												<td rowspan="2">
													<input type="image" src="image/img1.jpg" style="width:70px;" alt="login" />
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
												<td colspan="3">
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
								<div class="loginList">
									<ul>
										<li>
											<a href="edit/myPage">마이페이지 바로가기</a>
										</li>
										<li>
											<div class="out">
												<a href="login/logOut">로그아웃</a>
											</div>
										</li>
									</ul>
								</div>
								<div class="swiper-container myswiper slide_wrap">
									<div class="swiper-wrapper">
										<div class="swiper-slide slide">
											<img src="<%=request.getContextPath() %>/resources/asset/image/11.jpg" alt="">
										</div>
										<div class="swiper-slide slide">
											<img src="<%=request.getContextPath() %>/resources/asset/image/22.jpg" alt="">
										</div>
										<div class="swiper-slide slide">
											<img src="<%=request.getContextPath() %>/resources/asset/image/33.jpg" alt="">
										</div>
									</div>
								    <div class="swiper-button-next"></div>
								    <div class="swiper-button-prev"></div>
								    <div class="swiper-pagination"></div>
								</div>
								<div class="table2">
									<div class="inner">
										<h2 class="tit">금주 할인 상품 목록</h2>
										<table>
											<tbody>
												<tr>
													<c:forEach items="${lists}" var="dto" varStatus="cnt">
														<td class="prod_list">
															<a href="prod/goodsView?prodNum=${dto.prodNum}">
																<c:if test="${dto.prodImage != null}">
																	<img src="goods/upload/${dto.prodImage.split(',')[0]}" alt="상품이미지"/>
																</c:if>
																<br />
																<%-- <c:if test="${dto.prodImage==null}"></c:if> --%>
																<div class="prod">
																	<h3 class="prodtit">${dto.prodName}</h3>			
																	<span class="price">
																		<fmt:formatNumber value="${dto.prodPrice}" type="currency" />
																	</span>
																</div>
															</a>
														</td>
													</c:forEach>	
												</tr>
											</tbody>
										</table>
									</div>
								</div>
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
								<div class="out">
									<a href="login/logOut">로그아웃</a>
								</div>
							</c:if>
							
							<!-- //관리자단  -->
						</c:if>
						<!-- //로그인 된 경우 -->
				</div>
			</div>
		</div>
	</div>
</div>
</body>
<!-- js -->
<script src="<%=request.getContextPath() %>/resources/asset/js/jquery-2.2.24.min.js"></script>
<script src="<%=request.getContextPath() %>/resources/asset/js/swiper-bundle.min.js"></script>
<script src="<%=request.getContextPath() %>/resources/asset/js/main.js"></script>
 <script>
	 var swiper = new Swiper('.swiper-container', {
	     pagination: '.swiper-pagination',
	     //slidesPerView: 3,
	     paginationClickable: true,
	     spaceBetween: 30,
	     navigation: {
	          nextEl: ".swiper-button-next",
	          prevEl: ".swiper-button-prev",
         },
	 });
 </script>	
</html>