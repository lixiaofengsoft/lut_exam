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
			$("#courseid").change(function(){
				var courseid=$(this).val();	
			//	var json={"courseid":courseid};
				
				$.ajax({
					   type: "POST",
					   url: "ajax/getpar",
			//		   contentType:"application/json",  //传给服务器的类型为json
			//		   data: JSON.stringify(json),   //传进的json格式的字符串
					   data: "courseid="+courseid,   //传进的json格式的字符串
					   dataType:"json",					//返回的类型为json
					   success: function(data){				//data 返回的数据
						   $("#examPaperid").children().remove(); 
							$("#examPaperid").prepend("<option value='-1'>请选择</option>");
						   $.each(data,function(){
							   console.log(this.exampaperid+"--------"+this.name);
							   //"<option value='this.exampaperid'>this.name</option>"
							   var note="<option value='"+this.exampaperid+"'>"+this.name+"</option>"
							   $("#examPaperid").append(note); 
							});
					   },
					   error:function(XMLHttpRequest, textStatus, errorThrown){
						   alert("请重新选择！");
					   }
					});
			});
		/* 	
			$("#btn").on("click",function(){
				var ee=$("#exampaper").val();
				console.log(ee);
			});
			 */                                                                                                                                                    
			$("#type").change(function(){
				var val=$(this).val();
				console.log(val);
				if(val=="单选题"){
					sOption.style.display="";
					mOption.style.display="none"; 
				}else if(val=="多选题"){
					sOption.style.display="none";
					mOption.style.display="";		 
				}
				
			});
			
		});		
		
	</script>
	<style type="text/css">
	
	</style>
</head>
	<body>
		<c:import url="header.jsp"></c:import>
		
		
		<form id="my_form" class="table table-bordered" action="manager/addQueMsg" method="post">
			<table class="table table-bordered" style="width: 1000px" align="center">
				<caption><b>添加问题信息</b></caption>
				<tr>
					<td>所属课程：</td>
					<td>
							<select name="courseid" id="courseid" >
					    		<option value="-1">--请选择--</option>
								<c:forEach items="${courses }"  var="courses">
								 	<option value="${courses.courseid }">${courses.name }</option>
								</c:forEach>
							</select> 	
					</td>
					<td>所属试卷：</td>
					<td>
							<select name="examPaperid" id="examPaperid" >
					    		<option>--请选择--</option>
							</select> 	
					</td>
				</tr>
				<tr>
					<td>试题内容：</td>
					<td>
						<input type="text" name="subject">
					</td>
					<td>选项类型：</td>
					<td>
					    	<select name="type" id="type" >
					    		<option value="单选题">单选题</option> 
					    		<option value="多选题">多选题</option> 
							</select> 
					</td>
				</tr>
				<tr>
					<td>选项A：</td>
					<td>
						<input type="text" name="optiona">
					</td>
					<td>选项B：</td>
					<td>
						<input type="text" name="optionb">
					</td>
				</tr>
				<tr>
					<td>选项C：</td>
					<td>
						<input type="text" name="optionc">
					</td>
					<td>选项D：</td>
					<td>
						<input type="text" name="optiond">
					</td>
				</tr>
				<tr>
					<td colspan="4" align="center">
					答案：<input type="text" name="answer">多选请用逗号隔开
					</td>
				</tr>
				<tr>
					<td colspan="2" align="center"><input class="btn btn-default" type="submit" value="提交"></td>
					<td colspan="2" align="center"><input class="btn btn-default" type="button" value="返回" onclick="window.location.href='manager/question'"></td>
				</tr>
			</table>
		</form>		
		<c:import url="footer.jsp"></c:import>
	</body>
</html>