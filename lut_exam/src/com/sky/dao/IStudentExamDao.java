package com.sky.dao;

import java.util.List;

import com.sky.bean.ExamPaper;
import com.sky.bean.ExamQuestion2;


public interface IStudentExamDao {
	List<ExamQuestion2> selectAllOne(Integer examPaperid);
	List<ExamQuestion2> selectAllMore(Integer examPaperid);
	ExamPaper selectExamPaper(Integer examPaperid);
}
