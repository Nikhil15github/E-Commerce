package com.amdocs.wipro.ecommerce;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class UserRegistration 

{

	public void addDataRegistration( String firstname,String lastname ,String username , String password ,String city ,String mailid ,long mobilenumber )
	{
		
		try 
    	{
    		SqlConnections con= new SqlConnections();
    		
    		Connection co = con.connections();
		
			PreparedStatement pr = co.prepareStatement("insert into userrigistration(firstname,lastname,username,password,city,mailid,mobilenumber) values(?,?,?,?,?,?,?)");
			
			pr.setString(1, firstname);
			pr.setString(2, lastname);
			pr.setString(3, username);
			pr.setString(4, password);
			pr.setString(5, city);
			pr.setString(6, mailid);
			pr.setLong(7, mobilenumber);
			
			pr.executeUpdate();
			
			System.out.println(">>>>>>>> Register Succesfully >>>>>>>>");
		
    	}
		catch (Exception e) 
		{
			
			e.printStackTrace();
		}
	}
	
	public void getDataResigistration()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first name");
		String firstname=sc.next();
		
		System.out.println("Enter last name");
		String lastname=sc.next();
		
		System.out.println("create username");
		String username=sc.next();
		
		System.out.println("create new password");
		String password=sc.next();
		
		System.out.println("Enter city");
		String city=sc.next();
		
		System.out.println("Enter mailid");
		String mailid=sc.next();
		
		System.out.println("Enter mobile number");
		long mobilenumber=sc.nextLong();
		
		UserRegistration user = new UserRegistration();
		
		user.addDataRegistration(firstname, lastname, username, password, city, mailid, mobilenumber);
		
	}
	
	public static void main(String[] args) 
	{
		UserRegistration user = new UserRegistration();
		user.getDataResigistration();
	}
	
}
