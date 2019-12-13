package com.cg.phonesimulatorapp.dao;

import com.cg.phonesimulatorapp.bean.ShowContactsBean;

public interface ContactDAO {
	
	public ShowContactsBean get(String name);
	public boolean addContact(ShowContactsBean bean);
	public boolean deleteContact(String name);
	public boolean editContact(String name);
	
	

}
