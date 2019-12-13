package com.cg.phonesimulatorapp.service;

import com.cg.phonesimulatorapp.bean.ShowContactsBean;
import com.cg.phonesimulatorapp.dao.ContactDAO;
import com.cg.phonesimulatorapp.dao.ContactDAOImpl;

public class ContactServiceImpl implements  ContactService{

	ContactDAO dao = new ContactDAOImpl();

	@Override
	public ShowContactsBean get(String name) {
		return dao.get(name);
	}

	@Override
	public boolean addContact(ShowContactsBean bean) {
		return dao.addContact(bean);
	}

	@Override
	public boolean deleteContact(String name) {
		return dao.deleteContact(name);
	}

	@Override
	public boolean editContact(String name) {
		return dao.editContact(name);
	}

}
