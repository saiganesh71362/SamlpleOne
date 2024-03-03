package com.strings.java;

public class StringToCharArrayProgram
{

	public static void main(String[] args)
	{
        String str = "saiganeshpellakuru";
        char[] ch = str.toCharArray();
        int acount =0;
        int scount =0;
        int gcount =0;
        int ecount =0;
        int kcount =0;
        int lcount =0;
        int ucount =0;
        int pcount =0;
        for(int i =0;i<ch.length;i++)
        {
        	if(ch[i]=='s')
        	{
        		scount++;
        	}
        	else if(ch[i]=='a')
        	{
        		acount++;
        	}
        	else if(ch[i]=='g')
        	{
        		gcount++;
        	}
        	else if (ch[i]=='e')
        	{
        		ecount++;
        	}
        	else if (ch[i]=='k')
        	{
        		kcount++;
        	}
        	else if(ch[i]=='l')
        	{
        		lcount++;
        	}
        	else if(ch[i]=='u')
        	{
        		ucount++;
        	}
        	else if(ch[i]=='p')
        	{
        		pcount++;
        	}
        }
        
        int totalcount = acount+scount+gcount+ecount+kcount+lcount+ucount+pcount;

        System.out.println("scount :"+scount);
        System.out.println("acount :"+acount);
        System.out.println("gcount :"+gcount);
        System.out.println("kcount :"+kcount);
        System.out.println("lcount :"+lcount);
        System.out.println("ucount :"+ucount);
        System.out.println("pcount :"+ pcount);
        System.out.println("Total Char Count :"+totalcount);
	}

}
