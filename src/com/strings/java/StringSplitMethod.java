package com.strings.java;

public class StringSplitMethod
{  // using split method

	public static void main(String[] args)
	{
       String str = "sai,ganesh,pellakuru";
       String[] str1 = str.split(",");
     
        for(int i=0;i<str1.length;i++)
        {
        	System.out.println(str1[i]);
        }
	}

}
