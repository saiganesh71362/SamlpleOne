package com.strings.java;

public class StringMethodPro1
{ // using methods ( length,concat,==,equals)

	public static void main(String[] args)
	{
	  // entire program create 4 objects but java memories store only two objects , 
	// first create two objects already stored stack(String constant pool) this memory does not except duplicate objects store
      String str1 = "saiganesh"; // literal string
      String str2 = "pellakuru"; // literal string
      String str5 = "saiganesh";
      // both objects stores stack memory
      System.out.println(str1);
      System.out.println("String Length str1 ::"+str1.length()); 
      System.out.println(str2);
      System.out.println("String Length str2 :: "+str2.length());
      System.out.println(str1==str2); // compare reference variables check (==) operator.
      System.out.println(str1==str5);
      System.out.println(str1.equals(str2)); // compare both variable data
      System.out.println(str1.concat(str2)); // both strings add using (concat) method.
      
      String str3 = new String("saiganesh");
      String str4 = new String("pellakuru");
      String str6 = new String("saiganesh");
      // both objects stores heap memory 
      System.out.println(str3);
      System.out.println("String Length str3 ::"+str3.length()); 
      System.out.println(str4);
      System.out.println("String Length str4 ::"+str4.length());
      System.out.println(str3==str4);
      System.out.println(str3==str6);
      System.out.println(str3.equals(str4));
      System.out.println(str1.equals(str3));
      System.out.println(str4.equals(str2));
      System.out.println(str3.concat(str4)); // concat strings 
	}

	

}
