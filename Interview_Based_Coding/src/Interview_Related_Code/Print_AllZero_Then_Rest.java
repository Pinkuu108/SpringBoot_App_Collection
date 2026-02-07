package Interview_Related_Code;

public class Print_AllZero_Then_Rest {

	public static void main(String[] args) {
		int a[]= {9,0,6,0,5,0,3,0,3,0,10};
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==0)
			{
				System.out.print(a[i]+" ");
			}
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=0)
			{
				System.out.print(a[i]+" ");
			}
		}

	}

}
