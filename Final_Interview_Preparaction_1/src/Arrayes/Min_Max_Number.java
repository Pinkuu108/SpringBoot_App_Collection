package Arrayes;

public class Min_Max_Number {

	public static void main(String[] args) {
	int a[]= {-1,2,3,4,5,6,78,3,2,9,-22};
	int min=a[0];
	int max=a[0];
	
	for(int i=0;i<a.length;i++)
	{
		if(a[i]>max)
		{
			max=a[i];
		}
		else  if(a[i]<min)
		{
			min=a[i];
		}
	}
	System.out.println("MaX::"+max);
	System.out.println("Min::"+min);
	}

}
