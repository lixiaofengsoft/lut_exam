package com.sky.service.impl;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.sky.bean.Course;
import com.sky.bean.ExamPaper;
import com.sky.common.Page;
import com.sky.dao.ICourseDao;
import com.sky.dao.IExamPaperDao;
import com.sky.service.IExamPaperService;
@Service("examPaperService")
public class ExamPaperServiceImpl implements IExamPaperService{
	
	@Autowired
	IExamPaperDao iExamPaperDao;
	@Autowired
	ICourseDao iCourseDao;
	@Override
	public void selectAllExamPaper(HttpServletRequest request,Model model) {
		String pageNow = request.getParameter("pageNow");
		Page page=null;
		List<ExamPaper> allPaPer =null;
		
		int paPerCount = iExamPaperDao.getPaPerCount();
		
		if(pageNow!=null){
			page=new Page(paPerCount, Integer.parseInt(pageNow));
			allPaPer = iExamPaperDao.selectAllPaPer(page.getStartPos(), page.getPageSize());
		}else{
			page=new Page(paPerCount, 1);
			allPaPer = iExamPaperDao.selectAllPaPer(page.getStartPos(), page.getPageSize());
		}
		for(ExamPaper e:allPaPer){
			System.err.println(e);
			System.err.println(e.getName()+e.getCourse().getName());
		}
		
		model.addAttribute("allPaPer", allPaPer);
		model.addAttribute("page", page);
		
	}
	@Override
	public void delPaPerById(HttpServletRequest request) {
		String exampaperid = request.getParameter("exampaperid");
		this.iExamPaperDao.delPaPerById(Integer.parseInt(exampaperid));
		
	}
	@Override
	public void selectAllCourse(Model model) {
		List<Course> allCourse = this.iCourseDao.selectAllCourse();
		model.addAttribute("allCourse", allCourse);
		
	}
	@Override
	public void insertPaPer(ExamPaper examPaper) {

		this.iExamPaperDao.insertExamPaper(examPaper);	
	}
	@Override
	public void editCourse(HttpServletRequest request, Model model) {
		String exampaperid = request.getParameter("exampaperid");
		System.err.println(exampaperid);
		ExamPaper examPaper = this.iExamPaperDao.selectPaperById(Integer.parseInt(exampaperid));
		System.err.println(examPaper);
		model.addAttribute("examPaper", examPaper);
		
	}
	@Override
	public void updatePaPer(ExamPaper examPaper) {
		// TODO Auto-generated method stub
		/*int exampaperid = examPaper.getExampaperid();
		this.iExamPaperDao.delPaPerById(exampaperid);*/
		this.iExamPaperDao.updatePaPer(examPaper);
	}
}
