package com.string.assignments;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Palindrome
{

	public static void main(String[] args) throws IOException
	{
		InputStreamReader str = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(str);
		System.out.print("Enter a String :");  // mom
		String originalString = br.readLine();
		int length = originalString.length();  
		String reverse = " ";
		for (int i = length - 1; i >= 0; i--)   //0>=0 2>=0 mom m =0,o=1,m=2
		{
			reverse = reverse + originalString.charAt(i); 

		}
		if (originalString.equals(reverse))   //sai== isa
		{
			System.out.println("Entered String is a palindrome");
		} 
		else 
		{
			System.out.println("Entered String is not a Palindrome");
		}

	}

}

