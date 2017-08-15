package com.sky.service;
/**
 * 问题service接口
 */

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.sky.bean.ExamPaper;
import com.sky.bean.ExamQuestion;
import com.sky.bean.ExamQuestion2;

public interface IExamQuestionService {
	void selectAllExamQuestion(HttpServletRequest request,Model model);
	void delQuestionById(HttpServletRequest request);
	public void queryCourse(Model model);
	List<ExamPaper> selectPaperById(Integer id);
/*	void delPaPerById(HttpServletRequest request);
	 public void insertPaPer(ExamPaper examPaper);
	 
	 void editCourse(HttpServletRequest request,Model model);
	 
	 public void updatePaPer(ExamPaper examPaper);*/
	public void insertExamPaper(ExamQuestion2 examquestion2);
	void selectQuestion(HttpServletRequest request,Model model);
}
