
	$(function() {
		$('#response').click(function() {
			$.ajax({
				type : "GET",
				url : "ajax/response",
				success : function(data) {
					console.log(data);
					var jsontable = "";
					
					var parseJson = JSON.parse(data);
					$("#tbody").empty();
					

					$.each(parseJson,function(index, item){
						jsontable +=
							"<tr><td>"+item.ename+"</td>"+
							"<td>"+item.empno+"</td>"+
							"<td>"+item.job+"</td>"+
							"<td>"+item.mgr+"</td>"+
							"<td>"+item.sal+"</td>"+
							"<td>"+item.comm+"</td>"+
							"<td>"+item.deptno+"</td></tr>"
					});
					
					$('#tbody').append(jsontable);
				}
			})
		})
		
		
		$('#objectmapper').click(function() {
			$.ajax({
				type : "GET",
				url : "ajax/objectmapper",
				success : function(data) {
					console.log(data);
					var jsontable = "";
					
					var parseJson = JSON.parse(data);
					$("#tbody").empty();
					
					$.each(parseJson,function(index, item){
						jsontable +=
							"<tr><td>"+item.ename+"</td>"+
							"<td>"+item.empno+"</td>"+
							"<td>"+item.job+"</td>"+
							"<td>"+item.mgr+"</td>"+
							"<td>"+item.sal+"</td>"+
							"<td>"+item.comm+"</td>"+
							"<td>"+item.deptno+"</td></tr>"
					});
					
					$('#tbody').append(jsontable);
				}
			})
		});
		
		$('#responsebody').click(function() {
			$.ajax({
				type : "GET",
				url : "ajax/responsebody",
				success : function(data) {
					console.log(data);
					var jsontable = "";

					$("#tbody").empty();
					
					$.each(data,function(index, item){
						jsontable +=
							"<tr><td>"+item.ename+"</td>"+
							"<td>"+item.empno+"</td>"+
							"<td>"+item.job+"</td>"+
							"<td>"+item.mgr+"</td>"+
							"<td>"+item.sal+"</td>"+
							"<td>"+item.comm+"</td>"+
							"<td>"+item.deptno+"</td>"+
							"<td><button class='btn btn-secondary my-2 my-sm-0' type='button'style='background-color: #2e3f61' id='rest' value="+item.empno +">수정</button></td>"+
							"<td><button class='btn btn-secondary my-2 my-sm-0' type='button'style='background-color: #2e3f61' id='rest' value="+item.empno +">삭제</button></td></tr>"
							
					});
					
					$('#tbody').append(jsontable);
				}
			})
		});
		
 		$('#jsonview').click(function() {
			$.ajax({
				type : "GET",
				url : "ajax/jsonview",
				success : function(data) {
					console.log(data.list);
					var jsontable = "";

					$("#tbody").empty();

					 $.each(data.list,function(index, item){
						jsontable +=
							"<tr><td>"+item.ename+"</td>"+
							"<td>"+item.empno+"</td>"+
							"<td>"+item.job+"</td>"+
							"<td>"+item.mgr+"</td>"+
							"<td>"+item.sal+"</td>"+
							"<td>"+item.comm+"</td>"+
							"<td>"+item.deptno+"</td></tr>"
					}); 
					
					$('#tbody').append(jsontable);
				}
			})
		});
 		
 		$('#rest').click(function() {
			$.ajax({
				type : "GET",
				url : "restajax/rest",
				success : function(data) {
					var jsontable = "";

					$("#tbody").empty();

					 $.each(data,function(index, item){
						jsontable +=
							"<tr><td>"+item.ename+"</td>"+
							"<td>"+item.empno+"</td>"+
							"<td>"+item.job+"</td>"+
							"<td>"+item.mgr+"</td>"+
							"<td>"+item.sal+"</td>"+
							"<td>"+item.comm+"</td>"+
							"<td>"+item.deptno+"</td>"+
							"<td><a href = '${pageContext.request.contextPath}/emp/empUpdate.htm?empno=item.empno'>수정</a></td>"+
							"<td><button class='btn btn-secondary my-2 my-sm-0' type='button'style='background-color: #2e3f61' id='delete' value="+item.empno +">삭제</button></td></tr>"
					}); 
					
					$('#tbody').append(jsontable);
				}
			})
		}); 
 		
 		
 		$('#edit').click(function() {
 			$("#tbody").empty();
 			
 		});
 		
 		
 		
 		
 		
 		
	});
