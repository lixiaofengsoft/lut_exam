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
				var pw1 = $("#pw1").val();			
				var pw2 = $("#pw2").val();	
				var json ={"pw1":pw1,"pw2":pw2};
				console.log(json);
				$.ajax({
					url:"student/updatepwd",
					type:"post",
					data:"pw1="+pw1+"&pw2="+pw2,
					dataType:"text",
					success:function(data){
						alert(data);
					}
				});
			});
		}); 
	</script>
</head>
<body>
<c:import url="header.jsp"></c:import>
		<div class="main">
				<div align="center">
					<table class="table table-bordered" style="width: 300px">
						<tr>
							<td>学号：</td>
							<td>${student.stuId }</td>
						</tr>
						<tr>
							<td>姓名：</td>
							<td>${student.name }</td>
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
							<td colspan="2" align="center"><input type="button" id="button_sub" value="确认"> </td>
						</tr>
					</table>
			</div>
		</div>
<c:import url="footer.jsp"></c:import>
</body>
</html>