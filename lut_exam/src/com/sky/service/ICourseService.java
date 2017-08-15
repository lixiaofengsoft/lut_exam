package com.sky.service;


import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.sky.bean.Course;



public interface ICourseService {
	 void showCourseByPage(HttpServletRequest request,Model model); 
	 void delCourseById(HttpServletRequest request); 
	 
	 void addCourse(Course course);
	 void editCourse(HttpServletRequest request,Model model);
	 
}
