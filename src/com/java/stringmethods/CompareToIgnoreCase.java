package com.java.stringmethods;

public class CompareToIgnoreCase {

	public static void main(String[] args)
	{
       String s1 = "saiganesh_p";
       String s2 = "SAIGANESH";
        int s =s1.compareToIgnoreCase(s2);
        System.out.println(s);
	}

}
