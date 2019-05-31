<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- Header -->
<header class="header">
	<div class="container">
			<div class="col">
				<div
					class="header_content d-flex flex-row align-items-center justify-content-start">
					<div class="logo">
						<a href="#">
							<div>Major</div>
							<div>5 * Hotel</div>
						</a>
					</div>
					<nav class="main_nav" style="height : 100%">
						<ul
							class="d-flex flex-row align-items-center justify-content-start" style="height:100%">
							<li><a
								href="${pageContext.request.contextPath}/index.htm">Home</a>
							</li>
							<li>
								<a href="${pageContext.request.contextPath}/emp/empList.htm">About us</a>
							</li>
							<li>
							<a href="#inverse-modal" data-toggle="modal">Register</a>
							</li>
							<li></li>
							<li></li>

						</ul>
					</nav>

					<form class="form-inline my-2 my-lg-0">
						<input class="form-control mr-sm-2" type="text" name="id"
							placeholder="ID" style="width: 160px; height: 30px"> 
						<input class="form-control mr-sm-2" type="text" name="password"
							placeholder="password" style="width: 160px; height: 30px">
						<button class="btn btn-secondary my-2 my-sm-0" type="submit" style="background-color:#2e3f61">Login</button>
					</form>

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
				<form>
					
					USERID
					<br><br>
					<input class="form-control mr-sm-2" type="text" name="userid">
							<br>
					PASSOWRD
					<br><br>
					<input class="form-control mr-sm-2" type="text" name="password">
							<br>
					USERNAME
					<br><br>
					<input class="form-control mr-sm-2" type="text" name="username">
							<br>
					EMAIL
					<br><br>
					<input class="form-control mr-sm-2" type="text" name="email">
							<br>
				</form>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-primary">Sign up</button>
					<button type="button" class="btn btn-secondary"
						data-dismiss="modal">Close</button>
				</div>
			</div>
		</div>
	</div>