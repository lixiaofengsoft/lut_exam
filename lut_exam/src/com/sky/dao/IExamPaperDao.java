package com.sky.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.sky.bean.ExamPaper;

public interface IExamPaperDao {
	List<ExamPaper> selectAllPaPer(@Param(value="startPos") Integer startPos,@Param(value="pageSize") Integer pageSize);
	int getPaPerCount();
	void delPaPerById(int exampaperid);
	public void insertExamPaper(ExamPaper examPaper);
	ExamPaper selectPaperById(Integer id);
	void updatePaPer(ExamPaper examPaper);
}
