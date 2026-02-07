package Arrayes;

public class Remove_Ele_UsingIndex {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8,9};
		int size=a.length;
		int index=5;
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
