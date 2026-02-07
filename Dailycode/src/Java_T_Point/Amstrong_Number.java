package Java_T_Point;

import java.util.Scanner;

public class Amstrong_Number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number to Check Amstrong Number or Not");
		int num=sc.nextInt();
		int t1=num,lang=0;
		while(t1!=0)
		{
			t1=t1/10;
			lang++;
		}
		System.out.println("Number length ::"+lang);
         int t2=num,rem,sum=0;
         while(t2!=0)
         {    
        	 rem=t2%10;
        	 int mul=1;
        	 for(int i=1;i<=lang;i++)
        	 {
        		 mul=mul*rem;
        	 }
        	 sum=sum+mul;
        	 t2=t2/10;
        	 
         }
         System.out.println(sum);
         if(num==sum)
         {
        	 System.out.println(num+"::is a amstrong number");
         }
         else
         {
        	 System.out.println(num+"::is not a amstrong number");
         }
	}

}
