package Daily_COde1;

public class Remove_DuplicateElemeant_FromArray {
	public static void main(String[] args) {
		int a[]= {1,2,2,3,4,5,6,7,7};
		int j=0;
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]!=a[i+1])
			{
				a[j]=a[i];
				j++;
			}
			
		}
		a[j]=a[a.length-1];
		for(int i=0;i<j+1;i++)
		{
			System.out.print(a[i]+",");
		}
		//Second Approch
//		int []num=new int[a.length];
//		int j=0;
//		for(int i=0;i<a.length-1;i++)
//		{
//			if(a[i]!=a[i+1])
//			{
//				num[j]=a[i];
//				j++;
//			}
//		}
//		for(int i=0;i<num.length;i++)
//		{
//			System.out.print(num[i]+",");
//		}
	}

}
