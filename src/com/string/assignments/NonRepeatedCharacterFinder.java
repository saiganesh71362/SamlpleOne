package com.string.assignments;

public class NonRepeatedCharacterFinder {
	
	    public static void main(String args[]) 
	    {
	        String str = "saiganesh";
	        boolean flag = true;

	        for (int i = 0; i < str.length(); i++)
	        {
	            char currentChar = str.charAt(i);
	            boolean isUnique = true;

	            for (int j = 0; j < str.length(); j++)
	            {
	                if (i != j && currentChar == str.charAt(j))
	                {
	                    isUnique = false;
	                    break;
	                }
	            }

	            if (isUnique)
	            {
	                System.out.println("First non-repeating character is: " + currentChar);
	                flag = false;
	                break;
	            }
	        }

	        if (flag)
	            System.out.println("There is no non-repeating character in the input string");
	    }
	}
	
   
