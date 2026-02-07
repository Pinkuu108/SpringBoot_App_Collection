package Arrayes;

public class NuberIsExist_Not {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,89};
		boolean p=false;
		int num=6;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==num)
			{
				System.out.println("The Given Number is preseant in index ::"+i);
				p=true;
				break;
			}
		}
		if(p==false)
		{
			System.out.println("The Number is Not Exist In The Arrays");
		}
	}

}
