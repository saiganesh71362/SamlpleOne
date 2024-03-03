package com.string.assignments;

public class StringWordsCount 
{
		  public static void main(String[] args) 
		  {
	        String str = " hi iam saiganesh from tirupati"; // 5 words
	        String[] sp = str.split(" ");
	 
	        int count = 0;
	 
	        for (int i = 0; i < str.length(); i++)
	        {
	            if ((str.charAt(i) == ' ') && (str.charAt(i + 1) != ' '))
	            {
	                count++;
	            }
	        }
	        System.out.println("Number of words in a string : " + count);
	    }
	


}
