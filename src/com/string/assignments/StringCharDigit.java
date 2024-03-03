package com.string.assignments;


public class StringCharDigit
{
    public static boolean containsOnlyLettersOrDigits(String str) 
    {
        return str.matches("^[a-zA-Z0-9]+$");
    }

    public static void main(String[] args)
    {
        String input1 = "Saiganesh71362";
        String input2 = "Saiganesh71362@";
        System.out.println("Input 1 contains only letters or digits: " + containsOnlyLettersOrDigits(input1));
        System.out.println("Input 2 contains only letters or digits: " + containsOnlyLettersOrDigits(input2));
    }
}

