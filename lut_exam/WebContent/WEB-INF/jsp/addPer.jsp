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
		
			<form id="my_form" class="table table-bordered" action="manager/addPreMsg" method="post">
				<table class="table table-bordered" style="width: 1000px" align="center">
					<caption align="top"><b>添加试卷信息</b></caption>
					<tr>
						<td>课程名称：</td>
						<td>
							<select class="form-control" id="channelname" name="course.courseid">  
	                                <c:forEach var="allCourse" items="${allCourse}">  
		                                <option value="${allCourse.courseid}">  
		                               		 ${allCourse.name}  
		                                </option>  
	                                </c:forEach>  
	                 	 	 </select>  
						</td>
						<td>试卷名称：</td>
						<td><input class="form-control" type="text" style="width:250px" name="name" id="name""></td>
					</tr>
					<tr>
						<td colspan="2" align="center"><input class="btn btn-default" type="submit" value="提交"></td>
						<td colspan="2" align="center"><input class="btn btn-default" type="button" value="返回" onclick="window.location.href='manager/exampaper'"></td>
					</tr>
				</table>
			</form>	
			
		<%-- 	
			<form action="manager/addPreMsg" method="post">
				 课程名称：
						 <select id="channelname" name="course.courseid" cssClass="input4">  
                                <c:forEach var="allCourse" items="${allCourse}">  
	                                <option value="${allCourse.courseid}">  
	                               		 ${allCourse.name}  
	                                </option>  
                                </c:forEach>  
                 	 	 </select>  
				 
				 试题名称：<input type="text" name="name"><br>
				 <input type="submit" value="提交">
				 <input type="button" value="返回" onclick="window.location.href='manager/exampaper'">
			</form>		
				 --%>		
		<c:import url="footer.jsp"></c:import>
	</body>
</html>