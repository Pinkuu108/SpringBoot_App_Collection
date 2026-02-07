package DDCODE;

import java.util.Scanner;

public class PalinDrome_Number {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A Number to Reverse it ::");
		int num=sc.nextInt();
		int rev=0;
		for(int i=num;i!=0;i=i/10)
		{
			int no=i%10;
			rev=rev*10+no;
		}
		System.out.println(rev);
	}

}
