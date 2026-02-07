package Arrayes;

public class Find_SecondLArgest_Number_InTheArrays {

	public static void main(String[] args) {
	int a[]= {1,2,33333,4,5,65,67,78,8,9,0};
	int large=a[0];
	int second=a[0];
	
	for(int i=0;i<a.length;i++)
	{
		if(a[i]>large)
		{
			second=large;
			large=a[i];
		}
		else if(a[i]>second&&a[i]!=second)
		{
			second=a[i];
		}
	}
	System.out.println("The Largest Number is ::"+large);
	System.out.println("Second Large Number is::"+second);
	}

}
