package Interview_Related_Code;

public class Heigest_SmallestNo {
	public static void main(String[] args) {
		Integer a[]= {-99,1,4,6,2,8,90,-34,-78,6454};
		Integer largest=a[0];
		Integer smallest=a[0];
		
		for(int i=1;i<a.length;i++)
		{
			
				if(a[i]>largest)
				{
					largest=a[i];
				}
				else if(a[i]<smallest)
				{
					smallest=a[i];
				}
			
		}
		System.out.println("Smallest Number is ::"+smallest);
		System.out.println("largest Number is ::"+largest);
	}

}
