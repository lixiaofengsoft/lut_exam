package com.sky.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sky.bean.ExamPaper;
import com.sky.service.IExamQuestionService;

@Controller
@RequestMapping("/ajax")
public class AjaxController {
	
	@Autowired
	IExamQuestionService examQuestionService;
	
	@RequestMapping(value="/getpar",method=RequestMethod.POST,produces="application/json")
	@ResponseBody 
	public List<ExamPaper> getpar(String courseid){
		int id = Integer.parseInt(courseid);
		System.out.println(id);
		List<ExamPaper> examPaper=null;
		if(id==-1){
			return null;
		}else {
			examPaper = this.examQuestionService.selectPaperById(id);
		}
		
		for(ExamPaper e:examPaper){
			System.out.println(e);
		}
		
		return examPaper;
	}
}
