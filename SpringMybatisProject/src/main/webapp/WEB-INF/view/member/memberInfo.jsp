<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
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
<body class="memInfo emInfo">
<div id="wrap">
	<div class="wrap_inner">
		<%@ include file="/WEB-INF/view/include/header.jsp" %>
		<div id="container">
			<div class="container">
				<div class="content">
					<div class="table_wrap">
						<h2 class="tit">회원 정보 수정</h2>
						<table>
							<caption>회원 정보 수정 테이블</caption>
							<colgroup>
								<col style="width:50%"/>
								<col style="width:50%"/>
							</colgroup>
							<tbody>
								<tr>
									<th>아이디</th>
									<td>${lists[0].memId }</td>
								</tr>
								<tr>
									<th>이름</th>
									<td>${lists[0].memName }</td>
								</tr>
								<tr>
									<th>생년월일</th>
									<td>
										<fmt:formatDate value='${lists[0].memBirth }' type='date' pattern='yyyy-MM-dd'/>
									</td>
								</tr>
								<tr>
									<th>성별</th>
									<td>${lists[0].memGender }</td>
								</tr>
								<tr>
									<th>우편번호</th>
									<td>${lists[0].postNumber }</td>
								</tr>
								<tr>
									<th>주소</th>
									<td>${lists[0].memAddress }</td>
								</tr>
								<tr>
									<th>상세주소</th>
									<td>${lists[0].detailAdd }</td>
								</tr>
								<tr>
									<th>연락처</th>
									<td>${lists[0].memPhone }</td>
								</tr>
								<tr>
									<th>이메일</th>
									<td>${lists[0].memEmail }</td>
								</tr>
								<tr>
									<th>계좌번호</th>
									<td>${lists[0].memAccount }</td>
								</tr>
								<tr>
									<th>수신여부</th>
									<td>
										<div>
											<ul>
												<li>
													<c:if test="${lists[0].memEmailCk == 'Y' }" > 
														이메일 수신 함
													</c:if> 
												</li>
												<li>
													<c:if test="${lists[0].memEmailCk == 'N'}" > 
														이메일 수신 안함
													</c:if>
												</li>
											</ul>
										</div>
									</td>
								</tr>
							</tbody>
						</table>
						<a href="../memMod/${lists.get(0).memId}">수정</a>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>

</body>