package com.caps.jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.Scanner;

public class UserLogin1 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);  
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		//load the driver
		try {	Driver driver = new com.mysql.jdbc.Driver();
		DriverManager.registerDriver(driver);//registering the Driver
		System.out.println("Driver Loaded...");


		//get DB conn via driver
		String dbUrl ="jdbc:mysql://127.0.0.1:3306/ty_cg_nov6";  //db url
		System.out.println("Enter the user name and password");
		String dbuser = sc.nextLine();
		String dbPass=sc.nextLine();
		conn =	DriverManager.getConnection(dbUrl,dbuser,dbPass);
		System.out.println("conection Estd....");

		//issue sql queries via connection
		String query = "SELECT * FROM users_info where userid= ? AND password=? ";
		pstmt=conn.prepareStatement(query);
		System.out.println("Enter userid..");
		pstmt.setInt(1,Integer.parseInt(sc.nextLine()));
		System.out.println("Enter password....");
		pstmt.setString(2,sc.nextLine());
		rs=pstmt.executeQuery();
		System.out.println("Query Issued and executed...");
		System.out.println();

		//process returned 
		
		if(rs.next()) {
			System.out.println("Userid: "+rs.getInt(1));
			System.out.println("UserName: "+rs.getString(2));
			System.out.println("email: "+rs.getString("email"));
		}
		else
		{
			System.err.println("something went wrong");
		}


		} catch (SQLException e) {
			e.printStackTrace();
		}finally {

			{
				try {//close all JDBC objects
					if(conn!=null)
						conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				try {
					if(pstmt!=null) {
						pstmt.close();
					}
				}catch(SQLException e) {
					e.printStackTrace();
				}
				try {
					if(rs!=null) {
						rs.close();
					}
				}catch(SQLException e)
				{
					e.printStackTrace();

				}		
			}
		}
	}


}
