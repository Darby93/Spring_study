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

						
						<div class="section_text">
						
						<form action="search.htm" method="post" class="form-inline my-2 my-lg-0">
						<input class="form-control mr-sm-2" type="text" name="empno"
							placeholder="empno" style="width: 160px; height: 30px" id="empno"/>
						<button class="btn btn-secondary my-2 my-sm-0" type="submit" style="background-color:#2e3f61" id="search" disabled>Search</button>
						</form>
						
						<c:set var="emplist" value="${emplist}"></c:set>
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
									<th colspan="2"></th>
								</tr>
							</thead>
							<tbody>
							
							<c:choose>
							<c:when test="${not empty emplist}">
							<c:forEach var="i" begin="0" end="${emplist.size()-1}">
								<tr>
									<td>
									<a href = "${pageContext.request.contextPath}/emp/empDetail.htm?empno=${emplist[i].empno}">${emplist[i].ename }
									</a>
									</td>
									<td>${emplist[i].empno }</td>
									<td>${emplist[i].job }</td>
									<td>${emplist[i].mgr }</td>
									<td>${emplist[i].sal }</td>
									<td>${emplist[i].comm }</td>
									<td>${emplist[i].deptno }</td>
									<td><a href = "${pageContext.request.contextPath}/emp/empUpdate.htm?empno=${emplist[i].empno}">수정</a></td>
									<td><a href = "${pageContext.request.contextPath}/emp/empDelete.htm?empno=${emplist[i].empno}">삭제</a></td>
								</tr>
							</c:forEach>
							</c:when>
							
							<c:otherwise>
								<tr>
									<td>
									<a href = "${pageContext.request.contextPath}/emp/empDetail.htm?empno=${emp.empno}">${emp.ename }
									</a>
									</td>
									<td>${emp.empno }</td>
									<td>${emp.job }</td>
									<td>${emp.mgr }</td>
									<td>${emp.sal }</td>
									<td>${emp.comm }</td>
									<td>${emp.deptno }</td>
									<td><a href = "${pageContext.request.contextPath}/emp/empUpdate.htm?empno=${emp.empno}">수정</a></td>
									<td><a href = "${pageContext.request.contextPath}/emp/empDelete.htm?empno=${emp.empno}">삭제</a></td>
								</tr>
							</c:otherwise>
							</c:choose>
							
							</tbody>
							</table>
							
							<div align ="right">
							<div class="e_button button button_2" style="max-height:60px">
							<a href="${pageContext.request.contextPath}/emp/empReg.htm" >사원 등록</a></div>
							</div>
					</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	
					<script>
							$(function(){
								$('#empno').keyup(function(){
									if($('#empno').val() != null){
										$('#search').prop("disabled", false);
									} else {
										$('#search').prop("disabled", true);
									}
									
								});
							});
					</script>