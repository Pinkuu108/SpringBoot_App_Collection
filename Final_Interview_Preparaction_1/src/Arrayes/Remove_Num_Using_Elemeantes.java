package Arrayes;

public class Remove_Num_Using_Elemeantes {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8,9};
		int num=7;
		int index=-1;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==num)
			{
				index=i;
				break;
			}
		}
		if(index==-1)
		{
			System.out.println("Elemeantes is not found in the Array..");
		}
		
		int size=a.length;
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
