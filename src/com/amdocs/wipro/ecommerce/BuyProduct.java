package com.amdocs.wipro.ecommerce;

import java.util.Scanner;

public class BuyProduct extends AddToCart
{

	//AddToCart price = new AddToCart();
	
	
	public void buyProduct()
	{
		System.out.println();
		System.out.println("Do you want to buy product ");
		
		System.out.println("yes/No ");
		
		Scanner sc = new Scanner(System.in);
		String d=sc.next();
		
		//System.out.println(d);
		
		
		
		if(d.equals("yes"))
			
		{
			
			System.out.println("Your total ammount of bill is "+ AddToCart.productPrice);
			
		}
		if(d.equals("no"))
		{
			System.out.println("Thank you for using application ");
		}
		
		
	}
	
		public static void main(String[] args) 
		{
		BuyProduct obj= new BuyProduct();
		obj.buyProduct();
		}
}
