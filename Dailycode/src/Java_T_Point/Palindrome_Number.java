package Java_T_Point;

import java.util.Scanner;

public class Palindrome_Number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to check Palindrome Number");
		int num=sc.nextInt();
		int no=num;
		int rev=0,rest;
		while(no!=0)
		{
			rest=no%10;
			rev=rev*10+rest;
			no=no/10;
			
		}
		System.out.println("Reverse number is::"+rev);
		if(rev==num)
		{
			System.out.println("it is a Palindrome Number...");
		}
		else
		{
			System.out.println("It is not a palindrome Number");
		}
	}

}
