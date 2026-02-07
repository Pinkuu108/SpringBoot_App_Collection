package DDCODE;

import java.util.Scanner;

public class Prime_Number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to check Either prime or not::");
		int num=sc.nextInt();
		int count=0;
		
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				count++;
			}
		}
		System.out.println(count);
		if(count==2)
		{
			System.out.println("Prime Number");
		}
		else
		{
			System.out.println("Not A Prime Number");
		}

	}

}
