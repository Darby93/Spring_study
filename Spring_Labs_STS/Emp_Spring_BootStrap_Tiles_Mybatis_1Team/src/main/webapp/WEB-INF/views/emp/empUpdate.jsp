<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

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