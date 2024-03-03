package com.strings.java;

public class StringSubStringMethod 
{ // using subString Method.

	public static void main(String[] args) 
	{
		String str = "Saiganesh";
		String str1 = str.substring(3);    // only starting index
		System.out.println(str1);
		String str2 = str.substring(0, 3); // starting and ending index
		System.out.println(str2);
		String str4 = str1.concat(str2);
		System.out.println(str4);
		

	}

}
