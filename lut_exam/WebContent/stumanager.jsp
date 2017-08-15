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
<title>stumanager.jsp</title>
		
		
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
		<table class="table table-striped">
        <thead>
          <tr>
            <th>Student-ID</th>
            <th>First Name</th>
            <th>Last Name</th>
            <th>Grade</th>
          </tr>
        </thead>
        <tbody>
          <tr>
            <td>001</td>
            <td>Rammohan </td>
            <td>Reddy</td>
            <td>A+</td>
          </tr>
          <tr>
            <td>002</td>
            <td>Smita</td>
            <td>Pallod</td>
            <td>A</td>
          </tr>
          <tr>
            <td>003</td>
            <td>Rabindranath</td>
            <td>Sen</td>
            <td>A+</td>
          </tr>
        </tbody>
      </table>
		
	</body>
</html>