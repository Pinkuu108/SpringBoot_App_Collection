package Interview_Related_Code;

public class Find_Duplicate_Elemeants {

	public static void main(String[] args) {
		String s[]= {"java","c","java","python","c"};
		for(int i=0;i<=s.length;i++)
		{
			for(int j=i+1;j<s.length;j++)
			{
				if(s[i]!=s[j])
				{
					System.out.println(s[i]+" ");
				}
			}
		}
	}
}
