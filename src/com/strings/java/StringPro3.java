package com.strings.java;

public class StringPro3 
{

	public static void main(String[] args) 
	{
		String s1 = new String("Saiganesh");
	//StringBuffer s33 = new StringBuffer();
//		s1.apends(s33);
//		s1 = "Pellakuru";
//		s1.append(s1);
		// stored heap memory
		String s2 = new String("Saiganesh");
		String s3 = new String("Pellakuru");
		String s4 = "Pellakuru";
		String s5 = new String("Saiganesh");
 
//		System.out.println(s1==s3);
//		System.out.println(s1==s2);
//		System.out.println(s1.equals(s2));
//		System.out.println(s1);
		System.out.println(s1==s5);

	}

}
