package Daily_Practice_Coding;

public class Amstrong_Number {
	public static void main(String[] args) {
		
		int num=153;
		int t1=num;
		int len=0;
		//find Length Of This Integer
		while(t1!=0)
		{
			len++;
			t1=t1/10;
			
		}
		System.out.println("Length Of Integer is ::"+len);
				
		int t2=num;
		int total=0;
		int rem;
		while(t2!=0)
		{
			rem=t2%10;
			int mul=1;
			for(int i=1;i<=len;i++)
			{
				mul=mul*rem;
			}
			total=total+mul;
			t2=t2/10;
		}
		System.out.println("total is "+total);
		
	}

}
