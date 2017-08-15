package com.sky.bean;

import java.util.Arrays;

public class ExamQuestion3 {
	private int examquestionid;
	
	private int courseid;
	private int examPaperid;
	
	
	private int[] idArrS;	//记录单选题的试题ID的属性
	private int[] idArrM;	//记录多选题的试题ID的属性
	
	private String[] answerArrS=new String[0];  // 这个是提交时单选的答案数组
	
	private String[] moreSelect=new String[0]; ; // 这个是多选提交时的答案数组
	public ExamQuestion3() {}
	public ExamQuestion3(int examquestionid, int courseid, int examPaperid,
			int[] idArrS, int[] idArrM, String[] answerArrS, String[] moreSelect) {
		super();
		this.examquestionid = examquestionid;
		this.courseid = courseid;
		this.examPaperid = examPaperid;
		this.idArrS = idArrS;
		this.idArrM = idArrM;
		this.answerArrS = answerArrS;
		this.moreSelect = moreSelect;
	}
	public int getExamquestionid() {
		return examquestionid;
	}
	public void setExamquestionid(int examquestionid) {
		this.examquestionid = examquestionid;
	}
	public int getCourseid() {
		return courseid;
	}
	public void setCourseid(int courseid) {
		this.courseid = courseid;
	}
	public int getExamPaperid() {
		return examPaperid;
	}
	public void setExamPaperid(int examPaperid) {
		this.examPaperid = examPaperid;
	}
	public int[] getIdArrS() {
		return idArrS;
	}
	public void setIdArrS(int[] idArrS) {
		this.idArrS = idArrS;
	}
	public int[] getIdArrM() {
		return idArrM;
	}
	public void setIdArrM(int[] idArrM) {
		this.idArrM = idArrM;
	}
	public String[] getAnswerArrS() {
		return answerArrS;
	}
	public void setAnswerArrS(String[] answerArrS) {
		this.answerArrS = answerArrS;
	}
	public String[] getMoreSelect() {
		return moreSelect;
	}
	public void setMoreSelect(String[] moreSelect) {
		this.moreSelect = moreSelect;
	}
	@Override
	public String toString() {
		return "ExamQuestion3 [examquestionid=" + examquestionid
				+ ", courseid=" + courseid + ", examPaperid=" + examPaperid
				+ ", idArrS=" + Arrays.toString(idArrS) + ", idArrM="
				+ Arrays.toString(idArrM) + ", answerArrS="
				+ Arrays.toString(answerArrS) + ", moreSelect="
				+ Arrays.toString(moreSelect) + "]";
	}

	
}
