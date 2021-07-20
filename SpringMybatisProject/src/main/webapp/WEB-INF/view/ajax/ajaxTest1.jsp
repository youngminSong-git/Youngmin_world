<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="<%=request.getContextPath() %>/resources/asset/js/jquery-2.2.24.min.js"></script>
<script src="https://code.jquery.com/jquery-latest.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery.form/4.3.0/jquery.form.js"></script>
<script>
<!-- json : key값과 value값으로 값을 날림  -->
	
	$(function(){	
		$("#btn3").click(function(){
			$("#frm").ajaxSubmit({
				type: "post",
				url: "ajaxTest1",
				dataType: "html",
				success: function(result){
					$("#notice_content").html(result);
				},
				error: function(){
					alert('에러가 나왐');
					return;
				}
			});	
		});
		
		$("#btn4").click(function(){
			var option= {
				type: "post",
				url: "ajaxTest1",
				dataType: "html",
				success: function(result){
					$("#notice_content").html(result);
				},
				error: function(){
					alert("에러가 나왔음");
					return false;
				}
			}
			$("#frm").ajaxSubmit(option);
		});
		$("#btn5").click(function(){
			var option = {
				type: "post",
				url: "ajaxTest1",
				dataType: "html",
				beforeSubmit: beforeTest,
				success: okTest,
				error: err
			}
			$("#frm").ajaxSubmit(option);
		});
	});
	
	//에러가 발생했을때
	function err(){
		alert("에러입니다~");
		return false;
	}
	
	//ajax가 실행되고 나서 실행되는 함수
	/* 
		소스 해석
		1.responseText = html값 받아옴
		2.statusText
	*/
	function okTest(responseText, statusText, xhr, $form){
		if(statusText == "success"){
			$("#notice_content").html(responseText);
			$form.css("background-color", "red");
		}
	};
	
	function beforeTest(){
		if($("#n").val() == ""){
			alert("값을 입력해주세요.");
			$("#n").focus();
			return false;
		}else{
			alert("ajax가 submit하기 전에 실행되는 함수입니다.");
		}
	}
	
	function testDiv(num){
		$.ajax({
			type: "post",
			type: "ajaxTest1",
			dataType: "html", //
			data: {"num" : num}, //데이터 실행
			success: function(result){ //성공했을때 함수실행
				//데이터타입이 받아온걸 result로 실행
				$("#notice_content").html(result);
			},
			error: function(){
				alert('에러요');
				return false;
			}
		});
	}
	
	/* 
		ajax를 사용하지 않았을 때 == 동기식
		function testDiv(num){
			location.href="ajaxTest1?num=" +num
		}
	*/
</script>
</head>
<body>
	<ul>
		<li onclick="testDiv(1)">경력 3년 이상</li>
		<li onclick="testDiv(2)">석박사급</li>
		<li onclick="testDiv(3)">IT개발자</li>
	</ul>
	<!-- 매개변수가 가져온 값을 div에 출력  -->
	<div id="notice_content"></div>
	
	<!-- 안되는걸 확인할 때 동기식으로 확인  -->
	<form action="ajaxTest1" name="frm" id="frm">
		<input type="text" id="n" name="n" />
	</form>
	<button type="button" id="btn3">버튼2</button>
	<button type="button" id="btn4">버튼3</button>
	<button type="button" id="btn5">버튼4</button>
</body>
</html>