package com.cg.phonesimulatorapp.service;

import com.cg.phonesimulatorapp.bean.ShowContactsBean;

public interface ContactService {
	
	public ShowContactsBean get(String name);
	public boolean addContact(ShowContactsBean bean);
	public boolean deleteContact(String name);
	public boolean editContact(String name);
	


}
