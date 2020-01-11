package com.cg.appdevelopment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.appdevelopment.dao.UserInfoDAO;
import com.cg.appdevelopment.dto.UserInfo;


@Service
public class UserInfoServiceImpl implements UserInfoService{

	@Autowired
	private UserInfoDAO dao;
	
	@Override
	public UserInfo login(UserInfo info) {
		return dao.login(info);
	}

	@Override
	public boolean register(UserInfo user) {
		return dao.register(user);
	}

	@Override
	public boolean changePassword(int id, String password) {
		return dao.changePassword(id, password);
	}

}
