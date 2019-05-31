<%@page import="org.masterjung.util.GetImagePath"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="/WEB-INF/common/Head_top.jsp"></jsp:include>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resource/css/admin.css" />
<jsp:include page="/WEB-INF/common/Header_top.jsp"></jsp:include>
<jsp:include page="/WEB-INF/common/Sidebar_Left.jsp"></jsp:include>
<script type="text/javascript">
		function PageMove(page){
	        location.href = "withdraw.ad?page="+page;
	     }


</script>
<!-- 콘텐츠 영역 시작-->
<!-- BEGIN wizard -->
	<!-- BEGIN wizard-header -->

	<!-- END wizard-header -->
	<!-- BEGIN wizard-form -->
	<form action="#" method="POST" name="wizard_form">
		<!-- BEGIN wizard-content -->
		<div class="wizard-content tab-content">
			<!-- BEGIN tab-pane -->
					<div class="card">
					<!-- BEGIN card-header -->
					<div class="card-header card-header-inverse">
						<h4 class="card-header-title">탈퇴회원 : ${requestScope.withdrawUserCount} 명</h4>
						<div class="card-header-btn">
							<a href="#" data-toggle="card-expand" class="btn btn-success"><i
								class="fa fa-expand"></i></a> <a href="#" data-toggle="card-refresh"
								class="btn btn-warning"><i class="fa fa-redo"></i></a>
						</div>
					</div>
					<!-- END card-header -->

					<!-- BEGIN card-body -->
					<div class="card-body">
						<table class="table table-hover m-b-0">
													<thead>
							<tr>
								<th>상태</th>
								<th>번호</th>
								<th>이메일</th>
								<th>이름</th>
								<th>닉네임</th>
								<th>전화번호</th>
								<th>등급</th>
								<th>탈퇴날짜</th>
								<th></th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="withdrawUserList" items="${requestScope.withdrawUserList}">
								<tr>
									<td><c:choose>
											<c:when test="${withdrawUserList.enabled==1}">[회원]</c:when>
											<c:when test="${withdrawUserList.enabled==0}">[탈퇴]</c:when>
										</c:choose></td>
									<td>${withdrawUserList.id}</td>
									<td>${withdrawUserList.email}</td>
									<td>${withdrawUserList.user_name}</td>
									<td>-</td>
									<td>-</td>
									<td>-</td>
									<td>${withdrawUserList.last_updated}</td>
								</tr>
							</c:forEach>
						</table>
						<br>
						<div class="sorter">
					<ul class="pagination m-b-10 m-t-0">
						<c:if test="${paging.pageNo!=1}">
							<li class="page-item" id='lp'><a class="page-link"
								id="btnpre" href="javascript:PageMove(${paging.prevPageNo})">이전</a></li>
						</c:if>
						<c:forEach var="i" begin="${paging.startPageNo}"
							end="${paging.endPageNo}" step="1">
							<c:choose>
								<c:when test="${i eq paging.pageNo}">
									<li class="page-item active" id='l${i}'><a a
										class="page-link" id="btn${i}"
										href="javascript:PageMove(${i})">${i}</a></li>
								</c:when>
								<c:otherwise>
									<li class="page-item" id='l${i}'><a class="page-link"
										id="btn${i}" href="javascript:PageMove(${i})">${i}</a></li>
								</c:otherwise>
							</c:choose>
						</c:forEach>
						<c:if test="${paging.pageNo!=paging.endPageNo}">
							<li class="page-item" id='ln'><a class="page-link"
								id="btnnext" href="javascript:PageMove(${paging.nextPageNo})">다음</a></li>
						</c:if>
					</div>
					<!-- END card-body -->
				</div>
				<!-- END card -->
			</div>
			<!-- END tab-pane -->

			<!-- BEGIN tab-pane -->
			<div class="tab-pane fade" id="tab2">
						
			
				<!-- BEGIN card -->

				<!-- END card -->


			</div>
			<!-- END tab-pane -->

			<!-- BEGIN tab-pane -->
			<div class="tab-pane fade" id="tab3">

				<div class="row">
					<div class="col-6">
						<div class="card">

							<div class="card-body"
								style="background-color: #30303d; color: #fff;" id="cardchart3">

							</div>
						</div>
					</div>
					<div class="col-6">
						<div class="card">

							<div class="card-body"
								style="background-color: #30303d; color: #fff;">
								<div id="chartdiv5"></div>
							</div>

						</div>
						<div class="card">

							<div class="card-body"
								style="background-color: #30303d; color: #fff;">
								<div id="chartdiv6"></div>
							</div>

						</div>
					</div>
				</div>
				<br> <br>
				<!-- BEGIN card -->
				<div class="card">
					<!-- BEGIN card-header -->
					<div class="card-header card-header-inverse">
						<h4 class="card-header-title">Table Hover</h4>
						<div class="card-header-btn">
							<a href="#" data-toggle="card-expand" class="btn btn-success"><i
								class="fa fa-expand"></i></a> <a href="#" data-toggle="card-refresh"
								class="btn btn-warning"><i class="fa fa-redo"></i></a> <a
								href="#" data-toggle="card-remove" class="btn btn-danger"><i
								class="fa fa-trash-alt"></i></a>
						</div>
					</div>
					<!-- END card-header -->
					<!-- BEGIN card-body -->
					<div class="card-body">
						<table class="table table-hover m-b-0">
							<thead>
								<tr>
									<th>#</th>
									<th>PlayTime</th>
									<th>Name</th>
									<th>Developer</th>
									<th>Price</th>
								</tr>
							</thead>
							<tbody id="tbody3">

							</tbody>
						</table>
						<br>

					</div>
					<!-- END card-body -->
				</div>
				<!-- END card -->
			</div>
			<!-- END tab-pane -->


			<!-- BEGIN wizard-footer -->
			<div class="wizard-footer"></div>
			<!-- END wizard-footer -->
		</div>
		<!-- END wizard-content -->
	</form>
	<!-- END wizard-form -->

<!-- 콘텐츠영역 끝 -->
<jsp:include page="/WEB-INF/common/Sidebar_Right.jsp"></jsp:include>
<jsp:include page="/WEB-INF/common/Footer_bottom.jsp"></jsp:include>