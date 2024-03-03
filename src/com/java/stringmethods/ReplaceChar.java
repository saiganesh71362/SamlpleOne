package com.java.stringmethods;

public class ReplaceChar
{

	public static void main(String[] args)
	{
       String s1 = "saiganesh";
        String s =s1.replaceFirst("s", "d");
        System.out.println(s);
        
        
          String ss =s1.replace("a", "e");
          System.out.println(ss);
          
          String sss = s1.replaceAll(s, ss);
          System.out.println(sss);
	}

}
