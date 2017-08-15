package com.sky.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sky.service.IAdviceService;

/**
 * 
 * @author Feng
 *
 */
@Controller
@RequestMapping("/student")
public class StudentAdvice {
	@Autowired
	IAdviceService adviceService;
	@RequestMapping(value="/advice")
	public String selectAdvice(HttpServletRequest request,Model model){
		this.adviceService.showAdviceByPage(request, model);
		return "student/advice";
	}
    @RequestMapping("/advselect")
    public String selectAdviceMsg(HttpServletRequest request,Model model){
    	this.adviceService.selectAdvice(request, model);
    	return "student/advselect";
    } 
}
