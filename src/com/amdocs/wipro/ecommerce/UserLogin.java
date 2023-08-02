package com.amdocs.wipro.ecommerce;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UserLogin 
{

	
	ResultSet rs;
	String username;
	String password;
	
	public void getUsername()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("please enter username");
		 username =sc.next();
		
		System.out.println("please enter paasword");
		password = sc.next();
		
		
	}

	public void matchUsername() 
	{
		
		 
		try 
		{
			
			SqlConnections con= new SqlConnections();
		
			Connection co = con.connections();
			
			Statement cr = co.createStatement();
			
			
			String sql="select * from userrigistration where username='"+username+"' and password='"+password+"'";
			
			ResultSet rs = cr.executeQuery(sql);
			
			
			
			 if(rs.next())
			 {	
				 System.out.println("login successfully");
			 }
			 else
			 {	
				 System.out.println("incorrect username or password");
			 }
		
			
		}
		catch (Exception e)
		{
			
			e.printStackTrace();
		}
	} 
	
		
	public void result() 
	{
		UserLogin u = new UserLogin();
		
		u.getUsername();
		u.matchUsername();
			
	}
	
	
}
