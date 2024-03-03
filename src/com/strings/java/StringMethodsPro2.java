package com.strings.java;

public class StringMethodsPro2
{  
	   // using methods (startsWith,endsWith,replaceAll,replace)

	public static void main(String[] args)
	{
      String str1 = "SiganeSh";
      String str2 = "Saiganesh";
      System.out.println(str1.startsWith("S"));// this method returns String return First char
      System.out.println(str1.endsWith("h")); //this method returns String return last char
      System.out.println(str1.replaceAll("S","D"));
      System.out.println(str1.replace("s", "S"));
      
	}

}
