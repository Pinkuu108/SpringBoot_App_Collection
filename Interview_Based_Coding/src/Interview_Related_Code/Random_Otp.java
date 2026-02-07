package Interview_Related_Code;

import java.util.Random;

public class Random_Otp {
	public static void main(String[] args) {
		Random r=new Random();
		String otp="";
		for(int i=1;i<=4;i++)
		{
			int num=r.nextInt(10);
			otp+=num;
		}
		System.out.println(otp);
	}

}
