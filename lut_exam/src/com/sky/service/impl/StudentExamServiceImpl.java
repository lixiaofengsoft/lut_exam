package com.sky.service.impl;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.sky.bean.ExamPaper;
import com.sky.bean.ExamQuestion2;
import com.sky.dao.IStudentExamDao;
import com.sky.service.IStudentExamService;

@Service("studentExamService")
public class StudentExamServiceImpl implements IStudentExamService{

	@Autowired
	IStudentExamDao iStudentExamDao;
	
	@Override
	public boolean startExam(String examPaperid, Model model) {
		int id = Integer.parseInt(examPaperid);
		
		List<ExamQuestion2> selectAllOne = this.iStudentExamDao.selectAllOne(id);
		List<ExamQuestion2> selectAllMore = this.iStudentExamDao.selectAllMore(id);
		 ExamPaper examPaper = this.iStudentExamDao.selectExamPaper(id);
		if(selectAllOne==null&&selectAllMore==null){
			return false;
		}
		int one=40/selectAllOne.size();
		int more=60/selectAllMore.size();
		
		/*	int size1 = selectAllOne.size();
		int size2 = selectAllMore.size();
		ExamQuestion4 question=new ExamQuestion4();
		question.setSize(size1);
		question.setMoreSize(size2);*/
		
		
		System.out.println(selectAllOne.size()+"---"+selectAllMore.size());
		model.addAttribute("selectAllOne", selectAllOne);
		model.addAttribute("selectAllMore", selectAllMore);
		model.addAttribute("examPaper", examPaper);
		model.addAttribute("one", one);
		model.addAttribute("more", more);
		
		
		return true;
	}
	 
	 
}
