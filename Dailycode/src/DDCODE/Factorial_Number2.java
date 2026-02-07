package DDCODE;

import java.util.Scanner;

public class Factorial_Number2 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a Number for Factrorial Number::");
	int num=sc.nextInt();
	int sum=1;
	for(int i=1;i<=num;i++)
	{
		sum=i*sum;
	}
	System.out.println(sum);
}
}
