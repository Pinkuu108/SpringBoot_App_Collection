package Sorting;

public class Selection_Sort {
	public static void main(String[] args) {
		int a[]= {7,8,3,21,3,4,0,9,45};
		int min; 
		int temp=0;
		for(int i=0;i<a.length;i++)
		{  min=i;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j]<a[min])
				{
					min=j;
				}
				
			}
			temp=a[i];
			a[i]=a[min];
			a[min]=temp;
		}
		
		for (int i : a) {
			System.out.print(i+" " );
			
		}
	}

}
