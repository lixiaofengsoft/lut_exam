package com.sky.service.impl;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sky.bean.Student;
import com.sky.dao.IStudnetCheckDao;
import com.sky.service.IStudentCheckService;

@Service("studentCheckService")
public class StudentCheckServiceImpl implements IStudentCheckService {

	@Autowired
	IStudnetCheckDao iStudentCheck;
	@Override
	public Student studentCheck(Integer stuId, String password) {
		Student student = iStudentCheck.selectStudentById(stuId);
		if(student==null){
			return null;
		}else if(!student.getPassword().equals(password)){
			return null;
		}
		return student;
	}
	@Override
	public String selectAndUpdate(HttpSession session, String pw1, String pw2) {
		Student student =(Student) session.getAttribute("student");
		int stuId = student.getStuId();
		String password = this.iStudentCheck.selectPassword(stuId);
		if(password.equals(pw1)){
			this.iStudentCheck.updatePassword(stuId, pw2);
			return "修改成功";
		}
		return "原密码错误";
		
	}
	
}
