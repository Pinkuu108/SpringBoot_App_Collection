package DDCODE;

import java.util.Scanner;

public class Reverse_Number {

	public static void main(String[] args)

	{

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number to reverse it::");
		int num = sc.nextInt();
		int rev = 0;
		while (num > 0) {
			int no = num % 10;
			rev = rev * 10 + no;
			num = num / 10;

		}
		System.out.println("Reverse Number is::" + rev);

	}

}
