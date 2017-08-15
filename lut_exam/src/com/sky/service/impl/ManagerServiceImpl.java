package com.sky.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sky.bean.Manager;
import com.sky.dao.IManagerDao;
import com.sky.service.IManagerService;
/**
 * service层
 * @author Feng
 *
 */
@Service("managerServiceImpl")
public class ManagerServiceImpl implements IManagerService{
	@Autowired
	private IManagerDao iManagerDao;

	@Override
	public Manager findManagerByName(String name, String password) {
		Manager manager = iManagerDao.findManagerByName(name);
		if(manager==null){
			return null;
		}else if(!manager.getPassword().equals(password)){
			return null;
		}
		return manager;
	}

	@Override
	public void updateManager(Manager manager) {
		iManagerDao.updateManager(manager);
	}
}
