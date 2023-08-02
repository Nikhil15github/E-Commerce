package com.amdocs.wipro.ecommerce;

import java.sql.Connection;
import java.sql.DriverManager;

public class SqlConnections 
{

	public Connection connections()
	{
		Connection co=null;
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			 co = DriverManager.getConnection("jdbc:mysql://localhost:3306/user","root","123456");
		} 
		catch (Exception e) 
		{
			
			e.printStackTrace();
		}
		
		return co;
	}
	
}
