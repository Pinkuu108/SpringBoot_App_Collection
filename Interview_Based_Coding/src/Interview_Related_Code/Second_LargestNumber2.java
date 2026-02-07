package Interview_Related_Code;

public class Second_LargestNumber2 {

	public static void main(String[] args) {
		int a[]= {-77,6,3,1,2,78,54,9};
		
		int largest=Integer.MIN_VALUE;
		int Second_largest=Integer.MIN_VALUE;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>largest)
			{
				Second_largest=largest;
				largest=a[i];
			}
			else if(a[i]>Second_largest&& a[i]!=largest)
			{
				Second_largest=a[i];
			}
		}
		if(Second_largest==Integer.MIN_VALUE)
		{
			System.out.println("No Second_largest Valuse is there");
		}
		else
		{
			System.out.println("Second LArgest Value is ::"+Second_largest);
		}
	}
}
