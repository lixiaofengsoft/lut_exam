package com.sky.dao;

import com.sky.bean.Result;


public interface IStudnetSubmitDao {
	
	String rightAnswer(Integer id);
	void insertSubResult(Result rs);
}
