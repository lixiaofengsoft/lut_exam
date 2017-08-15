package com.sky.bean;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class ExamPaper {
	private int exampaperid;
	private String name;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date time;
	private Course course;
	public ExamPaper() {}
	public ExamPaper(int exampaperid, String name, Date time) {
		this.exampaperid = exampaperid;
		this.name = name;
		this.time = time;
	}
	public ExamPaper(int exampaperid, String name, Date time, Course course) {
		this.exampaperid = exampaperid;
		this.name = name;
		this.time = time;
		this.course = course;
	}
	
	
	public int getExampaperid() {
		return exampaperid;
	}
	public void setExampaperid(int exampaperid) {
		this.exampaperid = exampaperid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "ExamPaper [exampaperid=" + exampaperid + ", name=" + name
				+ ", time=" + time + ", course=" + course + "]";
	}
}
