package com.amdocs.wipro.ecommerce;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class ViewProducts 
{
	SqlConnections con= new SqlConnections();
	Connection co=con.connections();
	Scanner sc = new Scanner(System.in);
	
	    public void orders()
	    {
	    	ViewProducts view = new ViewProducts();
	    	System.out.println("Please select sorting order");
	    	
	    	sc = new Scanner(System.in);
	    	System.out.println("1.sort by Name");
	    	System.out.println("2.sort by Price");
	    	
	    	int nub=sc.nextInt();
	    	
	    	if(nub==1)
	    	{
	    		
	    		view.orderByName();
	    	}
	    	else
	    	{
	    		view.orderByPrice();
	    	}
	    	
	    	
	    }
		
		public void orderByName()
		{
		
			try 
			{
				PreparedStatement pre = co.prepareStatement("select * from products order by name");
		
				ResultSet rs = pre.executeQuery();
		
				while(rs.next())
				{
					
			
					System.out.println("  product Id>> "+rs.getString(1));
					System.out.println("  product Name>> "+rs.getString(3));
					System.out.println("  product Discription>> "+rs.getString(2));
					System.out.println("  product Price>> "+rs.getString(4));
					System.out.println("  Available Quantity>> "+rs.getString(5));
					System.out.println();
					
					
				}
				pre.close();
				rs.close();
				
				
			}
	 
			catch (Exception e) 
			{

				e.printStackTrace();
			}
		}
		
		public void orderByPrice()
		{
			try 
			{
				PreparedStatement pre = co.prepareStatement("select * from products order by price");
	
				ResultSet rs = pre.executeQuery();
	
				while(rs.next())
				{
				
		
				System.out.println("  product Id>> "+rs.getString(1));
				System.out.println("  product Name>> "+rs.getString(3));
				System.out.println("  product Discription>> "+rs.getString(2));
				System.out.println("  product Price>> "+rs.getString(4));
				System.out.println("  Available Quantity>> "+rs.getString(5));
				System.out.println();
				
				}
				pre.close();
				rs.close();
				
				
			}
 
			catch (Exception e) 
			{

				e.printStackTrace();
			}
		}
		
		
	public static void main(String[] args) 
	{
		ViewProducts pro = new ViewProducts();
		
		pro.orderByName();
		pro.orderByPrice();
		
	}
	
}
