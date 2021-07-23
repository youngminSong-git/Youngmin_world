<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ include file="/WEB-INF/view/include/taglib.jsp" %>
<%
	pageContext.setAttribute("br", "\n");
	request.setCharacterEncoding("UTF-8");
%>
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
<%-- <%@ include file="/WEB-INF/view/include/header.jsp" %> --%>
	<!-- content 테이블 -->
	<table>
		<caption>URL 직접접근 막기</caption>
		<colgroup>
			<col style="width:50%;" />
			<col style="width:50%;" />
		</colgroup>
		<tbody>
			<tr>
				<th rowspan="5">
					<!-- goodsDetailService가 goodsCommand를 가지고 잇으므로 goodsCommand를 이용해서 이미지 출력  -->
					<img src="../goods/upload/${goodsReviews.goods.prodImage.split(",")[0]}" alt="" /> 
				</th>
				<td>
					${goodsReviews.goods.prodName}
				</td>
			</tr>
			<tr>
				<td>
					${goodsReviews.goods.prodPrice}
				</td>
			</tr>
			<tr>
				<td>
					${goodsReviews.goods.prodDelFee}
				</td>
			</tr>
			<tr>
				<td>
					<label for="cartQty">
						수량 <input type="number" min="1" value="1" id="cartQty" name="cartQty"/>
					</label>
				</td>
			</tr>
			<tr>
				<td>
					<div class="btn_list">
						<button type="button" id="cart">장바구니</button>/
						<button type="button" id="buy">바로구매</button>
					</div>
				</td>
			</tr>
			<tr>
				<th colspan="2">
					${goodsCommand.prodDetail}
					<div>
						<c:forTokens items="${goodsReviews.goods.prodImage}" delims="," var="image">
							<img src="../goods/upload/${image}" alt="이미지" />
						</c:forTokens>
					</div>
				</th>
			</tr>
		</tbody>
	</table>
	<!-- //content  -->
	<!-- review -->
	<div class="review">
		<h2>리뷰</h2>
		<table>
			<tbody>
				<c:forEach items="${goodsReviews.reviews}" var="dto">
					<tr>
						<th>구매일자:</th>
						<td><fmt:formatDate value="${dto.reviewDate}" pattern="yyyy-mm-dd" /></td>
					</tr>
					<tr>
						<td>${fn:replace(dto.reviewContent, br, "<br />")}</td>
						<td><img src="goods/review/${dto.reviewImg}" alt="" /></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
	<!-- //review -->
</body>
<script src="https://code.jquery.com/jquery-latest.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery.form/4.3.0/jquery.form.js"></script>
<script>
	$(function(){
		//url 직접접근 차단
		$("#cart").click(function(){
			var cartQty = $("#cartQty").val(),
				prodNum = ${goodsReviews.goods.prodNum};
				
			/* ajax로 처리  */
			$.ajax({
				type: "post",
				url: "<c:url value='/cart/goodsCartAdd' />",
				dataType: "text",
				data :{"cartQty" : cartQty, "prodNum" : prodNum, "prodPrice" : ${goodsReviews.goods.prodPrice} }, //json방식 > key : value
				//json스타일이 아닐 때 : "ctq=" + cartQty + "&prodNum=" + prodNum
				success : function(result){
					if(result.trim() == "1"){
						//정상적으로 장바구니에 상품이 등록되었을 때
						if(confirm("계속 쇼핑하시려면 '아니오'를 클릭하세요.")){
							location.href="<c:url value='/cart/goodsCartList' />";
						}
					} else{
						alert("장바구니 안담겼어요");
					}
				}
			});
			
			$("#buy").click(function(){
				var cartQty = $("#cartQty").val(),
				prodNum = ${goodsReviews.goods.prodNum};
				
				$.ajax({
					type: "post",
					url: "<c:url value='/cart/goodsCartAdd' />",
					dataType: "text",
					data :{"cartQty" : cartQty, "prodNum" : prodNum, "prodPrice" : ${goodsReviews.goods.prodPrice} }, //json방식 > key : value
					//json스타일이 아닐 때 : "ctq=" + cartQty + "&prodNum=" + prodNum
					success : function(result){
						if(result.trim() == "1"){
							//정상적으로 장바구니에 상품이 등록되었을 때
							if(confirm("계속 쇼핑하시려면 '아니오'를 클릭하세요.")){
								location.href="<c:url value='/cart/goodsBuy' />";
							}
						}
					}
				});
			});
		});
	});
</script>
</html>