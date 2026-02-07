package Daily_Practice_Coding;

public class Missing_Number_No3 {
	public static void main(String[] args) {
		int a[]= {-1,0,1,3,4,5,6};
		
		int sum=0;
		for(int i=0;i<=a.length-1;i++)
		{
			sum=sum+a[i];
		}
		System.out.println("Missing_Number.main()"+sum);
		int sum1=0;
		for(int i=-1;i<=6;i++)
		{
			sum1=sum1+i;
			
		}
		System.out.println("Missing_Number.main()"+sum1);
		System.out.println("Missing_Number is ::"+(sum1-sum));
		
	}

}
