package com.java.stringmethods;

public class StartsWith
{

	public static void main(String[] args)
	{
		String s1 = "Saiganesh";
		 boolean s = s1.startsWith("S");
		 System.out.println(s);
		 boolean ss = s1.startsWith("g", 3);// toffset(3) where to begin looking in this string.
		 System.out.println(ss);
		 

	}

}
