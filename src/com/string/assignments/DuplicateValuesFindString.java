package com.string.assignments;

public class DuplicateValuesFindString 
{
	   public static void main(String argu[]) 
	   {
	      String str = "saiganesh pellakuru";
	      char[] carray = str.toCharArray();
	      System.out.println("String Length :"+str.length());
	      System.out.println("The string is:" + str);
 	      System.out.print("Duplicate Characters in above string are :");  // optional line
          for (int i = 0; i < str.length(); i++)
	      {
	         for (int j = i + 1; j < str.length(); j++)
	         {
	            if (carray[i] == carray[j]) 
	            {
	            	 System.out.print(carray[j] + ",");
	                 break;
                }
	             
	         }
	      }
	     




	   }
}
