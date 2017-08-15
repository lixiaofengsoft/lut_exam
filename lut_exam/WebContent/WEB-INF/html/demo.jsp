<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath %>" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>demo.jsp</title>
	<link rel="stylesheet" href="css/style.css" type="text/css">
	<script type="text/javascript" src="js/jquery-1.8.3.min.js"></script>
	<script type="text/javascript">
		$(function(){
		});
	</script>
	<style type="text/css">
	
	</style>
</head>
	<body>
		<div align="center">
		    <br/>
		    <br/>
		    <br/>
		    <h4>${error}</h4>
		    <h4><a href="http://localhost:8989/login2" >立即跳转</a></h4>
		</div>
	</body>
</html>