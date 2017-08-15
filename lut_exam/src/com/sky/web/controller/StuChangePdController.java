package com.sky.web.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sky.service.IStudentCheckService;

@Controller
@RequestMapping("/student")
public class StuChangePdController {
	
	@Autowired
	IStudentCheckService studentCheckService;
	
	@RequestMapping(value="/updatepwd",method=RequestMethod.POST)
	public void changePossword(HttpServletResponse response,HttpSession session,String pw1,String pw2) throws IOException{
		System.err.println(pw1+"------------"+pw2);
		
		String msg = this.studentCheckService.selectAndUpdate(session, pw1, pw2);
		PrintWriter writer = response.getWriter();
		System.out.println(msg);	
		writer.write(msg);
		writer.flush();
		writer.close();
	}
	
	
	
	@RequestMapping("/password")
	public String Possword(){
		
		return "student/password";
	}
}
