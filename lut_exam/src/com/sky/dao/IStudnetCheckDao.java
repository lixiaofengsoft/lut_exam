package com.sky.dao;

import org.apache.ibatis.annotations.Param;

import com.sky.bean.Student;

public interface IStudnetCheckDao {
	public Student selectStudentById(Integer stuId);
	public String selectPassword(Integer stuId);
	
	public void updatePassword(@Param(value="stuId")Integer stuId,@Param(value="password")String password);
}
