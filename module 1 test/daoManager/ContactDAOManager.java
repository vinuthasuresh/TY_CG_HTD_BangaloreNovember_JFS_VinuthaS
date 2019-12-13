package com.cg.phonesimulatorapp.daoManager;

import com.cg.phonesimulatorapp.dao.ContactDAO;
import com.cg.phonesimulatorapp.dao.ContactDAOImpl;
import com.cg.phonesimulatorapp.service.ContactService;
import com.cg.phonesimulatorapp.service.ContactServiceImpl;

public class ContactDAOManager {
	
	private ContactDAOManager() {
		
	}
	
	public static ContactDAO getContactDAO() {
		return new ContactDAOImpl();
		
	}
	public static ContactService getContactService() {
		return new ContactServiceImpl();
	}

}
