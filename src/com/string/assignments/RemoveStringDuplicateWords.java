package com.string.assignments;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RemoveStringDuplicateWords 
{

	  public static void main(String[] args)throws IOException
	  {  
	    //String to be inputted according to user 
        InputStreamReader in = new InputStreamReader(System.in);
	    BufferedReader br = new BufferedReader(in);
	    System.out.print("Enter the Input: ");
        String input= br.readLine();
	    String[] words=input.split(" ");  //Splitting every word in the sentence with the help of spaces
	    for(int i=0;i<words.length;i++)   //Outer loop for Comparison and to check if sentence is empty or not    
	    {
	      if(words[i]!=null)
	      {
	    	//Inner loop to compare two words in a sentence to check for duplicates
            for(int j=i+1;j<words.length;j++)  
	      {
	    	//Checking if both the compared strings are equal
           if(words[i].equals(words[j])) 
	      {
	          words[j]=null;  //Deletes the duplicate words if the compared strings are equal
	        }
	      }
	      }
	    }
	  //Displaying the String without the duplicate words
	    for(int k=0;k<words.length;k++)    
	    {
	      if(words[k]!=null)
	      {
	        System.out.print(words[k] + " ");
	      }
	      
	    }  
	  }
	}
