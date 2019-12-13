package com.cg.phonesimulatorapp.dao;


import java.io.FileReader;
import java.io.Reader;
import java.security.KeyStore.TrustedCertificateEntry;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.cg.phonesimulatorapp.bean.ShowContactsBean;

public class ContactDAOImpl implements ContactDAO {

	FileReader reader;
	Properties prop;
    DriverManager driver ;
  ShowContactsBean bean = new ShowContactsBean();
  private List<ShowContactsBean> bean1 = new ArrayList<ShowContactsBean>();		
  
  public ShowContactsBean get(String name) {
   try
    		(reader = DriverManager.getRegister(prop.getProperty("DriverClass"),
    				 DriverManager.getConnection(prop.getProperty("dbUrl"),
    						DriverManager.getConnection(prop.getProperty("dbPassword")
    	                    Statement statement= DriverManager.createStatement()))));{
    	                    Statement.executeQuery("getQuery");
    						
    		catch (Exception e) {
				e.printStackTrace();
			}
		for (ShowContactsBean showContactsBean : bean1) {
			if (showContactsBean.getName()==name)
			{
				return showContactsBean;
			}

		}
		return null;

	}

	@Override
	public boolean addContact(ShowContactsBean bean) {
		
		 try
 		(reader = DriverManager.getRegister(prop.getProperty("DriverClass"),
 				 DriverManager.getConnection(prop.getProperty("dbUrl"),
 						DriverManager.getConnection(prop.getProperty("dbPassword")
 	                    Statement statement= DriverManager.createStatement()))));{
 	                    statement.executeQuery("getQuery");
 						
 		catch (Exception e) {
				e.printStackTrace();
			}
		
	
	
		for (ShowContactsBean showContactsBean : bean1) {
			if(showContactsBean.getName()==bean.getName())
			{
				return false;
			}
		}
		bean1.add(bean);
		return true;

	}








	@Override
	public boolean deleteContact(String name) {
		 try
	 		(reader = DriverManager.getRegister(prop.getProperty("DriverClass"),
	 				 DriverManager.getConnection(prop.getProperty("dbUrl"),
	 						DriverManager.getConnection(prop.getProperty("dbPassword")
	 	                    Statement statement= DriverManager.createStatement()))));{
	 	                    statement.executeQuery("getQuery");
	 						
	 		catch (Exception e) {
					e.printStackTrace();
				}
		
		ShowContactsBean bean = null;
		{
			for (ShowContactsBean showContactsBean : bean1) {
				if(showContactsBean.getName()==name)
				{
					bean=showContactsBean;
				}
			}
			if(bean1.remove(bean)) {
					return true;
					
					
				}else
			}
	 	                    return false;
				
			}
		
	
		
	}

	@Override
	public boolean editContact(String name) {
		// TODO Auto-generated method stub
		return false;
	}

}
