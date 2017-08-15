package com.sky.service.impl;

import java.util.Arrays;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.sky.bean.ExamQuestion4;
import com.sky.bean.Result;
import com.sky.bean.Student;
import com.sky.dao.IStudnetSubmitDao;
import com.sky.service.IStudentSubmitService;

@Service("studentSubmitService")
public class StudentSubmitServiceImpl implements IStudentSubmitService {

	@Autowired
	IStudnetSubmitDao studentSubmit;
	
	@Override
	public void rightAnser(HttpSession session, ExamQuestion4 question4,
			Model model) {
		System.err.println(question4);
		
		Student student=(Student) session.getAttribute("student");
		int stuId = student.getStuId();
		String name = student.getName();
		//试题名称
		String papername = question4.getPapername();
		
		
		String rightAnswer=""; //设置正确答案
		float resone=0;	//设置单选得分
		float resmore=0;	//设置多选得分
		
		int one = question4.getOne();
		int more=question4.getMore();
		System.out.println("one"+one);
		System.out.println("more"+more);
		
		//单选得分统计
		int[] idArrS = question4.getIdArrS(); //单选题的试题ID的属性
		String[] answerArrS = question4.getAnswerArrS(); //提交时单选的答案数组
		System.err.println( Arrays.toString(answerArrS));
		for(int i=0;i<idArrS.length;i++){
			int id=idArrS[i];
			if(id!=0){
					rightAnswer = this.studentSubmit.rightAnswer(id);
					System.err.println(rightAnswer);
					//			String s1 = answerArrS[i];
					if(answerArrS[i].equals(rightAnswer)){
						resone+=one;
					}
			}
		}
		
		//多选得分统计
		int[] idArrM = question4.getIdArrM(); //多选题的试题ID的属性
		String[] moreSelect = question4.getMoreSelect(); //多选提交时的答案数组
		
		
		for(int i=0;i<idArrM.length;i++){
			int  id=idArrM[i];
			if(id!=0){
					rightAnswer = this.studentSubmit.rightAnswer(id);
					String s2 = moreSelect[i];
					System.out.println("s2"+s2);
					if(s2.equals(rightAnswer)){
						resmore+=more;
					}
			}
		}
		
		
		System.out.println(resone);
		System.out.println(resmore);
		
		Result rs=new Result(stuId, name, papername, resone, resmore, resone+resmore);
		this.studentSubmit.insertSubResult(rs);
		
		model.addAttribute("rs", rs);
	}

}
