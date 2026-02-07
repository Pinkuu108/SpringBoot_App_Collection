package DDCODE;

public class Factorial_Using_Recurssion {
	int fact=1;
	public static void main(String[] args) {
		int num=5,ans;
		Factorial_Using_Recurssion f=new Factorial_Using_Recurssion();

		ans=f.calfact(num);
		System.out.println(ans);
	}
	
	 int calfact(int  num)
	{
		
		if(num>1)
		{
			 fact=fact*num;
			 calfact(num-1);
		}
		return fact;
		
	}

}
