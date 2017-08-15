package com.sky.web.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sky.service.IExamQuestionService;


@Controller
@RequestMapping("/student")
public class StudentChoExamController {
	
	@Autowired
	IExamQuestionService examQuestionService;
	
	
	@RequestMapping("/choexam")
    public String addQue(Model model) {
    	this.examQuestionService.queryCourse(model);
    	return "student/choexam";
    }
}
