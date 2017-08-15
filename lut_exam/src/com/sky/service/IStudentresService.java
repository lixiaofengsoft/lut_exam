package com.sky.service;


import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;




public interface IStudentresService {
	 void showAdviceByPage(HttpServletRequest request,Model model); 
}
