<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- css  -->
<link rel="stylesheet" href="<%=request.getContextPath() %>/resources/asset/css/common.css" />
<link rel="stylesheet" href="<%=request.getContextPath() %>/resources/asset/css/sub.css" />
<title>Insert title here</title>
<style>
	caption{display:none;}
</style>
</head>
<body>
<form:form action="goodsUpdate" name="frm" method="post" modelAttribute="goodsCommand" enctype="multipart/form-data">
	<input type="hidden" name="prodNum" value="${goodsCommand.prodNum}"/>
	<input type="hidden" name="prodName" value="${goodsCommand.prodName}" />
	<table>
		<caption>상품리스트 테이블</caption>
		<colgroup>
			<col style="width:50%" />
			<col style="width:50%"/>
		</colgroup>
		<tbody>
			<tr>
				<th>상품번호 :</th>
				<td>${goodsCommand.prodNum}</td>
			</tr>
			<tr>
				<th>상품명 : </th>
				<td>${goodsCommand.prodName}</td>
			</tr>
			<tr>
				<th>가격 : </th>
				<td>
					<input type="number" name="prodPrice" min="10" value="${goodsCommand.prodPrice}" />
					<form:errors path="prodPrice" />
				</td>
			</tr>
			<tr>
				<th>규격 : </th>
				<td>
					<input type="number" name="prodCapacity" min="0" value="${goodsCommand.prodCapacity}" />
					<form:errors path="prodCapacity" />
				</td>
			</tr>
			<tr>
				<th>공급처 :</th>
				<td>
					<input type="text" name="prodSupplyer" value="${goodsCommand.prodSupplyer}" />
					<form:errors path="prodSupplyer" />
				</td>
			</tr>
			<tr>
				<th>배송비 : </th>
				<td>
					<input type="number" name="prodDelFee" min="0" value="${goodsCommand.prodDelFee}" />
					<form:errors path="prodDelFee" />
				</td>
			</tr>
			<tr>
				<th>추천여부 : </th>
				<td>
					<label for="y">
						<input type="radio" name="recommend" id="y" value="Y" <c:if test="${goodsCommand.recommend=='Y'}">checked</c:if> /> 추천
					</label>
					<label for="n">
						<input type="radio" name="recommend" id="n" value="N" <c:if test="${goodsCommand.recommend=='N'}">checked</c:if> /> 비추천
					</label>
				</td>
			</tr>
			<tr>
				<th>카테고리 : </th>
				<td>
					<select name="ctgr">
						<option value="wear"<c:if test="${goodsCommand.ctgr=='wear'}">selected</c:if>>의류</option>
						<option value="cosmetic" <c:if test="${goodsCommand.ctgr=='cosmetic'}">selected</c:if>>코스메틱</option>
						<option value="food" <c:if test="${goodsCommand.ctgr=='food'}">selected</c:if>>음식</option>
						<option value="car" <c:if test="${goodsCommand.ctgr=='car'}">selected</c:if>>차</option>
					</select>
				</td>
			</tr>
			<tr>
				<th>상세내용 :</th>
				<td>
					<textarea cols="30" rows="5" name="prodDetail">${goodsCommand.prodDetail}</textarea>
					<form:errors path="prodDetail" />
				</td>
			</tr>
			<tr>
				<th>파일</th>
				<td>
					<c:forTokens items="${goodsCommand.prodImage }" delims="," var="prodImage">
						<div>
							<span class="fileName">${prodImage}</span> 
							<input type="button" id = "btn" value="삭제" onclick="fileDel(this)" />
						</div>
					</c:forTokens>
				</td>
			</tr>
			<tr>
				<th>파일추가</th>
				<td>
					<input type="file" name="prodImage" multiple="multiple" />
				</td>
			</tr>
			<tr>
				<td>
					<input type="text" name="fileDel1" id="fileDel1" />
					<input type="submit" value="수정하기" />
					<input type="button" value="삭제하기" onclick = "javascript:location.href='goodsDel?prodNum=${goodsCommand.prodNum }'"/>
					<input type="button" value="리스트로가기" />
				</td>
			</tr>
		</tbody>
	</table>
</form:form>
</body>
<!-- js -->
<script src="<%=request.getContextPath() %>/resources/asset/js/jquery-2.2.24.min.js"></script>
<script>
function fileDel(btn){
	var delFile = $("#fileDel1").val()
	if($(btn).attr("value") == "삭제"){
		$(btn).attr("value","삭제취소");
		$("#fileDel1").val($(btn).parent().children(".fileName").text().trim()+"," + delFile)
	}else{
		$(btn).attr("value","삭제");
		fileName = $(btn).parent().children(".fileName").text().trim()+",";
		$("#fileDel1").val(delFile.replace(fileName,""));
	}
}
</script>
</html>