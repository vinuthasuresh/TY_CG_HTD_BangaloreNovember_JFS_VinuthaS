package com.cg.appdevelopment.dao;

import com.cg.appdevelopment.dto.UserInfo;

public interface UserInfoDAO {
	
	public UserInfo login(UserInfo info);
	public boolean register(UserInfo user);
	public boolean changePassword(int id, String password);
	


}
