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
			var form = document.getElementById("my_form");
			form.onsubmit = function(){
				
				if($('#courseid').val()=="-1"){
					alert("请选择课程");
					return false;
				}else if($('#examPaperid').val()=="-1"){
					alert("请选择试题");
					return false;
				}
				return true;
			}
			
			
			$("#courseid").change(function(){
				var courseid=$(this).val();	
			//	var json={"courseid":courseid};
				
				$.ajax({
					   type: "POST",
					   url: "ajax/getpar",
					   data: "courseid="+courseid,   //传进的json格式的字符串
					   dataType:"json",					//返回的类型为json
					   success: function(data){				//data 返回的数据
						   $("#examPaperid").children().remove(); 
							$("#examPaperid").prepend("<option value='-1'>请选择</option>");
						   $.each(data,function(){
							   console.log(this.exampaperid+"--------"+this.name);
							   var note="<option value='"+this.exampaperid+"'>"+this.name+"</option>"
							   $("#examPaperid").append(note); 
							});
					   }
					});
			});
			
			
			
		});		
		
	</script>
	<style type="text/css">
	
	</style>
</head>
	<body>
		<c:import url="header.jsp"></c:import>
<form id="my_form" class="table table-bordered" action="student/startExam" method="post">
	<table class="table table-bordered" style="width: 1000px" align="center">
		<caption><b>选择考试试题</b></caption>
		<tr>
			<td>所属课程：</td>
			<td>
					<select name="courseid" id="courseid"  style="width: 180px">
			    		<option value="-1">--请选择--</option>
						<c:forEach items="${courses }"  var="courses">
						 	<option value="${courses.courseid }" >${courses.name }</option>
						</c:forEach>
					</select> 
			</td>
		</tr>
		<tr>
			<td>所属试卷：</td>
			<td>
				<select name="examPaperid" id="examPaperid" style="width: 180px">
				   		<option>--请选择--</option>
				</select> 		
			</td>
		</tr>
		<tr>
			<td  align="center">
				 <input type="submit" value="点击开始考试">
			</td>
			<td  align="center"><input class="btn btn-default" type="button" value="返回" onclick="window.location.href='student/homepage'"></td>
		</tr>
	</table>
</form>		
		<c:import url="footer.jsp"></c:import>
	</body>
</html>