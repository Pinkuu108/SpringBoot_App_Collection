package Stream_Api;

import java.time.Year;
import java.util.Scanner;

public class Dob_LeapYear_OrNot {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a year To Check Leap Year Or Not");
		int year=sc.nextInt();
		Year y=Year.of(year);
		if(y.isLeap())
		{
			System.out.println("Leap Year");
		}
		else
		{
			System.out.println("Not A Leap Year");
		}
	}
}
