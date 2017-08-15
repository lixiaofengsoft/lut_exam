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
	
		<link rel="stylesheet" href="bootstrap3/css/bootstrap.min.css">
	    <link rel="stylesheet" href="bootstrap3/css/bootstrap-theme.min.css">
	    <script type="text/javascript" src="bootstrap3/js/bootstrap.min.js"></script>
	    <script type="text/javascript" src="bootstrap3/js/jquery-3.1.1.min.js"></script>
	
	
		<script type="text/javascript">
		$(function(){
			$('#button_sub').click(function(){
				
			});
		}); 
	</script>
</head>
<body>
<c:import url="header.jsp"></c:import>




		<div class="main">
			<div align="center">
				<form action="manager/udpwss" method="post">
					<table class="table table-bordered" style="width: 300px" >
						<tr>
							<td>用户名：</td>
							<td>${manager.name }</td>
						</tr>
						<tr>
							<td>原密码：</td>
							<td><input type="password" name="pw1" id="pw1"></td>
						</tr>
						<tr>
							<td>新密码：</td>
							<td><input type="password" name="pw2" id="pw2"> </td>
						</tr>
						<tr>
							<td><input type="reset" value="重置"> </td>
							<td><input type="submit" id="button_sub" value="确认"> </td>
						</tr>
					</table>
				</form>
			</div>
		</div>
<c:import url="footer.jsp"></c:import>
</body>
</html>