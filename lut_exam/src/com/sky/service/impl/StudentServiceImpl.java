package com.sky.service.impl;


import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.sky.bean.Manager;
import com.sky.bean.Student;
import com.sky.common.Page;
import com.sky.dao.IStudentDao;
import com.sky.service.IStudentService;
@Service("studentServiceImpl")
public class StudentServiceImpl implements IStudentService{
	@Autowired
	private IStudentDao iStudentDao;
	
	//展示所有学生逻辑层
	@Override
	public void showStudentsByPage(HttpServletRequest request, Model model) {
		
		System.err.println("in studentServiceImpl--------------");
		String pageNow = request.getParameter("pageNow");
		System.err.println("in studentServiceImpl--------------"+pageNow);
		
		Page page=null;
		List<Student> students=null;
		
		int totalCount=(int) iStudentDao.getStudentCount();
		System.err.println("in studentServiceImpl--------------"+totalCount);
		
		if(pageNow!=null){
			page=new Page(totalCount,Integer.parseInt(pageNow));
			students = iStudentDao.selectStudentByPage(page.getStartPos(), page.getPageSize());
		}else{
			page=new Page(totalCount, 1);
			students = iStudentDao.selectStudentByPage(page.getStartPos(), page.getPageSize());
		}
		
		for(Student s:students){
			System.err.println("student========="+s);
		}
		System.err.println("page================"+page);
		
	    model.addAttribute("students", students);  
	    model.addAttribute("page", page);  
 	}
	//删除某个学生
	@Override
	public void delStudentById(HttpServletRequest request) {
		int stuId =Integer.parseInt( request.getParameter("stuId"));
		iStudentDao.delStudentById(stuId);
	}
	
	
	
	//添加一个学圣
	@Override
	public void addStudent(Student student) {
		int stuId = student.getStuId();
		iStudentDao.delStudentById(stuId);
		iStudentDao.addStudent(student);
	}
	
	
	//查找编辑
	@Override
	public void editStudent(HttpServletRequest request, Model model) {
		int stuId =Integer.parseInt( request.getParameter("stuId"));
		
		Student student = iStudentDao.editStudent(stuId);
		
		System.err.println( "editStudent:"+student);
		model.addAttribute("student", student);  
	}
	@Override
	public void searchStudents(Map<String, Object> map, Model model) {
		// TODO Auto-generated method stub
		List<Student> students = iStudentDao.searchStudents(map);
		for(Student s:students){
			System.err.println("student========="+s);
		}
		model.addAttribute("students", students);
	}
	@Override
	public void addManager(Manager mangaer) {
		// TODO Auto-generated method stub
		iStudentDao.addManager(mangaer);
	}
}
