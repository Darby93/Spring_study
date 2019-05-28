<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!--################ Start Header Area ########-->
<button type="button" id="mobile-nav-toggle">
	<i class="lnr lnr-menu"> </i>
</button>
<header id="header" id="home">
	<div class="container main-menu">
		<div class="row align-items-center justify-content-between d-flex">
			<div id="logo">
				<a href="index.htm"><img src="img/logo.png" alt="" title="" /></a>
			</div>
			<nav id="nav-menu-container">
				<ul class="nav-menu">
					<li><a href="${pageContext.request.contextPath}/index.htm">Main</a></li>
					<li><a href="${pageContext.request.contextPath}/joinus/register.htm">Register</a></li>
					<li><a href='${pageContext.request.contextPath}/joinus/login.htm'>Login</a></li>
				</ul>
			</nav>
			<!--######## #nav-menu-container -->
		</div>
	</div>
</header>
<!--######## End Header Area ########-->

