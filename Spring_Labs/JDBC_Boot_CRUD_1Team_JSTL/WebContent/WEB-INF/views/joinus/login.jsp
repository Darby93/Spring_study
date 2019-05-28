<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

	<div class="container">
	    <form action="Ex02_JDBC_LoginOK.jsp" method="post" name="loginForm" id="joinForm">
			<h3 style="text-align: center;">로그인</h3>
			  <div id="login" class="form-group">
		      	<label for="usr">ID</label>
	      		<input type="text" class="form-control" name="id" id="id">
	      		<label for="usr">Password</label>
	      		<input type="password"  class="form-control" name="pwd" id="pwd">
				<hr>
				<input type="submit" class="form-control" id="joinsubmit" value="로그인">		
	    	  </div>
		</form>
	</div>
