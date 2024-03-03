package com.java.stringmethods;

public class Equaltoo
{

	public static void main(String[] args)
	{
		String s1 = "saiganesh";
		String s2 = "saiganesh";
		String s3 = "pellakuru";
		String s4 = new String("saiganesh");
		System.out.println(s1==s2); // true
		System.out.println(s1==s4); // false ==> s1 store scp , s4 store heap
		System.out.println(s2==s3); // false

	}

}
