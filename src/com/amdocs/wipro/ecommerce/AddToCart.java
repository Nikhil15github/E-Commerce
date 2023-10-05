package com.amdocs.wipro.ecommerce;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class AddToCart 
	{
	
	SqlConnections con= new SqlConnections();
	Connection co=con.connections();
	static String  productPrice;
	
	int nub;
	
	public void selectProduct()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Product id to add the product into cart");
		
	    nub=sc.nextInt();
		
			try 
			{
			PreparedStatement pre = co.prepareStatement("select * from products where productid='"+nub+"'");
			
			ResultSet rs=pre.executeQuery();
			
			System.out.println(">>>>>>>>your selected product>>>>>>>>");
			
			while(rs.next())
			{
				System.out.println("product Id>> "+rs.getString(1));
				System.out.println("product Name>>> "+rs.getString(3));
				System.out.println("product Discription>> "+rs.getString(2));
				System.out.println("product Price>> "+rs.getString(4));
				System.out.println("Available Quantity>>> "+rs.getString(5));
				System.out.println();
				
				 productPrice = rs.getString(4);
				 
				
				System.out.println("your product added into the cart ");
			}	
			} 
			catch (Exception e) 
			{
				
				e.printStackTrace();
			}
			System.out.println();
	}
	
	public static void main(String[] args) 
	{
		AddToCart cart = new AddToCart();
		
		cart.selectProduct();
		
	}

}
