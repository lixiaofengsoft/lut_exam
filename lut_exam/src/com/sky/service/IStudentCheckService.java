package com.sky.service;

import javax.servlet.http.HttpSession;

import com.sky.bean.Student;

public interface IStudentCheckService {
	public Student studentCheck(Integer stuId,String password);
	
	public String selectAndUpdate(HttpSession session,String pw1,String pw2);
}
