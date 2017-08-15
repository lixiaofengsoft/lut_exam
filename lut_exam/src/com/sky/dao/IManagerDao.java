package com.sky.dao;

import com.sky.bean.Manager;

public interface IManagerDao {
	public Manager findManagerByName(String name);
	
	public void updateManager(Manager manager);
}
