package com.sky.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sky.service.IStudentresService;

@Controller
@RequestMapping("/student")
public class StudentresController {
	
	@Autowired
	IStudentresService studentresService;
	
	@RequestMapping("/studentres")
	public String studentres(HttpServletRequest request,Model model){
		studentresService.showAdviceByPage(request, model);
		return "student/studentres";
	}
}
