package com.sky.service;



import javax.servlet.http.HttpSession;

import org.springframework.ui.Model;

import com.sky.bean.ExamQuestion4;




public interface IStudentSubmitService {
	 
	 void rightAnser(HttpSession session,ExamQuestion4 question4,Model model);
}
