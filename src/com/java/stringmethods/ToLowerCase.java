package com.java.stringmethods;

public class ToLowerCase 
{

	public static void main(String[] args)
	{
	// ONLY CREATE TWO OBJECTS ONLY TWO STORES DIFFRENT MEMORIES (SAME VALUE SCP)
      String s1= "SAIGANESH";
      String s2 = new String("SAIGANESH");
      // this variables return true when , we use .equals method
      System.out.println(s1.toLowerCase());
      System.out.println(s2.toLowerCase());
	}

}
