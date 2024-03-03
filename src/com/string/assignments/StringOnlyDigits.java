package com.string.assignments;

public class StringOnlyDigits 
 {
public static void main(String[] args) {
		
		String str ="saiganesh71362@";
        int digits =0;
		for(int i=0;i<str.length();i++)
		{
			if(Character.isDigit(str.charAt(i)))
			{
				digits++;
				
			}
		}
		System.out.println("Total number of Digits="+digits);
	}}

