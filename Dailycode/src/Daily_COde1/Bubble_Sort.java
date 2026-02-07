package Daily_COde1;

public class Bubble_Sort {

	public static void main(String[] args) {
		int num[]= {2,5,8,3,1,11,0};
		int temp;
		for(int i=0;i<num.length;i++)
		{
			for(int j=0;j<num.length-1-i;j++)
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
