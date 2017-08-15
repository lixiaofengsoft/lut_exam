package com.sky.bean;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Course {
	private int courseid;
	private String name;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date time;
	public Course() {}
	public Course(int courseid, String name, Date time) {
		this.courseid = courseid;
		this.name = name;
		this.time = time;
	}
	public int getCourseid() {
		return courseid;
	}
	public void setCourseid(int courseid) {
		this.courseid = courseid;
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
	@Override
	public String toString() {
		return "Course [courseid=" + courseid + ", name=" + name + ", time="
				+ time + "]";
	}
	
	
}
