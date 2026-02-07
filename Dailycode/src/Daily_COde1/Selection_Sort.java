package Daily_COde1;

public class Selection_Sort {

	public static void main(String[] args) {
		int no[]= {2,6,7,84,0,11,99};
		int m;
		int temp=0;
		for(int i=0;i<=no.length;i++)
		{
			m=i;
			for(int j=i+1;j<=no.length;j++)
			{
				if(no[j]<no[m])
				{
					m=j;
				}
			}
			temp=no[i];
			no[i]=no[m];
			no[m]=temp;
			
		}
		for(int i=0;i<no.length;i++)
		{
			System.out.print(no[i]+" ");
		}

	}

}
