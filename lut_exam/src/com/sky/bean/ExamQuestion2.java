package com.sky.bean;

public class ExamQuestion2 {
	private int examquestionid;
	private int courseid;
	private int examPaperid;
	private String subject;
	private String type;
	private String optiona;
	private String optionb;
	private String optionc;
	private String optiond;
	private String answer;
	public ExamQuestion2() {
	}
	public ExamQuestion2(int examquestionid, int courseid, int examPaperid,
			String subject, String type, String optiona, String optionb,
			String optionc, String optiond, String answer) {
		this.examquestionid = examquestionid;
		this.courseid = courseid;
		this.examPaperid = examPaperid;
		this.subject = subject;
		this.type = type;
		this.optiona = optiona;
		this.optionb = optionb;
		this.optionc = optionc;
		this.optiond = optiond;
		this.answer = answer;
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
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getOptiona() {
		return optiona;
	}
	public void setOptiona(String optiona) {
		this.optiona = optiona;
	}
	public String getOptionb() {
		return optionb;
	}
	public void setOptionb(String optionb) {
		this.optionb = optionb;
	}
	public String getOptionc() {
		return optionc;
	}
	public void setOptionc(String optionc) {
		this.optionc = optionc;
	}
	public String getOptiond() {
		return optiond;
	}
	public void setOptiond(String optiond) {
		this.optiond = optiond;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	@Override
	public String toString() {
		return "ExamQuestion2 [examquestionid=" + examquestionid
				+ ", courseid=" + courseid + ", examPaperid=" + examPaperid
				+ ", subject=" + subject + ", type=" + type + ", optiona="
				+ optiona + ", optionb=" + optionb + ", optionc=" + optionc
				+ ", optiond=" + optiond + ", answer=" + answer + "]";
	}
	
}
