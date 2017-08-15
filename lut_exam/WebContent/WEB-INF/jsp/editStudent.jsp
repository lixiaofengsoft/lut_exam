<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
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

<form id="my_form" class="table table-bordered" action="manager/editStuMsg" method="post">
	<table class="table table-bordered" style="width: 1000px" align="center">
		<caption><b>添加考生信息</b></caption>
		<tr>
			<td>学号:</td>
			<td><input class="form-control" type="text" style="width:400px" name="stuId" id="stuId" value="${student.stuId }" readonly="readonly"></td>
			<td>考生姓名:</td>
			<td><input class="form-control" type="text" style="width:400px" name="name" id="name" value="${student.name }"></td>
		</tr>
		<tr>
			<td>密码:</td>
			<td><input class="form-control" type="text" style="width:400px" name="password" id="password" value="${student.password }"></td>
			<td>性别</td>
			<td>
				  男<input type="radio" value="男" name="sex" checked="checked">
				 女<input type="radio" value="女" name="sex" >
			</td>
		</tr>
		<tr>
			<td>入学时间:</td>
			<td><input class="form-control" type="text" style="width:400px" name="joinTime" value="<fmt:formatDate value="${student.joinTime }" pattern="yyyy-MM-dd"/>"></td>
			<td>专业</td>
			<td><input class="form-control" type="text" style="width:400px" name="profession" value="${student.profession }"></td>
		</tr>
		<tr>
			<td colspan="2" align="center"><input class="btn btn-default" type="submit" value="提交"></td>
			<td colspan="2" align="center"><input class="btn btn-default" type="button" value="返回" onclick="window.location.href='manager/stumanager'"></td>
		</tr>
	</table>
</form>				
		
		
<%-- 			<form action="manager/editStuMsg" method="post">
				 学号：<input type="text" name="stuId" value="${student.stuId }" readonly="readonly"><br>
				 考生姓名：<input type="text" name="name" value="${student.name }"><br>
				 密码：<input type="text" name="password" value="${student.password }"><br>
				 性别：男<input type="radio" value="男" name="sex" checked="checked">
					    女<input type="radio" value="女" name="sex" >
				<br>
				
				 入学时间：<input type="text" name="joinTime" value="${student.joinTime }"><br>
				 入学时间：<input type="text" name="joinTime" value="<fmt:formatDate value="${student.joinTime }" pattern="yyyy-MM-dd"/>"><br>
				 专业：<input type="text" name="profession" value="${student.profession }"><br>
				 <input type="submit" value="提交">
				  <input type="button" value="返回" onclick="window.location.href='manager/stumanager'">
			</form>	 --%>				
		<c:import url="footer.jsp"></c:import>
	</body>
</html>