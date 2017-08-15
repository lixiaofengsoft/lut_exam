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
<title>管理员登陆</title>
<link rel="stylesheet" href="css/styles.css" type="text/css">
<script type="text/javascript" src="js/jquery-1.8.3.min.js"></script>
	<script type="text/javascript">
		$(function(){
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
				<h1>${error}</h1>
				<form class="form" action="http://localhost:8989/lut_exam/login">
					<button type="submit" id="login-button">确定</button>
				</form>
			</div>	
		</div>
	</body>
</html>
