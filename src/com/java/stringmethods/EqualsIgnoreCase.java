package com.java.stringmethods;

public class EqualsIgnoreCase
{

	public static void main(String[] args)
	{
	// this method compare only content upper case or Lower case not consider only content compare
       String s1 = "saiganesh";
       String s2 = "SAIGANESH";
       boolean s =s1.equalsIgnoreCase(s2);
       System.out.println(s);
	}

}
