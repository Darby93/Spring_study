<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="t" uri="http://tiles.apache.org/tags-tiles"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>
		<t:getAsString name="title"/>
	</title>
</head>
<body>
		<table style="width: 100%;padding: 0;" border = 1>
			<tr>
				<td colspan="2">
					<t:insertAttribute name="header"/>
				</td>
			</tr>
			<tr>
				<td valign="top">
					<t:insertAttribute name = "menu"/>
				</td>
				<td valign="top">
					<t:insertAttribute name = "body"/>
				</td>
			</tr>
			<tr>
				<td colspan="2">
					<t:insertAttribute name = "footer"/>
				</td>
			</tr>
		</table>
</body>
</html>