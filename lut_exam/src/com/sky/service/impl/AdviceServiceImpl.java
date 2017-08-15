package com.sky.service.impl;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.sky.bean.Advice;
import com.sky.common.Page;
import com.sky.dao.IAdviceDao;
import com.sky.service.IAdviceService;

@Service("adviceService")
public class AdviceServiceImpl implements IAdviceService{
	
	@Autowired
	IAdviceDao iAdviceDao;


	@Override
	public void showAdviceByPage(HttpServletRequest request, Model model) {
		String pageNow = request.getParameter("pageNow");
		Page page=null;
		List<Advice> advices=null;
		int adviceCount = iAdviceDao.getAdviceCount();
		if(pageNow!=null){
			page=new Page(adviceCount, Integer.parseInt(pageNow));
			advices=this.iAdviceDao.selectAdviceByPage(page.getStartPos(), page.getPageSize());
		}else{
			page=new Page(adviceCount, 1);
			advices=this.iAdviceDao.selectAdviceByPage(page.getStartPos(), page.getPageSize());
		}
		System.err.println("advice"+advices);
		model.addAttribute("advices", advices);
		model.addAttribute("page", page); 
	}

	public void delAdvice(HttpServletRequest request){
		String adviceid = request.getParameter("adviceid");
		this.iAdviceDao.delAdvice(Integer.parseInt(adviceid));
	}

	@Override
	public void addAdvice(Advice advice) {
		// TODO Auto-generated method stub
		this.iAdviceDao.addAdvice(advice);
	}

	@Override
	public void selectAdvice(HttpServletRequest request, Model model) {
		// TODO Auto-generated method stub
		String adviceid = request.getParameter("adviceid");
		Advice advice = this.iAdviceDao.selectAdvice(Integer.parseInt(adviceid));
		model.addAttribute("advice", advice);
	}


}
