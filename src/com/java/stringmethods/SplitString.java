package com.java.stringmethods;

public class SplitString
{

	public static void main(String[] args)
	{
	  // words split spaces
      String s1 = "sai ganesh pellakuru";
      String[] s =s1.split(" ");
      for (int i=0;i<s.length;i++)
      {
      System.out.println(s[i]);
	 }
	}
}
