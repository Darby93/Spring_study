<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>





<html lang="kor">
<head>
<script src="http://code.jquery.com/jquery-1.9.1.js"></script>

<title>Major</title>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="description" content="Major - 5* Hotel template project">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/styles/bootstrap-4.1.2/bootstrap.min.css">
<link
	href="${pageContext.request.contextPath}/plugins/font-awesome-4.7.0/css/font-awesome.min.css"
	rel="stylesheet" type="text/css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/plugins/OwlCarousel2-2.2.1/owl.carousel.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/plugins/OwlCarousel2-2.2.1/owl.theme.default.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/plugins/OwlCarousel2-2.2.1/animate.css">
<link
	href="${pageContext.request.contextPath}/plugins/colorbox/colorbox.css"
	rel="stylesheet" type="text/css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/styles/main_styles.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/styles/responsive.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/styles/bootstrap.min.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/styles/style.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
</head>
<body>

	<div class="intro">
		<div class="container">
			<div class="row">
				<div class="col">
					<div class="section_title_container text-center">
						<div class="section_text" style="max-width: 600px;">
							<table class="content-table">
							
							<form action="empUpdate.htm" method="post">
							<thead>
								<tr>
									<th colspan="6">Register</th>
								</tr>
							</thead>
							<tbody>
								<tr  style="height:80px">
									<td colspan="2">사원 이름</td>
									<td colspan="2">
									<input class="form-control mr-sm-2" type="text" name="ename" 
									style="width: 160px; height: 30px" readonly value="${empdetail.ename}"/> 
									</td>
								</tr>
								<tr  style="height:80px">
									<td>사원 번호</td>
									<td>
										<input class="form-control mr-sm-2" type="text" name="empno" 
										style="width: 160px; height: 30px" readonly value="${empdetail.empno}"/>
									</td>
									<td>사원 직종</td>
									<td>
										<input class="form-control mr-sm-2" type="text" name="job"  
										style="width: 160px; height: 30px" value="${empdetail.job}"/>
									</td>
								</tr>
								<tr style="height:80px">
									<td>선임 번호</td>
									<td>
										<input class="form-control mr-sm-2" type="text" name="mgr" 
										style="width: 160px; height: 30px" value="${empdetail.mgr}"/>
									</td>
									<td>부서 번호</td> 
									<td>
										<input class="form-control mr-sm-2" type="text" name="deptno" 
										style="width: 160px; height: 30px" value="${empdetail.deptno}"/>
									</td>
									
								</tr>
								<tr style="height:80px">
									<td>봉급</td>
									<td>
										<input class="form-control mr-sm-2" type="text" name="sal" 
										style="width: 160px; height: 30px" value="${empdetail.sal}"/>
									</td>
									<td>수당</td>
									<td>
										<input class="form-control mr-sm-2" type="text" name="comm" 
										style="width: 160px; height: 30px" value="${empdetail.comm}"/>
									</td>
								</tr>
							</tbody>
							
						</table>
						
							<div align ="right">
							<button class="btn btn-secondary my-2 my-sm-0" type="submit" style="background-color:#2e3f61">사원 수정</button>
							</div>
						</form>
					</div>
					</div>
				</div>
			</div>
		</div>
	</div>

	<script
		src="${pageContext.request.contextPath}/styles/bootstrap-4.1.2/popper.js"></script>
	<script
		src="${pageContext.request.contextPath}/styles/bootstrap-4.1.2/bootstrap.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/plugins/greensock/TweenMax.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/plugins/greensock/TimelineMax.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/plugins/scrollmagic/ScrollMagic.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/plugins/greensock/animation.gsap.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/plugins/greensock/ScrollToPlugin.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/plugins/OwlCarousel2-2.2.1/owl.carousel.js"></script>
	<script
		src="${pageContext.request.contextPath}/plugins/easing/easing.js"></script>
	<script
		src="${pageContext.request.contextPath}/plugins/progressbar/progressbar.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/plugins/colorbox/jquery.colorbox-min.js"></script>
	<script
		src="${pageContext.request.contextPath}/plugins/parallax-js-master/parallax.min.js"></script>
	<script
		src="https://maps.googleapis.com/maps/api/js?v=3.exp&key=AIzaSyCIwF204lFZg1y4kPSIhKaHEXMLYxxuMhA"></script>
	<script src="${pageContext.request.contextPath}/js/custom.js"></script>
	<script src="${pageContext.request.contextPath}/js/rest.js"></script>
</body>
</html>
