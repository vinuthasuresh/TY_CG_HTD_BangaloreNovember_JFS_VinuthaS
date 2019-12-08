package com.caps.jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertUser {
	public static void main(String[] args) {


		Scanner sc= new Scanner(System.in);
		Connection conn=null;
		PreparedStatement pstmt=null;
		//Load the driver
		try {
			Driver driver= new com.mysql.jdbc.Driver();
			DriverManager.registerDriver(driver);
			System.out.println("driver loaded....");

			//Get the db connection
			String dbUrl="jdbc:mysql://127.0.0.1:3306/ty_cg_nov6";
			System.out.println("Enter DB user and password");
			String user= sc.nextLine();
			String password=sc.nextLine();
			conn=DriverManager.getConnection(dbUrl,user,password);
			System.out.println("connection established..");

			//Issue sql query
			String query="INSERT INTO users_info values(?,?,?,?)";
			pstmt=conn.prepareStatement(query);
			System.out.println("Enter userid...");
			pstmt.setInt(1, Integer.parseInt(sc.nextLine()));
			System.out.println("enter username");
			pstmt.setString(2, sc.nextLine());
			System.out.println("enter email");
			pstmt.setString(3, sc.nextLine());
			System.out.println("Enter password...");
			pstmt.setString(4, sc.nextLine());


			int count=pstmt.executeUpdate();
			if(count>0) {
				System.out.println("user Inserted...");
			}else
			{
				System.err.println("Something went wrong...");
			}


		} catch (SQLException e) {

			e.printStackTrace();
		}


		//Process the results returned 
		//Close all the JDBC Objects

	}

}




