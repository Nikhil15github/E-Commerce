package com.amdocs.wipro.ecommerce;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ProductsList 
{

    public void getProductList()
    {
    	
    	try 
    	{
    		SqlConnections con= new SqlConnections();
    		
    		Connection co = con.connections();
		
			PreparedStatement pr = co.prepareStatement("insert into products(discription,name,price,quantity) values(?,?,?,?)");
			
			pr.setString(1, "4gb ram");
			pr.setString(2, "Redmi note 10");
			pr.setInt(3, 15000);
			pr.setInt(4, 6);
			pr.executeUpdate();
			
			Connection co1 = con.connections();
			
			PreparedStatement pr1 = co1.prepareStatement("insert into products(discription,name,price,quantity) values(?,?,?,?)");
			
			pr1.setString(1, "2gb ram");
			pr1.setString(2, "iphone 13");
			pr1.setInt(3, 65000);
			pr1.setInt(4, 5);
			pr1.executeUpdate();
			
			Connection co3 = con.connections();
			
			PreparedStatement pr2 = co1.prepareStatement("insert into products(discription,name,price,quantity) values(?,?,?,?)");
			
			pr2.setString(1, "6gb ram");
			pr2.setString(2, "Samsung 23utra");
			pr2.setInt(3, 90000);
			pr2.setInt(4, 3);
			pr2.executeUpdate();
			
			Connection co4 = con.connections();
			
			PreparedStatement pr3 = co1.prepareStatement("insert into products(discription,name,price,quantity) values(?,?,?,?)");
			
			pr3.setString(1, "8gb ram");
			pr3.setString(2, "onepluse 10R");
			pr3.setInt(3, 55000);
			pr3.setInt(4, 7);
			
			pr3.executeUpdate();
			
			
				
		} 
    	catch (Exception e) 
    	{
			
			e.printStackTrace();
		}
    }
	
    	public static void main(String[] args) 
    	{
		
    		ProductsList productsList = new ProductsList();
    		productsList.getProductList();
    		
    		System.out.println("done");
    	}
}
