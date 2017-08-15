package com.sky.service.impl;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.sky.bean.Result;
import com.sky.common.Page;
import com.sky.dao.IResultDao;
import com.sky.service.IResultService;
@Service("resultService")
public class ResultServiceImpl implements IResultService {
	
	@Autowired
	IResultDao iResultDao;
	
	@Override
	public void showResultByPage(HttpServletRequest resquest, Model model) {
		String pageNow = resquest.getParameter("pageNow");
		Page page=null;
		List<Result> results=null;
		int count = this.iResultDao.getResuletCount();
		if(pageNow !=null){
			page=new Page(count, Integer.parseInt(pageNow));
			results=this.iResultDao.selectResultByPage(page.getStartPos(), page.getPageSize());
		}else{
			page=new Page(count, 1);
			results=this.iResultDao.selectResultByPage(page.getStartPos(), page.getPageSize());
		}
		model.addAttribute("page", page);
		model.addAttribute("results", results);
	}

	@Override
	public void searchResults(Map<String, Object> map, Model model) {
		List<Result> results = this.iResultDao.searchResults(map);
		model.addAttribute("results", results);
	}

}
