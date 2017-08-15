package com.sky.web.controller;


import java.io.IOException;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sky.bean.ExamQuestion4;
import com.sky.service.IStudentSubmitService;


@Controller
@RequestMapping("/student")
public class StudentSubmitController {
	@Autowired
	IStudentSubmitService studentSubmitService;
	
	@RequestMapping("/submit")
	public String submit(HttpSession session, ExamQuestion4 question,Model model) throws IOException{
		System.out.println(question);
		studentSubmitService.rightAnser(session, question, model);
		
		return "student/subres";
	}
}
