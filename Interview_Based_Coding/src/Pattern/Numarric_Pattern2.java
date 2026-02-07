package Pattern;

public class Numarric_Pattern2 {

	public static void main(String[] args) {
		int p=0;
		for(int i=1;i<15;i++)
		{
			for(int j=1;j<i;j++)
			{
				p++;
				System.out.print(p+" ");
			}
			System.out.println();
		}
	}
}
