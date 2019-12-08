package com.caps.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UserEmailUpdate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Connection conn= null;
		PreparedStatement pstmt=null;



		try {
			//Load the Driver
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver Loaded...");

			//get DBconnection
			String dbUrl="jdbc:mysql://localhost:3306/ty_cg_nov6";
			System.out.println("Enter DB username and password");
			String userName = sc.nextLine();
			String userPass=sc.nextLine();
			conn=DriverManager.getConnection(dbUrl,userName,userPass);
			System.out.println("conn established....");

			//Issue sql query
			String query= "update users_info set email=? where userid=? and password=?";
			pstmt=conn.prepareStatement(query);
			System.out.println("enter userid...");
			pstmt.setInt(2,Integer.parseInt(sc.nextLine()));
			System.out.println("enter new email...");
			pstmt.setString(1, sc.nextLine());
			System.out.println("enter password ....");
			pstmt.setString(3,sc.nextLine());

			int count=pstmt.executeUpdate();

			//Process the results returned

			if(count>0)
			{
				System.out.println("Query OK,...."+ count+" Rows effected");	
			}
			else
			{
				System.err.println("something went wrong...");
			}


		} catch (Exception e) {

			e.printStackTrace();
		}
		finally {

			{
				try {
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
         sc.close();
			}
		}
	}
}







//Close all the JDBC Objects


