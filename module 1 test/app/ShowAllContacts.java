package com.cg.phonesimulatorapp.app;

import java.util.Scanner;

import com.cg.phonesimulatorapp.bean.ShowContactsBean;
import com.cg.phonesimulatorapp.dao.ContactDAO;
import com.cg.phonesimulatorapp.daoManager.ContactDAOManager;


public class ShowAllContacts {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ContactDAO dao = ContactDAOManager.getContactDAO();


		while (true) {

			System.out.println("Press 1 to show all contacts");
			System.out.println("Press 2 to search for contact");
			System.out.println("Press 3 to operate on contact");
			int choice = sc.nextInt();
			switch(choice) {

			case 1: System.out.println("Enter the contact name to display....");
			String cname= sc.next();
			ShowContactsBean  bean2 = new ShowContactsBean();
			
			if(bean2!=null)
			{
				System.out.println(bean2.getName());
				System.out.println(bean2.getNumber());
				System.out.println(bean2.getGroup());
			
			}
			
			

			}


		}


	}


}
