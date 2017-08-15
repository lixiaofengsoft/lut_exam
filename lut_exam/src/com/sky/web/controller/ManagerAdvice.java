package com.sky.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sky.bean.Advice;
import com.sky.service.IAdviceService;

/**
 * 
 * @author Feng
 *
 */
@Controller
@RequestMapping("/manager")
public class ManagerAdvice {
	@Autowired
	IAdviceService adviceService;
	@RequestMapping(value="/advice")
	public String selectAdvice(HttpServletRequest request,Model model){
		this.adviceService.showAdviceByPage(request, model);
		return "advice";
	}
	
    //删除一个通知
    @RequestMapping("/advdel")
    public String coudel(HttpServletRequest request) {
    	
    	this.adviceService.delAdvice(request);
    	return "redirect:advice";
    }
    
    //添加通知页面
    @RequestMapping("/addAdvice")
    public String addAdvice() {
    	return "addAdvice";
    }
    @RequestMapping("/addAdviceMsg")
    public String addAdviceMsg(Advice advice){
    	System.err.println(advice);
    	this.adviceService.addAdvice(advice);
    	return "redirect:advice";
    }
    @RequestMapping("/advselect")
    public String selectAdviceMsg(HttpServletRequest request,Model model){
    	this.adviceService.selectAdvice(request, model);
    	return "advselect";
    } 
	/*
	  //添加shiti信息到数据库
	  @RequestMapping(value="/advice",method=RequestMethod.POST)
	  public String addQue(ExamQuestion2 examQuestion2) {
	  	System.err.println(examQuestion2);
	  	this.examQuestionService.insertExamPaper(examQuestion2);
	  	return "redirect:question";
	  }
	  */
}
