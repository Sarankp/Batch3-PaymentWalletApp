package com.cg.paymentapp.Main;

import java.util.Scanner;

import com.cg.paymentapp.beans.Customer;
import com.cg.paymentapp.exception.InvalidInputException;
import com.cg.paymentapp.service.IUserService;
import com.cg.paymentapp.service.UserServiceImpl;

		public class UserMain 
		{
		
		public static void main(String[] main)
		{ 
				IUserService user=new UserServiceImpl();
				Customer c=new Customer();
				Scanner sc=new Scanner(System.in);			
					System.out.println("Please enter your name:");
					String name=sc.next();
					System.out.println("Please enter your mobile no:");
					String mob=sc.next();
					System.out.println("Please enter your password:");
					char[] pass= sc.next().toCharArray();
					String password=new String(pass);
					
					try {
						Customer cust=user.validateLogin(mob,password);
						System.out.println(cust);
						System.out.println("Login SuccessFul!");
						}
					catch(InvalidInputException e)
					{
				System.out.println(e.getMessage());
				System.out.println("Invalid Login Credentials.Please enter correct credentials.");
				System.out.println("Login Failed");
					}
					finally
					{
						System.out.println("Thanks for using this application. Have a good day!");
					}
					sc.close();
			
		}
	
}