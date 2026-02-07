package Interview_Related_Code;

public class remove_Number_UsingNumber {

	public static void main(String[] args) {
		int a[]= {4,5,6,7,8,9};
		int size=a.length;
		int index=0;
		int num=8;
		for(int i=0;i<size;i++)
		{
			if(a[i]==num)
			{
				index=i;
				break;
			}
		}
		
		for(int i=index;i<size-1;i++)
		{
			a[i]=a[i+1];
		}
		size--;
		for(int i=0;i<size;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}
