<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Spring Annotation 적용하기</title>
</head>
<body>
	<h3>TEST_1</h3>
	<a href ="hello.do">hello.do</a>
	<!-- http://localhost:8090/SpringMVC_Basic03_Annotation/hello.do -->
	
	<h3>TEST_2 : http 전송 : Form : method : GET, POST</h3>
	게시판 목록 페이지 링크 (글쓰기)<br>
	<a href="article/newArticle.do">글쓰기(newArticle.do)</a>
	
	<h3>TEST_3 : http 전송 : Form : method : GET, POST (List 컬렉션 처리)</h3>
	<a href="order/order.do"> 주문하기 화면 (order.do)</a>
	
	<h3>TEST_4 : parameter 다루기 @RequestParam</h3>
	Default <a href="search/external.do">  (external.do)</a><br>
	Default2 <a href="search/external.do?query=100">  (external.do)</a><br>
	Default3 <a href="search/external.do?p=200">  (external.do)</a><br>
	
	<h3>TEST_5 : spring에서 쿠키 사용하기</h3>
	<a href="cookie/make.do"> 쿠키 생성 (make.do)</a><br>
	<a href="cookie/view.do"> 쿠키 확인 (view.do)</a><br>
	
	<h3>TEST_6 : 업로드하기 </h3>
	<a href="image/upload.do"> image 파일 업로드 (upload.do) </a><br>
	
</body>
</html>