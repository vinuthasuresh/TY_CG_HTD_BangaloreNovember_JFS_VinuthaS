package com.caps.jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UserLogin {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);  
		Connection conn=null;
		Statement stmt=null;
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
		String query = "SELECT * FROM users_info where userid= 20 AND password='gjgf45'";
		stmt=conn.createStatement();

		rs=stmt.executeQuery(query);
		System.out.println("Query Issued and executed...");
		System.out.println();

		//process returned sql results
		if(rs.next()) {
			System.out.println("Userid: "+rs.getInt(1));
			System.out.println("UserName: "+rs.getString(2));
			System.out.println("email: "+rs.getString("email"));
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
					if(stmt!=null) {
						stmt.close();
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
