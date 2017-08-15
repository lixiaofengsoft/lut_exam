package com.sky.bean;

public class ExamQuestion {
	private int examquestionid;
	private String subject;
	private String type;
	private String optiona;
	private String optionb;
	private String optionc;
	private String optiond;
	private String answer;
	private Course course;
	private ExamPaper examPaper;
	public ExamQuestion() {}
	public ExamQuestion(int examquestionid, String subject, String type,
			String optiona, String optionb, String optionc, String optiond,
			String answer, Course course, ExamPaper examPaper) {
		this.examquestionid = examquestionid;
		this.subject = subject;
		this.type = type;
		this.optiona = optiona;
		this.optionb = optionb;
		this.optionc = optionc;
		this.optiond = optiond;
		this.answer = answer;
		this.course = course;
		this.examPaper = examPaper;
	}
	public int getExamquestionid() {
		return examquestionid;
	}
	public void setExamquestionid(int examquestionid) {
		this.examquestionid = examquestionid;
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
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}

	public ExamPaper getExamPaper() {
		return examPaper;
	}
	public void setExamPaper(ExamPaper examPaper) {
		this.examPaper = examPaper;
	}
	@Override
	public String toString() {
		return "ExamQuestion [examquestionid=" + examquestionid + ", subject="
				+ subject + ", type=" + type + ", optiona=" + optiona
				+ ", optionb=" + optionb + ", optionc=" + optionc
				+ ", optiond=" + optiond + ", answer=" + answer + ", course="
				+ course + ", examPaper=" + examPaper + "]";
	}

	
}
