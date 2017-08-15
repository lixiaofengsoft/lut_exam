package com.sky.web.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sky.service.IResultService;

@Controller
@RequestMapping("/manager")
public class ResultController {

	@Autowired
	IResultService resultService;
	@RequestMapping(value="/result")
	public String getResult(HttpServletRequest request,Model model){
		this.resultService.showResultByPage(request, model);
		return "result";
	}
	
    //模糊查询学生
    @RequestMapping("/searchResult")
    public String searchStu(String stuid,String name, Model model) {
    	Map<String,Object> map = new HashMap<String,Object>(); 
    	System.err.println(stuid);
    	if(!"".equals(stuid)){
    		map.put("stuid", stuid);
    	}
    	if(!"".equals(name)){
    		map.put("name", "%"+name+"%");
    	}
    	if("".equals(stuid)&&"".equals(name)){
    		return "redirect:result";
    	}
    	this.resultService.searchResults(map, model);
    	return "result1";
    }
}
