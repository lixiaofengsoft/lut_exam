package com.sky.service;


import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.sky.bean.ExamPaper;

public interface IExamPaperService {
	void selectAllExamPaper(HttpServletRequest request,Model model);
	void delPaPerById(HttpServletRequest request);
	 public void selectAllCourse(Model model);
	 public void insertPaPer(ExamPaper examPaper);
	 
	 void editCourse(HttpServletRequest request,Model model);
	 
	 public void updatePaPer(ExamPaper examPaper);
}
