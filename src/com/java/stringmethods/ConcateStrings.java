package com.java.stringmethods;

public class ConcateStrings {

	public static void main(String[] args)
	{
        String s1 = "sai";
        String s2 = "ganesh";
        String s =s1.concat(s2);
        String ss = s1+s2;
        System.out.println(s); // this line use string method
        System.out.println(ss); // this line use operator(+)
	}

}
