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
			<form action="manager/addQueMsg" method="post">
				<table width="40%"  border="0" cellpadding="0" cellspacing="0"  align="center">
					<tr>
					    <td height="30" align="left" style="padding:5px;">所属课程：</td>
					    <td align="left">
							<select name="courseid" id="courseid" >
								 	<option value="${oneQuestion.course.courseid}">  
	                               		 ${oneQuestion.course.name}  
	                                </option>  
							</select> 	
					     </td>
					 </tr>
					<tr>
					    <td height="30" align="left" style="padding:5px;">所属试卷：</td>
					    <td align="left">
							<select name="examPaperid" id="examPaperid" >
					    		<option value="${oneQuestion.examPaper.exampaperid }">${oneQuestion.examPaper.name }</option>
							</select> 	
					     </td>
					 </tr>
					 <tr>
					    <td height="30" align="left" style="padding:5px;">试题题目：</td>
					    <td align="left">
					    	<input type="text" name="subject" value="oneQuestion.type">
					     </td>
					 </tr>
					<tr>
					    <td height="30" align="left" style="padding:5px;">选项类型：</td>
					    <td align="left">
					    	<select name="type" id="type" >
					    		<option value="单选题">单选题</option> 
					    		<option value="多选题">多选题</option> 
							</select> 
					     </td>
					 </tr>
					<tr>
					    <td height="30" align="left" style="padding:5px;">选项A：</td>
					    <td align="left">
							<input type="text" name="optiona" value="oneQuestion.optiona">
					    </td>
					 </tr>
					<tr>
					<tr>
					    <td height="30" align="left" style="padding:5px;">选项B：</td>
					    <td align="left">
							<input type="text" name="optionb" value="oneQuestion.optionb">
					    </td>
					 </tr>
					<tr>
					<tr>
					    <td height="30" align="left" style="padding:5px;">选项C：</td>
					    <td align="left">
							<input type="text" name="optionc" value="oneQuestion.optionc">
					    </td>
					 </tr>
					<tr>
					<tr>
					    <td height="30" align="left" style="padding:5px;">选项D：</td>
					    <td align="left">
							<input type="text" name="optiond" value="oneQuestion.optiond">
					    </td>
					 </tr>
					<tr>
					 <td height="30" align="left" style="padding:5px;">答案：</td>
					 <!-- 
					 		<td align="left" id="sOption">
					    		<select name="answer" id="answer" >
					    			<option value="-1">请选择</option> 
					    			<option value="A">A</option> 
					    			<option value="B">B</option> 
						    		<option value="C">C</option> 
						    		<option value="D">D</option> 
								</select> 
						     </td>
					   		 <td align="left" id="mOption" style="display:none">
					   		 			<input type="checkbox" value="A" name="answer" >A
										<input type="checkbox" value="B" name="answer" >B
										<input type="checkbox" value="C" name="answer" >C
										<input type="checkbox" value="D" name="answer" >D
						  	 </td>	
					  -->
					  	<td>
					  		<input type="text" name="answer" value="oneQuestion.answer">多选请用逗号隔开
					  	</td>
					 </tr>
					<tr>
						<td>
							 <input type="submit" value="提交">
						</td>
						<td>
							 <input type="button" value="返回" onclick="window.location.href='manager/question'">
						</td>
					</tr> 	
				</table>
			</form>					
		<c:import url="footer.jsp"></c:import>
	</body>
</html>