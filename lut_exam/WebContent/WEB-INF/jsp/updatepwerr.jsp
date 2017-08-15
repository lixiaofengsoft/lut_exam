<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath %>" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改密码</title>
	<link rel="stylesheet" type="text/css" href="css/css.css">
	<script type="text/javascript" src="js/jquery-1.8.3.min.js"></script>
	
		<script type="text/javascript">
	</script>
</head>
<body>
<c:import url="header.jsp"></c:import>
		<div class="main">
			<div align="center">
				<form action="manager/updatepw">
					<h1>原密码错误</h1>
					<input type="submit" value="返回">
				</form>
			</div>
		</div>
<c:import url="footer.jsp"></c:import>
</body>
</html>