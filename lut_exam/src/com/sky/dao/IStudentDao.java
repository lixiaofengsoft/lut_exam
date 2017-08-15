package com.sky.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.sky.bean.Manager;
import com.sky.bean.Student;

public interface IStudentDao {
	/** 
	 * 使用注解方式传入多个参数，
	 */  
	public List<Student> selectStudentByPage(@Param(value="startPos") Integer startPos,@Param(value="pageSize") Integer pageSize);  
	  
	/** 
	 * 取得Student数量信息
	 */  
	public long getStudentCount(); 
	
	void delStudentById(Integer stuId); 
	
	void addStudent(Student student);
	void addManager(Manager mangaer);
	Student editStudent(Integer stuId);
	
	List<Student> searchStudents(Map<String, Object> map);
}
