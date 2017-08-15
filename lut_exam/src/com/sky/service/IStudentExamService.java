package com.sky.service;



import org.springframework.ui.Model;




public interface IStudentExamService {
	 
	 boolean startExam(String examPaperid,Model model);
}
