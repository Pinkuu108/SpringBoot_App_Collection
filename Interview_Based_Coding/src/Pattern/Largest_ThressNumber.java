package Pattern;

import java.util.Scanner;

public class Largest_ThressNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 1st Number::");
		int a = sc.nextInt();

		System.out.println("Enter 2nd Number::");
		int b = sc.nextInt();

		System.out.println("Enter 3rd Number::");
		int c = sc.nextInt();

//		if (a > b && a > c) {
//			System.out.println(a + "::is big");
//		} else if (b > a && b > c) {
//			System.out.println(b + "::is big");
//		} else {
//			System.out.println(c + "::is big");
//		}
		
		int lar=a>b?a:b;
		
		int lar2=lar>c?lar:c;
		System.out.println(lar2+"::is big");
		
	}
}
