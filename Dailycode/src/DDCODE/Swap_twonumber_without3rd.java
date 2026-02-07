package DDCODE;

import java.util.Scanner;

public class Swap_twonumber_without3rd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Value::");
		int a=sc.nextInt();
        System.out.println("Enter b value::");
        int b=sc.nextInt();
        
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("A value is :"+a);
        System.out.println("B value is ::"+b);
	}

}
