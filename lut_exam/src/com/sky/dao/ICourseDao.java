package com.sky.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.sky.bean.Course;

public interface ICourseDao {
	/** 
	 * 使用注解方式传入多个参数，
	 */  
	public List<Course> selectCourseByPage(@Param(value="startPos") Integer startPos,@Param(value="pageSize") Integer pageSize);  
	
	/** 
	 * 取得Course数量信息
	 */  
	public int getCourseCount(); 
	
	void delCourseById(Integer courseid); 
	
	void addCourse(Course course);
	Course editCourse(Integer courseid); 
	
	public List<Course> selectAllCourse();
}
