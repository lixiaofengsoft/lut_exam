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
<title>开始考试</title>
	<link rel="stylesheet" type="text/css" href="css/css.css">
	<script type="text/javascript" src="js/jquery-1.8.3.min.js"></script>
	
		<script type="text/javascript">
		$(function(){
			$(document).bind("contextmenu",function(e) { 
				return false; 
			}); 
			$(document).bind("keydown",function(e){ 
				e=window.event||e; 
				if(e.keyCode==116){ 
				e.keyCode = 0; 
				return false; 
				} 
			}); 
			
/* 			var form = document.getElementById("frm");
			form.onsubmit = function(){
				alert(form.elements.length);
				 for(var i=0;i<form.elements.length-1;i++)
	               {
				alert(form.elements[i].value);
	                  if(form.elements[i].value=="")
	                  {
	                     alert("当前表单不能有空项");
	                     form.elements[i].focus();
	                     return false;
	                  }
	               }
	               return true;

			} */
			
		}); 
	</script>
	<style type="text/css">
	.title{
		font-size:44;font-weight:bold;
		}
	</style>
</head>
<body onLoad="onkeydown=keydown()">
	<div class="find_head">
		<div class="system">
			<span class="system1">无纸化考试系统</span>
		</div>
		<div class="welcome">
			欢迎：<span>${student.name }</span>
		</div>
	</div>
		<table width="80%" border="0" cellspacing="0" cellpadding="0" align="center">
			<tr>
				<td align="center">考试时间</td>
				<td align="center">45分钟</td>
				<td align="center">剩余考试时间</td>
				<td align="center"><span id="time"></span></td>
			</tr>
		</table>
		<hr>
		
		
		<table width="100%" border="0" cellspacing="0" cellpadding="0">
        <tr>
          <td colspan="2" align="center" class="title"><font color="red">${examPaper.name }</font> &nbsp;&nbsp;考试卷
          </td>
        </tr>
        <tr>
          <td width="64%">&nbsp;</td>
          <td width="36%">&nbsp;满分<font color="red">100</font>分&nbsp;&nbsp;&nbsp;单选题<font color="red">40</font>分&nbsp;&nbsp;&nbsp;多选题<font color="red">60</font>分</td>
        </tr>
      </table>
		
	<form id="frm" action="student/submit" method="post" >
<%-- 	<input type="hidden" name="size" value="${selectAllOne.size() }"> 
	<input type="hidden" name="moreSize" value="${selectAllMore.size() }"> --%>
		<input type="hidden" name="papername" value="${examPaper.name }">
		<table id="single" width="90%"  border="0" cellspacing="0" cellpadding="0" align=center>
			
			  <tr>
			    <td colspan="4" height=23 style="font-size:11pt;">一、单选题（<font color=red>每题${one }分，答错不得分</font>）</td>
			    <input type="hidden" name="one" value="${one }">
			  </tr>
		
			<c:forEach items="${selectAllOne }" var="selectAllOne" varStatus="status">
				  <tr>
				    <td height=23 colspan="4" align=center nowrap>
					  <table width="100%"  border="0" cellspacing="0" cellpadding="0">
					        <tr>
					          <td width="8%" align=left height=23> ${status.index+1}.${selectAllOne.subject }  </td>
					          <td width="8%" align=left height=23><input type="hidden" name="idArrS[${status.index}]" value="${selectAllOne.examquestionid }"> </td>
					        </tr>
				      </table>
					</td>
				  </tr>
				  <tr>
				    <td  height=23 nowrap><input type="radio" value="A" name="answerArrS[${status.index}]" >A&nbsp;${selectAllOne.optiona }</td>
				  </tr>
				  <tr>
				    <td  height=23 nowrap><input type="radio" value="B" name="answerArrS[${status.index}]" >B&nbsp;${selectAllOne.optionb }</td>
				  </tr>
				  <tr>
				    <td  height=23 nowrap><input type="radio" value="C" name="answerArrS[${status.index}]" >C&nbsp;${selectAllOne.optionc }</td>
				  </tr>
				  <tr>
				    <td  height=23 nowrap><input type="radio" value="D" name="answerArrS[${status.index}]" >D&nbsp;${selectAllOne.optiond }</td>
				  </tr>
			</c:forEach>
		</table>
		
	<table id="single" width="90%"  border="0" cellspacing="0" cellpadding="0" align=center>
		
		  <tr>
		    <td colspan="4" height=23 style="font-size:11pt;">二、多选题（<font color=red>每题${more }分，答错不得分</font>）</td>
			<input type="hidden" name="more" value="${more }">
		  </tr>
			
		<c:forEach items="${selectAllMore }" var="selectAllMore" varStatus="status">
			  <tr>
			    <td height=23 colspan="4" align=center nowrap>
				  <table width="100%"  border="0" cellspacing="0" cellpadding="0">
				        <tr>
				          <td width="8%" align=left height=23> ${status.index+1}.${selectAllMore.subject }  </td>
				          <td width="8%" align=left height=23><input type="hidden" name="idArrM[${status.index}]" value="${selectAllMore.examquestionid }"> </td>
				        </tr>
			      </table>
				</td>
			  </tr>
			  <tr>
			    <td  height=23 nowrap><input type="checkbox" value="A" name="moreSelect[${status.index}]" >A&nbsp;${selectAllMore.optiona }</td>
			  </tr>
			  <tr>
			    <td  height=23 nowrap><input type="checkbox" value="B" name="moreSelect[${status.index}]" >B&nbsp;${selectAllMore.optionb }</td>
			  </tr>
			  <tr>
			    <td  height=23 nowrap><input type="checkbox" value="C" name="moreSelect[${status.index}]" >C&nbsp;${selectAllMore.optionc }</td>
			  </tr>
			  <tr>
			    <td  height=23 nowrap><input type="checkbox" value="D" name="moreSelect[${status.index}]" >D&nbsp;${selectAllMore.optiond }</td>
			  </tr>
		</c:forEach>
	</table>
	
		
		
		<div align="center"> <input type="submit" value="提交试卷"> </div>
	</form>
<c:import url="footer.jsp"></c:import>
<script>
    var times = 45 * 60;//剩余时间,单位秒
    var timeDiv = document.getElementById("time");
    var timeObj = null;
    function timer(){
        if(times == 0){
            //倒计时结束，提交表单
            document.getElementById("frm").submit();
            window.clearInterval(timeObj);
            return;
        }
        var t = Math.floor(times/60) +"分"+times%60+"秒"
        timeDiv.innerHTML = t;
        times --;
    }
    timeObj = window.setInterval(timer,1000);//setInterval动作的作用是在播放动画的时，每隔一定时间就调用函数，方法或对象。可以使用本动作更新来自数据库的变量或更新时间显示。
</script>
</body>
</html>