package DDCODE;

import java.util.Scanner;
//Reverse String And After Reverse it will reverse again 1st two letter
public class Reverse_String2 {

	public static void main(String[] args) {


		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Name To Reverse Name::");
		String name=sc.next();
		String rev="";
		int lang=name.length();
		for(int i=lang-1;i>=0;i--)
		{
			rev=rev+name.charAt(i);
			
		}
		
		String finalresult="";
		if(rev.length()>=2)
		{
			String firsttwo=rev.substring(0, 2);
			String rest=rev.substring(2);
			String reversefirsttwo="";
			for(int i=firsttwo.length()-1;i>=0;i--)
			{
				reversefirsttwo=reversefirsttwo+firsttwo.charAt(i);
				
			}
			   // Combine both parts
			 finalresult=reversefirsttwo+rest;
		}
		else
		{
			finalresult=rev;
		}
		
		System.out.println("Reverse Number is ::"+finalresult);

	}

}
