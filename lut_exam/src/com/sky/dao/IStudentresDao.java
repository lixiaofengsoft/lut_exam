package com.sky.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.sky.bean.Result;

public interface IStudentresDao {
	public List<Result> selectStudentResByPage(@Param(value="stuid") Integer stuid,@Param(value="startPos") Integer startPos,@Param(value="pageSize") Integer pageSize);
	public int getStudentResCount();
}
