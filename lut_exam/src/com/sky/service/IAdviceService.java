package com.sky.service;


import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.sky.bean.Advice;
import com.sky.bean.Course;



public interface IAdviceService {
	 void showAdviceByPage(HttpServletRequest request,Model model); 
	 
	 void delAdvice(HttpServletRequest request);
	 public void addAdvice(Advice advice);
	 public void selectAdvice(HttpServletRequest request,Model model);
	/* void delCourseById(HttpServletRequest request); 
	 
	 void addCourse(Course course);
	 void editCourse(HttpServletRequest request,Model model);
	 */
}
