package com.sky.service.impl;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.sky.bean.Course;
import com.sky.common.Page;
import com.sky.dao.ICourseDao;
import com.sky.service.ICourseService;

@Service("courseServiceImpl")
public class CourseServiceImpl implements ICourseService{
	
	@Autowired
	ICourseDao iCourseDao;
	
	@Override
	public void showCourseByPage(HttpServletRequest request, Model model) {
		
		String pageNow = request.getParameter("pageNow");
		Page page=null;
		List<Course> courses=null;
		int courseCount = iCourseDao.getCourseCount();
		
		if(pageNow!=null){
			page=new Page(courseCount, Integer.parseInt(pageNow));
			courses=this.iCourseDao.selectCourseByPage(page.getStartPos(), page.getPageSize());
		}else{
			page=new Page(courseCount, 1);
			courses=this.iCourseDao.selectCourseByPage(page.getStartPos(), page.getPageSize());
		}
		
		model.addAttribute("courses", courses);
		model.addAttribute("page", page);  
	}

	@Override
	public void delCourseById(HttpServletRequest request) {
		int courseid =Integer.parseInt( request.getParameter("courseid"));
		System.err.println(courseid);
		this.iCourseDao.delCourseById(courseid);
		
	}

	@Override
	public void addCourse(Course course) {
		int courseid = course.getCourseid();
		this.iCourseDao.delCourseById(courseid);
		this.iCourseDao.addCourse(course);
	}

	@Override
	public void editCourse(HttpServletRequest request, Model model) {
		int courseid =Integer.parseInt( request.getParameter("courseid"));
		Course course = this.iCourseDao.editCourse(courseid);
		model.addAttribute("course", course);
	}

}
