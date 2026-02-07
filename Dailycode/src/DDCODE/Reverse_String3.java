package DDCODE;

import java.util.Scanner;

public class Reverse_String3 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Name to Reverse it ::");
		String name=sc.next();
		String rev="";
		int lang=name.length();
		for(int i= lang-1;i>=0;i--)
		{
			rev=rev+name.charAt(i);
		}
		System.out.println(rev);
	}

}
