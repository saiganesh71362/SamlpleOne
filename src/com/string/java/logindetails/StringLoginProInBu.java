package com.string.java.logindetails;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringLoginProInBu
{

	public static void main(String[] args) throws IOException
	{
       System.out.print("Enter UserName :");
       InputStreamReader in = new InputStreamReader(System.in);
       BufferedReader bu = new BufferedReader(in);
       String username =  bu.readLine();
       System.out.print("Enter Password :");
       String password = bu.readLine();
        
        if(username.equals(username) && password.equals(password))
        {
        	System.out.println("Login Successfully \n Valid User Details");
        }
        else
        {
        	System.out.println("Invalid User Details");
        }
	}

}
