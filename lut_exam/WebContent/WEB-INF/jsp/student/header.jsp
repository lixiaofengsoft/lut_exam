<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

	<div class="find_head">
		<div class="system">
			<span class="system1">无纸化考试系统</span>
		</div>
		<div class="welcome">
			欢迎：<span>${student.name }</span>
		</div>
	</div>
	<div class="find_nav">
	    <div class="find_nav_left">
	        <div class="find_nav_list">
	            <ul>
	                <li><a href="student/homepage">首页</a></li>
	                <li><a href="student/choexam">在线考试</a></li>
	                <li><a href="student/studentres">考试成绩查询</a></li>
	                <li><a href="student/advice">通知</a></li>
	                <li><a href="student/password">修改密码</a></li>
	                <li><a href="login">退出</a></li>
	            </ul>
	        </div>
	    </div>
	</div>