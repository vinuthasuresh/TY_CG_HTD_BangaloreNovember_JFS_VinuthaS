package com.caps.jdbc.factory;

import com.capgemini.jdbc.dao.UserDAO;
import com.capgemini.jdbc.dao.UserDAOImp1;
import com.capgemini.jdbc.services.UserServices;
import com.capgemini.jdbc.services.UserServicesImpl;

public class UserFactory {
		
	private UserFactory() {
		
	}
	public static UserDAO instanceOfUserDaoImp1() {
		UserDAO dao = new UserDAOImp1();
		return dao;
		
	}
	public static UserServices instanceofUserServices() {
		UserServices sevices = new UserServicesImpl();
		return sevices;
	}

}
