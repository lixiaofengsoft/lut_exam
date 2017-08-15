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
<title>考生登陆</title>
<link rel="stylesheet" href="css/styles.css" type="text/css">
<script type="text/javascript" src="js/jquery-1.8.3.min.js"></script>
	<script type="text/javascript">
		$(function(){
			var form = document.getElementById("my_form");
			form.onsubmit = function(){
				console.log("表单想要提交");
				
				if($('#name').val()==""){
					alert("用户名不能为空");
					return false;
				}else if($('#password').val()==""){
					alert("密码不能为空");
					return false;
				}
				return true;
			}
		});
	</script>
	<style type="text/css">
		body,td,th { font-family: "Source Sans Pro", sans-serif; }
		body { background-color: #2B2B2B; }
	</style>
</head>
	<body>
		<div class="wrapper">
			<div class="container">
				<h1>考试系统</h1>
				<form id="my_form" class="form" method="post" action="student/login">
					<input type="text" placeholder="用户名" name="stuId" id="stuId">
					<input type="password" placeholder="密&nbsp;&nbsp;码" name="password" id="password">
					<button type="submit" id="login-button">Login</button>
				</form>
			</div>	
		</div>
	</body>
</html>