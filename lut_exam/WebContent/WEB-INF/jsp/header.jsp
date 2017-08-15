<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	<div class="find_head">
		<!-- <div class="logo">
			<img src="images/logo.jpg" width="200px" height="80px">
		</div> -->
		<div class="system">
			<span class="system1">无纸化考试系统后台</span>
		</div>
		<div class="welcome">
			欢迎：<span>${manager.name }</span>
		</div>
	</div>
	<div class="find_nav">
	    <div class="find_nav_left">
	        <div class="find_nav_list">
	            <ul>
	                <li><a href="manager/homepage">首页</a></li>
	                <li><a href="manager/stumanager">考生管理</a></li>
	                <li><a href="manager/result">考试成绩查询</a></li>
	                <li><a href="manager/course">课程管理</a></li>
	                <li><a href="manager/exampaper">试卷管理</a></li>
	                <li><a href="manager/question">试题管理</a></li>
	                <li><a href="manager/advice">发送通知</a></li>
	                <li><a href="manager/addManager">添加管理员</a></li>
	                <li><a href="manager/updatepw">修改密码</a></li>
	                <li><a href="login2">退出</a></li>
	            </ul>
	        </div>
	    </div>
	</div>