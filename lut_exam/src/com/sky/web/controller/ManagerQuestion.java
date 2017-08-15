package com.sky.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sky.bean.ExamQuestion2;
import com.sky.service.IExamQuestionService;

/**
 * 
 * @author Feng
 *
 */
@Controller
@RequestMapping("/manager")
public class ManagerQuestion {
	@Autowired
	IExamQuestionService examQuestionService;
	
	  //添加shiti信息到数据库
	  @RequestMapping(value="/addQueMsg",method=RequestMethod.POST)
	  public String addQue(ExamQuestion2 examQuestion2) {
	  	System.err.println(examQuestion2);
	  	this.examQuestionService.insertExamPaper(examQuestion2);
	  	return "redirect:question";
	  }
	  /**
	   * Controller 传进参数给查找一条数据
	   * @param request
	   * @param model
	   * @return
	   */
	  
	  @RequestMapping(value="/queedit")
	  public String queedit(HttpServletRequest request,Model model) {
		  examQuestionService.selectQuestion(request, model);
		  
		 return "editQuestion";
		// return null;
	  }
	  
	  
}
