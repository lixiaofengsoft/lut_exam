package com.sky.service.impl;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.sky.bean.Result;
import com.sky.bean.Student;
import com.sky.common.Page;
import com.sky.dao.IStudentresDao;
import com.sky.service.IStudentresService;

@Service("studentresService")
public class StudentresServiceImpl implements IStudentresService{
	
	@Autowired
	IStudentresDao iStudentresDao;


	@Override
	public void showAdviceByPage(HttpServletRequest request, Model model) {
		String pageNow = request.getParameter("pageNow");
		Page page=null;
		List<Result> results=null;
		int resCount = iStudentresDao.getStudentResCount();
		HttpSession session = request.getSession();
		Student student =(Student) session.getAttribute("student");
		int stuid = student.getStuId();
		
		if(pageNow!=null){
			page=new Page(resCount, Integer.parseInt(pageNow));
			results=iStudentresDao.selectStudentResByPage(stuid, page.getStartPos(), page.getPageSize());
		}else{
			page=new Page(resCount, 1);
			results=iStudentresDao.selectStudentResByPage(stuid, page.getStartPos(), page.getPageSize());
		}
		
		model.addAttribute("sturesults", results);
		model.addAttribute("page", page); 
	}




}
