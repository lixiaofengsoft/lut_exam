package com.sky.service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

public interface IResultService {
	void showResultByPage(HttpServletRequest resquest,Model model);
	 void searchResults(Map<String, Object> map,Model model); 
}
