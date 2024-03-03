package com.strings.java;

public class StringPro1
{

	public static void main(String[] args)
	{
		String s1 = "Pellakuru"; //s1 "Pellakuru" (id=30)	
		String s2 = "Pellakuru"; //s2 "Pellakuru" (id=30)
		
		// stored stack area stack memory not allowed duplicate data
		
		String s3 = new String ("Saiganesh"); // s3	"Saiganesh" (id=23)	
       	String s4 = new String("Siagnesh");    //s4	"Saiganesh" (id=32)	
       	
         // stored heap area heap memory allows duplicate data 
		
		System.out.println(s1==s2); //(30==30)true both stack  
		
		System.out.println(s1==s3); //(30==23) flase  s1 stack s3 heap 
		
		System.out.println(s1.equals(s3)); //  false compare only data
		
		System.out.println(s1.equals(s2)); // true compare only data.

	}

}
