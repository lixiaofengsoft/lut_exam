package com.sky.service.impl;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.sky.bean.Course;
import com.sky.bean.ExamPaper;
import com.sky.bean.ExamQuestion;
import com.sky.bean.ExamQuestion2;
import com.sky.common.Page;
import com.sky.dao.IExamQuestionDao;
import com.sky.service.IExamQuestionService;
@Service("examQuestionService")
public class ExamQuestionServiceImpl implements IExamQuestionService{
	@Autowired
	IExamQuestionDao examQuestion;
	
	@Override
	public void selectAllExamQuestion(HttpServletRequest request, Model model) {
		String pageNow = request.getParameter("pageNow");
		List<ExamQuestion> examQuestions=null;
		int totalCount = this.examQuestion.getQuesionCount();
		
		Page page=null;
		if(pageNow!=null){
			page=new Page(totalCount, Integer.parseInt(pageNow));
			examQuestions = this.examQuestion.selectAllQuestion(page.getStartPos(), page.getPageSize());
		}else{
			page=new Page(totalCount, 1);
			examQuestions = this.examQuestion.selectAllQuestion(page.getStartPos(), page.getPageSize());
		}
		System.err.println(examQuestions);
		model.addAttribute("examQuestions", examQuestions);
		model.addAttribute("page", page);
	}

	@Override
	public void delQuestionById(HttpServletRequest request) {
		// TODO Auto-generated method stub
		String examquestionid = request.getParameter("examquestionid");
		this.examQuestion.delQuestionById(Integer.parseInt(examquestionid));
	}

	@Override
	public void queryCourse(Model model) {
		List<Course> courses = this.examQuestion.queryCourse();
		model.addAttribute("courses", courses);
	}

	@Override
	public List<ExamPaper> selectPaperById(Integer id) {
		List<ExamPaper> list = this.examQuestion.selectPaperById(id);
		return list;
	}

	@Override
	public void insertExamPaper(ExamQuestion2 examquestion2) {
		this.examQuestion.insertExamPaper(examquestion2);
		
	}
	/**
	 * 通过点击编辑通过链接请求带参数查到一条数据 将数据加入到模型中
	 */
	@Override
	public void selectQuestion(HttpServletRequest request,
			Model model) {
		Integer exampaperid =Integer.parseInt(request.getParameter("exampaperid")) ;
		List<ExamQuestion> oneQuestion = examQuestion.selectQuestion(exampaperid);
		System.err.println("ExamQuestionServiceImpl---------"+oneQuestion);
		model.addAttribute("oneQuestion", oneQuestion);
	}
	
}
