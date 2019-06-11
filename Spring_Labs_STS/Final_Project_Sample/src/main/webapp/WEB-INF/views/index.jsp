<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">


<!-- ===============================================-->
<!--    Document Title-->
<!-- ===============================================-->
<title>Boots4 v3.0 | Portfolio Template</title>


<!-- ===============================================-->
<!--    Favicons-->
<!-- ===============================================-->
<link rel="apple-touch-icon" sizes="180x180"
	href="${pageContext.request.contextPath}/resources/img/favicons/apple-touch-icon.png">
<link rel="icon" type="image/png" sizes="32x32"
	href="${pageContext.request.contextPath}/resources/img/favicons/favicon-32x32.png">
<link rel="icon" type="image/png" sizes="16x16"
	href="${pageContext.request.contextPath}/resources/img/favicons/favicon-16x16.png">
<link rel="shortcut icon" type="image/x-icon"
	href="${pageContext.request.contextPath}/resources/img/favicons/favicon.ico">
<link rel="manifest"
	href="${pageContext.request.contextPath}/resources/img/favicons/manifest.json">
<meta name="msapplication-TileImage"
	content="${pageContext.request.contextPath}/resources/img/favicons/mstile-150x150.png">
<meta name="theme-color" content="#ffffff">


<!-- ===============================================-->
<!--    Stylesheets-->
<!-- ===============================================-->
<link
	href="${pageContext.request.contextPath}/resources/lib/prismjs/prism.css"
	rel="stylesheet">
<link
	href="${pageContext.request.contextPath}/resources/lib/loaders.css/loaders.min.css"
	rel="stylesheet">
<link
	href="https://fonts.googleapis.com/css?family=Raleway:100,300,400,500,700"
	rel="stylesheet">
<link href="https://fonts.googleapis.com/css?family=Source+Sans+Pro"
	rel="stylesheet">
<link
	href="${pageContext.request.contextPath}/resources/lib/remodal/remodal.css"
	rel="stylesheet">
<link
	href="${pageContext.request.contextPath}/resources/lib/remodal/remodal-default-theme.css"
	rel="stylesheet">
<link
	href="${pageContext.request.contextPath}/resources/lib/owl.carousel/owl.carousel.css"
	rel="stylesheet">
<link
	href="${pageContext.request.contextPath}/resources/lib/lightbox2/css/lightbox.css"
	rel="stylesheet">
<link href="${pageContext.request.contextPath}/resources/css/theme.css"
	rel="stylesheet">
<style>
* {
	box-sizing: border-box;
}

.video-background {
	background: #000;
	position: fixed;
	top: 0;
	right: 0;
	bottom: 0;
	left: 0;
	z-index: -99;
}

.video-foreground, .video-background iframe {
	position: absolute;
	top: 0;
	left: 0;
	width: 100%;
	height: 100%;
	pointer-events: none;
}

#vidtop-content {
	top: 0;
	color: #fff;
}

.vid-info {
	position: absolute;
	top: 0;
	right: 0;
	width: 33%;
	background: rgba(0, 0, 0, 0.3);
	color: #fff;
	padding: 1rem;
	font-family: Avenir, Helvetica, sans-serif;
}

.vid-info h1 {
	font-size: 2rem;
	font-weight: 700;
	margin-top: 0;
	line-height: 1.2;
}

.vid-info a {
	display: block;
	color: #fff;
	text-decoration: none;
	background: rgba(0, 0, 0, 0.5);
	transition: .6s background;
	border-bottom: none;
	margin: 1rem auto;
	text-align: center;
}

@media ( min-aspect-ratio : 16/9) {
	.video-foreground {
		height: 300%;
		top: -100%;
	}
}

@media ( max-aspect-ratio : 16/9) {
	.video-foreground {
		width: 300%;
		left: -100%;
	}
}

@media all and (max-width: 600px) {
	.vid-info {
		width: 100%;
		padding: .5rem;
	}
	.vid-info h1 {
		margin-bottom: .2rem;
	}
}

@media all and (max-width: 500px) {
	.vid-info .acronym {
		display: none;
	}
}
</style>
<style>
.ldiv {
	font-family: "montserrat", sans-serif;
}

.login-box {
	position: absolute;
	top: 0;
	left: 0;
	width: 100%;
	height: 100vh;
	transition: 0.4s;
}

.login-form {
	position: absolute;
	top: 50%;
	left: 50%;
	transform: translate(-50%, -50%);
	color: white;
	text-align: center;
}

.login-form h1 {
	font-weight: 400;
	margin-top: 0;
	color: white;
}

