package com.java.stringmethods;

public class TrimString {

	public static void main(String[] args)
	{
		String s1 = "     saiganesh     ";
		System.out.println( "String Before Trim : "+s1.length());
		String s =s1.trim();
		System.out.println("Output String :"+s);
		System.out.println("String After Trim :"+s.length());

	}

}