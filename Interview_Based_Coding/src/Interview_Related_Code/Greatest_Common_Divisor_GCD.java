package Interview_Related_Code;

import java.util.Scanner;

public class Greatest_Common_Divisor_GCD {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st Number::");
		int a=sc.nextInt();
		System.out.println("Enter Second Number::");
		int b=sc.nextInt();
	    while(b!=0)
	    {
	    	int temp=b;
	    	b=a%b;
	    	a=temp;
	    }
	    System.out.println("Gcd is ::"+a);
	}

}
