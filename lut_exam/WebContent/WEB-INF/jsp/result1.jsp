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
<title>result.jsp</title>
	<link rel="stylesheet" type="text/css" href="css/css.css">
	<script type="text/javascript" src="js/jquery-1.8.3.min.js"></script>


		<link rel="stylesheet" href="css/jqpagination.css" />
		<script src="js/jquery.jqpagination.min.js"></script>
		<script src="js/scripts.js"></script>
		<script src="js/demo.js"></script>
	<script type="text/javascript">
		$(function(){
		});
	</script>
	<style type="text/css">
	
	</style>
</head>
	<body>
		<c:import url="header.jsp"></c:import>
			<div class="main">
				<div class="smhead">
					<div align="center" class="smhead3">
							<span class="smhead1">考生成绩管理</span>
							<br>
							<form action="manager/searchResult" method="post">
								<span class="smhead1">学号：</span>
								<input type="text" id="stuid" name="stuid">
								<span class="smhead1">姓名：</span>
								<input type="text" id="name" name="name">
								<input type="submit" value="查询">
							</form>
					</div>
					<div class="smhead2" align="center" >
							<table height="40" width="1200" border="1" rules="all" frame="box" align="center">
								<tr align="center" valign="middle">
									<td>学号</td>
									<td>姓名</td>
									<td>试题</td>
									<td>单选得分</td>
									<td>多选得分</td>
									<td>总分</td>
									<td>时间</td>
								</tr>
								 <c:forEach items="${results }" var="result">
									<tr>
										<td class=tablebody2 valign=middle align=center width="">${result.stuid }</td>
										<td class=tablebody2 valign=middle align=center width="">${result.name }</td>
										<td class=tablebody2 valign=middle align=center width="">${result.papername }</td>
										<td class=tablebody2 valign=middle align=center width="">${result.resone }</td>
										<td class=tablebody2 valign=middle align=center width="">${result.resmore }</td>
										<td class=tablebody2 valign=middle align=center width="">${result.restotal }</td>
										<td class=tablebody2 valign=middle align=center width=""><fmt:formatDate value="${result.time }" pattern="yyyy-MM-dd"/></td>
									</tr>
						        </c:forEach>
							</table>
					</div>
					
				</div>
						
			</div>
		<c:import url="footer.jsp"></c:import>
	</body>
</html>