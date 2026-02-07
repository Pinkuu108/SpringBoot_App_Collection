package DDCODE;

import java.util.Scanner;

public class Reverse_Number1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a NAme to Reverse it::");
		int no=sc.nextInt();
		
		int rev=0,rem=0;
		while(no!=0)
		{
			rem=no%10;
			rev=rev*10+rem;
			no=no/10;
		}
		System.out.println("Reverse Number is ::"+rev);
	}

}
