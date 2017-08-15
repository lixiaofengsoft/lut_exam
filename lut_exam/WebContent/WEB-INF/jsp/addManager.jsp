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
<title>stumanager.jsp</title>
	<link rel="stylesheet" type="text/css" href="css/css.css">
	<script type="text/javascript" src="js/jquery-1.8.3.min.js"></script>


		<link rel="stylesheet" href="css/jqpagination.css" />
		<script src="js/jquery.jqpagination.min.js"></script>
		<script src="js/scripts.js"></script>
		<script src="js/demo.js"></script>
		
		<link rel="stylesheet" href="bootstrap3/css/bootstrap.min.css">
	    <link rel="stylesheet" href="bootstrap3/css/bootstrap-theme.min.css">
	    <script type="text/javascript" src="bootstrap3/js/bootstrap.min.js"></script>
	    <script type="text/javascript" src="bootstrap3/js/jquery-3.1.1.min.js"></script>
	<script type="text/javascript">
		$(function(){
		});
	</script>
	<style type="text/css">
	
	</style>
</head>
	<body>
		<c:import url="header.jsp"></c:import>
		
			<form id="my_form" class="table table-bordered" action="manager/addMgrMsg" method="post">
				<table class="table table-bordered" style="width: 500px" align="center">
					<tr>
						<td align="center">管理员：</td>
						<td>
							<input type="text" class="form-control" name="name" >
						</td>
					</tr>
					<tr>
						<td align="center">  密码：</td>
						<td>
							<input type="text" class="form-control" name="password" >
						</td>
					</tr>
					<tr>
						<td  align="center"><input class="btn btn-default" type="submit" value="提交"></td>
						<td  align="center"><input class="btn btn-default" type="button" value="返回" onclick="window.location.href='manager/homepage'"></td>
					</tr>
				</table>
			</form>				
		<!-- 
			<div align="center">
			<form action="manager/addMgrMsg" method="post">
				管理员：<input type="text" name="name"><br>
				 密码：<input type="text" name="password"><br>
				 <input type="submit" value="提交">
				 <input type="button" value="返回" onclick="window.location.href='manager/homepage'">
			</form>					
			</div>
			 -->
			
		<c:import url="footer.jsp"></c:import>
	</body>
</html>