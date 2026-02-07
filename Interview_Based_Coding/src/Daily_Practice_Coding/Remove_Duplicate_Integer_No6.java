package Daily_Practice_Coding;

import java.util.HashSet;

public class Remove_Duplicate_Integer_No6 {
	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,4,4,5,6,6,5,7,7,8,5,9,9,9,0};
		HashSet<Integer> hs=new HashSet<Integer>();
		for(int i=0;i<a.length;i++)
		{
			hs.add(a[i]);
		}
		System.out.println("Remove_Duplicate_Integer_No6.main()::"+hs);
	}

}
