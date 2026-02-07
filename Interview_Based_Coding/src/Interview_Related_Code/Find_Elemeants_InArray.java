package Interview_Related_Code;

public class Find_Elemeants_InArray {
	
	public static void main(String[] args) {
		int a[]= {20,30,40,50};
		int n=50;
		int count=0;
//		boolean flag=false;
		for(int i=0;i<a.length;i++)
		{
			if(n==a[i])
			{
				System.out.println("The Elemeant Found At ::"+i);
				count++;
				break;
			}
			
		}
		if(count==0)
		{
			System.out.println("The Elemeants is Not Prtesent in Array");
		}
	}

}
