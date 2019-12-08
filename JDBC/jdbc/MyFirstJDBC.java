package com.caps.jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
                                                                                           
public class MyFirstJDBC {
	public static void main(String[] args)  {
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;
		
		try {
			//1.load the driver
			Driver driver = new com.mysql.jdbc.Driver();
			DriverManager.registerDriver(driver);//registering the Driver
//			Class.forName(" com.mysql.jdbc.Driver");
			System.out.println("Driver Loaded...");
			
			//2.get DBConnection via Driver
			String dbUrl ="jdbc:mysql://localhost:3306/ty_cg_nov6"+"?user=root&password=root";
		    conn =	DriverManager.getConnection(dbUrl);
	     	System.out.println("conection Estd....");
		
		    //3.Issue SQL query via connection
	     	  String query = "SELECT * FROM users_info";
	          stmt=conn.createStatement();
	          stmt.executeQuery(query);
	          rs=stmt.executeQuery(query);
	          System.out.println("Query Issued...");
	          System.out.println();
	          
	        //4.process the result returned by SQL QUERIES
	          while(rs.next()) {
	        	  System.out.println("Userid: "+rs.getInt("userid"));
	        	  System.out.println("UserName: "+rs.getString("username"));
	        	  System.out.println("email: "+rs.getString("email"));
	        	  System.out.println("*************************************");
	          }
	
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		//5.Close all JDBC Objects
		finally {
			
			{
				try {
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


