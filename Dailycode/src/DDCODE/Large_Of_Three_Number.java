package DDCODE;

import java.util.Scanner;

public class Large_Of_Three_Number {

	public static void main(String[] args) {
		int a,b,c;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a Values=");
		a=sc.nextInt();
		System.out.println("Enter b Values=");
		b=sc.nextInt();
		System.out.println("Enter c Values=");
		c=sc.nextInt();
		
		//Fist Approach
//		if(a>b&a>c)
//		{
//			System.out.println("A is Big");
//		}
//		else if (b>a&b>c)
//		{
//			System.out.println("B Is Big");
//		}
//		else 
//		{
//			System.out.println("C IS Big");
//		}
		
		
		if(a>b) 
		{
			if(a>c)
			{
				System.out.println("A is Big");
			}
			else
			{
				System.out.println("B is Big");
			}
			
		}
		else if(b>c)
		{
			System.out.println("B is Big");
		}
		else
		{
			System.out.println("C is Big");
		}
	}

}
