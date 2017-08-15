package com.sky.bean;

import java.util.Date;

public class Advice {
	private Integer id;
	private String name;
	private String content;
	private Date createtime;
	public Advice() {}
	public Advice(Integer id, String name, String content, Date createtime) {
		this.id = id;
		this.name = name;
		this.content = content;
		this.createtime = createtime;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getCreatetime() {
		return createtime;
	}
	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}
	@Override
	public String toString() {
		return "Advice [id=" + id + ", name=" + name + ", content=" + content
				+ ", createtime=" + createtime + "]";
	}
	
	
}
