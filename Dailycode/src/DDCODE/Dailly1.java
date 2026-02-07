package DDCODE;

import java.util.Scanner;

public class Dailly1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("1 to 100 Prime Number::");
		for(int i=1;i<=100;i++)
		{
			int count=0;
			for(int j=1;j<=i;j++)
			{
			
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.println(i);
			}
		}
	}

}
