package DDCODE;

public class Example1 {
	public static void main(String[] args) {

		int a[]= {1,0,11,21,33,45,6,78,90,890};
		for(int i=0;i<a.length;i++)
		{
			int temp=0;
			for(int j=0;j<a.length-1-i;j++)
			{
				if(a[j]>a[j+1])
					{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
}
					}
			
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}

}
