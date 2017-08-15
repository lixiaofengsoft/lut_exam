package com.sky.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.sky.bean.Result;

public interface IResultDao {
	public List<Result> selectResultByPage(@Param(value="startPos") Integer startPos,@Param(value="pageSize") Integer pageSize);
	public int getResuletCount(); 
	
	List<Result> searchResults(Map<String, Object> map);
}
