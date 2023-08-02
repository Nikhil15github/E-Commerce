package com.amdocs.wipro.ecommerce;

import java.util.Scanner;

public class WelcomePage 
{

	public void displayOperations()
	{
		System.out.println("Welcome to E-Commerce based application");
		System.out.println();
		System.out.println("1.User Registration");
		System.out.println("2.User Login");
		System.out.println("3.User view Product item as Sorted Order");
		System.out.println("4.Buy Product");
		System.out.println("5.View Cart ");
		System.out.println("6.Purchase the item ");
		System.out.println("Admin Operation");
		System.out.println("7. Add product item");
		System.out.println();
	
		
	}
	
	public void matchOperation()
	{
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Please select the number accoding to choice");
		
		int choice=sc.nextInt();
		
		if(choice >7 || choice <=0)
		{
			System.out.println("please enter choice between 1 to 7");
		}
		
		switch(choice)
		{
		
		case 1:
			UserRegistration res = new UserRegistration();
			res.getDataResigistration();
			
		break;
		case 2:
			UserLogin login = new UserLogin();
			login.result();
			
		break;
		}
		
	}
	
	public static void main(String[] args) 
	{
		WelcomePage we = new WelcomePage();
		we.displayOperations();
		we.matchOperation();
		
	}
}
