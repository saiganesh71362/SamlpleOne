package com.java.stringmethods;

public class CodePointBefore
{

	public static void main(String[] args) 
	{
		// this method returns string value  select specific values select based on index position ,
		 //then method returns before value OF select INDEX position value return type(ASCII)
        String s1 = "saiganesh";
        int s =s1.codePointBefore(2);
        System.out.println(s);
	}

}
