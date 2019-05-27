<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3></h3>
	<form method="post" enctype="multipart/form-data">
		이름 : <input type="text" nama="name"><br>
		나이 : <input type="text" nama="age"><br>
		사진 : <input type="file" name="file"><br>
		
		<!-- private CommonsMultipartFile file; -->
		<input type="submit" value="파일업로드">
	</form>
</body>
</html>