package com.capgemini.jdbc.controller;

import java.util.Scanner;

import com.capgemini.jdbc.bean.UserBean;
import com.capgemini.jdbc.services.UserServices;
import com.caps.jdbc.factory.UserFactory;

public class UserLogin {
	public static void main(String[] args) {
		UserServices services = UserFactory.instanceofUserServices();
		Scanner sc = new Scanner(System.in);
		UserBean user= new UserBean();
		
		 System.out.println("enter username ");
	     user.setUsername(sc.nextLine());
	     System.out.println("enter password");
	     user.setPassword(sc.nextLine());
	     UserBean user1 =services.userlogin(user.getUsername(), user.getPassword());
		
	
		if(user1!= null)
		{
		      System.out.println("user id is "+user1.getUserid());
		      System.out.println("username is "+user1.getUsername());
		      System.out.println("email is "+user1.getEmail());
		}
		else
		{
			System.err.println("something went wrong");
		}

		}
		
	}



