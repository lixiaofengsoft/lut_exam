package com.sky.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sky.bean.Student;
import com.sky.service.IStudentCheckService;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	IStudentCheckService studentCheckService;
	
	@RequestMapping("/login")
	public String loginCheck(String stuId,String password,HttpServletRequest req){
		int stuid = Integer.parseInt(stuId);
		Student student = this.studentCheckService.studentCheck(stuid, password);
		if(student!=null){
			HttpSession session = req.getSession();
			session.setAttribute("student", student);
			return "student/homepage";
		}
		req.setAttribute("error", "用户名或密码错误");
		return "student/error";
	}
	@RequestMapping("homepage")
	public String homepage(){
		return "student/homepage";
	}
	
}