.txtb {
	display: block;
	box-sizing: border-box;
	width: 240px;
	background: #ffffff28;
	border: 1px solid white;
	padding: 10px 20px;
	color: white;
	outline: none;
	margin: 10px 0;
	border-radius: 6px;
	text-align: center;
}

.login-btn {
	width: 240px;
	background: #2c3e50;
	border: 0;
	color: white;
	padding: 10px;
	border-radius: 6px;
	cursor: pointer;
}

.hide-login-btn {
	color: #000;
	position: absolute;
	top: 40px;
	right: 40px;
	font-size: 24px;
	opacity: .7;
}
</style>
</head>


<body>
	<!-- ============================================-->
	<!-- Preloader ==================================-->
	<div id="preloader">
		<div class="loader">
			<span></span><span></span><span></span><span></span>
		</div>
	</div>
	<!-- ============================================-->
	<!-- End of Preloader ===========================-->


	<!-- ============================================-->
	<!-- <section> begin ============================-->
	<section class="p-0" id="home">

	<div class="container-fluid p-0 minh-100vh">

		<div class="position-relative px-3 w-lg-50 position-lg-absolute"
			id="baseContent">

			<div
				class="row align-items-center minh-50vh justify-content-center py-5 minh-lg-100vh">
				<%-- <div class="bg-holder overlay overlay-1"
					style="background-image:url(${pageContext.request.contextPath}/resources/img/home-blur.jpg);">
				</div> --%>
				<!--/.bg-holder-->

				<div class="video-background">
					<div class="video-foreground">
						<iframe class="ww"
							src="https://www.youtube.com/embed/18FWwXRte00?mute=1&autoplay=1&rel=0&controls=0&showinfo=0"
							frameborder="0"
							allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture"
							allowfullscreen></iframe>
					</div>
				</div>

				<div class="login-box ldiv">

					<form class="login-form" action="index.html" method="POST">

						<h1>Welcome</h1>
						<input class="txtb" type="text" name="" placeholder="Username">
						<input class="txtb" type="password" name="" placeholder="Password">
						<input class="login-btn" type="submit" name="" value="Login">
					</form>
				</div>
			</div>
		</div>
		<div class="position-relative w-lg-50 position-lg-fixed undefined"
			id="gridNav">
			<div style="position: fixed; z-index: -99; ">

				<div class="row h-lg-100vh"> 
					<div
						class="col-6 col-sm-3 minh-25vh h-lg-50vh sidebar-item-wrapper py-5 "
						OnClick="location.href ='${pageContext.request.contextPath}/aboutUs.htm'">
						<div class="bg-holder"
							style="background-image:url(${pageContext.request.contextPath}/resources/img/navigation/about.jpg);">
						</div>
						<!--/.bg-holder-->

						<div class="sidebar-item">
							<img class="mb-2 mb-md-3 nav-icon"
								src="${pageContext.request.contextPath}/resources/img/lineicons/favorites.svg"
								alt="">
							<h2 class="font-weight-light text-white fs-1 fs-xl-2 fs-xxl-3">About
								Us</h2>
						</div>
					</div>
					<div
						class="col-6 col-sm-3 minh-25vh h-lg-50vh sidebar-item-wrapper py-5"
						OnClick="location.href ='${pageContext.request.contextPath}/service.jsp'">
						<div class="bg-holder"
							style="background-image:url(${pageContext.request.contextPath}/resources/img/navigation/service.jpg);">
						</div>
						<!--/.bg-holder-->

						<div class="sidebar-item">
							<img class="mb-2 mb-md-3 nav-icon"
								src="${pageContext.request.contextPath}/resources/img/lineicons/suitcase.svg"
								alt="">
							<h2 class="font-weight-light text-white fs-1 fs-xl-2 fs-xxl-3">Services</h2>
						</div>
					</div>
					<div
						class="col-6 col-sm-3 minh-25vh h-lg-50vh sidebar-item-wrapper py-5"
						OnClick="location.href ='${pageContext.request.contextPath}/portfolio.htm'">
						<div class="bg-holder"
							style="background-image:url(${pageContext.request.contextPath}/resources/img/navigation/portfolio.jpg);">
						</div>
						<!--/.bg-holder-->

						<div class="sidebar-item">
							<img class="mb-2 mb-md-3 nav-icon"
								src="${pageContext.request.contextPath}/resources/img/lineicons/heart.svg"
								alt="">
							<h2 class="font-weight-light text-white fs-1 fs-xl-2 fs-xxl-3">Portfolio</h2>
						</div>
					</div>
					<div
						class="col-6 col-sm-3 minh-25vh h-lg-50vh sidebar-item-wrapper py-5">
						<div class="bg-holder"
							style="background-image:url(${pageContext.request.contextPath}/resources/img/navigation/gallery.jpg);">
						</div>
						<!--/.bg-holder-->

						<div class="sidebar-item">
							<img class="mb-2 mb-md-3 nav-icon"
								src="${pageContext.request.contextPath}/resources/img/lineicons/image.svg"
								alt="">
							<h2 class="font-weight-light text-white fs-1 fs-xl-2 fs-xxl-3">Gallery</h2>
						</div>
					</div>
					<div
						class="col-6 col-sm-3 minh-25vh h-lg-50vh sidebar-item-wrapper py-5" >
						<div class="bg-holder"
							style="background-image:url(${pageContext.request.contextPath}/resources/img/navigation/faq.jpg);">
						</div>
						<!--/.bg-holder-->

						<div class="sidebar-item">
							<img class="mb-2 mb-md-3 nav-icon"
								src="${pageContext.request.contextPath}/resources/img/lineicons/computer.svg"
								alt="">
							<h2 class="font-weight-light text-white fs-1 fs-xl-2 fs-xxl-3">Faq</h2>
						</div>
					</div>
					<div
						class="col-6 col-sm-3 minh-25vh h-lg-50vh sidebar-item-wrapper py-5">
						<div class="bg-holder"
							style="background-image:url(${pageContext.request.contextPath}/resources/img/navigation/contact.jpg);">
						</div>
						<!--/.bg-holder-->

						<div class="sidebar-item">
							<img class="mb-2 mb-md-3 nav-icon"
								src="${pageContext.request.contextPath}/resources/img/lineicons/placeholder.svg"
								alt="">
							<h2 class="font-weight-light text-white fs-1 fs-xl-2 fs-xxl-3">Contact</h2>
						</div>
					</div>
					<div
						class="col-6 col-sm-3 minh-25vh h-lg-50vh sidebar-item-wrapper py-5">
						<div class="bg-holder"
							style="background-image:url(${pageContext.request.contextPath}/resources/img/navigation/starter.jpg);">
						</div>
						<!--/.bg-holder-->

						<div class="sidebar-item">
							<img class="mb-2 mb-md-3 nav-icon"
								src="${pageContext.request.contextPath}/resources/img/lineicons/key.svg"
								alt="">
							<h2 class="font-weight-light text-white fs-1 fs-xl-2 fs-xxl-3">Starter</h2>
						</div>
					</div>
					<div
						class="col-6 col-sm-3 minh-25vh h-lg-50vh sidebar-item-wrapper py-5" >
						<div class="bg-holder"
							style="background-image:url(${pageContext.request.contextPath}/resources/img/navigation/docs.jpg);">
						</div>
						<!--/.bg-holder-->

						<div class="sidebar-item">
							<img class="mb-2 mb-md-3 nav-icon"
								src="${pageContext.request.contextPath}/resources/img/lineicons/edit.svg"
								alt="">
							<h2 class="font-weight-light text-white fs-1 fs-xl-2 fs-xxl-3">Docs</h2>
						</div>
					</div>
				</div>
			</div>
		</div>
		<!-- end of .container-->
	</section>
	<!-- <section> close ============================-->
	<!-- ============================================-->


	</main>




	<!-- ===============================================-->
	<!--    JavaScripts-->
	<!-- ===============================================-->

	<script
		src="${pageContext.request.contextPath}/resources/js/jquery.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/resources/js/popper.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/resources/js/bootstrap.js"></script>
	<script
		src="${pageContext.request.contextPath}/resources/js/plugins.js"></script>
	<script
		src="${pageContext.request.contextPath}/resources/lib/prismjs/prism.js"></script>
	<script
		src="${pageContext.request.contextPath}/resources/lib/loaders.css/loaders.css.js"></script>
	<script
		src="${pageContext.request.contextPath}/resources/js/stickyfill.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/resources/lib/remodal/remodal.js"></script>
	<script
		src="${pageContext.request.contextPath}/resources/lib/jtap/jquery.tap.js"></script>
	<script src="https://www.google.com/recaptcha/api.js"></script>
	<script
		src="${pageContext.request.contextPath}/resources/lib/owl.carousel/owl.carousel.js"></script>
	<script
		src="${pageContext.request.contextPath}/resources/lib/isotope-layout/isotope.pkgd.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/resources/lib/isotope-packery/packery-mode.pkgd.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/resources/lib/lightbox2/js/lightbox.js"></script>
	<script src="${pageContext.request.contextPath}/resources/js/theme.js"></script>
	<script
		src="https://maps.googleapis.com/maps/api/js?key=AIzaSyARdVcREeBK44lIWnv5-iPijKqvlSAVwbw&callback=initMap"
		async></script>


</body>

</html>