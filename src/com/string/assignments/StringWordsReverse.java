package com.string.assignments;

public class StringWordsReverse 
{
    public  static void main(String[] args)
	 {
		    String str = " sai ganesh pellakuru";
		    char [] stringCharArray = str.toCharArray();
		    String reversedString = " ";
		    
		    for(int i = stringCharArray.length-1; i>=0; i--)
		    {
		      reversedString = reversedString + stringCharArray[i];
		    }
		    
		    System.out.print("The reversed string of the '"+str+"' is: " );
		    System.out.println(reversedString);
		  }
}


