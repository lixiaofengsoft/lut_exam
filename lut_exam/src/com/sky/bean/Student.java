package com.sky.bean;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Student {
	private int stuId;
	private String name;
	private String password;
	private String sex;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date joinTime;
	private String profession;
	public Student() {}
	public Student(int stuId, String name, String password, String sex,
			Date joinTime, String profession) {
		super();
		this.stuId = stuId;
		this.name = name;
		this.password = password;
		this.sex = sex;
		this.joinTime = joinTime;
		this.profession = profession;
	}
	public int getStuId() {
		return stuId;
	}
	public void setStuId(int stuId) {
		this.stuId = stuId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Date getJoinTime() {
		return joinTime;
	}
	public void setJoinTime(Date joinTime) {
		this.joinTime = joinTime;
	}
	public String getProfession() {
		return profession;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	@Override
	public String toString() {
		return "Student [stuId=" + stuId + ", name=" + name + ", password="
				+ password + ", sex=" + sex + ", joinTime=" + joinTime
				+ ", profession=" + profession + "]";
	}


}
