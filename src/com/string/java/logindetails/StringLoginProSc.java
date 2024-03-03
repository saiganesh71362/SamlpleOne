package com.string.java.logindetails;

import java.util.Scanner;

public class StringLoginProSc 
{

	public static void main(String[] args) 
	{
         System.out.print("Enter User Name :");
         Scanner ur = new Scanner(System.in);
         String username =  ur.next();
        //System.out.println(username);
         System.out.print("Enter Password :");
         String password = ur.next();
         //System.out.println(password);
         
         if(username.equals(username) && password.equals(password))
         {
        	 System.out.println("Login Success Fully");
        	 System.out.println("Valid User Details ");
        	 
         }
         else
         {
        	 System.out.println("Invalid User Details");
         }
	}

}
