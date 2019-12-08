package com.capgemini.jdbc.controller;

import java.util.Scanner;

import com.capgemini.jdbc.bean.UserBean;
import com.capgemini.jdbc.services.UserServices;
import com.caps.jdbc.factory.UserFactory;

public class InsertUser {
	public static void main(String[] args) {
		UserServices services = UserFactory.instanceofUserServices();
		UserBean user= new UserBean();
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter user id...");
		user.setUserid(Integer.parseInt(sc.nextLine()));
		System.out.println("enter user name...");
		user.setUsername((sc.nextLine()));
		System.out.println("enter the email");
		user.setEmail(sc.nextLine());
		System.out.println("enter the password");
		user.setPassword(sc.nextLine());
		
		if(services.insertUser(user)) {
			System.out.println("user inserted.........");
			
		}else
		{
			System.err.println("something went wrong");
		}
		sc.close();
		
		
	}

}
