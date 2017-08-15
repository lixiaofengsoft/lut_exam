package com.sky.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.sky.bean.Course;
import com.sky.bean.ExamPaper;
import com.sky.bean.ExamQuestion;
import com.sky.bean.ExamQuestion2;

public interface IExamQuestionDao {
	List<ExamQuestion> selectAllQuestion(@Param(value="startPos") Integer startPos,@Param(value="pageSize") Integer pageSize);
	int getQuesionCount();
	void delQuestionById(int examquestionid);
	List<ExamPaper> selectPaperById(Integer id);
	List<Course> queryCourse();
	
	List<ExamQuestion> selectQuestion(Integer id);
	
	
	public void insertExamPaper(ExamQuestion2 examquestion2);
//	void updatePaPer(ExamPaper examPaper);
}
