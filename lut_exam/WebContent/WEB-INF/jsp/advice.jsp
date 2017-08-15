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
			<div class="main">
				<div class="smhead">
					<div align="center" class="smhead3">
							<span class="smhead1">通知</span>
							<br>
					</div>
					<div >
							<table height="40" width="1200" border="1" rules="all" frame="none" align="center">
								<tr>
									<td colspan="7"><input type="button" value="添加通知" onclick="window.location.href='manager/addAdvice'"> </td>
								</tr>
							</table>
					</div>
					<div class="smhead2" align="center" >
							<table class="table table-striped" height="40" width="1200" border="1" rules="all" frame="box" align="center">
								<tr align="center" valign="middle">
									<td>通知标题</td>
									<td>创建时间</td>
									<td>操作</td>
								</tr>
								 <c:forEach items="${advices }" var="advices">
									<tr>
										<td class=tablebody2 valign=middle align=center width="">${advices.name }</td>
									
										<td class=tablebody2 valign=middle align=center width=""><fmt:formatDate value="${advices.createtime }" pattern="yyyy-MM-dd"/></td>
										<td class=tablebody2 valign=middle align=center width="" colspan="2">
											<input type="button" value="查看" onclick="window.location.href='manager/advselect?adviceid=${advices.id}'">
											<input type="button" value="删除" onclick="window.location.href='manager/advdel?adviceid=${advices.id}'">
										</td>
									</tr>
						        </c:forEach>
							</table>
						<!-- 分页功能 start -->  
					    <div align="center" >  
					        <font size="2">共 ${page.totalPageCount} 页</font> <font size="2">第  
					            ${page.pageNow} 页</font> <a href="manager/advice?pageNow=1">首页</a>  
					        <c:choose>  
					            <c:when test="${page.pageNow - 1 > 0}">  
					                <a href="manager/advice?pageNow=${page.pageNow - 1}">上一页</a>  
					            </c:when>  
					            <c:when test="${page.pageNow - 1 <= 0}">  
					                <a href="manager/advice?pageNow=1">上一页</a>  
					            </c:when>  
					        </c:choose>  
					        <c:choose>  
					            <c:when test="${page.totalPageCount==0}">  
					                <a href="manager/advice?pageNow=${page.pageNow}">下一页</a>  
					            </c:when>  
					            <c:when test="${page.pageNow + 1 < page.totalPageCount}">  
					                <a href="manager/advice?pageNow=${page.pageNow + 1}">下一页</a>  
					            </c:when>  
					            <c:when test="${page.pageNow + 1 >= page.totalPageCount}">  
					                <a href="manager/advice?pageNow=${page.totalPageCount}">下一页</a>  
					            </c:when>  
					        </c:choose>  
					        <c:choose>  
					            <c:when test="${page.totalPageCount==0}">  
					                <a href="manager/advice?pageNow=${page.pageNow}">尾页</a>  
					            </c:when>  
					            <c:otherwise>  
					                <a href="manager/advice?pageNow=${page.totalPageCount}">尾页</a>  
					            </c:otherwise>  
					        </c:choose>  
					    </div>  
					    <!-- 分页功能 End -->  
					</div>
					
				</div>
						
						
				<!-- 				
				<div align="center">
					<div class="gigantic pagination">
					    <a href="hello" class="first" data-action="first">&laquo;</a>
					    <a href="#" class="previous" data-action="previous">&lsaquo;</a>
					    <input type="text" readonly="readonly" />
					    <a href="#" class="next" data-action="next">&rsaquo;</a>
					    <a href="#" class="last" data-action="last">&raquo;</a>
					</div>
				</div>	
				
				 -->				
			</div>
		<c:import url="footer.jsp"></c:import>
	</body>
</html>