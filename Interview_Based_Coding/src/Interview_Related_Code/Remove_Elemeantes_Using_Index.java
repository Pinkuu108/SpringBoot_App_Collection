package Interview_Related_Code;

public class Remove_Elemeantes_Using_Index {

	public static void main(String[] args) {
	
		
		int a[]= {1,2,3,4,5,6,7};
		int size=a.length;
		int index=4;
		
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
