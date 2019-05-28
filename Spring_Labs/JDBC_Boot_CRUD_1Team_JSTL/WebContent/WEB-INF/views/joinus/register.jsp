<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

	<div class="container">
		<form action="Ex02_JDBC_JoinOK.jsp" method="post" name="joinForm" id="joinForm">
			<h3 style="text-align: center;">회원가입</h3>
			  <div id="login" class="form-group">
		      	<label for="usr">ID</label>
	      		<input type="text" class="form-control" name="id" id="id">
	      		<label for="usr">Password</label>
	      		<input type="password"  class="form-control" name="pwd" id="pwd">
	      		<label for="usr">Name</label>
	      		<input type="text"  class="form-control" name="mname" id="mname">
	      		<label for="usr">Age</label>
	      		<input type="text" class="form-control" name="age" id="age" maxlength="3">
	      		<label for="usr">Gender</label><br>
	      		<input type="radio" name="gender" id="gender" value="여"
							checked>여자 &nbsp&nbsp&nbsp
				<input type="radio" name="gender"
							id="gender" value="남">남자<br>
				<label for="usr">Email</label>
				<input type="text" class="form-control" name="email" id="email">
				<br>
				<hr>
				<input type="submit" class="form-control" id="joinsubmit" value="회원가입">
						
	    	  </div>
		</form>		
	</div>
