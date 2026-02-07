package Java_T_Point;

import java.util.Scanner;

public class Factorial_Number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number to Calculate Factorial Number");
		int num=sc.nextInt();
		int rest=1;
		for(int i=1;i<=num;i++)
		{
			rest=rest*i;
			
		}
		System.out.println(num+"::"+"Factorial Number is ::"+rest);
		

	}

}
