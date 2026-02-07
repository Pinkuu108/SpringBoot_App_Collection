package Interview_Related_Code;

public class Print_AllZero_LastIndex {

	public static void main(String[] args) {
		int a[]= {1,0,6,0,4,0,90,0,2,0};
		
		int num[]=new int[a.length];
		int index=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=0)
			{
				num[index]=a[i];
				index++;
			}
		}
		for(int i=0;i<num.length;i++)
		{
			System.out.print(num[i]+" ");
		}
	}
}
