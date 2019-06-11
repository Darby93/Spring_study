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


						<div class="section_text"> 
							<button class="btn btn-secondary my-2 my-sm-0" type="button"
								style="background-color: #2e3f61" id="response" >response</button>
							<button class="btn btn-secondary my-2 my-sm-0" type="button"
								style="background-color: #2e3f61" id="objectmapper" >objectmapper</button>
							<button class="btn btn-secondary my-2 my-sm-0" type="button"
								style="background-color: #2e3f61" id="responsebody" >responsebody</button>
							<button class="btn btn-secondary my-2 my-sm-0" type="button"
								style="background-color: #2e3f61" id="jsonview" >jsonview</button>
							<button class="btn btn-secondary my-2 my-sm-0" type="button"
								style="background-color: #2e3f61" id="rest" >rest</button>
							<!-- 						<form action="search.htm" method="post" class="form-inline my-2 my-lg-0">
						<input class="form-control mr-sm-2" type="text" name="empno"
							placeholder="empno" style="width: 160px; height: 30px" id="empno"/>
						<button class="btn btn-secondary my-2 my-sm-0" type="submit" style="background-color:#2e3f61" id="search" disabled>Search</button>
						</form> -->



							<table class="content-table">
								<thead>
									<tr>
										<th>사원이름</th>
										<th>사원번호</th>
										<th>직종</th>
										<th>담당 매니저 번호</th>
										<th>월급</th>
										<th>추가수당</th>
										<th>부서번호</th>
										<th>수정</th>
										<th>삭제</th>
									</tr>
								</thead>
								<tbody id="tbody">
								</tbody>
							</table>

							<%-- 							<div align ="right">
							<div class="e_button button button_2" style="max-height:60px">
							<a href="${pageContext.request.contextPath}/emp/empReg.htm" >사원 등록</a></div>
							</div> --%>
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
