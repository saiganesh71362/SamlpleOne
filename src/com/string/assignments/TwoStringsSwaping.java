package com.string.assignments;

public class TwoStringsSwaping 
{
	    public static void main(String[] args)
	    {
	        String str1 = "sai";
	        String str2 = "ganesh";

	        System.out.println("Before swapping:");
	        System.out.println("String 1: " + str1);
	        System.out.println("String 2: " + str2);

	        // Swap the strings
	        String temp = str1;
	        str1 = str2;
	        str2 = temp;

	        System.out.println("\nAfter swapping:");
	        System.out.println("String 1: " + str1);
	        System.out.println("String 2: " + str2);
	    }
	}



