<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- Header -->
<c:set var="id" value="${sessionScope.userid}" />



<header class="header">
	<div class="container">
			<div class="col">
				<div
					class="header_content d-flex flex-row align-items-center justify-content-start">
					<div class="logo">
						<a href="${pageContext.request.contextPath}/index.htm">
							<div>Team 1</div>
							<div>assignment </div>
						</a>
					</div>
					<nav class="main_nav" style="height : 100%">
						<c:choose>
						<c:when test="${empty id}">
						<ul
							class="d-flex flex-row align-items-center justify-content-start" style="height:100%">
							<li><a
								href="${pageContext.request.contextPath}/index.htm">Home</a>
							</li>
							
							<li>
							<a href="#inverse-modal" data-toggle="modal">Register</a>
							</li>
							<li>
							</li>
							<li></li>
							<li></li>
						</ul>
						</c:when>
						<c:when test="${id ne 'admin'}">
							<ul
							class="d-flex flex-row align-items-center justify-content-start" style="height:100%">
							<li><a
								href="${pageContext.request.contextPath}/index.htm">Home</a>
							</li>
							<li>
							
							</li>
							<li>

							</li>
							<li></li>
							<li></li>
						</ul>
						</c:when>
						<c:otherwise>
							<ul
							class="d-flex flex-row align-items-center justify-content-start" style="height:100%">
							<li><a
								href="${pageContext.request.contextPath}/index.htm">Home</a>
							</li>
							<li>
								<a href="${pageContext.request.contextPath}/emp/empList.htm">EmpList</a>
							</li>
							<li>

							</li>
							<li></li>
							<li></li>
						</ul>
						</c:otherwise>
						</c:choose>
					</nav>
					
					
					<c:choose>
					<c:when test="${empty id}">
					<form action="login.htm" method="post" class="form-inline my-2 my-lg-0">
						<input class="form-control mr-sm-2" type="text" name="userid"
							placeholder="ID" style="width: 160px; height: 30px"> 
						<input class="form-control mr-sm-2" type="password" name="password"
							placeholder="password" style="width: 160px; height: 30px">
						<button class="btn btn-secondary my-2 my-sm-0" type="submit" style="background-color:#2e3f61">Login</button>
					</form>
					</c:when>
					
					<c:otherwise>
						<p style="color:white">${sessionScope.userid }님 안녕하세요!</p>
						&nbsp;&nbsp;
						<button class="btn btn-secondary my-2 my-sm-0" type="button" style="background-color:#2e3f61"
						onclick="location.href='${pageContext.request.contextPath}/logout.htm' ">Logout</button>
					</c:otherwise>
					
					</c:choose>
				</div>
			</div>
		</div>
	</div>
</header>

<!-- Begin modal -->
	<div class="modal" id="inverse-modal">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title">Register</h5>
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
				</div>
				<div class="modal-body">
				<form action="register.htm">
					
					USERID <input type="button"class="btn btn-primary" id="checkid" value="button">
					<br><br>
					<input class="form-control mr-sm-2" type="text" name="userid" id="userid">
							<br>
					PASSOWRD
					<br><br>
					<input class="form-control mr-sm-2" type="password" name="password">
							<br>
					USERNAME
					<br><br>
					<input class="form-control mr-sm-2" type="text" name="username">
							<br>
					EMAIL
					<br><br>
					<input class="form-control mr-sm-2" type="text" name="email">
							<br>
				
				</div>
				<div class="modal-footer">
					<button type="submit" class="btn btn-primary">Sign up</button>
					<button type="button" class="btn btn-secondary"
						data-dismiss="modal">Close</button>
				</div>
				</form>
			</div>
		</div>
	</div>