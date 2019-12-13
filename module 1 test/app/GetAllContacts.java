package com.cg.phonesimulatorapp.app;

import java.util.Scanner;

import com.cg.phonesimulatorapp.bean.ShowContactsBean;
import com.cg.phonesimulatorapp.dao.ContactDAO;
import com.cg.phonesimulatorapp.daoManager.ContactDAOManager;

public class GetAllContacts {
	public static void main(String[] args) {
		ContactDAO dao = ContactDAOManager.getContactDAO();
		ShowContactsBean bean3 = new ShowContactsBean();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the contact number");
		int num= sc.nextInt();
		System.out.println("Enter the contact name");
		String name = sc.next();
		System.out.println("Enter the group name");
		String group = sc.next();
		
		bean3.setNumber(num);
		bean3.setName(name);
		bean3.setGroup(group);
		boolean check = dao.addContact(bean3);
		if(check) {
			System.out.println("Details added successfully");
		}
		else
			System.out.println("Couldn't add the details");
		
		
	}

}
