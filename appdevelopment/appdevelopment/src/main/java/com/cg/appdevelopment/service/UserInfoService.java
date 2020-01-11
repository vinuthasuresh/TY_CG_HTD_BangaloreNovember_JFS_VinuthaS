package com.cg.appdevelopment.service;

import com.cg.appdevelopment.dto.UserInfo;

public interface UserInfoService {
	public UserInfo login(UserInfo info);
	public boolean register(UserInfo user);
	public boolean changePassword(int id, String password);
	



}
