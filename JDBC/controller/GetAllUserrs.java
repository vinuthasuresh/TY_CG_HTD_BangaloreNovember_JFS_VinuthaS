package com.capgemini.jdbc.controller;

import java.util.List;

import com.capgemini.jdbc.bean.UserBean;
import com.capgemini.jdbc.services.UserServices;
import com.caps.jdbc.factory.UserFactory;

public class GetAllUserrs {
	public static void main(String[] args) {
		UserServices services = UserFactory.instanceofUserServices();
		List<UserBean> list= services.getAllUsers();
		
		if(list!= null)
			for(UserBean user:list)
				System.out.println(user);
	}

}
