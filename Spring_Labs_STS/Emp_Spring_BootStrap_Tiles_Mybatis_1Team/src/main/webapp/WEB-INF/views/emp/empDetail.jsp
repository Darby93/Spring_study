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
							
							
							<thead>
								<tr>
									<th colspan="6">Detail</th>
								</tr>
							</thead>
							<tbody>
								<tr  style="height:80px">
									<td colspan="2">사원 이름</td>
									<td colspan="2">${empdetail.ename}</td>
								</tr>
								<tr  style="height:80px">
									<td>사원 번호</td>
									<td>${empdetail.empno}</td>
									<td>사원 직종</td>
									<td>${empdetail.job}</td>
								</tr>
								<tr style="height:80px">
									<td>선임 번호</td>
									<td>${empdetail.mgr}</td>
									<td>부서 번호</td> 
									<td>${empdetail.deptno}</td>
									
								</tr>
								<tr style="height:80px">
									<td>봉급</td>
									<td>${empdetail.sal}</td>
									<td>수당</td>
									<td>${empdetail.comm}</td>
								</tr>
								<tr style="height:80px">
									<td colspan="2">입사일</td> 
									<td colspan="2">${empdetail.hiredate}</td>
								</tr>
							</tbody>
							
						</table>
					</div>
					</div>
				</div>
			</div>
		</div>
	</div>