package DDCODE;

import java.util.Scanner;

public class PalinDrome_Number2 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a NUmbner to Revberse it ::");
		int num=sc.nextInt();
		int pal=num;
		int rev=0;
		while(num!=0)
		{
			int no=num%10;
			rev=rev*10+no;
			num=num/10;
			
		}
		System.out.println("Reverse Number is ::"+rev);
		if(pal==rev)
		{
			System.out.println(rev+" ::is a palindrome number");
		}
		else {
			System.out.println(pal+"::Is Not A Palindrome Numer");
		}
	}

}
