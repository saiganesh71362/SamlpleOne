package com.string.java.logindetails;

public class StringLoginProNarmal
{

	public static void main(String[] args)
	{
        String username = "saiganesh71362@gmail.com";
        String password = "Saiganesh71362@";
        String alterpassword = "Sai71362@";
        
        if(username.equals(username) && password.equals("Saiganesh71362@") ||alterpassword.equals("Sai71362") )
        {	
        	System.out.println("Login Successfully Use App");
        }
       // else if( username.equals("saiganesh71362@gmail.com") && password.equals("Sai71362@"))
       // {
        //	System.out.println("Login Use altenative Password");
        //}
        else
        {
        	System.out.println("Login Faild");
        }
	}

}
