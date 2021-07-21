<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
결제 페이지입니다.
<form action="doPayment" method="post" >
<input type="hidden" name="purchaseNum" value="${purchNo }" />
<input type="hidden" name="paymentApprPrice" value="${payPrice }" />
<table>
	<tr>
		<th>구매번호</th>
		<td>${purchNo }</td>
	</tr>
	<tr>
		<th>결제금액</th>
		<td>${payPrice }원</td>
	</tr>
	<tr>
		<th>결제방법</th>
		<td>카드</td>
	</tr>
	<tr>
		<th>카드번호</th>
		<td>
			<input type="text" name="paymentNumber"/>
		</td>
	</tr>
	<tr>
		<td align = "center" colspan="2">
			<input type="submit" value="결제 완료" />
		</td>
	</tr>
</table>
</form>
</body>
</html>