package Daily_COde1;

public class Bubble_s {

	public static void main(String[] args) {
		int num[]= {0,9,7,5,3,2,1};
		int temp;
		for(int i=0;i<num.length;i++)
		{
			for(int j=0;j<num.length-1;j++)
			{
				if(num[j]>num[j+1])
				{
					temp=num[j];
					num[j]=num[j+1];
					num[j+1]=temp;
				}
			}
		}
		for(int i=0;i<num.length;i++)
		{
			System.out.print(num[i]+" ");
		}

	}

}
