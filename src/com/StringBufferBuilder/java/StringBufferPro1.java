package com.StringBufferBuilder.java;

public class StringBufferPro1
{

	public static void main(String[] args)
	{
       StringBuffer bu1 = new StringBuffer("saiganesh");
       StringBuffer bu2 = new StringBuffer("saiganesh");
       System.out.println(bu1.equals(bu2));
       System.out.println(bu1==bu2);
       System.out.println(bu1.append('p'));
	}

}
