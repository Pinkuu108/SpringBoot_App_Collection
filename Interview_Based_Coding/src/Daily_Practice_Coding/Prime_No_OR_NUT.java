package Daily_Practice_Coding;

public class Prime_No_OR_NUT {
	public static void main(String[] args) {
//		int a = 9;
//		if (a % 2 == 0) {
//			System.out.println("The Number is Prime ::" + a);
//		} else {
//			System.out.println("The Number is Not Prime ::" + a);
//
//		}
//		
		
//		int no=7;
//		int count=0;
//		for(int i=1;i<=no;i++)
//		{
//			if( no%i==0)
//			{
//				count++;
//			}
//		}
//		if(count==2)
//		{
//			System.out.println("Prime Number ");
//		}
//		else
//		{
//			System.out.println("Not a Prime Numer ");
//		}
			
		// 0 to 100 Prime Number 
		for(int i=1;i<=100;i++)
		{int c=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					c++;
				}
			}
			if(c==2)
			{
				System.out.print(i+",");
			}
		}
		
	}

}
