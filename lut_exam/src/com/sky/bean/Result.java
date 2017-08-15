package com.sky.bean;

import java.util.Date;

public class Result {
	private int id;
	private int stuid;
	private String name;
	private String papername;
	private float resone;
	private float resmore;
	private float restotal;
	private Date time;
	public Result() {
	}
	public Result(int stuid, String name, String papername, float resone,
			float resmore, float restotal) {
		super();
		this.stuid = stuid;
		this.name = name;
		this.papername = papername;
		this.resone = resone;
		this.resmore = resmore;
		this.restotal = restotal;
	}
	public Result(int id, int stuid, String name, String papername,
			float resone, float resmore, float restotal, Date time) {
		super();
		this.id = id;
		this.stuid = stuid;
		this.name = name;
		this.papername = papername;
		this.resone = resone;
		this.resmore = resmore;
		this.restotal = restotal;
		this.time = time;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getStuid() {
		return stuid;
	}
	public void setStuid(int stuid) {
		this.stuid = stuid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPapername() {
		return papername;
	}
	public void setPapername(String papername) {
		this.papername = papername;
	}
	public float getResone() {
		return resone;
	}
	public void setResone(float resone) {
		this.resone = resone;
	}
	public float getResmore() {
		return resmore;
	}
	public void setResmore(float resmore) {
		this.resmore = resmore;
	}
	public float getRestotal() {
		return restotal;
	}
	public void setRestotal(float restotal) {
		this.restotal = restotal;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	@Override
	public String toString() {
		return "Result [id=" + id + ", stuid=" + stuid + ", name=" + name
				+ ", papername=" + papername + ", resone=" + resone
				+ ", resmore=" + resmore + ", restotal=" + restotal + ", time="
				+ time + "]";
	}

	
}
