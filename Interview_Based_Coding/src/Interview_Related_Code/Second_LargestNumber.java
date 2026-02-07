package Interview_Related_Code;

public class Second_LargestNumber {

	
	public static void main(String[] args) {
		
		int a[]= {1,6,4,2,0,9,-99,9876,976,6789};
		int temp;
		
//		for(int i=0;i<a.length;i++)
//		{
//			for(int j=0;j<a.length-1;j++)
//			{
//				if(a[j]<a[j+1])
//				{
//					temp=a[j];
//					a[j]=a[j+1];
//					a[j+1]=temp;
//				}
//			}
//		}
//		for(int k=0;k<a.length;k++)
//		{
//			System.out.print(a[k]+" ");
//		}
		
		
		
		//Second Aproach
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int k=0;k<a.length;k++)
		{
			System.out.print(a[k]+" ");
		}
	}
}
