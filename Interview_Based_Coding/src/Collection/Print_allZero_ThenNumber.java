package Collection;

public class Print_allZero_ThenNumber {

	public static void main(String[] args) {
		int a[]= {0,2,9,0,5,7,0,1,02,7,0};
		
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
