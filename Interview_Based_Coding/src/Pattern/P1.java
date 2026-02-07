package Pattern;

public class P1 {
	public static void main(String[] args) {
		
//		r=1-5
//		c=1-5		
//		for(int i=1;i<=6;i++)
//		{
//			for(int j=1;j<=i;j++)
//			{
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
		
		
//		r=1-5
//		c=5-1
		for(int i=1;i<=6;i++)
		{
			for(int j=6;j>=i;j--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
