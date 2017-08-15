package com.sky.service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.sky.bean.Manager;
import com.sky.bean.Student;



public interface IStudentService {
	 void showStudentsByPage(HttpServletRequest request,Model model); 
	 void delStudentById(HttpServletRequest request); 
	 
	 void addStudent(Student student);
	 void addManager(Manager mangaer);
	 void editStudent(HttpServletRequest request,Model model);
	 
	 void searchStudents(Map<String, Object> map,Model model); 
	 
}
