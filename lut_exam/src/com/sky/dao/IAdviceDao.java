package com.sky.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.sky.bean.Advice;

public interface IAdviceDao {
	public List<Advice> selectAdviceByPage(@Param(value="startPos") Integer startPos,@Param(value="pageSize") Integer pageSize);
	public int getAdviceCount();
	
	public void delAdvice(Integer id);
	public void addAdvice(Advice advice);
	public Advice selectAdvice(Integer id);
}
