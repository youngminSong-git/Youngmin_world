<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
	<form action="libwrite" method="post"  enctype="multipart/form-data">
		<caption>자료실</caption>
		<tbody>
			<tr>
				<th>제목</th>
				<td>
					<input type="text" name="noticeSub" />
				</td>
			</tr>
			<tr>
				<th>내용</th>
				<td>
					<textarea name="noticeCon" cols="30" rows="6"></textarea>
				</td>
			</tr>
			<tr>
				<th>파일</th>
				<td>
					<input type="file" name="noticeFile" multiple="multiple"/>
				</td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit" value="자료실 등록"/>
					<input type="reset" value="초기화" />
				</td>
			</tr>
		</tbody>
	</form>
</body>
</html>