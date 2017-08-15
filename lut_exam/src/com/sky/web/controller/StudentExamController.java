package com.sky.web.controller;


import java.io.IOException;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sky.service.IStudentExamService;


@Controller
@RequestMapping("/student")
public class StudentExamController {
	
	@Autowired
	IStudentExamService studentExamService;
	@RequestMapping("/startExam")
	public String studentres(String examPaperid,Model model) throws IOException{
		System.out.println(examPaperid);
		this.studentExamService.startExam(examPaperid, model);
		
		return "student/startexam";
	}
}
