package com.sky.service;

import com.sky.bean.Manager;

public interface IManagerService {
	public Manager findManagerByName(String name,String password);
	public void updateManager(Manager manager);
}
