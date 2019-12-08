package com.capgemini.jdbc.controller;

import java.util.Scanner;

import com.capgemini.jdbc.bean.UserBean;
import com.capgemini.jdbc.services.UserServices;
import com.caps.jdbc.factory.UserFactory;

public class UpdateUser {
	public static void main(String[] args) {
		UserServices services = UserFactory.instanceofUserServices();
		UserBean user= new UserBean();
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter userid ");
	    user.setUserid(Integer.parseInt(sc.nextLine()));
	     System.out.println("enter password");
	     user.setPassword(sc.nextLine());
	     System.out.println("enter the new email id");
	     user.setEmail(sc.nextLine());
	     
	    
 		
 		
     	
		if(services.updateUser(user.getUserid(),user.getPassword(),user.getEmail())) {
     		System.out.println("user updated...");
     	}
     	else
     	{
     		System.err.println("something went wrong.....");
     	}
		sc.close();
		
	}

}

